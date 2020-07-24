declare function local:checkFollowingSiblingInGroup($r as element(), $group as element(), $n2 as xs:string, $namespace as xs:string)
as xs:boolean
{
    (some $element in $group/xs:element satisfies
      $element/@name = $n2
      or
      $element/@ref = $namespace || $n2)
     or
     (some $groupRef in $group/xs:group satisfies
        some $group in $r//xs:group[substring-after($groupRef/@ref, $namespace) = @name] satisfies
          local:checkFollowingSiblingInGroup($r, $group, $n2, $namespace))   
};

declare function local:checkFollowingSiblingOfElementOrGroup($r as element(), $e1 as element(), $n2 as xs:string, $namespace as xs:string)
as xs:boolean
{
  (exists($e1/parent::xs:sequence) 
    and
    ((some $followingSibling in $e1/following-sibling::xs:element satisfies
      $followingSibling/@name = $n2
      or
      $followingSibling/@ref = $namespace || $n2))
     or
     (some $followingSiblingGroupRef in $e1/following-sibling::xs:group satisfies
        some $group in $r//xs:group[substring-after($followingSiblingGroupRef/@ref, $namespace) = @name] satisfies
          local:checkFollowingSiblingInGroup($r, $group, $n2, $namespace)
        ))
    or
    (exists($e1/parent::xs:all) 
     and
    ((some $sibling in $e1/parent::xs:all/xs:element satisfies
      $sibling/@name = $n2
      or
      $sibling/@ref = $namespace || $n2))
      (some $siblingGroupRef in $e1/parent::xs:all/xs:group satisfies
        some $group in $r//xs:group[substring-after($siblingGroupRef/@ref, $namespace) = @name] satisfies
          local:checkFollowingSiblingInGroup($r, $group, $n2, $namespace)
        ))
    or
    (some $complexType in $e1/parent::*/parent::xs:complexType satisfies
      some $extension in $r//xs:extension[substring-after(@base, $namespace) = $complexType/@name] satisfies        
        exists($extension/*/xs:element[@name = $n2 or @ref = $namespace || $n2])
        or
        (some $followingSiblingGroupRef in $extension/*/xs:group satisfies
        some $group in $r//xs:group[substring-after($followingSiblingGroupRef/@ref, $namespace) = @name] satisfies
            local:checkFollowingSiblingInGroup($r, $group, $n2, $namespace)
        ))
    or
    (some $group in $e1/parent::*/parent::xs:group satisfies
      some $groupRef in $r//xs:group[substring-after(@ref, $namespace) = $group/@name] satisfies
        local:checkFollowingSiblingOfElementOrGroup($r, $groupRef, $n2, $namespace)
    )
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

declare function local:checkFollowingSibling($r as element(), $n1 as xs:string, $n2 as xs:string, $namespace as xs:string)
as xs:boolean
{
  some $e1 in $r//xs:element[@name=$n1 or @ref=$namespace || $n1] satisfies
    local:checkFollowingSiblingOfElementOrGroup($r, $e1, $n2, $namespace)
    or
    ($n1 = $n2
      and
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
};