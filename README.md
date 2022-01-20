# Prevent Screen from sleeping

This utility project can be used to prevent the computer from sleeping/locking which can be 
extremely helpful when running scripts that want your computer/laptop to stay awake.

## Requirements

For building the application you need:

- [JDK 11](https://www.oracle.com/java/technologies/downloads/#java11-mac)
- [Maven 3](https://maven.apache.org)

For running the application you need a JRE installed on your system.

## To Build and Package the application

```shell
mvn clean install
```

## Running the application locally

There are several ways to run this Java application on your local machine. One way is to execute
the `main` method in the `com.pj.app.ScreenActive` class from your IDE.

Alternatively you can use the java -jar command.

```shell
java -jar target/screen-active-1.0-SNAPSHOT-shaded.jar
```
