Feature:  Job Withdraw

  Background:
    Given open landing page
    When click on the agree button at the banner

  Scenario: Withdraw job from applied jobs tab
    When Click on the login button
#    When Click on the "Login as a teacher" button
    When Enter login "newuatautotestteacher7@yopmail.com"
    When Enter password "AutoTest123!"
    When Click on the Log in button
    When Click on the "Jobs" button in the header
#    When Click on the arrow down button
#  When Click on the LOGOUT button
    When Click on the "APPLIED JOBS" button
    When Click on the "Withdraw" button at the appropriate job
    When Click on the "confirm" button
    Then Applied job isn't displayed in the "APPLIED" tab