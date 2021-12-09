@all
@Parallel2
Feature: valid sign in
  Background:
    Given user goes to Amazon Home Page
  Scenario:
    Then user clicks signin button
    And user enters valid email
    And clicks continue button
    Then user enters valid password
    And verifies that Hello, Login text on the sign in button

