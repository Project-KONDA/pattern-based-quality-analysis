declare function local:checkOrderContainer($r as element(), $n2 as xs:string, $orderContainer as element(), $namespace as xs:string)
as xs:boolean
{
  exists($orderContainer/*/xs:element[@name = $n2]) 
  or 
  exists($orderContainer/*/xs:element[@ref = $namespace || $n2])
  or 
  (some $nestedOrderContainer in $orderContainer/*[./*[name() = "xs:sequence" or name() = "xs:choice" or name() = "xs:all" or name() ="xs:group"]] satisfies
      local:checkOrderContainer($r,$n2,$nestedOrderContainer,$namespace))
  or
  (some $groupRef in $orderContainer/xs:group satisfies
    some $group in $r//xs:group[@name = substring-after($groupRef/@ref, $namespace)] satisfies
      local:checkOrderContainer($r,$n2,$group,$namespace))      
};

declare function local:checkChildComplexType($r as element(), $n2 as xs:string, $complexType as element(), $namespace as xs:string)
as xs:boolean
{
  if($complexType/xs:sequence or $complexType/xs:choice or $complexType/xs:all) then
    local:checkOrderContainer($r,$n2,$complexType,$namespace)
  else
    (some $groupRef in $complexType/xs:group satisfies
      some $group in $r//xs:group[@name = substring-after($groupRef/@ref, $namespace)] satisfies
        local:checkOrderContainer($r,$n2,$group,$namespace))
    or
    (some $extension in $complexType/xs:complexContent/xs:extension satisfies 
      local:checkOrderContainer($r,$n2,$extension,$namespace)
      or      
      (some $extensionComplexType in $r/xs:complexType[@name = substring-after($extension/@base, $namespace)] satisfies
        local:checkChildComplexType($r, $n2, $extensionComplexType, $namespace)))      
    or
    (some $restriction in $complexType/xs:complexContent/xs:restriction satisfies 
      local:checkOrderContainer($r,$n2,$restriction,$namespace))
};

declare function local:checkChild($r as element(), $n1 as xs:string, $n2 as xs:string, $namespace as xs:string)
as xs:boolean
{
some $e1 in $r//xs:element[@name=$n1] satisfies
  if($e1[@type]) then
    some $externalComplexType in $r/xs:complexType[@name = substring-after($e1/@type, $namespace)] satisfies 
      local:checkChildComplexType($r, $n2, $externalComplexType, $namespace)      
  else
    some $internalComplexType in $e1/xs:complexType satisfies
      local:checkChildComplexType($r, $n2, $internalComplexType, $namespace)  
};

declare function local:checkOrderContainerDescendant($r as element(), $n2 as xs:string, $orderContainer as element(), $namespace as xs:string)
as xs:boolean
{
  (some $child in $orderContainer/*/xs:element satisfies      
    (exists($child/@name) and local:checkDescendant($r,$child/@name,$n2,$namespace))
    or
    (exists($child/@ref) and local:checkDescendant($r,substring-after($child/@ref, $namespace),$n2,$namespace)))
  or 
  (some $nestedOrderContainer in $orderContainer/*[./*[name() = "xs:sequence" or name() = "xs:choice" or name() = "xs:all" or name() ="xs:group"]] satisfies
      local:checkOrderContainerDescendant($r,$n2,$nestedOrderContainer,$namespace))
  or
  (some $groupRef in $orderContainer/xs:group satisfies
    some $group in $r/xs:group[@name = substring-after($groupRef/@ref, $namespace)] satisfies        
      local:checkOrderContainerDescendant($r,$n2,$group,$namespace))             
};

declare function local:checkDescendantComplexType($r as element(), $n2 as xs:string, $complexType as element(), $namespace as xs:string)
as xs:boolean
{
  if($complexType/xs:sequence or $complexType/xs:choice or $complexType/xs:all) then
     local:checkOrderContainerDescendant($r,$n2,$complexType,$namespace)  
  else
    some $extension in $complexType/xs:complexContent/xs:extension satisfies       
      local:checkOrderContainerDescendant($r,$n2,$extension,$namespace)
      or        
      (some $extensionComplexType in $r/xs:complexType[@name = substring-after($extension/@base, $namespace)]
        satisfies local:checkDescendantComplexType($r, $n2, $extensionComplexType, $namespace))
    or
    (some $restriction in $complexType/xs:complexContent/xs:restriction satisfies 
      local:checkOrderContainerDescendant($r,$n2,$restriction,$namespace))             
};

declare function local:checkDescendant($r as element(), $n1 as xs:string, $n2 as xs:string, $namespace as xs:string)
as xs:boolean
{  
  (local:checkChild($r,$n1,$n2,$namespace))
  or
  (some $e1 in $r//xs:element[@name=$n1] satisfies    
    if($e1[@type]) then       
      some $externalComplexType in $r/xs:complexType[@name = substring-after($e1/@type, $namespace)] satisfies           
        local:checkDescendantComplexType($r, $n2, $externalComplexType,$namespace)            
    else      
      some $internalComplexType in $e1/xs:complexType satisfies
        local:checkDescendantComplexType($r, $n2, $internalComplexType,$namespace))             
};



declare function local:checkFollowingInGroup($r as element(), $group as element(), $n2 as xs:string, $namespace as xs:string)
as xs:boolean
{
    (some $element in $group/xs:element satisfies
      exists($element/@name) and local:checkDescendant($r, $element/@name, $n2, $namespace)
      or
      exists($element/@ref) and local:checkDescendant($r, substring-after($element/@ref, $namespace), $n2, $namespace))     
     or
     (some $groupRef in $group/xs:group satisfies
        some $group in $r//xs:group[substring-after($groupRef/@ref, $namespace) = @name] satisfies
          local:checkFollowingInGroup($r, $group, $n2, $namespace))   
};

declare function local:checkFollowingOfElementOrGroup($r as element(), $e1 as element(), $n2 as xs:string, $namespace as xs:string)
as xs:boolean
{
  (exists($e1/parent::xs:sequence) 
    and
    ((some $followingSibling in $e1/following-sibling::xs:element satisfies
      exists($followingSibling/@name) and local:checkDescendant($r, $followingSibling/@name, $n2, $namespace)
      or
      exists($followingSibling/@ref) and local:checkDescendant($r, substring-after($followingSibling/@ref, $namespace), $n2, $namespace))   
     or
     (some $followingSiblingGroupRef in $e1/following-sibling::xs:group satisfies
        some $group in $r//xs:group[substring-after($followingSiblingGroupRef/@ref, $namespace) = @name] satisfies
          local:checkFollowingInGroup($r, $group, $n2, $namespace)
        )))
    or
    (exists($e1/parent::xs:all) 
     and
    ((some $sibling in $e1/parent::xs:all/xs:element satisfies
      exists($sibling/@name) and local:checkDescendant($r, $sibling/@name, $n2, $namespace)
      or
      exists($sibling/@ref) and local:checkDescendant($r, substring-after($sibling/@ref, $namespace), $n2, $namespace))   
      (some $siblingGroupRef in $e1/parent::xs:all/xs:group satisfies
        some $group in $r//xs:group[substring-after($siblingGroupRef/@ref, $namespace) = @name] satisfies
          local:checkFollowingInGroup($r, $group, $n2, $namespace)
        )))
    or
    (some $complexType in $e1/parent::*/parent::xs:complexType satisfies
      some $extension in $r//xs:extension[substring-after(@base, $namespace) = $complexType/@name] satisfies        
        (some $extensionElement in $extension/*/xs:element satisfies
          exists($extensionElement/@name) and local:checkDescendant($r, $extensionElement/@name, $n2, $namespace)
          or
          exists($extensionElement/@ref) and local:checkDescendant($r, substring-after($extensionElement/@ref, $namespace), $n2, $namespace))   
        or
        (some $followingSiblingGroupRef in $extension/*/xs:group satisfies
          some $group in $r//xs:group[substring-after($followingSiblingGroupRef/@ref, $namespace) = @name] satisfies
              local:checkFollowingInGroup($r, $group, $n2, $namespace)
        ))
    or
    (some $group in $e1/parent::*/parent::xs:group satisfies
      some $groupRef in $r//xs:group[substring-after(@ref, $namespace) = $group/@name] satisfies
        local:checkFollowingOfElementOrGroup($r, $groupRef, $n2, $namespace)
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

declare function local:checkFollowing($r as element(), $n1 as xs:string, $n2 as xs:string, $namespace as xs:string)
as xs:boolean
{
  some $e1 in $r//xs:element[@name=$n1 or @ref=$namespace || $n1] satisfies
    local:checkFollowingOfElementOrGroup($r, $e1, $n2, $namespace)
    or
    ((string(number($e1/@maxOccurs)) != 'NaN' and $e1/@maxOccurs > 1
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
        ))
      and 
      local:checkDescendant($r, $n1, $n2, $namespace))
};