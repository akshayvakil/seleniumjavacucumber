package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/**
 * Runner for Example4 Registration Feature:
 * - Executes nopCommerce registration scenario with DataTable
 * - Glue includes steps and hooks
 * - Tags allow selective execution (@SmokeTest, @Regression)
 */
@CucumberOptions(
    features = "src/test/resources/features/Example4_RegistrationUsingDataDrivenTable.feature",
    glue = {"steps", "hooks"},
    plugin = {
        "pretty",
        "html:target/cucumberReports/registrationReport.html",
        "json:target/cucumber.json",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
    },
    monochrome = true,
    tags = "@SmokeTest or @Regression" // run both tagged scenarios
)
public class Example4_RegiUsingDataDrivenTableRunner extends AbstractTestNGCucumberTests {
}
