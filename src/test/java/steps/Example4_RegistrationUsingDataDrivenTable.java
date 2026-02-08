package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import actions.RegistrationPageActions;
import io.cucumber.datatable.DataTable;
import org.testng.Assert;
import java.util.Map;

/**
 * Step Definitions for nopCommerce Registration Feature
 */
public class Example4_RegistrationUsingDataDrivenTable {
    RegistrationPageActions registrationPage = new RegistrationPageActions();

    @Given("user navigates to registration page of nopCommerce")
    public void user_navigates_to_registration_page() {
        registrationPage.openRegistrationPage();
    }

    @When("user enters registration details:")
    public void user_enters_registration_details(DataTable dataTable) {
        Map<String, String> details = dataTable.asMap(String.class, String.class);

        registrationPage.enterFirstName(details.get("firstname"));
        registrationPage.enterLastName(details.get("lastname"));
        registrationPage.enterEmail(details.get("email"));
        registrationPage.enterPassword(details.get("password"));
        registrationPage.submitRegistration();
    }

    
    @Then("user should see a message like {string}")
    //Due to captch this method will not work
    //But Our purpose to use DataTable is successful
    public void user_should_see_a_message_like(String expectedMessage) {
    	   String actualMessage = registrationPage.getSuccessMessage();
           Assert.assertTrue(actualMessage.contains(expectedMessage),
                   "Expected message not found. Actual: " + actualMessage);
    }

}
