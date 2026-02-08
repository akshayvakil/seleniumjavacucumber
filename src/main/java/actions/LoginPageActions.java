package actions;

import base.BaseClass;
import locators.LoginPageLocators;
import org.openqa.selenium.support.PageFactory;

/**
 * Actions class:
 * - Encapsulates business logic (open page, login, get message)
 * - Uses locators defined in LoginPageLocators
 *
 * ✅ Interview Note:
 * SRP (Single Repo Principle , one class file one purpose locators only, actions only etc) : this class only handles actions/business logic. 
 * Step definitions call these methods, not raw Selenium code.
 */
public class LoginPageActions {
    LoginPageLocators locators;

    public LoginPageActions() {
        locators = new LoginPageLocators();
        PageFactory.initElements(BaseClass.getDriver(), locators); // initializes @FindBy elements
    }

    public void openLoginPage() {
        BaseClass.getDriver().get(BaseClass.getProperty("url"));
    }

    public void login(String username, String password) {
        locators.usernameField.sendKeys(username);
        locators.passwordField.sendKeys(password);
        locators.loginButton.click();
    }

    public String getFlashMessage() {
        BaseClass.waitForElement(locators.flashMessage, 5);
        return locators.flashMessage.getText();
    }
}
