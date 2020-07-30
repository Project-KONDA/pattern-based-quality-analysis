
declare function local:checkParentComplexType($r as element(), $complexType as element(), $n2 as xs:string, $namespace as xs:string)
as xs:boolean
{
  if($complexType[@name]) then
    some $e in $r//xs:element[@type = $namespace || $complexType/@name] satisfies
      $e[@name = $n2]   
  else
    some $e in $complexType/parent::xs:element satisfies
      $e[@name = $n2]  
};

declare function local:checkParentGroup($r as element(), $group as element(), $n2 as xs:string, $namespace as xs:string)
as xs:boolean
{
   if($group[@name]) then
     some $groupRef in $r//xs:group[@ref = $namespace || $group/@name]
     satisfies local:checkParentIndicator($r, $groupRef, $n2, $namespace)
   else if ($group[@ref]) then
     local:checkParentIndicator($r, $group, $n2, $namespace)
};

declare function local:checkParentExtension($r as element(), $extension as element(), $n2 as xs:string, $namespace as xs:string)
as xs:boolean
{
  if (exists($extension/parent::xs:complexContent/parent::xs:complexType)) then
    local:checkParentComplexType($r, $extension/parent::*/parent::*, $n2, $namespace) 
};

declare function local:checkParentIndicator($r as element(), $indicator as element(), $n2 as xs:string, $namespace as xs:string)
as xs:boolean
{
  if (exists($indicator/parent::xs:complexType)) then
    local:checkParentComplexType($r, $indicator/parent::*, $n2, $namespace)
  else if(exists($indicator/parent::xs:sequence) or exists($indicator/parent::xs:choice) or exists($indicator/parent::xs:all)) then
    local:checkParentIndicator($r, $indicator/parent::*, $n2, $namespace)
  else if (exists($indicator/parent::xs:group)) then 
    local:checkParentGroup($r, $indicator/parent::*, $n2, $namespace)
  else if (exists($indicator/parent::xs:extension)) then 
    local:checkParentExtension($r, $indicator/parent::*, $n2, $namespace)  
};

declare function local:checkParent($r as element(), $n1 as xs:string, $n2 as xs:string, $namespace as xs:string)
as xs:boolean
{
some $e1 in $r//xs:element[@name=$n1 or @ref=$n1] satisfies
  if(exists($e1/parent::xs:sequence) or exists($e1/parent::xs:choice) or exists($e1/parent::xs:all)) then
    local:checkParentIndicator($r, $e1/parent::*, $n2, $namespace)
};