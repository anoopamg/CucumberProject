@Browser
Feature: This feature will be used to test the login functionality of Simplilearn Application

  Background: 
    Given I have launched the application
    And I have clicked on Login link

  @WIP
  Scenario: Validate the launch home page scenario
    Then I should land on login page

  @Sanity
  Scenario: Validate the login failure scenario
    When I enter username
    And I enter password
    And I click on Login button
    Then I should get the error message

  @Sanity
  Scenario: Validate the login failure scenario using parameters
    When I enter username as "abc@gmail.com"
    And I enter password as "Axdase@2e"
    And I click on Login button
    Then I should get the error message as "The email or password you have entered is invalid."

  @Regression
  Scenario Outline: Validate the login failure scenario using parameters
    When I enter username as "<UserName>"
    And I enter password as "<Password>"
    And I click on Login button
    Then I should get the error message as "The email or password you have entered is invalid."

    Examples: 
      | UserName       | Password  |
      | hqv@gmail.com  | S23@sdfff |
      | nbdt@gmail.com | G@fdg1fng |
