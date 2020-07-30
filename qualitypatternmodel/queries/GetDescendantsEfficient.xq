declare function local:getOrderContainerDescendant($r as element(), $orderContainer as element(), $visited as xs:string*, $namespace as xs:string)
as element()*
{
  let $nameOrRef :=
  (for $child in $orderContainer/*/xs:element       
   return 
     if (exists($child/@name)) then ($child, local:getDescendantsNotVisited($r,$child/@name, $visited, $namespace))
     else ($child, local:getDescendantsNotVisited($r,substring-after($child/@ref, $namespace), $visited, $namespace)))
  
  let $nested := 
  (for $nestedOrderContainer in $orderContainer/*[./*[name() = "xs:sequence" or name() = "xs:choice" or name() = "xs:all" or name() ="xs:group"]]
   return local:getOrderContainerDescendant($r, $nestedOrderContainer, $visited, $namespace))
  
  let $group :=
  (for $groupRef in $orderContainer/xs:group
   for $group in $r/xs:group[@name = substring-after($groupRef/@ref, $namespace)]        
   return local:getOrderContainerDescendant($r, $group, ($visited, substring-after($groupRef/@ref, $namespace)), $namespace))
   
  for $result in (($nameOrRef, $nested, $group))
  return $result             
};

declare function local:getDescendantsComplexType($r as element(), $complexType as element(), $visited as xs:string*, $namespace as xs:string)
as element()*
{
  if($complexType/xs:sequence or $complexType/xs:choice or $complexType/xs:all) then
     for $c in $complexType
     return local:getOrderContainerDescendant($r, $complexType, $visited, $namespace)  
  else
    
    let $group :=
    (for $groupRef in $complexType/xs:group
     for $group in $r//xs:group[@name = substring-after($groupRef/@ref, $namespace)]
     return local:getOrderContainerDescendant($r, $group, ($visited, substring-after($groupRef/@ref, $namespace)), $namespace))
  
    let $extension1 :=
    (for $extension in $complexType/xs:complexContent/xs:extension       
     return local:getOrderContainerDescendant($r, $extension, $visited, $namespace))
    
    let $extension2 :=        
      (for $extension in $complexType/xs:complexContent/xs:extension
       for $extensionComplexType in $r/xs:complexType[@name = substring-after($extension/@base, $namespace)]
       return local:getDescendantsComplexType($r, $extensionComplexType, ($visited, substring-after($extension/@base, $namespace)), $namespace))
    
    let $restriction :=
    (for $restriction in $complexType/xs:complexContent/xs:restriction 
     return local:getOrderContainerDescendant($r, $restriction, $visited, $namespace))
    
    for $result in (($group, $extension1, $extension2, $restriction))
    return $result             
};

declare function local:getDescendantsNotVisited($r as element(), $n1 as xs:string, $visited as xs:string*, $namespace as xs:string)
as element()*
{ 
 for $e1 in $r//xs:element[@name=$n1 and not($n1 = $visited)]    
   return if($e1[@type and not(substring-after(@type, $namespace) = $visited)]) then
      for $externalComplexType in $r/xs:complexType[@name = substring-after($e1/@type, $namespace)]           
      return local:getDescendantsComplexType($r, $externalComplexType, ($visited, substring-after($e1/@type, $namespace), $n1), $namespace)            
    else      
      for $internalComplexType in $e1/xs:complexType
      return local:getDescendantsComplexType($r, $internalComplexType, ($visited, $n1), $namespace)             
};

declare function local:getDescendants($r as element(), $n1 as xs:string, $namespace as xs:string)
as element()*
{ 
  for $e1 in $r//xs:element[@name=$n1]    
   return if($e1[@type]) then       
      for $externalComplexType in $r/xs:complexType[@name = substring-after($e1/@type, $namespace)]           
      return local:getDescendantsComplexType($r, $externalComplexType, (substring-after($e1/@type, $namespace), $n1), $namespace)            
    else      
      for $internalComplexType in $e1/xs:complexType
      return local:getDescendantsComplexType($r, $internalComplexType, $n1, $namespace)           
};
