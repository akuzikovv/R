Feature:  Job Search

  Background:
    Given open landing page
    When click on the agree button at the banner


  Scenario: Search appropriate job as non logged teacher
    When Click on the "jobs" button
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


  Scenario: Search appropriate job as logged in "Other" teacher
    When Click on the login button
    When Click on the "Login as a teacher" button
    When Enter login "uatteacher22@yopmail.com"
    When Enter password "Test123!"
    When Click on the Log in button
    When Click on the "jobs" button in the header
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

  Scenario: Search appropriate job as logged in "Supply" teacher
    When Click on the login button
    When Click on the "Login as a teacher" button
    When Enter login "a.kuzikov@aimprosoft.com"
    When Enter password "Test123!"
    When Click on the Log in button
    When Click on the "jobs" button in the header
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

    Scenario: Search appropriate job by postcode
      When Click on the login button
      When Click on the "Login as a teacher" button
      When Enter login "a.kuzikov@aimprosoft.com"
      When Enter password "Test123!"
      When Click on the Log in button
      When Click on the "jobs" button in the header
      When Enter "NW36AE" to the postcode field
      When Choose "3" distance
      When Click on the "search" button
      Then The "Reilly Stevens Plc" job is displayed in the search result



