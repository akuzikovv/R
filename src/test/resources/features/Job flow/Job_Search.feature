Feature:  Job Search

  Background:
    Given open landing page
    When click on the agree button at the banner


  Scenario: Search appropriate job as non logged teacher
    When  Click on the "jobs" button
    When Enter job title to the search field
    When Click on the "search" button
    Then Appropriate job is displayed in the search result


