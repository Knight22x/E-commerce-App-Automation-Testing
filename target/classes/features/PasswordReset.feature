Feature: PasswordReset

  #SC3- User could reset his/her password successfully
  Scenario:The user enters their valid email to reset their password
    Given The user navigates to the Login Page
    And The user clicks on the Forgot password? button
    When The user enters an existing valid email
    And The user clicks on the Recover button
    Then The user will be sent an email with instructions to reset their password



