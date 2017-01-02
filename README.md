# Pasadena  [![Build Status](https://travis-ci.org/codeheap/Pasadena.svg?branch=master)](https://travis-ci.org/codeheap/Pasadena)
A REST Service based on Wildfly Swarm and Docker

## Project Pasadena
Pasadena is a sample JEE7 Project, showing how to use the same code base for different target platforms.

The Cheesecake Factory provides meals as a REST Service. This service can be deployed as a standalone
Wildfly Swarm package or a WAR wich can be deployed to an JEE7 AppServer or as a docker image.

The different builds are made with Gradle.

The following technologies are used:
- JEE7 (JAX-RS / CDI)
- Gradle 3 as build tool
- Wildlfly Swarm
- Docker

###Licence

Copyright 2017 Thomas Hasler

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
