# jobrunr-oracle-issue

Sample application desmostrating error while running jobrunr with oracle database

## Prerequisite

- Java 17
- Oracle 12

## Setup

Change the database configurations [application.yml](/src/main/resources/application.yml) with proper `url`, `username`, `password`.


## Build

```shell
mvn clean install -DskipTests
```

## Running the application


### From the command line:

```shell
mvn spring-boot:run
```

### From your IDE

Execute the `main` method from: `com.jobrunner.oracle.jobrunroracle.JobrunrOracleApplication#main`


