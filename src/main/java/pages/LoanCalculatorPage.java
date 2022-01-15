package pages;

import utilities.TestBasePage;
import java.io.IOException;

public class LoanCalculatorPage extends TestBasePage {

    public void launchBrowser() {
        try {
            if(fetchProperties("browser").equalsIgnoreCase("chrome")){
                launchChrome();
            } else if(fetchProperties("browser").equalsIgnoreCase("firefox")){
                launchFirefox();
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

}
