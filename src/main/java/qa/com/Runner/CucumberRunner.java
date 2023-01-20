package qa.com.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/main/resources/features",
        glue = {"qa/com/StepDefinition"}
)
public class CucumberRunner extends AbstractTestNGCucumberTests {
}
