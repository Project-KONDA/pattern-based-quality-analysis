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

declare function local:getFollowingSiblingInGroup($r as element(), $group as element(), $namespace as xs:string)
as element()*
{
    
    ($group/xs:element)
     ,
     (for $groupRef in $group/xs:group
        for $group in $r//xs:group[substring-after($groupRef/@ref, $namespace) = @name]
         return local:getFollowingSiblingInGroup($r, $group, $namespace))   
};

declare function local:getFollowingSiblingOfElementOrGroup($r as element(), $e1 as element(), $namespace as xs:string)
as element()*
{
  let $sequence := (
  if (exists($e1/parent::xs:sequence)) 
  then
    ($e1/following-sibling::xs:element)
     ,
     (for $followingSiblingGroupRef in $e1/following-sibling::xs:group
      for $group in $r//xs:group[substring-after($followingSiblingGroupRef/@ref, $namespace) = @name]
      return local:getFollowingSiblingInGroup($r, $group, $namespace)
        ))
    
    let $all := (
    if (exists($e1/parent::xs:all)) 
    then
    (($e1/parent::xs:all/xs:element)
    ,
      (for $siblingGroupRef in $e1/parent::xs:all/xs:group
       for $group in $r//xs:group[substring-after($siblingGroupRef/@ref, $namespace) = @name]
       return local:getFollowingSiblingInGroup($r, $group, $namespace)
        )))
    
    let $complex :=
    (for $complexType in $e1/parent::*/parent::xs:complexType
      for $extension in $r//xs:extension[substring-after(@base, $namespace) = $complexType/@name]        
        return (
        ($extension/*/xs:element)
        ,
        (for $followingSiblingGroupRef in $extension/*/xs:group
          for $group in $r//xs:group[substring-after($followingSiblingGroupRef/@ref, $namespace) = @name]
           return local:getFollowingSiblingInGroup($r, $group, $namespace)
        )))
    
    let $group :=
    (for $group in $e1/parent::*/parent::xs:group
      for $groupRef in $r//xs:group[substring-after(@ref, $namespace) = $group/@name]
       return local:getFollowingSiblingOfElementOrGroup($r, $groupRef, $namespace)
    )
    
    for $result in (($sequence, $all, $complex, $group))
    return $result
};

declare function local:checkContainerOccurence($r as element(), $container as element(), $namespace as xs:string)
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

declare function local:getFollowingSibling($r as element(), $n1 as xs:string, $namespace as xs:string)
as element()*
{
  for $e1 in $r//xs:element[@name=$n1 or @ref=$namespace || $n1]
    let $followingSibling := local:getFollowingSiblingOfElementOrGroup($r, $e1, $namespace)
    
    let $self := (
    if
    (
      ((string(number($e1/@maxOccurs)) != 'NaN' and $e1/@maxOccurs > 1)
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
            local:checkContainerOccurence($r, $orderContainer, "")
        )))
        
      then $e1)
      
    for $result in (($followingSibling, $self))
    return $result
};

declare function local:getFollowing($r as element(), $n1 as xs:string, $namespace as xs:string)
as element()*
{
  for $followingSibling in local:getFollowingSibling($r, $n1, $namespace)
  return 
  if (exists($followingSibling/@name)) then ($followingSibling, local:getDescendants($r, $followingSibling/@name, $namespace)) 
  else ($followingSibling, local:getDescendants($r, substring-after($followingSibling/@ref, $namespace), $namespace)) 
   
};

for $root in /xs:schema
return local:getFollowing($root, "actorID", "lido:")