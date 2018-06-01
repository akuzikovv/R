Feature: Teacher Other Home Page

  Background:
    Given open landing page
    When Click on the login button
    When Click on the sign in school button
    When Enter login "satintest1+school@gmail.com"
    When Enter password "Test123!"
    When Click on the Log in button

  Scenario: Header contains all necessary elements
    Then  Header contains textbuttons:
      | home      |
      | messaging |
      | bookings  |
      | jobs      |
    Then  Header contains bell icon
    Then  Header contains user photo icon
    Then  Header contains user name "Hermione Granger"
    Then  Header contains arrow down button
    When  Close window



  Scenario: Jobs page contains necessary elements
    When Click on the "jobs" button in the header
    Then  Jobs page contains all necessary elements:
      | Jobs      |
      | live      |
      | archived  |
      | draft     |
      | JOB TITLE |
      | STATUS    |
      | view applicants |
      | move to archive |
    When Click on the archived tab
    Then Archived tab is opened with all necessary elements:
      | Jobs      |
      | live      |
      | archived  |
      | draft     |
      | JOB TITLE |
      | view applicants |
      | repost |
    When Click on the draft tab
    Then Draft tab is opened with all necessary elements:
      | Jobs      |
      | live      |
      | archived  |
      | draft     |
      | JOB TITLE |
      | CREATED    |
      | edit and post |