Feature: Login Feature with Multiple Scenarios
  Scenario: Login with valid credentials
    Given user navigates to login page for Example2
    When user enters "valid" username for Example2
    And user enters "valid" password for Example2
    Then user should be redirected to the dashboard for Example2

  Scenario: Login with invalid credentials
    Given user navigates to login page for Example2
    When user enters "invalid" username for Example2
    And user enters "invalid" password for Example2
    Then user should see an error message for Example2
# Notes: valid / invalid  # These values are passed into step definitions as parameters