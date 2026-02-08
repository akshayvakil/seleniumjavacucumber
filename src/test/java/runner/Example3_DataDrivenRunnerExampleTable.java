package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/**
 * Runner for Example5 feature:
 * - Executes valid, invalid, and locked account scenarios
 * - Glue includes steps and hooks
 * - Tags allow selective execution (@SmokeTest, @Regression)
 */
@CucumberOptions(
    features = "src/test/resources/features/Example3_DataDrivenLoginExampleTable.feature",
    glue = {"steps", "hooks"},
    plugin = {
        "pretty",
        "html:target/cucumberReports/dataDrivenReport.html",
        "json:target/cucumber.json",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
    },
    monochrome = true,
    tags = "@SmokeTest or @Regression" // run both tagged scenarios
)
public class Example3_DataDrivenRunnerExampleTable extends AbstractTestNGCucumberTests {
}
