declare function local:getOrderContainer($r as element(), $orderContainer as element(), $namespace as xs:string)
as element()*
{
  let $element := $orderContainer/*/xs:element   
  
  let $nested :=
  (for $nestedOrderContainer in $orderContainer/*[./*[name() = "xs:sequence" or name() = "xs:choice" or name() = "xs:all" or name() ="xs:group"]]
   return local:getOrderContainer($r, $nestedOrderContainer, $namespace))
  
  let $group :=
  (for $groupRef in $orderContainer/xs:group
   for $group in $r//xs:group[@name = substring-after($groupRef/@ref, $namespace)]
   return local:getOrderContainer($r, $group, $namespace))   
      
  for $result in (($element, $nested, $group))
  return $result   
};

declare function local:getChildrenComplexType($r as element(), $complexType as element(), $namespace as xs:string)
as element()*
{
  if($complexType/xs:sequence or $complexType/xs:choice or $complexType/xs:all) then
    for $c in $complexType
    return local:getOrderContainer($r, $complexType, $namespace)
  else
  
    let $groupResult :=
    (for $groupRef in $complexType/xs:group
     for $group in $r//xs:group[@name = substring-after($groupRef/@ref, $namespace)]
     return local:getOrderContainer($r, $group, $namespace))
    
    let $extensionResult1 :=
    (for $extension in $complexType/xs:complexContent/xs:extension 
     return local:getOrderContainer($r, $extension, $namespace))
    
    let $extensionResult2 :=
      (for $extension in $complexType/xs:complexContent/xs:extension
       for $extensionComplexType in $r/xs:complexType[@name = substring-after($extension/@base, $namespace)]
       return local:getChildrenComplexType($r, $extensionComplexType, $namespace))    
    
    let $restrictionResult :=
    (for $restriction in $complexType/xs:complexContent/xs:restriction 
     return local:getOrderContainer($r, $restriction, $namespace))
    
    for $result in (($groupResult, $extensionResult1, $extensionResult2, $restrictionResult))
    return $result  
};

declare function local:getChildren($r as element(), $n1 as xs:string, $namespace as xs:string)
as element()*
{
for $e1 in $r//xs:element[@name=$n1]
return
  if($e1[@type]) then
    for $externalComplexType in $r/xs:complexType[@name = substring-after($e1/@type, $namespace)] 
    return local:getChildrenComplexType($r, $externalComplexType, $namespace)      
  else
    for $internalComplexType in $e1/xs:complexType
    return local:getChildrenComplexType($r, $internalComplexType, $namespace)  
};

declare function local:getOrderContainerDescendant($r as element(), $orderContainer as element(), $visited as xs:string*, $namespace as xs:string)
as element()*
{
  let $nameOrRef :=
  (for $child in $orderContainer/*/xs:element       
   return 
     if (exists($child/@name)) then local:getDescendants($r,$child/@name, $visited, $namespace)
     else local:getDescendants($r,substring-after($child/@ref, $namespace), $visited, $namespace))
  
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

declare function local:getDescendants($r as element(), $n1 as xs:string, $visited as xs:string*, $namespace as xs:string)
as element()*
{ 
  let $children := 
  (local:getChildren($r, $n1, $namespace))
  
  let $nonChildren :=
  (for $e1 in $r//xs:element[@name=$n1]    
   return if($e1[@type]) then
     if (not(substring-after($e1/@type, $namespace) = $visited)) then       
      for $externalComplexType in $r/xs:complexType[@name = substring-after($e1/@type, $namespace)]           
      return local:getDescendantsComplexType($r, $externalComplexType, ($visited, substring-after($e1/@type, $namespace)), $namespace)            
    else      
      for $internalComplexType in $e1/xs:complexType
      return local:getDescendantsComplexType($r, $internalComplexType, ($visited, $n1), $namespace))
      
   for $result in (($children, $nonChildren))
   return $result             
};

declare function local:getDescendants($r as element(), $n1 as xs:string, $namespace as xs:string)
as element()*
{ 
  let $children := 
  (local:getChildren($r, $n1, $namespace))
  
  let $nonChildren :=
  (for $e1 in $r//xs:element[@name=$n1]    
   return if($e1[@type]) then       
      for $externalComplexType in $r/xs:complexType[@name = substring-after($e1/@type, $namespace)]           
      return local:getDescendantsComplexType($r, $externalComplexType, substring-after($e1/@type, $namespace), $namespace)            
    else      
      for $internalComplexType in $e1/xs:complexType
      return local:getDescendantsComplexType($r, $internalComplexType, $n1, $namespace))
      
   for $result in (($children, $nonChildren))
   return $result             
};



declare function local:getFollowingInGroup($r as element(), $group as element(), $namespace as xs:string)
as element()*
{
    let $element :=
    (for $element in $group/xs:element
      return if(exists($element/@name)) then local:getDescendants($r, $element/@name, $namespace)
      else if (exists($element/@ref)) then local:getDescendants($r, substring-after($element/@ref, $namespace), $namespace))     
     
     let $group :=
     (for $groupRef in $group/xs:group
      for $group in $r//xs:group[substring-after($groupRef/@ref, $namespace) = @name]
      return local:getFollowingInGroup($r, $group, $namespace))   
      
     for $result in (($element, $group))
     return $result
};

declare function local:getFollowingOfElementOrGroup($r as element(), $e1 as element(), $namespace as xs:string)
as element()*
{
  let $sequence := (
  if (exists($e1/parent::xs:sequence))
  then     
    ((for $followingSibling in $e1/following-sibling::xs:element
      return 
      if (exists($followingSibling/@name)) then ($followingSibling, local:getDescendants($r, $followingSibling/@name, $namespace))
      else if (exists($followingSibling/@ref)) then ($followingSibling, local:getDescendants($r, substring-after($followingSibling/@ref, $namespace), $namespace)))     
     ,
     (for $followingSiblingGroupRef in $e1/following-sibling::xs:group
      for $group in $r//xs:group[substring-after($followingSiblingGroupRef/@ref, $namespace) = @name]
      return local:getFollowingInGroup($r, $group, $namespace))))
    
    let $all := (
    if(exists($e1/parent::xs:all)) 
    then     
    ((for $sibling in $e1/parent::xs:all/xs:element
      return
      if (exists($sibling/@name)) then ($sibling, local:getDescendants($r, $sibling/@name, $namespace))
      else if (exists($sibling/@ref)) then ($sibling, local:getDescendants($r, substring-after($sibling/@ref, $namespace), $namespace)))   
      ,
      (for $siblingGroupRef in $e1/parent::xs:all/xs:group
       for $group in $r//xs:group[substring-after($siblingGroupRef/@ref, $namespace) = @name]
       return local:getFollowingInGroup($r, $group, $namespace)
        )))
    
    let $complex :=
    (for $complexType in $e1/parent::*/parent::xs:complexType
      for $extension in $r//xs:extension[substring-after(@base, $namespace) = $complexType/@name]        
        return 
        ((for $extensionElement in $extension/*/xs:element
          return if (exists($extensionElement/@name)) then ($extensionElement, local:getDescendants($r, $extensionElement/@name, $namespace))
          else if (exists($extensionElement/@ref)) then ($extensionElement, local:getDescendants($r, substring-after($extensionElement/@ref, $namespace), $namespace)))   
        ,
        (for $followingSiblingGroupRef in $extension/*/xs:group
         for $group in $r//xs:group[substring-after($followingSiblingGroupRef/@ref, $namespace) = @name]
         return local:getFollowingInGroup($r, $group, $namespace)
        )))
    
    let $group :=
    (for $group in $e1/parent::*/parent::xs:group
     for $groupRef in $r//xs:group[substring-after(@ref, $namespace) = $group/@name]
     return local:getFollowingOfElementOrGroup($r, $groupRef, $namespace)
    )
    
    for $result in (($sequence, $all, $complex, $group))
    return $result
};

declare function local:getContainerOccurence($r as element(), $container as element(), $namespace as xs:string)
as xs:boolean
{
  (some $group in $container/parent::*/parent::xs:group satisfies
    some $groupRef in $r//xs:group[substring-after(@ref, $namespace) = $group/@name] satisfies
      ((string(number($groupRef/@maxOccurs)) != 'NaN' and $groupRef/@maxOccurs > 1)
      or
      ($groupRef/@maxOccurs = "unbounded"))
  )
  or
  (some $orderContainer in $container/parent::*[@maxOccurs] satisfies        
      ((string(number($orderContainer/@maxOccurs)) != 'NaN' and $orderContainer/@maxOccurs > 1)
      or
      ($orderContainer/@maxOccurs = "unbounded"))
  )
};

declare function local:getFollowing($r as element(), $n1 as xs:string, $namespace as xs:string)
as element()*
{
  for $e1 in $r//xs:element[@name=$n1 or @ref=$namespace || $n1]
  
    let $elementOrGroup := local:getFollowingOfElementOrGroup($r, $e1, $namespace)
    
    let $descendants := (
    if
    (string(number($e1/@maxOccurs)) != 'NaN' and $e1/@maxOccurs > 1
        or
        ($e1/@maxOccurs = "unbounded")
      or
      (some $group in $e1/parent::*/parent::xs:group satisfies
        some $groupRef in $r//xs:group[substring-after(@ref, $namespace) = $group/@name] satisfies
          ((string(number($groupRef/@maxOccurs)) != 'NaN' and $groupRef/@maxOccurs > 1)
          or
          ($groupRef/@maxOccurs = "unbounded"))
      )
      or
      (some $orderContainer in $e1/parent::*[@maxOccurs] satisfies        
          ((string(number($orderContainer/@maxOccurs)) != 'NaN' and $orderContainer/@maxOccurs > 1)
          or
          ($orderContainer/@maxOccurs = "unbounded"))
      )
      or
      (some $orderContainer in $e1/parent::* satisfies        
            local:getContainerOccurence($r, $orderContainer, "")
        )) 
      then       
      (local:getDescendants($r, $n1, $namespace), $e1))
      
      for $result in (($elementOrGroup, $descendants))
      return $result
};
