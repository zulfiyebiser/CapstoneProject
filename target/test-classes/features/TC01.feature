@all
@Parallel1
Feature: Amazon invalid sign in

  Background:
    When user goes to Amazon Home Page
    Then user clicks signin button

  Scenario: Amazon invalid sign in
    And user enters invalid email
    And clicks continue button
    Then checks that the error message is displayed
