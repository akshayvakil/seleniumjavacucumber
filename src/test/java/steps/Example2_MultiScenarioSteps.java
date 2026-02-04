package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class Example2_MultiScenarioSteps {

    @Given("user navigates to login page for Example2")
    public void user_navigates_to_login_page_example2() {
        System.out.println("Navigated to login page (Example2)");
    }

    // As .feature has parameter "valid" or "invalid" we will be replacing it with {string} in stepDefination file
    @When("user enters {string} username for Example2")
    public void user_enters_username_example2(String usernameType) {
        System.out.println("Entered " + usernameType + " username (Example2)");
    }

    @When("user enters {string} password for Example2")
    public void user_enters_password_example2(String passwordType) {
        System.out.println("Entered " + passwordType + " password (Example2)");
    }

    @Then("user should be redirected to the dashboard for Example2")
    public void user_redirected_to_dashboard_example2() {
        System.out.println("Redirected to dashboard (Example2)");
    }

    @Then("user should see an error message for Example2")
    public void user_should_see_error_message_example2() {
        System.out.println("Error message displayed (Example2)");
    }
}
