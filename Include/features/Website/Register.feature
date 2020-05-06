Feature: Register feature

  Scenario: Register with valid credentials
    Given User navigate to register page
    When User click close button
    And User click allow button
    And User click continue with email
    And User User click sign up
    And User enters Credentials name and email and password
    And User click checkbox
    And User click continue button
    Then User navigate to home page
