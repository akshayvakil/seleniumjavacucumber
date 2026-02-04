package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/features/Example2_MultiScenarioFeature.feature", // Path to feature files
    glue = {"steps"},                         // Package containing step definitions
    plugin = {
        "pretty",                             // Prints steps in console
        "html:target/cucumberReports/multiScenarioReport.html", // Default HTML report
        "json:target/cucumber.json",          // JSON report
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" // Extent Spark report
    },
    monochrome = true
)
public class Example2_MultiScenarioRunner extends AbstractTestNGCucumberTests {
    // This runner executes all scenarios in Example2_MultiScenarioFeature.feature
    // Extent Spark report will show both scenarios separately in ExtentReport.html
}
