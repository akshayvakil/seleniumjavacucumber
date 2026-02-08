package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import actions.LoginPageActions;
import base.BaseClass;
import org.testng.Assert;

/**
 * Step Definitions for Example2 feature:
 * - Reuses Page Actions and Hooks
 * - Accepts "valid"/"invalid" parameters for username and password
 * - Uses assertions for both success and failure flows
 *
 * ✅ Interview Note:
 * This demonstrates parameterization in Cucumber.
 * Instead of duplicating code, we pass values into step definitions.
 */
public class Example2_MultiScenarioSteps {
    LoginPageActions loginPage = new LoginPageActions();
    private String username;
    private String password;

    @Given("user navigates to login page for Example2")
    public void user_navigates_to_login_page_for_example2() {
        loginPage.openLoginPage();
    }

    @When("user enters {string} username for Example2")
    public void user_enters_username_for_example2(String type) {
        if (type.equalsIgnoreCase("valid")) {
            username = BaseClass.getProperty("username"); // from config.properties
        } else {
            username = "wrongUser"; // hardcoded invalid
        }
    }

    @When("user enters {string} password for Example2")
    public void user_enters_password_for_example2(String type) {
        if (type.equalsIgnoreCase("valid")) {
            password = BaseClass.getProperty("password"); // from config.properties
        } else {
            password = "wrongPassword"; // hardcoded invalid
        }
        // Perform login after both username and password are set
        loginPage.login(username, password);
    }

    @Then("user should be redirected to the dashboard for Example2")
    public void user_should_be_redirected_to_dashboard_for_example2() {
        String actualMessage = loginPage.getFlashMessage();
        String expectedMessage = "You logged into a secure area!";
        Assert.assertTrue(actualMessage.contains(expectedMessage),
                "Expected success message not found. Actual: " + actualMessage);
    }

    @Then("user should see an error message for Example2")
    public void user_should_see_error_message_for_example2() {
        String actualMessage = loginPage.getFlashMessage();
        String expectedMessage = "Your username is invalid!";
        Assert.assertTrue(actualMessage.contains(expectedMessage),
                "Expected error message not found. Actual: " + actualMessage);
    }
}
