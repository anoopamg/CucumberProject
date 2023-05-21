@Calculator
Feature: This feature will allow you do to all the calculator operations using parameters

  Scenario Outline: To add two numbers and validate the results are coming fine using parameter
    Given I have two numbers <num1> and <num2>
    When I add those two numbers
    Then I should get the result as <result>

    Examples: 
      | num1 | num2 | result |
      |    5 |    7 |     12 |
      |    4 |    4 |      8 |
      |   15 |   12 |     27 |
      |  -15 |   12 |     -3 |
      |    0 |   12 |     12 |
	@WIP
  Scenario: This scenario will validate addition of multiple numbers
    Given I have below numbers
      |  5 |
      |  9 |
      | 16 |
      | 33 |
      |  0 |
    When I add those numbers
    Then I should get the result as 63

  Scenario: To calculate the total bill amount
    Given I want to buy given items
      | Coffee   |  30 |
      | Doughnut | 120 |
      | Burger   | 210 |
      | Fries    |  75 |
    When I buy them
    Then I should get total amount as 435

  Scenario: To calculate the total bill amount using quantity
    Given I want to buy given quantity of items
      | Coffee | 2 | 30 |
      | Fries  | 4 | 75 |
    Then I should get total amount as 360
