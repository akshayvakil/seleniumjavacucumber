Feature: Data-Driven Login Feature with And Statements

  Background:
    Given user navigates to login page

  @SmokeTest
  Scenario Outline: Login with multiple credential sets
    When user enters username "<username>"
    And user enters password "<password>"
    Then user should see "<expectedMessage>"

    Examples:
      | username   | password     | expectedMessage                        |
      | validUser  | validPass    | You logged into a secure area!         |
      | wrongUser  | validPass    | Your username is invalid!              |
      | validUser  | wrongPass    | Your password is invalid!              |

  @Regression
  Scenario: Login with locked account
    When user enters username "lockedUser"
    And user enters password "lockedPass"
    Then user should see "Your account is locked!"
