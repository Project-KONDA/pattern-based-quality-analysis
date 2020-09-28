# Quality Pattern Model

> Proof of concept for the definition of generic patterns, independent of database technology.


## About the Project

To localize data-inherent quality problems, we present a model-driven approach to analyze the quality of research data.
It allows abstracting from the underlying database technology. 
Based on the observation that many quality problems show anti-patterns, generic analysis patterns can be formulated that are generic concerning the database format and technology. 
This pattern can be adapted to a specific database technology and concretisized for a domain-specific database format. 
The resulting concrete patterns are used to locate quality problems in specific databases.
As proof of concept, this project realizes this approach for XML databases.

The approach is described in detail in the research paper "[Detecting Quality Problems in Research Data: A Model-Driven Approach](https://doi.org/10.5281/zenodo.4019095)", published in the Conference "[MODELS2020](http://www.modelsconference.org)".


## Meta

Arno Kesper - arno.kesper@uni-marburg.de

Viola Wenz - viola.wenz@uni-marburg.de

Gabriele Taentzer - taentzer@uni-marburg.de


## Built With

* [Eclipse Modelling Framework](https://www.eclipse.org/modeling/emf/)
* [Eclipse Sirius](https://www.eclipse.org/sirius/)
* [XQuery](https://www.w3.org/XML/Query/)
* [BaseX](https://basex.org)


## Context : Project "KONDA"

The Project "[KONDA](https://zenodo.org/communities/konda-project)" is a research project of three partners: 
* [Deutsches Dokumentationszentrum für Kunstgeschichte](https://www.uni-marburg.de/de/fotomarburg) (Foto Marburg)
* Prof. Gabriele Taentzer of the [Departement for Mathematics and Informatics](https://www.uni-marburg.de/en/fb12) (FB12) of Philipps Univerisity Marburg 
* [State Library of University Göttingen] (https://www.sub.uni-goettingen.de) (SUB)
It is funded by BMBF for three years (2019-2022).


## License
???