# Webzio Project

This repository contains the Webzio project with information, setup, and guidelines for development and testing.

## Table of Contents

- [Setup](#setup)
- [Maven Build](#maven-build)
- [Testing](#testing)
- [Cucumber Feature](#cucumber-feature)
---

## Setup

1. **Clone the repository:**

    ```bash
    git clone https://github.com/your-username/webzio.git
    ```

2. **Navigate to the project directory:**

    ```bash
    cd webzio
    ```

3. **Update the Java version in the `pom.xml` file.**

## Maven Build

To build the project using Maven, run the following command:

```bash
mvn clean install
```
If you encounter dependency resolution issues, try running with the -U option:

```bash
mvn clean install -U
```
## Testing 

Open feature file e.g news.feauture and from the left side nexto to the Scenario select Play option 
Feature: Web Content Filtering

## Cucumber Feature 

```bash
Scenario: Making a GET request to the API
  Given I have the API query ""
  When I make a GET request to the API
  Then the API should respond with status code 200
```
