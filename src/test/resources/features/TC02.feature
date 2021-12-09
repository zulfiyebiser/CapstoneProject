@all
@Parallel1
Feature: Amazon search

  Background:
    When user goes to Amazon Home Page

    Scenario Outline: Search for product add to basket
    Given user searches for "<query>"
    When the search results are displayed
    Then the search results has the "<query>" in it
    Examples:
    |query   |
    |computer|
    |flower|