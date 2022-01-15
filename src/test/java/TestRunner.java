import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/feature", tags = {}, plugin = {"pretty","html:target/cucumber-html-report", "json:target/cucumber.json",
        "junit:target/cucumber.xml"}, glue = {"loancalculatortests"})
public class TestRunner {
}