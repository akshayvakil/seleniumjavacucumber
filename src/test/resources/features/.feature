# Example 1: Basic Feature with a single scenario
# Feature files describe behavior in plain English using Gherkin syntax.
# Each step here will be mapped to a Java method in the step definition file.

Feature: Basic Login Feature
  In order to access the application
  As a valid user
  I want to be able to login successfully

  Scenario: Successful login
    Given user navigates to login page
    When user enters valid credentials
    Then user should be redirected to the dashboard
