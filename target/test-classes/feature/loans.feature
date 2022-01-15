Feature: Loan estimation calculator

  Background: Launch the ANZ loan calculator page
    Given Launch the ANZ loan calculator web page



  Scenario: Verify with the loan estimation value based upon the user provides the details
    And Provide all the required details with respective to loan calculation
    Then Verify with loan estimation value


  Scenario: Verify whether loan calculator form gets clear when user clicks on start over
    And Provide all the required details with respective to loan calculation
    Then Verify whether the loan calculation form gets clear immediately once the user clicks on start over


  Scenario: Verify for the appropriate message when user provides an invalid data
    And Provide an invalid details with respective to loan calculation
    Then Verify for the appropriate message when user provides an invalid data in loan claculator form