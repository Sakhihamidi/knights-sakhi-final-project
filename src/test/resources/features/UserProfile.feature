@UserProfile
Feature: User Profile Test

@UserProfile_1
  Scenario: Navigate to Valid Portal then click on profile button validate information is in Profile Side Drawer is correct.
    When Click on Login button
    When Enter user name in user name filed as supervisor
    When Enter password in password filed as tek_supervisor
    When Click on Sign In button
    When Click on Profile button
    Then Validate Name as Supervisor
    Then Validate Username as supervisor

@UserProfile_2
  Scenario: Navigate to Valid Portal then click on profile button and click on Logout button and you navigate yo home page
    When Click on Login button
    When Enter user name in user name filed as supervisor
    When Enter password in password filed as tek_supervisor
    When Click on Sign In button
    When Click on Profile button
    When Click on Logout button
    Then Validate navigation to homepage

