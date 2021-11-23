# java-cli-maven-spring-failsafe-jacoco-cucumber-junit-car-data

## Description
A POC for spring app using JUnit5
and cucumber framework with jacoco, failsafe
and surefire plugins. Define a parameter
type of `example.model.Car`in the test
runner class.

## Tech stack
- java
- maven
  - spring
  - junit
  - jacoco
  - surefire
  - failsafe
  - cucumber

## Docker stack
- maven:3-openjdk-17

## To run
`sudo ./install.sh -u`

## To stop
`sudo ./install.sh -d`

## For help
`sudo ./install.sh -h`

## Credit
- [Code concept] (https://stackoverflow.com/questions/67847818/maven-junit-5-cucumber-not-running-tests)
- [Build concept] (https://github.com/citrusframework/citrus-samples/blob/main/samples-junit/sample-junit5/pom.xml)
- [Parameter Type code base] (https://thepracticaldeveloper.com/cucumber-guide-3-step-definitions-state/)
