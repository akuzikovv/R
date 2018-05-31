Feature: Landing page

  Scenario: Unauthorised user job search and save
    Given open landing page
    Then  Header contains textbuttons:
      | blog      |
      | forum |
      | login  |
      | sign up      |
    When Enter "Head of Herbology" to the search field
    When Click search button
    Then The "Head of Herbology" is displayed in the search result
    When Click on the Save button
    Then  Authorization page contains necessary elements
    | Don't remember your password? |
    When Enter login "satintest1+teacherSupply@gmail.com"
    When Enter password "Test123!"
    When Click on the Log in button
    When Enter "Head of Herbology" to the search field
    When Click search button
    Then The "Head of Herbology" is displayed in the search result
    Then The "Saved" button is highlighted


  Scenario: Unauthorised user job search and apply
    Given open landing page
    When Enter "Head of Herbology" to the search field
    When Click search button
    Then The "Head of Herbology" is displayed in the search result
    When Click on the job title
    Then The job preview page is opened with necessary elements
    |Preview|
    |Head of Herbology1|
    |Posted:|
    |Apply by: |
    |School   |
    |Job Description|
    |APPLY           |
    |Contract Type      |
    |Contract Term      |
    |Salary            |
    |School Profile     |
    | Skills & Essentials|
    | Documents          |
    |Video prescreening  |
    |Video interview     |
