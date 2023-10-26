@Accounts
Feature: Account Tests

  @Accounts_1
  Scenario:Navigate to Customer Service Portal with valid CSR credentials and navigate to Accounts verify 5 row /page is default
    When Click on Login button
    When Enter user name in user name filed as supervisor
    When Enter password in password filed as tek_supervisor
    When Click on Sign In button
    When Click on Accounts button
    Then Validate 5 rows as default

  @Accounts_2
  Scenario: Navigate to Customer Service Portal with valid CSR credentials and navigate to Accounts change show
  per page to 10, 25, 50 and validate table records per page according to selected show per page.
    When Click on Login button
    When Enter user name in user name filed as supervisor
    When Enter password in password filed as tek_supervisor
    When Click on Sign In button
    When Click on Accounts button
    When Change item per page to "Show 5"
    Then Validate accounts table have "Show 5" rows
    When Change item per page to "Show 10"
    Then Validate accounts table have "Show 10" rows
    When Change item per page to "Show 25"
   # Then Validate accounts table have "25" rows
    When Change item per page to "Show 50"
   # Then Validate accounts table have "50" rows