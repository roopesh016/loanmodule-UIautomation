$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("loans.feature");
formatter.feature({
  "line": 1,
  "name": "Loan estimation calculator",
  "description": "",
  "id": "loan-estimation-calculator",
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
formatter.match({
  "location": "LoanCalculator.launchTheANZLoanCalculatorWebPage()"
});
formatter.result({
  "duration": 6260891400,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Verify with the loan estimation value based upon the user provides the details",
  "description": "",
  "id": "loan-estimation-calculator;verify-with-the-loan-estimation-value-based-upon-the-user-provides-the-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "Provide all the required details with respective to loan calculation",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Verify with loan estimation value",
  "keyword": "Then "
});
formatter.match({
  "location": "LoanCalculator.provideAllTheRequiredDetailsWithRespectiveToLoanCalculation()"
});
formatter.result({
  "duration": 652904400,
  "status": "passed"
});
formatter.match({
  "location": "LoanCalculator.verifyWithLoanEstimationValue()"
});
formatter.result({
  "duration": 780976500,
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
formatter.match({
  "location": "LoanCalculator.launchTheANZLoanCalculatorWebPage()"
});
formatter.result({
  "duration": 5705874000,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Verify whether loan calculator form gets clear when user clicks on start over",
  "description": "",
  "id": "loan-estimation-calculator;verify-whether-loan-calculator-form-gets-clear-when-user-clicks-on-start-over",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "Provide all the required details with respective to loan calculation",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Verify whether the loan calculation form gets clear immediately once the user clicks on start over",
  "keyword": "Then "
});
formatter.match({
  "location": "LoanCalculator.provideAllTheRequiredDetailsWithRespectiveToLoanCalculation()"
});
formatter.result({
  "duration": 894056400,
  "status": "passed"
});
formatter.match({
  "location": "LoanCalculator.verifyWhetherTheLoanCalculationFormGetsClearImmediatelyOnceTheUserClicksOnStartOver()"
});
formatter.result({
  "duration": 11086011200,
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
formatter.match({
  "location": "LoanCalculator.launchTheANZLoanCalculatorWebPage()"
});
formatter.result({
  "duration": 5545573800,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Verify for the appropriate message when user provides an invalid data",
  "description": "",
  "id": "loan-estimation-calculator;verify-for-the-appropriate-message-when-user-provides-an-invalid-data",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 19,
  "name": "Provide an invalid details with respective to loan calculation",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Verify for the appropriate message when user provides an invalid data in loan claculator form",
  "keyword": "Then "
});
formatter.match({
  "location": "LoanCalculator.provideAnInvalidDetailsWithRespectiveToLoanCalculation()"
});
formatter.result({
  "duration": 652637200,
  "status": "passed"
});
formatter.match({
  "location": "LoanCalculator.verifyForTheAppropriateMessageWhenUserProvidesAnInvalidDataInLoanClaculatorForm()"
});
formatter.result({
  "duration": 772999000,
  "status": "passed"
});
});