Feature: Authorization page
      Background:
        Given open login page

  Scenario: Teacher Authorization page
    When Click on the sign in teacher button
    Then  Authorization page contains necessary elements
    |Don't remember your password?|

  Scenario: School Authorization page
    When Click on the sign in school button
    Then  Authorization page contains necessary elements
    |Don't remember your password?|