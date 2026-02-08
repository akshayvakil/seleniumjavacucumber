package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Locators for nopCommerce Registration Page
 */
public class RegistrationPageLocators {

    @FindBy(id = "FirstName")
    public WebElement firstNameField;

    @FindBy(id = "LastName")
    public WebElement lastNameField;

    @FindBy(id = "Email")
    public WebElement emailField;

    @FindBy(id = "Password")
    public WebElement passwordField;

    @FindBy(id = "ConfirmPassword")
    public WebElement confirmPasswordField;

    @FindBy(id = "register-button")
    public WebElement registerButton;

    @FindBy(css = ".result")
    public WebElement successMessage;
}
