Feature: School Jobs

  Background:
    Given open landing page
    When click on the agree button at the banner
    When Click on the login button
    When Click on the school "Login as a school" button
    When Enter login "satintest1+school@gmail.com"
    When Enter password "Test123!"
    When Click on the Log in button

  Scenario: Header contains all necessary elements
    Then  Header contains textbuttons:
      | dashboard      |
      | community |
      | jobs  |
      | bookings      |
    Then  Header contains bell icon
    Then  Header contains user photo icon
    Then  Header contains user name "Main Admin"
    Then  Header contains arrow down button
    When  Close window


  Scenario: Jobs page contains necessary elements
    When Click on the "Jobs" button in the header
    Then  Jobs page contains all necessary elements:
      | Jobs            |
      | LIVE            |
      | ARCHIVED        |
      | DRAFT           |
      | JOB TITLE       |
      | STATUS          |
#      | view applicants |
#      | move to archive |
    When Click on the archived tab
    Then Archived tab is opened with all necessary elements:
      | Jobs            |
      | LIVE            |
      | ARCHIVED        |
      | DRAFT           |
      | JOB TITLE       |
      | view applicants |
      | repost          |
    When Click on the "draft" tab
    Then Draft tab is opened with all necessary elements:
      | Jobs          |
      | LIVE            |
      | ARCHIVED        |
      | DRAFT           |
      | JOB TITLE     |
      | CREATED       |
#      | edit and post |

