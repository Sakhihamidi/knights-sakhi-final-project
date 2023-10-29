
@HomePage
Feature:HomePage Test

  #Scenarios and Stories
  #Home Page
  ##Validate When user navigate to home page title is TEK Insurance App and create Primary Account Button is exist
 @HomePage-1
  Scenario:Page title should be TEK Insurance App and Validate Create Primary Account Button is exist
    Then Validate home page header title is "Tek Insurance UI"
    Then Validate "Create Primary Account" Button is exist
    Then validate page title header is "TEK Insurance UI"
