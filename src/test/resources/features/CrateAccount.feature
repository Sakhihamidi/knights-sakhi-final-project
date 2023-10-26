@CreateAccount
Feature: Create Account Test

@CreateAccount_1
  Scenario: Navigate to Create Account form and validate Form Title as Expected Create Primary Account Holder
    When Click on Create Primary Account button
    Then Validate form title header is Create Primary Account Holder
@CreateAccount_2
  Scenario: Create Account and validate account holder email
    When Click on Create Primary Account button
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
      When Click on Create Primary Account button
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








