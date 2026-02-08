package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import actions.LoginPageActions;
import base.BaseClass;
import org.testng.Assert;

/**
 * Step Definitions for Example3 feature:
 * - Matches corrected feature file with unique step wording
 * - Demonstrates Background, Scenario Outline, Tags, and And statements
 * - Uses assertions for validation
 * - Reuses Page Actions for multiple scenarios
 */
public class Example3_DataDrivenLoginExampleTable {
    LoginPageActions loginPage = new LoginPageActions();
    private String username;
    private String password;

    @Given("user navigates to login page")
    public void user_navigates_to_login_page() {
        loginPage.openLoginPage();
    }

    @When("user enters username {string}")
    public void user_enters_username(String user) {
        if (user.equalsIgnoreCase("validUser")) {
            username = BaseClass.getProperty("username");
        } else {
            username = user; // wrongUser, lockedUser, etc.
        }
    }

    @When("user enters password {string}")
    public void user_enters_password(String pass) {
        if (pass.equalsIgnoreCase("validPass")) {
            password = BaseClass.getProperty("password");
        } else {
            password = pass; // wrongPass, lockedPass, etc.
        }
        // Perform login after both username and password are set
        loginPage.login(username, password);
    }

    @Then("user should see {string}")
    public void user_should_see_message(String expectedMessage) {
        String actualMessage = loginPage.getFlashMessage();
        Assert.assertTrue(actualMessage.contains(expectedMessage),
                "Expected message not found. Actual: " + actualMessage);
    }
}
