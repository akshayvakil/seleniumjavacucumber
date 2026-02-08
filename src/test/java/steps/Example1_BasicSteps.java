package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import actions.LoginPageActions;
import base.BaseClass;
import org.testng.Assert;

/**
 * Step Definitions:
 * - Map Gherkin steps to Java methods
 * - Call only high-level Page Actions
 * - Use assertions for validation (industry standard)
 *
 * ✅ Interview Note:
 * Assertions make tests self-validating and CI/CD-ready.
 * Step definitions stay readable and business-focused.
 */
public class Example1_BasicSteps {
    LoginPageActions loginPage = new LoginPageActions();

    @Given("user navigates to login page for Example1")
    public void user_navigates_to_login_page_for_example1() {
        loginPage.openLoginPage();
    }

    @When("user enters valid credentials for Example1")
    public void user_enters_valid_credentials_for_example1() {
        loginPage.login(BaseClass.getProperty("username"), BaseClass.getProperty("password"));
    }

    @Then("user should be redirected to the dashboard for Example1")
    public void user_should_be_redirected_to_dashboard_for_example1() {
        String actualMessage = loginPage.getFlashMessage();
        String expectedMessage = "You logged into a secure area!";

        // ✅ Industry-standard assertion
        Assert.assertTrue(actualMessage.contains(expectedMessage),
                "Expected success message not found. Actual: " + actualMessage);
    }
}