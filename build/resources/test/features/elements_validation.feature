Feature: Validation elements

  Background:

    Given I am on the page of https://www.haceb.com/

  Scenario Outline: Validation elements

    When I am in the home of the Haceb page and I choose to enter a random element

    Then  I validate the cart interface and home page

    Examples:

      | url                    |
      | https://www.haceb.com/ |