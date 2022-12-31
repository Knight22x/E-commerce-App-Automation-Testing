@smoke
Feature: Registration

  #SC1- User could register with valid data
  Scenario:The user fills the required fields with valid data and complete registration successfully
    Given The user navigates to the Registration webpage
    When The user enters their first name
    And The user enters their last name
    And The user enters their email
    And The user enters their chosen password
    And The user enters their password again for confirmation
    And The user clicks on the registration button
    Then The user will have an account created successfully