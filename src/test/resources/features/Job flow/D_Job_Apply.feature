Feature:  Job Apply

  Background:
    Given open landing page
    When click on the agree button at the banner


  Scenario: Apply job from landing page as non logged teacher (redirect to login page)
    When Click on the "jobs" button
    When Enter job title to the search field
    When Click on the "search" button
    Then Appropriate job is displayed in the search result
    When Click on the "Apply" button at the appropriate job
    When Click on the "APPLY" button
    When Enter login "a.kuzikov@aimprosoft.com"
    When Enter password "Test123!"
    When Click on the Log in button
    Then The job name is right displayed
    When Click on the "APPLY" button
    When Upload "Candidate_Summary.pdf" file
    When Enter "Covering Message" text to the text field
    When Click on the "APPLY" button
    Then Applied job is displayed in the "APPLIED" tab
    When Click on the arrow down button
    When Click on the LOGOUT button
#
  Scenario: Apply job from landing page as logged in teacher
    When Click on the login button
    When Click on the "Login as a teacher" button
    When Enter login "uatteacher22@yopmail.com"
    When Enter password "Test123!"
    When Click on the Log in button
    When Click on the "jobs" button in the header
    When Enter job title to the search field
    When Click on the "search" button
    Then Appropriate job is displayed in the search result
    When Click on the "Apply" button at the appropriate job
    When Click on the "APPLY" button
    When Upload "Candidate_Summary.pdf" file
    When Enter "Covering Message" text to the text field
    When Click on the "APPLY" button
    Then Applied job is displayed in the "APPLIED" tab
    When Click on the arrow down button
    When Click on the LOGOUT button


  Scenario: Apply job from saved jobs tab as logged in teacher
    When Click on the login button
    When Click on the "Login as a teacher" button
    When Enter login "teach20uat2@yopmail.com"
    When Enter password "Test123!"
    When Click on the Log in button
    When Click on the "jobs" button in the header
    When Click on the "SAVED JOBS" button
    When Click on the appropriate job title at the "SAVED" tab
    When Click on the "APPLY" button
    When Upload "Candidate_Summary.pdf" file
    When Enter "Covering Message" text to the text field
    When Click on the "APPLY" button
    Then Applied job is displayed in the "APPLIED" tab
    When Click on the arrow down button
    When Click on the LOGOUT button