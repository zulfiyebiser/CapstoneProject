@all
@Parallel1
Feature: Amazon Search Feature

Background:
  When user goes to Amazon Home Page

    Scenario: Second most expensive product contains Nikon D3X

    When user searches for "Nikon"
    And sorts the result from highest price to lowest
    And clicks second product for details
    Then checks product title contains "Nikon D3100"