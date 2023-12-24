## Overview

This project is a test automation framework developed in Java using Selenium and Cucumber BDD for both GUI and API testing. 
It aims to provide a scalable and maintainable solution for automating tests in a behavior-driven development (BDD) approach.

## Features

- **GUI Automation:** Selenium WebDriver is used for automating web applications for testing purposes.
- **API Automation:** API testing is implemented using RestAssured Library.
- **Cucumber BDD:** Behavior-driven development approach to write tests in simple English sentences.
- **Page Object Model (POM):** Enhances test maintenance and reduces code duplication by organizing page objects.

## Prerequisites

- Java 11 or higher
- Maven
- Web browser (for GUI tests)


## Getting Started

1. Clone the repository:

 git clone https://github.com/busraun/ContactListAppDemo


2. Run the tests:
from feature files or CukesRunner class


## Project Structure

1. src/test/java/API_ContactList: Holds the API test scripts.

2. src/test/java/cukesRunner: Runs whole project.

3. src/test/java/pages: Holds every single pages in the App.

4. src/test/java/step_defs: Holds step definitions from the related feature file.

5. src/test/java/utilities: Holds Driver and TestDataGenerator classes.

6. src/test/resources: Contains feature files for Cucumber BDD.




## Contributing
Contributions are welcome! If you have suggestions or find issues, please open an issue or create a pull request.
