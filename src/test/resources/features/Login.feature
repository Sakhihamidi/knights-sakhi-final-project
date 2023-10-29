@Login @all
Feature: Login Tests

  @Login_1
  Scenario: Navigate to login by clicking on Login button and enter valid csr user
    When Click on Login button
    When Enter user name in user name filed as supervisor
    When Enter password in password filed as tek_supervisor
    When Click on Sign In button
    Then Validate home page header title as "Customer Service Portal"

  @Login_2
  Scenario Outline: Navigate to login to validate error message as expected
    When Click on Login button
    When Enter userName as "<UserName>"
    When Enter password as "<Password>"
    When Click on Sign In button
    Then Validate error message as "<ErrorMessage>"

    Examples:
      | UserName       | Password       | ErrorMessage|
      | supervisor     | Wrong Password | ERROR       |
      | Wrong UserName | tek_supervisor | ERROR       |

