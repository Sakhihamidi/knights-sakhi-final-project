@Plans @all
Feature:Plans Tests

  Background: Login tests before all steps
    When Click on Login button


  @Plans_1
  Scenario: Navigate to Customer Service Portal with valid CSR credentials and navigate to Plans Page. Validate 4 row of data is present.
    When Enter user name in user name filed as supervisor
    When Enter password in password filed as tek_supervisor
    When Click on Sign In button
    When Click on Plans
    Then Validate 4 row of data is present

@Plans_2
  Scenario: Navigate to Customer Service Portal with valid CSR credentials and navigate to Plans Page. Then validate Create Date is today's date in (EST Time zone) and Date Expire is a day after (EST Time Zone)
    When Enter user name in user name filed as supervisor
    When Enter password in password filed as tek_supervisor
    When Click on Sign In button
    When Click on Plans
    Then Validate Create Date is today's date in EST Time zone
    Then Validate Date Expire is a day after EST Time Zone