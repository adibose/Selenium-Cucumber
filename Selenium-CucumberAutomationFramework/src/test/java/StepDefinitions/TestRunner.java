package StepDefinitions;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber; 

@RunWith(Cucumber.class)
@CucumberOptions
(features="src/test/resources/Features",
glue={"StepDefinitions","hooks"},
monochrome = true,
plugin = {"pretty", "html:target/HtmlReports"},
tags = "@smoke"
)
public class TestRunner {

}
