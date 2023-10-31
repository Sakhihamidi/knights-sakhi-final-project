@CreateAccount @all
Feature: Create Account Test


  Background: Click Steps  for all scenarios
  When Click on Create Primary Account button


  @CreateAccount_1
  Scenario: Navigate to Create Account form and validate Form Title as Expected Create Primary Account Holder
    Then Validate form title header is Create Primary Account Holder

@CreateAccount_2
  Scenario: Create Account and validate account holder email
    When Enter email address
    When Select title or prefix
    When Enter first name
    When Enter last name
    When Select gender
    When Select marital status
    When Enter employment status
    When Enter date of birth
    When Click on Create Account button
    Then Validate form title header is Sign up your account
    Then Validate email address

  @CreateAccount_3
  Scenario: Create account with existing email address and validate error message as expected
      When Enter an existing email address
      When Select title or prefix
      When Enter first name
      When Enter last name
      When Select gender
      When Select marital status
      When Enter employment status
      When Enter date of birth
      When Click on Create Account button
      Then Validate create account error message as ERROR








