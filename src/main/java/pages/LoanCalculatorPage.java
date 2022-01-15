package pages;

import locators.LoanCalculatorElementLocators;
import org.openqa.selenium.By;
import utilities.TestBasePage;
import java.io.IOException;

public class LoanCalculatorPage extends TestBasePage {

    LoanCalculatorElementLocators loanCalculatorElementLocators = new LoanCalculatorElementLocators();

    public void launchBrowser() {
        try {
            if(fetchProperties("browser").equalsIgnoreCase("chrome")){
                launchChrome();
            } else if(fetchProperties("browser").equalsIgnoreCase("firefox")){
                launchFirefox();
            }  else {
                launchIEBrowser();
            }
        }catch (IOException io){
            io.printStackTrace();
        }
    }

    public void openUrl() {
        try {
            getDriver().get(fetchProperties("url"));
        } catch (IOException io) {
            io.printStackTrace();
        }
    }

    public void selectApplicationType(String applicationType) {
        if (applicationType.equalsIgnoreCase("singleType")) {
            if(getDriver().findElement(By.cssSelector(loanCalculatorElementLocators.applicationTypeSingle)).isEnabled() == false)
                clickOperation(getDriver().findElement(By.cssSelector(loanCalculatorElementLocators.applicationTypeSingle)));
        }
         else {
                clickOperation(getDriver().findElement(By.cssSelector(loanCalculatorElementLocators.applicationTypeJoint)));
        }
    }

    public boolean isSelectedSingleType(){
        return getDriver().findElement(By.cssSelector(loanCalculatorElementLocators.applicationTypeSingle)).isEnabled();
    }

    public void selectNumberOfDependants(String dependantValue){
        clickOperation(getDriver().findElement(By.cssSelector(loanCalculatorElementLocators.numberOfDependents))).sendKeys(dependantValue);
    }

    public void selectProperty(String propertyType){
        if (propertyType.equalsIgnoreCase("homelivein")) {
            if(getDriver().findElement(By.cssSelector(loanCalculatorElementLocators.homeLiveIn)).isEnabled() == false)
                clickOperation(getDriver().findElement(By.cssSelector(loanCalculatorElementLocators.homeLiveIn)));
        } else {
            clickOperation(getDriver().findElement(By.cssSelector(loanCalculatorElementLocators.borrowTypeInvestment)));
        }
    }

    public boolean isSelectedHomeLiveIn(){
        return getDriver().findElement(By.cssSelector(loanCalculatorElementLocators.homeLiveIn)).isEnabled();
    }

    public void setLoanCalculatorPrerequisiteData(String annualIncome,String otherIncome,String monthlyLivingExpenses,String homeLoanRepyments,String otherLoanRepayments,String otherCommitments,String totalCreditCardLimits){
        getDriver().findElement(By.cssSelector(loanCalculatorElementLocators.annualIncome)).sendKeys(annualIncome);
        getDriver().findElement(By.cssSelector(loanCalculatorElementLocators.otherIncome)).sendKeys(otherIncome);
        getDriver().findElement(By.cssSelector(loanCalculatorElementLocators.monthlyLivingExpenses)).sendKeys(monthlyLivingExpenses);
        getDriver().findElement(By.cssSelector(loanCalculatorElementLocators.homeLoanRepayments)).sendKeys(homeLoanRepyments);
        getDriver().findElement(By.cssSelector(loanCalculatorElementLocators.otherLoanRepayments)).sendKeys(otherLoanRepayments);
        getDriver().findElement(By.cssSelector(loanCalculatorElementLocators.otherCommitments)).sendKeys(otherCommitments);
        getDriver().findElement(By.cssSelector(loanCalculatorElementLocators.totalCreditCardLimits)).sendKeys(totalCreditCardLimits);
    }

    public String getLoanAmountBorrowResult(){
        waitUntilElementPresent(By.cssSelector(loanCalculatorElementLocators.borrowResultTextAmount));
        return getDriver().findElement(By.cssSelector(loanCalculatorElementLocators.borrowResultTextAmount)).getText();
    }

    public void clickBorrowButton(){
        jsClick(getDriver().findElement(By.cssSelector(loanCalculatorElementLocators.borrowAmountBtn)));
    }

    public void closeBrowser(){
        quitBrowser();
    }

    public String getAnnualIncome(){
        return getDriver().findElement(By.cssSelector(loanCalculatorElementLocators.annualIncome)).getAttribute("value");
    }

    public String getAnnualOtherIncome(){
        return getDriver().findElement(By.cssSelector(loanCalculatorElementLocators.otherIncome)).getAttribute("value");
    }

    public String getMonthlyLivingExpenses(){
        return getDriver().findElement(By.cssSelector(loanCalculatorElementLocators.monthlyLivingExpenses)).getAttribute("value");
    }

    public String getCurrentHomeLoanMonthlyRepayments(){
        return getDriver().findElement(By.cssSelector(loanCalculatorElementLocators.homeLoanRepayments)).getAttribute("value");
    }

    public String getOtherLoanMonthlyRepayments(){
        return getDriver().findElement(By.cssSelector(loanCalculatorElementLocators.otherLoanRepayments)).getAttribute("value");
    }

    public String getOtherMonthlyCommitments(){
        return getDriver().findElement(By.cssSelector(loanCalculatorElementLocators.otherCommitments)).getAttribute("value");
    }

    public String getTotalCreditCardLimits(){
        return getDriver().findElement(By.cssSelector(loanCalculatorElementLocators.totalCreditCardLimits)).getAttribute("value");
    }

    public void clickStartOverBtn(){
        try {
            Thread.sleep(10000);
            jsClick(getDriver().findElements(By.cssSelector(loanCalculatorElementLocators.startOverBtn)).get(0));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getBorrowErrorText(){
        waitUntilElementPresent(By.cssSelector(loanCalculatorElementLocators.borrowErrorText));
        return getDriver().findElement(By.cssSelector(loanCalculatorElementLocators.borrowErrorText)).getText();
    }

}
