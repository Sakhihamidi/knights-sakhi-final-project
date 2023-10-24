@Login
Feature: Login Tests
@Login_1
  Scenario: Navigate to login by clicking on Login button and enter valid csr user
    When Click on Login button
    When Enter user name in user name filed as supervisor
    When Enter password in password filed as tek_supervisor
    When Click on Sign In button
    Then Validate home page header title is Customer Service Portal

  @Login_2
  Scenario: Navigate to login and enter wrong USERNAME and validate error message as expected
    When Click on Login button
    When Enter Wrong user name in user name field
    When Enter password in password filed as tek_supervisor
    When Click on Sign In button
    Then Validate error message is User not found

  @Login_3
  Scenario: Navigate to login and enter wrong PASSWORD and validate error message as expected
    When Click on Login button
    When Enter user name in user name filed as supervisor
    When Enter wrong  password in password field
    When Click on Sign In button
    Then Validate error message is User not found
