Feature: Login

  #SC2- User could log in with valid email and password
  Scenario:The user enters their email and password to log in successfully to the website
    Given The user navigates to the Login Page
    When The user enters their valid login credentials
    And The user clicks on the Login Button
    Then The user will be logged in successfully
