@all8
@Parallel2
Feature: all listed products contain ...

  Scenario:
    When user goes to Amazon Home Page
    Then opens the signin window
    And clicks  Create a List link
    Then Verifies that the title contains "Your List"