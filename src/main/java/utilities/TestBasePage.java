package utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.Set;

public class TestBasePage {
    WebDriver driver = new WebDriver() {
        @Override
        public void get(String url) {

        }

        @Override
        public String getCurrentUrl() {
            return null;
        }

        @Override
        public String getTitle() {
            return null;
        }

        @Override
        public List<WebElement> findElements(By by) {
            return null;
        }

        @Override
        public WebElement findElement(By by) {
            return null;
        }

        @Override
        public String getPageSource() {
            return null;
        }

        @Override
        public void close() {

        }

        @Override
        public void quit() {

        }

        @Override
        public Set<String> getWindowHandles() {
            return null;
        }

        @Override
        public String getWindowHandle() {
            return null;
        }

        @Override
        public TargetLocator switchTo() {
            return null;
        }

        @Override
        public Navigation navigate() {
            return null;
        }

        @Override
        public Options manage() {
            return null;
        }
    };

    Actions actions = new Actions(driver);

    public WebDriver getDriver(){
        return driver;
    }


    public String getProjectLocation() {
        return System.getProperty("user.dir");
    }

    public String fetchProperties(String value) throws IOException {
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(getProjectLocation() + File.separator + "environment.properties");
        properties.load(fileInputStream);
        if (value.equalsIgnoreCase("browser")) {
            return properties.getProperty("browser");
        } else {
            return properties.getProperty("url");
        }
    }

    public void launchChrome() {
        System.setProperty("webdriver.chrome.driver",getProjectLocation() + File.separator + "drivers" + File.separator+ "chromedriver.exe");
        driver = new ChromeDriver();
        maximizeWindow();
    }

    public void launchFirefox() {
        System.setProperty("webdriver.gecko.driver",getProjectLocation() + File.separator + "drivers" + File.separator + "geckodriver.exe");
        driver = new FirefoxDriver();
        maximizeWindow();
    }


    public void launchIEBrowser() {
        System.setProperty("webdriver.ie.driver",getProjectLocation() + File.separator + "drivers" + File.separator + "IEDriverServer.exe");
        driver = new InternetExplorerDriver();
        maximizeWindow();
    }

    public Actions clickOperation(WebElement element){
        return actions.click();
    }

    public void jsClick(WebElement element){
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
    }


    public void waitUntilElementPresent(By element){
        WebDriverWait webDriverWait = new WebDriverWait(driver,30);
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public void maximizeWindow() {
        driver.manage().window().maximize();
    }

    public void quitBrowser() {
        driver.quit();
    }

}
