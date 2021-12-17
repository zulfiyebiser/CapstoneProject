@all5
@Parallel1
  Feature: check the sub menu

    Background:
      When user goes to Amazon Home Page

    Scenario: Check the Computers menu
      And user clicks to All categories
      And selects Computers
      Then checks that Computers menu has 15 sub categories
