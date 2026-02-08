package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Locators class:
 * - Defines all elements using @FindBy annotations
 * - No business logic here
 *
 * ✅ Interview Note:
 * This is the PageFactory pattern.
 * SRP: this class has only one responsibility — element definitions.
 */
public class LoginPageLocators {
    @FindBy(id = "username")
    public WebElement usernameField;

    @FindBy(id = "password")
    public WebElement passwordField;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;

    @FindBy(id = "flash")
    public WebElement flashMessage;
}
