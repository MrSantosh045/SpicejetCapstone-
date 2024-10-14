# Automated Testing of the SpiceJet Flight Booking System

## Table of Contents
- [Project Title](#project-title)
- [Description](#description)
- [Test Objectives](#test-objectives)
- [Preconditions](#preconditions)
- [Demo URL](#demo-url)
- [Technologies Used](#technologies-used)
- [Task Description](#task-description)
- [Test Cases](#test-cases)
  - [Positive Scenarios](#positive-scenarios)
  - [Negative Scenarios](#negative-scenarios)
- [Setup and Installation](#setup-and-installation)
- [Usage](#usage)
- [Running the Test Suite Automatically](#running-the-test-suite-automatically)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

---

## Project Title

**Automated Testing of the SpiceJet Flight Booking System**

## Description

This project aims to develop an automated testing framework for the SpiceJet flight booking system using Java and Selenium WebDriver within the Eclipse IDE. The automation scripts will navigate through the SpiceJet website, perform various booking-related actions, and validate the functionality to ensure a seamless user experience.

## Test Objectives

- **Automate Functional Testing**: Develop scripts to automatically test the functionalities of the SpiceJet flight booking system.
- **Ensure Reliability**: Verify that all features work as expected under different scenarios.
- **Enhance Efficiency**: Reduce manual testing efforts by automating repetitive test cases.
- **Validate User Experience**: Ensure that the booking process is smooth and error-free for users.

## Preconditions

- The user must be logged in to the SpiceJet ticket booking application.
- The user must have access to the booking feature.

## Demo URL

You can use the following URL for testing:
[https://www.spicejet.com/](https://www.spicejet.com/)

## Technologies Used

- **Programming Language**: Java
- **Automation Tool**: Selenium WebDriver
- **IDE**: Eclipse
- **Build Tool**: Maven
- **Testing Framework**: TestNG/JUnit
- **Version Control**: Git

## Task Description

1. **Set Up Selenium Project**
   - Initialize a Selenium project in Java using Eclipse.
   - Configure Maven dependencies for Selenium and TestNG/JUnit.

2. **Open Web Browser and Navigate**
   - Write code to launch a web browser (e.g., Chrome) and navigate to [SpiceJet Flight Booking System](https://www.spicejet.com/).

3. **Validate Sign-Up Page**
   - Automate the process of filling out mandatory and non-mandatory fields on the Sign-Up page.
   - Ensure proper validation messages are displayed for incorrect inputs.

4. **Login Functionality**
   - Automate logging in using a dummy email ID and password.
   - Handle popup fields that appear after clicking the Login button on the top of the page.

5. **Search for Flights**
   - Automate flight search by entering dummy origin and destination information.
   - Cover the following trip types:
     - **One-way**
     - **Round Trip**

6. **Select Flight and Proceed to Booking**
   - Automate selecting a flight from the search results.
   - Navigate to the booking page.

7. **Fill Booking Form**
   - Automate filling out the booking form with dummy passenger details and payment information.
   - Ensure all mandatory fields are correctly populated.

8. **Verify Booking Success**
   - Verify that the booking was successful by checking for a booking confirmation message on the resulting web page.

9. **Validate Booking Page Fields**
   - Automate validation of the following fields on the booking page:
     - **Check-in**
     - **Flight Status**
     - **Manage Booking**

10. **Close Web Browser**
    - Automate the process of closing the web browser once testing is complete.

11. **Automate Test Suite Execution**
    - Write scripts to run the test suite automatically on a regular basis (e.g., using cron jobs or Jenkins for CI/CD integration).

## Test Cases

### Positive Scenarios

- **Successful Login**: Verify that a user can log in with valid credentials.
- **Flight Search**: Verify that flights can be searched successfully with valid origin and destination.
- **One-way Trip Booking**: Verify booking flow for one-way trips completes successfully.
- **Round Trip Booking**: Verify booking flow for round trips completes successfully.
- **Form Validation**: Ensure all mandatory fields accept valid inputs without errors.
- **Booking Confirmation**: Confirm that a booking confirmation message appears after successful booking.
- **Field Validation**: Ensure check-in, flight status, and manage booking features work as expected.

### Negative Scenarios

- **Invalid Login**: Attempt to log in with incorrect email or password and verify appropriate error messages.
- **Flight Search with Invalid Data**: Search for flights with invalid origin or destination and verify error handling.
- **Incomplete Booking Form**: Attempt to submit the booking form with missing mandatory fields and verify validation messages.
- **Invalid Payment Information**: Enter incorrect payment details and verify that the system rejects the booking.
- **Navigation Errors**: Attempt to navigate to restricted pages without proper authentication and verify access is denied.



## Running the Test Suite Automatically

To run the test suite automatically on a regular basis, follow these steps:

1. **Set Up Continuous Integration (CI)**
   - Use a CI tool like Jenkins to schedule automated test runs.

2. **Create a Jenkins Job**
   - Configure a new Jenkins job linked to your Git repository.
   - Set build triggers (e.g., daily, weekly) as per requirements.

3. **Configure Build Steps**
   - Add build steps to install dependencies, compile the project, and execute test cases using Maven commands:
     ```bash
     mvn clean install
     mvn test
     ```

4. **Post-build Actions**
   - Configure post-build actions to archive test reports and notify stakeholders of test results.

## Contributing

Contributions are welcome! Please follow these steps to contribute:

1. **Fork the Repository**
2. **Create a Feature Branch**
   ```bash
   git checkout -b feature/YourFeature
   ```
3. **Commit Your Changes**
   ```bash
   git commit -m "Add Your Feature"
   ```
4. **Push to the Branch**
   ```bash
   git push origin feature/YourFeature
   ```
5. **Create a Pull Request**


## Contact

For any queries or support, please contact:

- **Name**: Santosh Sonawane
- **Email**: Mrsantosh045@example.com
- **LinkedIn**: https://www.linkedin.com/in/santosh-sonawane-8230ab178/
---

*Happy Testing! 🚀*
