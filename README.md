# case-study-46e1f868-26e2-49f8-88ec-b35f3f856ed7

Table of Contents

[1. Aufgabenstellung](#aufgabenstellung)

## Aufgabenstellung

**Aufgabe**:
Entwickle ein Backend für ein Raumbuchungssystem mit REST-Endpunkten.

**Usecase**:
Raumbuchungssystem

**Datenobjekte**:
Raum
Buchung
Nutzer

**Architektur**:
Domain-Driven-Design
Onion-Architecture

**Technik**:
- Spring Boot als Backend
- Nur REST-Endpunkte
- Keine Authentifizierung
- Swagger-ui zur Anzeige der Endpunkte
- Spring Data JDBC als Persistence-Layer
- Postgresql als Datenbank
- Data Migration Tool nicht notwendig
**Optional**:
- Frontend mit Angular...

---


## Setup Steps

### Create Multimodule POM File

```
mvn archetype:generate -DgroupId=de.vidaee.roombookingsystem -DartifactId=room-booking-system -DarchetypeArtifactId=maven-archetype-quickstart
```

Change packing mode to "pom"

```
<packaging>jar</packaging>

<packaging>pom</packaging>
```

- delete APP.java
- delete APPTest.java

- add Java Properties

- set dependencies

```
    <dependency>
      <groupId>jakarta.inject</groupId>
      <artifactId>jakarta.inject-api</artifactId>
      <version>2.0.1</version>
    </dependency>
```

### Create Domain Module

```
mvn archetype:generate -DgroupId=de.vidaee.roombookingsystem -DartifactId=roombookingsystem-domain \
-DinteractiveMode=false -Dversion=1.0.0-SNAPSHOT
```
- delete auto generated files from main and src folder


### Create Presentation Layer (REST API)

```
mvn archetype:generate -DgroupId=de.vidaee.roombookingsystem -DartifactId=roombookingsystem-rest-api \
-DinteractiveMode=false -Dversion=1.0.0-SNAPSHOT
```

- delete auto generated files from main and src folder

- use "https://start.spring.io" to create web rest package and merge files

build sprin boot
```
cd roombookingsystem-rest-api
mvn package spring-boot:repackage
```

### Create Data Layer
```
mvn archetype:generate -DgroupId=de.vidaee.roombookingsystem -DartifactId=roombookingsystem-data \
-DinteractiveMode=false -Dversion=1.0.0-SNAPSHOT
```

- delete auto generated files from main and src folder


Run Project

```
//root Folder
java -jar roombookingsystem-rest-api/target/roombookingsystem-rest-api-1.0.0-SNAPSHOT.jar 
```


#### Deps

vfox
─┬java
│ └──v25.0.1+8
┬maven
│ └──v4.0.0-rc-5

.zshrc

### vFox (versionFox)
eval "$(vfox activate zsh)"

