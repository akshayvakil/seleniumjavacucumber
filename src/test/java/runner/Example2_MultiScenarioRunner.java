package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/**
 * Runner for Example2 feature:
 * - Executes valid and invalid login scenarios
 * - Glue includes steps and hooks
 *
 * ✅ Interview Note:
 * Runner ties feature files to step definitions and hooks.
 */
@CucumberOptions(
    features = "src/test/resources/features/Example2_MultiScenarioFeature.feature",
    glue = {"steps", "hooks"},
    plugin = {
        "pretty",
        "html:target/cucumberReports/multiScenarioReport.html",
        "json:target/cucumber.json",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
    },
    monochrome = true
)
public class Example2_MultiScenarioRunner extends AbstractTestNGCucumberTests {
}
