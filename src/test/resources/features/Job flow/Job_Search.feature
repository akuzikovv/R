Feature:  Job Search

  Background:
    Given open landing page
    When click on the agree button at the banner


  Scenario: Search appropriate job as non logged teacher
    When  Click on the "jobs" button
    When Enter job title to the search field
    When Click on the "search" button
    Then Appropriate job is displayed in the search result
    When Click on the appropriate job title
    Then The job name is right displayed
    Then the job description is right displayed
    Then Current posted date is displayed
    Then Chosen skills are displayed
    Then Chosen closed date is displayed
    Then Contract type is right displayed
      |Full-time|
#    Then Contract term "Interim" is right displayd
    Then Salary is right displayed
    Then The "requested" text is displayed at the Video prescreening field


