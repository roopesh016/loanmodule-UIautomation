package loancalculatortests;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.LoanCalculatorPage;

public class LoanCalculator {

    LoanCalculatorPage loanCalculatorPage = new LoanCalculatorPage();

    @Given("^Launch the ANZ loan calculator web page$")
    public void launchTheANZLoanCalculatorWebPage() {
        loanCalculatorPage.launchBrowser();
        loanCalculatorPage.openUrl();
    }

    @And("^Provide all the required details with respective to loan calculation$")
    public void provideAllTheRequiredDetailsWithRespectiveToLoanCalculation() {
        System.out.println("Provide all required values");
    }

    @Then("^Verify with loan estimation value$")
    public void verifyWithLoanEstimationValue() {
        System.out.println("Verify for the estimation value");
    }

    @Then("^Verify whether the loan calculation form gets clear immediately once the user clicks on start over$")
    public void verifyWhetherTheLoanCalculationFormGetsClearImmediatelyOnceTheUserClicksOnStartOver() {
        System.out.println("Loan Calculation form gets cleared");
    }

    @Then("^Verify for the appropriate message when user provides an invalid data in loan claculator form$")
    public void verifyForTheAppropriateMessageWhenUserProvidesAnInvalidDataInLoanClaculatorForm() {
        System.out.println("Error message should be displayed when there is an invalid data set");
    }
}
