declare function local:getAttributesContainer($r as element(), $attributeContainer as element(), $namespace as xs:string)
as element()*
{
  let $attribute := $attributeContainer/xs:attribute
  
  let $group :=
  (for $groupRef in $attributeContainer/xs:attributeGroup
   for $group in $r/xs:attributeGroup[@name = substring-after($groupRef/@ref, $namespace)]
   return local:getAttributesContainer($r, $group, $namespace))     
  
  for $result in (($attribute, $group))
  return $result 
};

declare function local:getAttributesComplexType($r as element(), $complexType as element(), $namespace as xs:string)
as element()*
{
  let $attributes := local:getAttributesContainer($r, $complexType, $namespace)
  
  let $extension1 :=
  (for $extension in $complexType/*/xs:extension 
   return local:getAttributesContainer($r, $extension, $namespace))
  
  let $extension2 :=      
    (for $extension in $complexType/*/xs:extension
      for $extensionComplexType in $r/xs:complexType[@name = substring-after($extension/@base, $namespace)]
      return local:getAttributesComplexType($r, $extensionComplexType, $namespace))
   
   let $restriction1 :=
   (for $restriction in $complexType/*/xs:restriction 
    return local:getAttributesContainer($r, $restriction, $namespace))
   
   let $restriction2 :=     
      (for $restriction in $complexType/*/xs:restriction 
       for $restrictionComplexType in $r/xs:complexType[@name = substring-after($restriction/@base, $namespace)]
       return local:getAttributesComplexType($r, $restrictionComplexType, $namespace))
   
   for $result in (($attributes, $extension1, $extension2, $restriction1, $restriction2))
   return $result        
};

declare function local:getAttributes($r as element(), $elementName as xs:string, $namespace as xs:string)
as element()*
{
for $e1 in $r//xs:element[@name=$elementName]
return
  if($e1[@type]) then
    for $externalComplexType in $r/xs:complexType[@name = substring-after($e1/@type, $namespace)] 
    return local:getAttributesComplexType($r, $externalComplexType, $namespace)      
  else   
    for $internalComplexType in $e1/xs:complexType
    return local:getAttributesComplexType($r, $internalComplexType, $namespace)  
};