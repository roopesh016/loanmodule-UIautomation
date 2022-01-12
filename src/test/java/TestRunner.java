import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\91861\\Desktop\\makemytrip\\src\\test\\resources\\feature", tags = {}, plugin = {"pretty",
        "html:target/cucumber-html-report", "json:target/cucumber.json",
        "junit:target/cucumber.xml"}, glue = {"tests"})
public class TestRunner {
}
