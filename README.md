# case-study-46e1f868-26e2-49f8-88ec-b35f3f856ed7

Table of Contents

- [1. Aufgabenstellung](#1-aufgabenstellung)
- [2. Setup Steps](#2-setup-steps)
  - [2.1 Create Multimodule POM](#21-create-multimodule-pom-file)
  - [2.2 Create Domain Layer](#22-create-domain-module)
  - [2.3 Create Presentation Layer](#23-create-presentation-layer-rest-api)
  - [2.4 Create Infrastructure Layer](#24-create-infrastructure)
  - [2.5 Create Application Layer](#25-create-application-layer)
  - [2.6 Activate Open API](#26-activate-openai)
- [3. Run Project](#3-run-project)
- [4. Dependencies](#4-deps)

## 1. Aufgabenstellung

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


## 2. Setup Steps

### 2.1 Create Multimodule POM File

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

### 2.2 Create Domain Module

```
mvn archetype:generate -DgroupId=de.vidaee.roombookingsystem -DartifactId=room-booking-system-domain \
-DinteractiveMode=false -Dversion=1.0.0-SNAPSHOT
```
- delete auto generated files from main and src folder


### 2.3 Create Presentation Layer (REST API)

```
mvn archetype:generate -DgroupId=de.vidaee.roombookingsystem -DartifactId=room-booking-system-presentation \
-DinteractiveMode=false -Dversion=1.0.0-SNAPSHOT
```

- delete auto generated files from main and src folder

- use "https://start.spring.io" to create web rest package and merge files

build spring boot
```
cd roombookingsystem-rest-api
mvn package spring-boot:repackage
```

### 2.4 Create Infrastructure
```
mvn archetype:generate -DgroupId=de.vidaee.roombookingsystem -DartifactId=room-booking-system-infrastructure \
-DinteractiveMode=false -Dversion=1.0.0-SNAPSHOT
```

- delete auto generated files from main and src folder


### 2.5 Create Application Layer
```
mvn archetype:generate -DgroupId=de.vidaee.roombookingsystem -DartifactId=room-booking-system-application \
-DinteractiveMode=false -Dversion=1.0.0-SNAPSHOT
```

### 2.6 Activate OpenAI

```
    d<dependency>
      <groupId>org.springdoc</groupId>
      <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
      <version>3.0.0</version>
    </dependency>

```

- swagger ui is available at /swagger-ui.html
- swagger docs: /v3/api-docs


## 3. Run Project

```
//root Folder
java -jar roombookingsystem-rest-api/target/roombookingsystem-rest-api-1.0.0-SNAPSHOT.jar 
```

or

```
//Presentation Folder

mvn spring-boot:run
```



### 4. Deps

vfox
─┬java
│ └──v25.0.1+8
┬maven
│ └──v4.0.0-rc-5

.zshrc

### vFox (versionFox)
eval "$(vfox activate zsh)"


```
mvn clean flyway:migrate -Dflyway.configFiles=./src/main/java/de/vidaee/roombookingsystem/persistence/db/flyway.config
```
