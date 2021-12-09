@all
@Parallel2
Feature: all listed products contain ...

  Background:
    When user goes to Amazon Home Page

  Scenario:
    And user clicks to All categories
    And selects Computers
    And selects Computer Components
    And selects the first product listed
    And adds to cart
    Then user clicks to All categories
    And selects Electronics
    And selects Camera & Photo
    And selects the second product listed
    And adds to cart
    And goes to cart
    Then Verifies that there are 2 items in the cart
    And  deletes the first item in the cart
    Then Verifies that there are 1 items in the cart

