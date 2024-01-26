package webzio.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "webzio.stepdefinitions",
        plugin = {"pretty", "html:target/cucumber-html-reports", "json:target/cucumber-html-reports/cucumber.json"}
)
public class ApiTestRunner {
}