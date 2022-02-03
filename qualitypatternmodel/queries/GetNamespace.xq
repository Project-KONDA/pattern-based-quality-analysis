declare namespace xsd = "http://www.w3.org/2001/XMLSchema";
for $element in /xsd:schema
for $prefix in fn:in-scope-prefixes(/xsd:schema)
where fn:namespace-uri-for-prefix($prefix, $element) = $element/@targetNamespace/data()
return $prefix