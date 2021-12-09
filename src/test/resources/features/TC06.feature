@all
@Parallel2
Feature: all listed products contain ...

  Background:
    When user goes to Amazon Home Page

  Scenario:
    And user clicks to All categories
    And selects Computers
    And selects Computer Components
    And selects the Seagate checkbox
    Then verifies that all listed products contain "Seagate" information