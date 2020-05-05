Feature:  Job Save

  Background:
    Given open landing page
    When click on the agree button at the banner


  Scenario: Save appropriate job as non logged user
    When Click on the "Jobs" button in the header
    When Enter job title to the search field
    When Click on the "search" button
    Then Appropriate job is displayed in the search result
    When Click on the "Save" button at the appropriate job
    When Enter login "a.kuzikov@aimprosoft.com"
    When Enter password "Test123!"
    When Click on the Log in button
    When Enter job title to the search field
    When Click on the "search" button
    Then The "Saved" button is highlighted red at the appropriate job
    When Click on the "Saved" button at the appropriate job
    When Click on the arrow down button
    When Click on the LOGOUT button


  Scenario: Save appropriate job as logged in "Other" teacher
    When Click on the login button
    When Click on the "Login as a teacher" button
    When Enter login "uatteacher22@yopmail.com"
    When Enter password "Test123!"
    When Click on the Log in button
    When Click on the "Jobs" button in the header
    When Enter job title to the search field
    When Click on the "search" button
    Then Appropriate job is displayed in the search result
    Then Click on the "Save" button at the appropriate job
    Then The "Saved" button is highlighted red at the appropriate job
    When Click on the arrow down button
    When Click on the LOGOUT button


  Scenario: Save job from job preview page as non logged user
    When Click on the "Jobs" button in the header
    When Enter job title to the search field
    When Click on the "search" button
    Then Appropriate job is displayed in the search result
    When Click on the appropriate job title
    Then Click on the "SAVE" button
    When Enter login "a.kuzikov@aimprosoft.com"
    When Enter password "Test123!"
    When Click on the Log in button
    When Enter job title to the search field
    When Click on the "search" button
    Then The "Saved" button is highlighted red at the appropriate job
    When Click on the "Saved" button at the appropriate job
    When Click on the arrow down button
    When Click on the LOGOUT button

  Scenario: Save job from job preview page as logged in "Other" teacher
    When Click on the login button
    When Click on the "Login as a teacher" button
    When Enter login "teach20uat2@yopmail.com"
    When Enter password "Test123!"
    When Click on the Log in button
    When Click on the "Jobs" button in the header
    When Enter job title to the search field
    When Click on the "search" button
    Then Appropriate job is displayed in the search result
    When Click on the appropriate job title
    When Click on the "SAVE" button at the job preview page
    When refresh the page
    Then The "SAVE" button displayed as saved
    When Click on the arrow down button
    When Click on the LOGOUT button
