$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("loans.feature");
formatter.feature({
  "line": 1,
  "name": "Loan eligibility calculator",
  "description": "",
  "id": "loan-eligibility-calculator",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "Launch the ANZ loan calculator page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Launch the ANZ loan calculator web page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Provide all the required details with respective to loan calculation",
  "keyword": "And "
});
formatter.match({
  "location": "LoanCalculator.launchTheANZLoanCalculatorWebPage()"
});
formatter.result({
  "duration": 6345260900,
  "status": "passed"
});
formatter.match({
  "location": "LoanCalculator.provideAllTheRequiredDetailsWithRespectiveToLoanCalculation()"
});
formatter.result({
  "duration": 67500,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Verify with the loan estimation value based upon the user provides the details",
  "description": "",
  "id": "loan-eligibility-calculator;verify-with-the-loan-estimation-value-based-upon-the-user-provides-the-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "Verify with loan estimation value",
  "keyword": "Then "
});
formatter.match({
  "location": "LoanCalculator.verifyWithLoanEstimationValue()"
});
formatter.result({
  "duration": 35200,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "Launch the ANZ loan calculator page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Launch the ANZ loan calculator web page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Provide all the required details with respective to loan calculation",
  "keyword": "And "
});
formatter.match({
  "location": "LoanCalculator.launchTheANZLoanCalculatorWebPage()"
});
formatter.result({
  "duration": 5141291700,
  "status": "passed"
});
formatter.match({
  "location": "LoanCalculator.provideAllTheRequiredDetailsWithRespectiveToLoanCalculation()"
});
formatter.result({
  "duration": 33000,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Verify whether loan calculator form gets clear when user clicks on start over",
  "description": "",
  "id": "loan-eligibility-calculator;verify-whether-loan-calculator-form-gets-clear-when-user-clicks-on-start-over",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "Verify whether the loan calculation form gets clear immediately once the user clicks on start over",
  "keyword": "Then "
});
formatter.match({
  "location": "LoanCalculator.verifyWhetherTheLoanCalculationFormGetsClearImmediatelyOnceTheUserClicksOnStartOver()"
});
formatter.result({
  "duration": 56300,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "Launch the ANZ loan calculator page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Launch the ANZ loan calculator web page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Provide all the required details with respective to loan calculation",
  "keyword": "And "
});
formatter.match({
  "location": "LoanCalculator.launchTheANZLoanCalculatorWebPage()"
});
formatter.result({
  "duration": 5832146800,
  "status": "passed"
});
formatter.match({
  "location": "LoanCalculator.provideAllTheRequiredDetailsWithRespectiveToLoanCalculation()"
});
formatter.result({
  "duration": 72200,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Verify for the appropriate message when user provides an invalid data",
  "description": "",
  "id": "loan-eligibility-calculator;verify-for-the-appropriate-message-when-user-provides-an-invalid-data",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "Verify for the appropriate message when user provides an invalid data in loan claculator form",
  "keyword": "Then "
});
formatter.match({
  "location": "LoanCalculator.verifyForTheAppropriateMessageWhenUserProvidesAnInvalidDataInLoanClaculatorForm()"
});
formatter.result({
  "duration": 43300,
  "status": "passed"
});
});