
declare function local:getParentsComplexType($r as element(), $complexType as element(), $namespace as xs:string)
as element()*
{
  if($complexType[@name]) then
    ($r//xs:element[@type = $namespace || $complexType/@name]
    ,
     for $extension in $r//xs:extension[@base = $namespace || $complexType/@name]
     return local:getParentsExtension($r, $extension, $namespace))    
  else
    $complexType/parent::xs:element 
};

declare function local:getParentsGroup($r as element(), $group as element(), $namespace as xs:string)
as element()*
{
   if($group[@name]) then
     for $groupRef in $r//xs:group[@ref = $namespace || $group/@name]
     return local:getParentsIndicator($r, $groupRef, $namespace)
   else if ($group[@ref]) then
     local:getParentsIndicator($r, $group, $namespace)
};

declare function local:getParentsExtension($r as element(), $extension as element(), $namespace as xs:string)
as element()*
{
  if (exists($extension/parent::xs:complexContent/parent::xs:complexType)) then
    local:getParentsComplexType($r, $extension/parent::*/parent::*, $namespace) 
};

declare function local:getParentsIndicator($r as element(), $indicator as element(), $namespace as xs:string)
as element()*
{
  if (exists($indicator/parent::xs:complexType)) then
    local:getParentsComplexType($r, $indicator/parent::*, $namespace)
  else if(exists($indicator/parent::xs:sequence) or exists($indicator/parent::xs:choice) or exists($indicator/parent::xs:all)) then
    local:getParentsIndicator($r, $indicator/parent::*, $namespace)
  else if (exists($indicator/parent::xs:group)) then 
    local:getParentsGroup($r, $indicator/parent::*, $namespace)
  else if (exists($indicator/parent::xs:extension)) then 
    local:getParentsExtension($r, $indicator/parent::*, $namespace)  
};

declare function local:getParents($r as element(), $n1 as xs:string, $namespace as xs:string)
as element()*
{
for $e1 in $r//xs:element[@name=$n1 or @ref = $namespace || $n1]
return
  if(exists($e1/parent::xs:sequence) or exists($e1/parent::xs:choice) or exists($e1/parent::xs:all)) then
    local:getParentsIndicator($r, $e1/parent::*, $namespace)
};






declare function local:getAncestorsComplexType($r as element(), $complexType as element(), $visited as xs:string*, $namespace as xs:string)
as element()*
{
  if($complexType[@name]) then
    (for $e in $r//xs:element[@type = $namespace || $complexType/@name]
    return local:getAncestorsNotVisited($r, $e/@name, $visited, $namespace)
    ,
     for $extension in $r//xs:extension[@base = $namespace || $complexType/@name]
     return local:getAncestorsExtension($r, $extension, ($visited, $complexType/@name), $namespace))    
  else
    for $e in $complexType/parent::xs:element
    return local:getAncestorsNotVisited($r, $e/@name, $visited, $namespace)
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
  let $parents := 
  (local:getParents($r, $n1, $namespace))
    
  let $nonParents :=
  (
    for $e1 in $r//xs:element[(@name=$n1 or @ref = $namespace || $n1) 
      and not(substring-after(@type, $namespace) = $visited)
      and not($n1 = $visited)]
    return
      if(exists($e1/parent::xs:sequence) or exists($e1/parent::xs:choice) or exists($e1/parent::xs:all)) then
        if($e1[@type]) then local:getAncestorsIndicator($r, $e1/parent::*, ($visited, substring-after($e1/@type, $namespace), $n1), $namespace)
        else local:getAncestorsIndicator($r, $e1/parent::*, ($visited, $n1), $namespace)
  )    
      
   for $result in (($parents, $nonParents))
   return $result   
};

declare function local:getAncestors($r as element(), $n1 as xs:string, $namespace as xs:string)
as element()*
{
  let $parents := 
  (local:getParents($r, $n1, $namespace))
    
  let $nonParents :=
  (
    for $e1 in $r//xs:element[@name=$n1 or @ref = $namespace || $n1]
    return
      if(exists($e1/parent::xs:sequence) or exists($e1/parent::xs:choice) or exists($e1/parent::xs:all)) then
        if($e1[@type]) then local:getAncestorsIndicator($r, $e1/parent::*, (substring-after($e1/@type, $namespace), $n1), $namespace)
        else local:getAncestorsIndicator($r, $e1/parent::*, ($n1), $namespace) 
        
  )    
      
   for $result in (($parents, $nonParents))
   return $result   
};
