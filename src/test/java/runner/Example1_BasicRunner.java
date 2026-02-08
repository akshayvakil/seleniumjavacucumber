package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/features/Example1_BasicFeature.feature", // Path to feature files
    glue = {"steps","hooks"},                         // Package containing step definitions
    plugin = {
        "pretty",                             // Prints steps in console
        "html:target/cucumberReports/basicReport.html", // Default Cucumber HTML report
        "json:target/cucumber.json",          // JSON report
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" // Extent Spark report
    },
    monochrome = true
)
public class Example1_BasicRunner extends AbstractTestNGCucumberTests {
    // ExtentCucumberAdapter will generate ExtentReport.html
    // The output file name is controlled by extent.properties or extent-config.xml
}
