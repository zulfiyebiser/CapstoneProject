@all
@Parallel2
Feature: create a list
  Background:
    When user goes to Amazon Home Page
  Scenario:

  Then user clicks signin button
  Then user enters valid email
  Then clicks continue button
  And user enters valid password
  Then user searches for "samsung laptop"
  Then selects the first item
  And users clicks add to List button
  And opens to shopping list
  And checks if the product is in the list
  Then clicks delete button
  And checks if the product is not in the list

