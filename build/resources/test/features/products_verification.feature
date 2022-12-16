Feature: Verification products

  Background:

    Given I am on the page of https://www.haceb.com/

  Scenario Outline: Verification products

    When I am in the home of the Haceb page and refresh it

    And I validate the logo

    And I choose to enter the element at position 4 and save his name

    Then I verify that it has the same name

    Examples:

      | url                    |
      | https://www.haceb.com/ |