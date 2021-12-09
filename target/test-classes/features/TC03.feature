@all
@Parallel1
Feature:Check basket total

  Background:
    When user goes to Amazon Home Page

  Scenario Outline:
    Given user searches for "<query>"
    Then the search results has the "<query>" in it
    Given user adds first item to basket
    When user checks basket total
    Then it should match the price of the item added into basket
    Examples:
      |query   |
      |computer laptop|