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