Feature: Teacher Other Home Page

  Background:
    Given open login page
    When Click on the sign in teacher button
    When Enter login "satintest1+teacherSupply@gmail.com"
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
    Then  Header contains user name "Test3 Test3"
    Then  Header contains arrow down button
    When  Close window



  Scenario: Jobs page contains necessary elements
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
    Then draft tab is opened with all necessary elements:
      | Jobs      |
      | live      |
      | archived  |
      | draft     |
      | JOB TITLE |
      | CREATED    |
      | edit and post |