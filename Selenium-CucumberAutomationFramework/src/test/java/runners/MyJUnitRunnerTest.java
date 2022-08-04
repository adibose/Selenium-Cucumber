package runners;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber; 

@RunWith(Cucumber.class)
@CucumberOptions
(features="src/test/resources/Features",
glue={"StepDefinitions","hooks","customType"},
monochrome = true,
plugin = {"pretty", "html:target/CucumberReports/cucumber.html"}

)
public class MyJUnitRunnerTest {

}
