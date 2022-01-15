package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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


    public WebDriver getDriver(){
        return driver;
    }


    //For to fetch the project location
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
    }

    public void launchFirefox() {
        System.setProperty("","");
        driver = new FirefoxDriver();
    }
}
