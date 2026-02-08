Feature: User Registration on nopCommerce

  Background:
    Given user navigates to registration page of nopCommerce

  @Regression
  Scenario: Register new user with multiple details
    When user enters registration details:
      | field     | value             |
      | firstname | Akshay            |
      | lastname  | Sharma            |
      | email     | akshay123@test.com|
      | password  | Test@123          |
    Then user should see a message like "Your registration completed"
    
    # //Due to captch THEN  method will not work ,But Our purpose to use DataTable is successful
