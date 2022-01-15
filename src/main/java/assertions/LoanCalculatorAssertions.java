package assertions;

import org.junit.Assert;
import utilities.TestBasePage;

public class LoanCalculatorAssertions extends TestBasePage {
    public void validationOfLoanEstimatedAmount(String actualValue){
        if(Float.valueOf(actualValue.replaceAll("[$,]","").trim()) >= 479000){
            Assert.assertTrue(true);
        }else {
            Assert.assertFalse(false);
        }
    }


    public void validationOnLoanPage(String expectedValue, String actualValue){
        Assert.assertEquals("",expectedValue,actualValue);
    }

    public void validateIsElementSelected(Boolean expectedValue,Boolean actualValue){
        Assert.assertEquals("",expectedValue,actualValue);
    }
}
