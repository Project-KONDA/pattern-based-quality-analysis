# Constraint Variant Definition Guide
This document is about the definition of variants that fit an already existing template.
Templates define a flexible quality analysis using different parameters. However, they cannot be understand by the common user.
Variants define a mapping from the complex templates to a simple user-comprehensible sentence.
Variants shall be based on a natural sentence, which puts the parameters of a template into context. This shall help users to understand how to use a template to define a quality analyis.
Variants are specified using a specific JSON format.

## How-To Guide

### Create new Variant JSON
To create a new variant for a template, first the sentence needs to be formulated. All parameters of a template must either occur in the sentence or be [... something missing...]
This sentence is split into fragments: TextFragments and ParameterFragments (Gaps). 
The fragments and the predefined parameters need to be translated into the corresponding JSON structure. For further information see [Variant Header](#variant-header) and [Fragment Types](#fragment-types).

### Load JSON into QPM
If the JSON is created, there are two options for loading the JSON into QPM, either permanently before startup (or before restart), or temporarily at runtime.

### Before Startup
During the startup of QPM, variants are automatically loaded into the QPM-service, if they are in the variants folder, specified by the environmental variable `VARIANTS_FOLDER`. Note, that the environmental variable `VALUE_AS_JSON` must be set.
In [Constrainify](https://gitlab.gwdg.de/aqinda/constrainify), these JSONs need to be in the folder `configuration\templates` before starting the application. If the service already runs, the application needs to be restarted to locate the variant.
### At Runtime
If the API of QPM is accessible, variants can also be loaded mid-runtime via the API call:
```curl
curl --location --request PUT 'http://<server>:<port>/template/variant/<technology>/<templateID>?variants=<url-encoded-json>
```
Note: If the environmental variable `OVERRIDE_VARIANTS` is set as true, variants created this way will be removed after a restart of QPM.

### Delete Variant
At runtime, if the API of QPM is accessible, variants can also be deleted via the API call:
```curl
curl --location --request DELETE 'http://<server>:<port>/template/variant/<technology>/<templateID>?variants=<variantsID>
```
Note: If the JSON-file of the variant remains in the folder and the environmental variable `VALUE_AS_JSON` is set as true, deleted variants will be recreated on a restart of QPM.

### Change an existing Variant
To change an existing variant, first find the corresponding JSON either in the variants folder (see [Load JSON into QPM](#before-startup)) or per cURL request (see [Template Parameters](#template-parameters).
Modify the JSON to your liking and load it into the application (see [Load JSON into QPM](#load-json-into-qpm).

### Create new Templates
Currently, we offer no option to create new templates. [-------> EXPLAIN WHY NOT...] Please report template-requests to the AQinDa team or create a [new issue](https://github.com/Project-KONDA/pattern-based-quality-analysis/issues). If possible, suggest a formulation as a constraint sentence. 

## Templates
QPM by default provides a set of templates, each with at least one variant.
- **xml**: `MandAtt_xml`, `CompSet_xml`, `Match_xml`, `Card_xml`, `InvalidLink_xml`, `StringLength_xml`, `Contains_xml`, `Unique_xml`, `MandCont_xml`
- **rdf**: `StringLength_rdf`, `Unique_rdf`, `Match_rdf`, `MandAtt_rdf`, `Card_rdf`, `Contains_rdf`, `CompSet_rdf`
- **neo4j**: `Card_neo4j`, `Contains_neo4j`, `Match_neo4j`, `Unique_neo4j`, `CompSet_neo4j`, `MandAtt_neo4j`, `StringLength_neo4j`

## Variant Creation
Each template comes with a fixed set of parameters. A variant must put all parameters of a parameter in context. Therefore, each parameter must be included exactly once in the specification of a variant. 
A variant provides a sentence to explain the quality analysis and maps all template-parameters to the gaps in the sentence.

### Parameter Types
The available parameter types are:
`Text` (any String), `RegEx` (a regular expression for string-matching), `TextList` (a list of strings),  `Number`, `Boolean` (true or false), `Date`, `Time`, `DateTime`, `Enumeration` (limited list of specific options), `ComparisonOption` (equals, greater than, …)
There are some technology-specific parameters, namely:
- for XML: `XmlPath_Element`, `XmlPath_Property`
- for RDF: `RdfPath`, `IriList`
- for NEO4J: `NeoNodeLabel`, `NeoElementPath`, `NeoPropertyPath`

### Template Parameters
A list of all parameters and the existing variants of a template can be requested using the API call: 
```curl
curl --location --request GET 'http://<server>:<port>/template/variant/<technology>/<templateID>
```
This request also returns a list of currently existing variants in the variants definition schema within the `variants` array.
It always includes a section listing all available parameters with ID and type:
For the technology `xml` and the templateId `Match_xml`, this call returns:
```json
{
    "variants": [ ]
    "params": {
        "0": "Boolean",
        "1": "Text",
        "2": "XmlPath_Element",
        "3": "XmlPath_Property"
    }
}
```
Thus, the template `Match_xml` contains 4 parameters of type Boolean, Text, XmlPath_Element and XmlPath_Property.

## Variant Header
To start the definition of a new variant, we create a json file with the following structure:
```json
{
    "template": "<templateId>",
    "technology": "<technology>"
    "name": "<variantId>",
    "typeConstraint": true,
    "fragments": [ ]
}
```
- **template**: The definition starts with the ID of the template, which we want to extend, for example `Match_xml`.
- **technology**: Here, we specify which technology this template is associated with. Currently, we support `xml`, `rdf` and `neo4j`.
- **name**: This name builds an internal ID of the variant. It must be unique within a template and is only allowed to contain letters (`a-zA-Z`), digits (`0-9`), underscores (`_`) and hyphens (`-`).
- **typeConstraint**: This is an optional parameter that indicates whether the variant is formulated as a constraint (true) or as antipattern (false). A constraint defines a condition that shall be followed (“X must apply”). Meanwhile, an antipattern defines the search process for issues (“Search, where X does not apply”). The underlying analysis of QPM is based on antipatterns. Therefore, the formulation as constraint requires an additional negation, which must be realized via the variants. This value of the typeConstraint-parameter has no influence on the analysis or in the UI. [-------> A BIT DIFFICULT TO UNDERSTAND]
- **fragments**: This parameter contains an ordered list of fragments in the form of a JSON Array. Here, the text parts and the parameter gaps are specified in the order, in which they will appear in the UI. Each fragment is represented as a single JSON Object.

## Fragment types
A variant is built as a text with gaps. As such, the text must be split into fragments. For this, the order of fragments specified in the JSON file is important.

### Text Fragment
Text Fragments specify parts of the sentence that are displayed before, between or after parameters. 
Multiple text fragments next to each other are allowed but not recommended.
Text Fragments also include punctuation. Thus, this can lead to single text fragments at the end of a sentence that only contain a dot.
These fragments are specified as JSON Objects that include the attribute `text`, which includes the part of the sentence as string value.
```json
{"text": "For each"},
```

### Parameter Fragments
Parameter fragments specify the parameter gaps in the sentence. The minimal parameter specification looks like this:
```json
{   
    "name": "properties",
    "params": [3],
    "exampleValue": "Surname"},
```
- **name**: The name of the parameter is shown in the UI to the user as the label for the parameter gap. It should contain minimal information on the meaning of the parameter. If the name is not sufficient, the parameter can be explained further with a description. For good usability, this label should fit into the sentence grammatically.
- **params**: Each parameter fragment must be associated with at least one template-parameter. However, it can be associated with multiple parameters of the same type(!), if they shall always share the same value.
- **exampleValue**: This value shall help the user by representing a simple example. This value is just a simple textual value, which should fit grammatically into the sentence. This value is purely cosmetically, there is no validation.
The parameter-fragments can be supplemented with further optional parameters:
```json
{
    "newId": "XmlPath_Property_1",
    "description": "value that gets analysed",
    "plural": true,
    "map": {
        "true": "do not",
        "false": "do"
    },
    "defaultMap":"comparison_is"
}
```
- **description**: The description can hold valuable information on what the parameter means in the context. This can be a String of any length.
- **plural**: In some sentences, the grammar of the sentence demands a plural. In this case, the parameter should be annotated with `"plural":"true"`. This typically only appears on technology-specific parameters.
- **newId**: The parameter-fragment needs an associated ID to be addressable from the UI. This ID must be unique within the parameter-fragment IDs of a variant-declaration. Typically, these are generated automatically, but can also be set manually.
- **map**: Some values have many options. These options can be limited by specifying a map manually. Specifying a map results in the parameter becoming a dropdown-menu in the UI with a limited choice. The entries of the map always have the form `<actual value>: <shown choice>`.
- **defaultMap**: With the default maps, we can reuse existing maps. Currently available are: `comparison`, `comparison_negated`, `comparison_is`, `comparison_isnot`, `is`, `isnot`, `do`, `donot`, `does`, `doesnot`
Note, that sometimes the negation is required, if the formulation is a constraint instead of an antipattern (see typeConstraint).
The declaration of default maps can be found [here](https://github.com/Project-KONDA/pattern-based-quality-analysis/blob/master/qualitypatternmodel/src/qualitypatternmodel/textrepresentation/impl/ParameterFragmentImpl.java#L571).

### Parameter Predefinitions
It can occur in some variants, that template-parameters shall be filled with a fixed value. This can simplify the template, improve the readability and understandability of the end user.
Every template-parameter
A predefined parameter is specified as follows:
```json
{
    "params": [0],
    "value": "true"
},
```
Note, that in the example, the template-parameter with ID `0` is of type `Boolean` (see [Template Parameters](#template-parameters)). To declare a valid variant, the value must be valid to the type of the template-parameter.

## Examples

### Example 1: Default version
Each template comes with a default variant. For the Match_xml template, the example for the default variant is:
`For each {Actor} all {Surnames} {do} match {[A-Z][a-z][a-z]+}.`
The variant specification looks as follows:
```json
{
    "template":"Match_xml",
    "language":"xml",
    "name":"default-constraint",
	"typeConstraint":true,
    "fragments":[
        {"text":"For each"},
        {
            "name":"element",
            "params":[2],
            "exampleValue":"Actor",
            "description":"anchor for analysis"
        },
        {"text":"all"},
        {
            "name":"properties",
            "params":[3],
            "exampleValue":"Surnames",
            "description":"value that gets analysed",
            "plural":"true"
        },
        {
            "name":"do / do not",
            "params":[0],
            "defaultMap":"do not",
            "exampleValue":"do"
        },
        {"text":"match"},
        {
            "name":"a specific pattern (RegEx)",
            "params":[1],
            "exampleValue":"[A-Z][a-z][a-z]+"
        },
        {"text":"."}
    ]
}
```
Note that all four parameters found a place as parameter-fragments in this sentence. 
The second parameter-fragment `properties` is annotated with the attribute `"plural":"true"`, as the grammar of the sentence demands a plural.

### Example 2: Specialized version
One variant of the Match_xml template is specialized to target the validation of dates in the ISO 8601 format. The simplified variant sentence looks as follows:
`For each {Actor} all {Birthdates} match the ISO 8601 format.`
With this sentence, two parameters can be predefined with fixed values. Thus, the user input can be omitted.
Specifically, the parameters for the regular expression (parameter ID 1) and for the boolean (negate the regex, parameter ID 0) are predefined with specific values. This predefinitions can be found in the last two fragments. 
The variant specification looks as follows:
```json
{
    "template":"Match_xml",
    "language":"xml",
    "name":"iso-date",
	"typeConstraint":true,
    "fragments":[
        {"text":"For each"},
        {
            "name":"element",
            "params":[2],                            
            "exampleValue":"Actors",
            "description":"anchor for analysis"
        },
        {"text":"all"},
        {
            "name":"properties",
            "params":[3],
            "exampleValue":"Birthdates",
            "description":"value that gets analysed",
            "plural":"true"
        },
        {"text":"match the ISO 8601 format."},
        {
            "params":[0],
            "value": "true"
        },
        {
            "params":[1],
    		"value":"^\\d{4}(-[01]\\d(-[0-3]\\d(T[01]\\d:[0-5]\\d(:[0-5]\\d(\\.\\d+)?)?(\\+[01]\\d:[03]0)?)?)?)?$"
        }
    ]
}
```

## Glossar:
- **Generic Templates**: Generic Templates are a very abstract specification of a constraint, independent of a specific technology and of a specific problem. They define the logical structure of a data quality analysis in an abstract way.
- **Template**: Templates are generated based on generic templates. Templates build the basis of a technology-specific constraint. They include the logical structure of a quality analysis. This structure is supplemented by (template-)parameters that enable flexible application to multiple similar quality analyses. Per default, templates are not understandable for the common user.
- **(Template-)Parameter**: (Template-)Parameters are the way to include user-input into a template. Parameters possess a specific type. To successfully specify a parameter, it must be filled with a valid value according to its type. 
- **Variant**: Variants are used to represent templates as a sentence in natural language. They extend the template with a sentence-representation. For this, they define a mapping of the (template-)parameters into a gap text. A variant is built from an ordered list of fragments.
- **Fragments**: A fragment specifies a part of the sentence of a variant. This can be a text-fragment, specifying a part of the natural language sentence, or a parameter-fragment, which represents a gap for user input.
- **Constraint**: A constraint is a fully parameterized template, thus each parameter must be filled with a valid value. A constraint is specified to fit a specific data format. It can be used to analyze any database of the format.
- **Constraint-Formulation**: A constraint defines a condition that shall be followed (“X must apply”).
- **Antipattern-Formulation**: An antipattern defines the search process for issues (“Search, where X does not apply”). The underlying analysis of QPM is based on antipatterns.
