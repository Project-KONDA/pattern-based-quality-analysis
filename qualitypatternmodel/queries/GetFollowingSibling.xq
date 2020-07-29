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
