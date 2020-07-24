declare function local:checkAttributeContainer($r as element(), $attributeName as xs:string, $attributeContainer as element(), $namespace as xs:string)
as xs:boolean
{
  exists($attributeContainer/xs:attribute[@name = $attributeName])
  or 
  exists($attributeContainer/xs:attribute[@ref = $namespace || $attributeName])
  or
  (some $groupRef in $attributeContainer/xs:attributeGroup satisfies
    some $group in $r/xs:attributeGroup[@name = substring-after($groupRef/@ref, $namespace)] satisfies
       local:checkAttributeContainer($r,$attributeName,$group,$namespace))      
};

declare function local:checkAttributeComplexType($r as element(), $attributeName as xs:string, $complexType as element(), $namespace as xs:string)
as xs:boolean
{
  local:checkAttributeContainer($r, $attributeName, $complexType, $namespace)
  or
  (some $extension in $complexType/*/xs:extension satisfies 
    local:checkAttributeContainer($r, $attributeName, $extension, $namespace)
    or      
    (some $extensionComplexType in $r/xs:complexType[@name = substring-after($extension/@base, $namespace)] satisfies
      local:checkAttributeComplexType($r, $attributeName, $extensionComplexType, $namespace)))
   or
   (some $restriction in $complexType/*/xs:restriction satisfies 
    local:checkAttributeContainer($r, $attributeName, $restriction, $namespace)
    or      
      (some $restrictionComplexType in $r/xs:complexType[@name = substring-after($restriction/@base, $namespace)] satisfies
        local:checkAttributeComplexType($r, $attributeName, $restrictionComplexType, $namespace)))        
};

declare function local:checkAttribute($r as element(), $elementName as xs:string, $attributeName as xs:string, $namespace as xs:string)
as xs:boolean
{
some $e1 in $r//xs:element[@name=$elementName] satisfies
  if($e1[@type]) then
    some $externalComplexType in $r/xs:complexType[@name = substring-after($e1/@type, $namespace)] satisfies 
        local:checkAttributeComplexType($r, $attributeName, $externalComplexType, $namespace)      
  else   
    some $internalComplexType in $e1/xs:complexType satisfies
      local:checkAttributeComplexType($r, $attributeName, $internalComplexType, $namespace)  
};
