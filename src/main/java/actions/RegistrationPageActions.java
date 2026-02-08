package actions;

import base.BaseClass;
import locators.RegistrationPageLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Actions for nopCommerce Registration Page
 */
public class RegistrationPageActions extends BaseClass {
    WebDriver driver = getDriver();
    RegistrationPageLocators locators;

    public RegistrationPageActions() {
        this.locators = new RegistrationPageLocators();
        PageFactory.initElements(driver, locators);
    }

    public void openRegistrationPage() {
    	BaseClass.getDriver().get(BaseClass.getProperty("url2"));
    
    }

    public void enterFirstName(String firstname) {
        locators.firstNameField.sendKeys(firstname);
    }

    public void enterLastName(String lastname) {
        locators.lastNameField.sendKeys(lastname);
    }

    public void enterEmail(String email) {
        locators.emailField.sendKeys(email);
    }

    public void enterPassword(String password) {
        locators.passwordField.sendKeys(password);
        locators.confirmPasswordField.sendKeys(password);
    }

    public void submitRegistration() {
        locators.registerButton.click();
    }

    public String getSuccessMessage() {
        return locators.successMessage.getText();
    }
}
