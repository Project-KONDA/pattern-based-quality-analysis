# Constraint Variant Definition Guide
This document is about the definition of variants that fit an already existing template.
Templates define a flexible quality analysis using different parameters. However, they cannot be understand by the common user.
Variants define a mapping from the complex templates to a simple user-comprehensible sentence.
Variants shall be based on a natural sentence, which puts the parameters of a template into context. This shall help users to understand how to use a template to define a quality analyis.
Variants are specified using a specific JSON format, which is explained in the following.

Creating new variants has the following advantages:
generally:
- the formulation of the sentence can be improved to enhance comprehensibility
- the order of parameters in the sentence can be changed
Variants for specific use cases:
- options of parameters can be limited
- parameters can be predefined with fixed values

However, a variant can not add complexity to the quality analysis (e.g. adding new conditions), as that the analysis itself is determined by the template.

## How-To Guide
This guide provides a quick overview and step-by-step instructions for managing variants in [Constrainify](https://gitlab.gwdg.de/aqinda/constrainify).
We assume that the Constrainify repository has already been pulled from Git.
Each **variant** is defined as a JSON file. The variant creation using JSON (see [Variant Creation](#variant-creation) is independent from constrainify.

### Create a New Variant
1. **Navigate to the Variants Directory**  
  - Within the files from the Constrainify repository, go to [`/configuration/variants`](https://gitlab.gwdg.de/aqinda/constrainify/-/tree/main/configuration/variants?ref_type=heads) where all variants are stored as JSON files.
2. **Create a new JSON file**
  - Create a new file with any name directly in the folder `/configuration/variants` or any subfolder.
  - Define the variant header (see [Variant Header](#variant-header)).
  - Define the fragments as variant body (see [Variant Body](#variant-body)).
3. **Ensure the Following**:
  - The name is unique across all variants of the same template
  - The target sentence is correctly depicted via fragments.
  - All parameters of the template are referenced exactly once, either as parameter-fragment or as parameter-predefinition.
5. **Apply Changes**  
  - Restart **Constrainify** to apply the changes: In the terminal navigate to the constrainify repository and execute:  `docker-compose up --force-recreate`

### Delete Variant
1. **Navigate to the Variants Directory**  
  - Go to `/configuration/variants` where all variants are stored as JSON files.
2. **Locate and delete the Variant File**
3. **Apply Changes**  
  - Ensure, that the environmental variable `OVERRIDE_VARIANTS` in the [docker-compose.yaml](https://gitlab.gwdg.de/aqinda/constrainify/-/blob/main/docker-compose.yaml) file is set as true.
  - Restart **Constrainify** to apply the changes.

### Change an existing Variant
1. **Navigate to the Variants Directory**  
  - Go to `/configuration/variants` where all variants are stored as JSON files.
2. **Locate and modify the Variant File**
  - optionally make a backup copy of the file first. If the file remains in the variants folder, make sure to change the name attribute of the new variant.
  - examples for changes include: 
    - restructure the sentence by reordering fragments or adapting text fragments
    - reducing the input options by adding a map 
    - predefining a parameter with a fixed value
3. **Apply Changes**  
  - Ensure, that the environmental variable `OVERRIDE_VARIANTS` in the docker-compose.yaml file is set as true.
  - Restart **Constrainify** to apply the changes.

### Create new Template
Currently, we offer no option to create new templates. Please report template-requests to the AQinDa team or create a [new issue](https://github.com/Project-KONDA/pattern-based-quality-analysis/issues). If possible, suggest a formulation as a constraint sentence.

## Templates
QPM currently supports three technologies, namely XML, RDF and Neo4j. Constrainify currently only supports XML.
For each technology, QPM by default provides a set of templates, each with at least one specified default-variant.
The list of templates can be requested from QPM using the following API call:
```curl
curl --location --request GET 'http://<server>:<port>/pattern/list/<technology>/template
```
This returns the following JSON:
```json
{
    "total": 9,
    "templates": [ ... ],
    "ids": [ … ]
}
```
The IDs of the currently available templates are the following:
- **xml**: `MandAtt_xml`, `CompSet_xml`, `Match_xml`, `Card_xml`, `InvalidLink_xml`, `StringLength_xml`, `Contains_xml`, `Unique_xml`, `MandCont_xml`
- **rdf**: `StringLength_rdf`, `Unique_rdf`, `Match_rdf`, `MandAtt_rdf`, `Card_rdf`, `Contains_rdf`, `CompSet_rdf`
- **neo4j**: `Card_neo4j`, `Contains_neo4j`, `Match_neo4j`, `Unique_neo4j`, `CompSet_neo4j`, `MandAtt_neo4j`, `StringLength_neo4j`

## Variant Creation
Each template comes with a fixed set of parameters. A variant must put all parameters of a parameter in context. Therefore, each parameter must be included exactly once in the specification of a variant. 
A variant provides a sentence to explain the quality analysis and maps all template-parameters to the gaps in the sentence.

### Variant Header
To start the definition of a new variant, we create json file with the following structure:
```json
{
    "template": "<templateId>",
    "technology": "<technology>",
    "name": "<variantId>",
    "typeConstraint": true,
    "fragments": [ ]
}
```
- **template**: The definition starts with the ID of the template, which we want to extend, for example `Match_xml`.
- **technology**: Here, we specify which technology this template is associated with. Currently, we support `xml`, `rdf` and `neo4j`.
- **name**: This name builds an internal ID of the variant. It must be unique within a template and is only allowed to contain letters (`a-zA-Z`), digits (`0-9`), underscores (`_`) and hyphens (`-`).
- **typeConstraint**: This is an optional parameter that indicates whether the variant is formulated as a constraint (true) or as antipattern (false). A constraint defines a condition that shall be followed (“X must apply”). Meanwhile, an antipattern defines the search process for issues (“Search, where X does not apply”). The underlying analysis of QPM is based on antipatterns. Therefore, the formulation as constraint requires an additional negation, which must be realized via the variants. This value of the typeConstraint-parameter has no influence on the analysis or in the UI.
- **fragments**: This parameter contains an ordered list of fragments in the Form of a JSON Array. Here, the text parts and the parameter gaps are specified in the order, in which they will appear in the UI. Each fragment is represented as a single JSON Object.

### Parameter Types
The available parameter Types are:
`Text` (any String), `RegEx` (a regular expression for string-matching), `TextList` (a list of strings),  `Number`, `Boolean` (true or false), `Date`, `Time`, `DateTime`, `Enumeration` (limited list of specific options), `ComparisonOption` (equals, greater than, …)
There are some technology-specific parameters, namely:
- **XML**: `XmlPath_Element`, `XmlPath_Property`
- **RDF** `RdfPath`, `IriList`
- **Neo4j**: `NeoNodeLabel`, `NeoElementPath`, `NeoPropertyPath`

### Available Parameters
A list of all parameters of a template can be requested using the API call of QPM:
```curl
curl --location --request GET 'http://<server>:<port>/template/variant/<technology>/<templateID>
```
This request also returns a list of currently existing variants in the variants definition schema in the `variants` array.
It always includes a section listing the parameters of the template with ID and type. All parameters **must** occur in each valid variant exactly once.
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
This call additionally returns a list of all currently available variants in the variants-array.

## Variant Body
The variant body specifies the variant-sentence with its parameters-gaps. As such, the sentence is split into fragments. Each fragment is represented as one JSON Object. The order of fragments specified in the JSON file is important.

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
    "defaultMap":"donot",
    "default":"do"
}
```
- **description**: The description can hold valuable information on what the parameter means in the context. This can be a String of any length.
- **plural**: In some sentences, the grammar of the sentence demands a plural. In this case, the parameter should be annotated with `"plural":"true"`. This typically only appears on technology-specific parameters.
- **newId**: The parameter-fragment needs an associated ID to be addressable from the UI. This ID must be unique within the parameter-fragment IDs of a variant-declaration. Typically, these are generated automatically, but can also be set manually.
- **map**: Some values have many options. These options can be limited by specifying a map manually. Specifying a map results in the parameter becoming a dropdown-menu in the UI with a limited choice. The entries of the map always have the form `<actual value>: <shown choice>`.
- **defaultMap**: With the default maps, we can reuse existing maps. Currently available are: `comparison`, `comparison_negated`, `comparison_is`, `comparison_isnot`, `comparison_are`, `comparison_arenot`, `is`, `isnot`, `are`, `are not`, `do`, `donot`, `does`, `doesnot`, `must` `must not`.
Note, that sometimes the negation is required, if the formulation is a constraint instead of an antipattern (see typeConstraint).
The declaration of default maps can be found [here](https://github.com/Project-KONDA/pattern-based-quality-analysis/blob/master/qualitypatternmodel/src/qualitypatternmodel/textrepresentation/impl/ParameterFragmentImpl.java#L571).
- **default**: When instantiating a new template, boolean values start as true and other values start as unset. This parameter allows to put in default values for every Parameter. This can be either a real value or a value from the set map.

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
