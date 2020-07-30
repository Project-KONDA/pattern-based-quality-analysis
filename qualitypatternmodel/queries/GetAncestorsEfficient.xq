declare function local:getAncestorsComplexType($r as element(), $complexType as element(), $visited as xs:string*, $namespace as xs:string)
as element()*
{
  if($complexType[@name]) then
    (for $e in $r//xs:element[@type = $namespace || $complexType/@name]
    return ($e, local:getAncestorsNotVisited($r, $e/@name, $visited, $namespace))
    ,
     for $extension in $r//xs:extension[@base = $namespace || $complexType/@name]
     return local:getAncestorsExtension($r, $extension, ($visited, $complexType/@name), $namespace))    
  else
    for $e in $complexType/parent::xs:element
    return ($e, local:getAncestorsNotVisited($r, $e/@name, $visited, $namespace))
};

declare function local:getAncestorsGroup($r as element(), $group as element(), $visited as xs:string*, $namespace as xs:string)
as element()*
{
   if($group[@name and not(@name = $visited)]) then
     for $groupRef in $r//xs:group[@ref = $namespace || $group/@name]
     return local:getAncestorsIndicator($r, $groupRef, ($visited, $group/@name), $namespace)
   else if ($group[@ref and not(substring-after(@ref, $namespace) = $visited)]) then
     local:getAncestorsIndicator($r, $group, ($visited, substring-after($group/@ref, $namespace)), $namespace)
};

declare function local:getAncestorsExtension($r as element(), $extension as element(), $visited as xs:string*, $namespace as xs:string)
as element()*
{
  if (exists($extension/parent::xs:complexContent/parent::xs:complexType)) then
    local:getAncestorsComplexType($r, $extension/parent::*/parent::*, $visited, $namespace) 
};

declare function local:getAncestorsIndicator($r as element(), $indicator as element(), $visited as xs:string*, $namespace as xs:string)
as element()*
{
  if (exists($indicator/parent::xs:complexType)) then
    local:getAncestorsComplexType($r, $indicator/parent::*, $visited, $namespace)
  else if(exists($indicator/parent::xs:sequence) or exists($indicator/parent::xs:choice) or exists($indicator/parent::xs:all)) then
    local:getAncestorsIndicator($r, $indicator/parent::*, $visited, $namespace)
  else if (exists($indicator/parent::xs:group)) then 
    local:getAncestorsGroup($r, $indicator/parent::*, $visited, $namespace)
  else if (exists($indicator/parent::xs:extension)) then 
    local:getAncestorsExtension($r, $indicator/parent::*, $visited, $namespace)  
};

declare function local:getAncestorsNotVisited($r as element(), $n1 as xs:string, $visited as xs:string*, $namespace as xs:string)
as element()*
{
    for $e1 in $r//xs:element[(@name=$n1 or @ref = $namespace || $n1) 
      and not(substring-after(@type, $namespace) = $visited)
      and not($n1 = $visited)]
    return
      if(exists($e1/parent::xs:sequence) or exists($e1/parent::xs:choice) or exists($e1/parent::xs:all)) then
        if($e1[@type]) then local:getAncestorsIndicator($r, $e1/parent::*, ($visited, substring-after($e1/@type, $namespace), $n1), $namespace)
        else local:getAncestorsIndicator($r, $e1/parent::*, ($visited, $n1), $namespace) 
};

declare function local:getAncestors($r as element(), $n1 as xs:string, $namespace as xs:string)
as element()*
{ 
  for $e1 in $r//xs:element[@name=$n1 or @ref = $namespace || $n1]
  return
    if(exists($e1/parent::xs:sequence) or exists($e1/parent::xs:choice) or exists($e1/parent::xs:all)) then
      if($e1[@type]) then local:getAncestorsIndicator($r, $e1/parent::*, (substring-after($e1/@type, $namespace), $n1), $namespace)
      else local:getAncestorsIndicator($r, $e1/parent::*, ($n1), $namespace)   
};
