Feature:  Job Applicants

  Background:
    Given open landing page
    When click on the agree button at the banner
    When Click on the login button
#    When Click on the school "Login as a school" button
    When Enter login "newuatschool28@yopmail.com"
#    When Enter email of new school user
    When Enter password "AutoTest123!"
    When Click on the Log in button
    When Click on the "Jobs" button in the header

  Scenario: School view applicants
    When Click on the "view applicants" button at the appropriate job title
    Then The job name is displayed at the applicants page
    Then The "Teacher Other 2" name of first applicant is displayed
    Then The "Teacher Other" name of second applicant is displayed
    Then The current received date is displayed
    Then The message link of first applicant has right email address "teach20uat2@yopmail.com"
    When Open profile details popup of the first applicant
    Then The "Teacher Other 2" teacher name is displayed
    Then The "ABOUT ME" section is displayed
    Then The "PRESCREENING QUESTIONS:" section is displayed
    Then The "TEACHER CHARACTERISTICS" section is displayed
    Then The "CV" section is displayed
    Then The "Documents" section is displayed
    Then The "Clearance" section is displayed
    Then Close popup
    Then Click on the "+" button
    Then The "Teacher Other 2" teacher name is displayed at the accordion section
    Then The "CV" field contains the "Candidate_Summary.pdf" attached document
    Then The "Application Form" field contains the "Candidate_Summary.pdf" attached document
    Then The "Additional Documents" field contains the "Candidate_Summary.pdf" attached document
    Then The covering message is displayed
    When Click on the link at the Video Prescreening Questions field
    Then The odro site is opened in the new tab after clicking on the prescreening questions link
    |https://meet.odro.co.uk/remeuat/archive/5e5fc31ce7ec316aad5c3349/5e25924c27782761c154aa62|



