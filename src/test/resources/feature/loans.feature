Feature: Loan eligibility calculator

  Background: Launch the ANZ loan calculator page
    Given Launch the ANZ loan calculator web page
    And Provide all the required details with respective to loan calculation


  Scenario: Verify with the loan estimation value based upon the user provides the details
    Then Verify with loan estimation value


  Scenario: Verify whether loan calculator form gets clear when user clicks on start over
    Then Verify whether the loan calculation form gets clear immediately once the user clicks on start over


  Scenario: Verify for the appropriate message when user provides an invalid data
   Then Verify for the appropriate message when user provides an invalid data in loan claculator form