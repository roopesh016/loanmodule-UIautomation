package loancalculatortests;

import assertions.LoanCalculatorAssertions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.LoanCalculatorPage;

public class LoanCalculator {

    LoanCalculatorPage loanCalculatorPage = new LoanCalculatorPage();

    LoanCalculatorAssertions loanCalculatorAssertions = new LoanCalculatorAssertions();

    @Given("^Launch the ANZ loan calculator web page$")
    public void launchTheANZLoanCalculatorWebPage() {
        loanCalculatorPage.launchBrowser();
        loanCalculatorPage.openUrl();
    }

    @And("^Provide all the required details with respective to loan calculation$")
    public void provideAllTheRequiredDetailsWithRespectiveToLoanCalculation() {
        loanCalculatorPage.selectApplicationType("singleType");
        loanCalculatorPage.selectNumberOfDependants("0");
        loanCalculatorPage.selectProperty("homelivein");
        loanCalculatorPage.setLoanCalculatorPrerequisiteData("80000","10000","500","0","100","0","10000");
        loanCalculatorPage.clickBorrowButton();
    }

    @Then("^Verify with loan estimation value$")
    public void verifyWithLoanEstimationValue() {
       loanCalculatorAssertions.validationOfLoanEstimatedAmount(loanCalculatorPage.getLoanAmountBorrowResult());
       loanCalculatorPage.closeBrowser();
    }

    @Then("^Verify whether the loan calculation form gets clear immediately once the user clicks on start over$")
    public void verifyWhetherTheLoanCalculationFormGetsClearImmediatelyOnceTheUserClicksOnStartOver() {
        loanCalculatorPage.clickStartOverBtn();
        loanCalculatorAssertions.validationOnLoanPage(loanCalculatorPage.getAnnualIncome(),"0");
        loanCalculatorAssertions.validationOnLoanPage(loanCalculatorPage.getAnnualOtherIncome(),"0");
        loanCalculatorAssertions.validationOnLoanPage(loanCalculatorPage.getCurrentHomeLoanMonthlyRepayments(),"0");
        loanCalculatorAssertions.validationOnLoanPage(loanCalculatorPage.getOtherLoanMonthlyRepayments(),"0");
        loanCalculatorAssertions.validationOnLoanPage(loanCalculatorPage.getOtherMonthlyCommitments(),"0");
        loanCalculatorAssertions.validationOnLoanPage(loanCalculatorPage.getTotalCreditCardLimits(),"0");
        loanCalculatorAssertions.validationOnLoanPage(loanCalculatorPage.getMonthlyLivingExpenses(),"0");
        loanCalculatorAssertions.validationOnLoanPage(loanCalculatorPage.getLoanAmountBorrowResult(),"$0");
        loanCalculatorAssertions.validateIsElementSelected(loanCalculatorPage.isSelectedSingleType(),true);
        loanCalculatorAssertions.validateIsElementSelected(loanCalculatorPage.isSelectedHomeLiveIn(),true);
        loanCalculatorPage.closeBrowser();
    }


    @And("^Provide an invalid details with respective to loan calculation$")
    public void provideAnInvalidDetailsWithRespectiveToLoanCalculation() {
        loanCalculatorPage.selectApplicationType("singleType");
        loanCalculatorPage.selectNumberOfDependants("0");
        loanCalculatorPage.selectProperty("homelivein");
        loanCalculatorPage.setLoanCalculatorPrerequisiteData("0","0","1","0","0","0","0");
    }

    @Then("^Verify for the appropriate message when user provides an invalid data in loan claculator form$")
    public void verifyForTheAppropriateMessageWhenUserProvidesAnInvalidDataInLoanClaculatorForm() {
        loanCalculatorPage.clickBorrowButton();
        loanCalculatorAssertions.validationOnLoanPage(loanCalculatorPage.getBorrowErrorText().trim(),"Based on the details you've entered, we're unable to give you an estimate of your borrowing power with this calculator. For questions, call us on 1800 035 500.");
        loanCalculatorPage.closeBrowser();
    }

}
