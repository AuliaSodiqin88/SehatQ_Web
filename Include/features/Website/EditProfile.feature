Feature: EditProfile feature

  Scenario: Edit Profile
    Given User edit profile
    When User successfully login
    And User click icon user
    And User click edit profile
    And User click address
    And User click save button
    Then User successfully change profile
