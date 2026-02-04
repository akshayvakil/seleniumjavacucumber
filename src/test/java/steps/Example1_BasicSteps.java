package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class Example1_BasicSteps {

    @Given("user navigates to login page for Example1")
    public void user_navigates_to_login_page_example1() {
        System.out.println("Navigated to login page (Example1)");
    }

    @When("user enters valid credentials for Example1")
    public void user_enters_valid_credentials_example1() {
        System.out.println("Entered valid credentials (Example1)");
    }

    @Then("user should be redirected to the dashboard for Example1")
    public void user_redirected_to_dashboard_example1() {
        System.out.println("Redirected to dashboard (Example1)");
    }
}
