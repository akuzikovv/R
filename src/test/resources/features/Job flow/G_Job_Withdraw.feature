Feature:  Job Withdraw

  Background:
    Given open landing page
    When click on the agree button at the banner

  Scenario: Withdraw job from applied jobs tab
    When Click on the login button
    When Click on the "Login as a teacher" button
    When Enter login "teach20uat2@yopmail.com"
    When Enter password "Test123!"
    When Click on the Log in button
    When Click on the "jobs" button in the header
    When Click on the "APPLIED JOBS" button
    When Click on the "Withdraw" button at the appropriate job
    When Click on the "confirm" button
    Then Applied job isn't displayed in the "APPLIED" tab