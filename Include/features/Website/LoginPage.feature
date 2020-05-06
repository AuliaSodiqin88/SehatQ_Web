Feature: Login feature

  Scenario: Login with valid credentials
    Given User navigate to Login page
    When User click button close
    And User click button allow
    And User click continue with email button
    And User enters Credentials username and password
    And User click button continue
    Then User go to dashboard
