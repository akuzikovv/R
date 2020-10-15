Feature:  New Users Flow
  Background:
    Given open landing page
    When click on the agree button at the banner

  Scenario: Job creation as new school user
    When Click on the login button
    When Enter email of new school user
    When Enter password "Test123!"
    When Click on the Log in button
    When Click on the "Jobs" button in the header
    When Click on the "POST A NEW JOB" button
    When Fill all necessary fields
      | Job For new users                                                                                        |
      | Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. |
      | Salary $$$$                                                                                 |
    When Choose "Supply" checkbox
    When Choose "Interim" checkbox
    When Choose "Full-time" checkbox
#    When Choose "Please tick if you want to request video prescreening questions to be answered for enhanced applications." checkbox
    When Upload "Candidate_Summary.pdf" file
    When Enter the "05/12/2020" closing date
    When Choose "Social Augmentation with AI Direct Targeting" radiobutton
    When Choose skills
      | write |
    When Click on the Post Job button
    Then The job name is right displayed
    Then the job description is right displayed
    Then Current posted date is displayed
    Then Chosen skills are displayed
    Then Contract type is right displayed
      | Full-time |
    Then Contract term "Interim" is right displayd
    Then Salary is right displayed
#    Then The "requested" text is displayed at the Video prescreening field
    When Click on the "submit" button
    Then Appropriate job is displayed in "live" jobs tab

  Scenario: Save appropriate job as logged in new "Supply" teacher
    When Click on the login button
    When Enter login of new created user "teacher"
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

  Scenario: Apply job from saved jobs tab as logged in Supply new teacher
    When Click on the login button
    When Enter login of new created user "teacher"
    When Enter password "Test123!"
    When Click on the Log in button
    When Click on the "Jobs" button in the header
    When Click on the "SAVED JOBS" button
    When refresh the page
    When Click on the appropriate job title at the "SAVED" tab
    When Click on the "APPLY" button
    When Upload "Candidate_Summary.pdf" file
    When Enter "Covering Message" text to the text field
    When Click on the "APPLY" button
    Then Applied job is displayed in the "APPLIED" tab
    When Click on the arrow down button
    When Click on the LOGOUT button



  Scenario: New School view applicants
    When Click on the login button
    When Enter email of new school user
    When Enter password "Test123!"
    When Click on the Log in button
    When Click on the "Jobs" button in the header
    When Click on the "view applicants" button at the appropriate job title
    Then The job name is displayed at the applicants page
    Then The "Auto Teacher" name of first applicant is displayed
    Then The current received date is displayed
    When Open profile details popup of the first applicant
    Then The "Auto Teacher" teacher name is displayed
    Then The "ABOUT ME" section is displayed
#    Then The "PRESCREENING QUESTIONS:" section is displayed
    Then The "TEACHER CHARACTERISTICS" section is displayed
    Then The "CV" section is displayed
    Then The "Documents" section is displayed
    Then The "Clearance" section is displayed
    Then Close popup
    Then Click on the "+" button
    Then The "Auto Teacher" teacher name is displayed at the accordion section
    Then The "CV" field contains the "Candidate_Summary.pdf" attached document
    Then The "Application Form" field contains the "Candidate_Summary.pdf" attached document
    Then The "Additional Documents" field contains the "Candidate_Summary.pdf" attached document
    Then The covering message is displayed
#    When Click on the link at the Video Prescreening Questions field
#    Then The odro site is opened in the new tab after clicking on the prescreening questions link
      |https://meet.odro.co.uk/remeuat/archive/5e5fc31ce7ec316aad5c3349/5e25924c27782761c154aa62|

  Scenario: Withdraw job from applied jobs tab as new teacher
    When Click on the login button
    When Enter login of new created user "teacher"
    When Enter password "Test123!"
    When Click on the Log in button
    When Click on the "Jobs" button in the header
    When Click on the "APPLIED JOBS" button
    When Click on the "Withdraw" button at the appropriate job
    When Click on the "confirm" button
    Then Applied job isn't displayed in the "APPLIED" tab

  Scenario: Create booking for new PENDING teacher
    When Click on the login button
    When Enter login of new created user "school"
    When Enter password "Test123!"
    When Click on the Log in button
    When Click on the "Bookings" button in the header
    When Click on the "New Supply Booking" button
    When Enter "Booking for pending teacher" to the Name your job posting field
    When Enter "Booking Description" to the Describe the job field
    When Choose "Teacher" checkbox
    When Choose "TA" checkbox
    When Choose "Select day(s) and half day(s)" checkbox
    When Choose full day "26" in the "2" month of available calendar
    When Choose half day "28" in the "2" month of available calendar
    When Click on the "SHOW RESULTS" button
    When Click on the Invite to job button at the teacher with "auto teacher" name
    When Click on the "NEXT STEP" button
    When Click on the "SEND" button
    Then Check penging popup "You have selected a teacher whose DBS clearance is still pending. Before continuing, you will need to agree to our clearance waiver."
    Then The OK button isn't clickable
    When Choose "Agree to waiver and continue" checkbox
    When Click on the "Ok" button
    When Click on the "REVIEW INVITATIONS" button
    When Click on the "SEND" button
    When wait time
    Then Check penging popup "You have selected a teacher whose DBS clearance is still pending. Before continuing, you will need to agree to our clearance waiver."
    Then The OK button isn't clickable
    When Choose "Agree to waiver and continue" checkbox
    When Click on the "Ok" button
    When Click on the "REVIEW INVITATIONS" button
    When Click on the "SEND" button
    When wait time
    Then Check penging popup "You have selected a teacher whose DBS clearance is still pending. Before continuing, you will need to agree to our clearance waiver."
    Then The OK button isn't clickable
    When Choose "Agree to waiver and continue" checkbox
    When Click on the "Ok" button
    When Get names of teachers
    When Click on the "View all invites" button
    When Get Booking ID
    When Open booking section
    Then Appropriate teachers are displayed in the invites list
    When Click on the arrow down button
    When Click on the LOGOUT button

  Scenario: Accept booking as new PENDING teacher
    When Click on the login button
    When Enter login of new created user "teacher"
    When Enter password "Test123!"
    When Click on the Log in button
    When Click on the "Bookings" button in the header
    When Click on the "invites" tab
    When Click on the "accept" button of the appropriate booking
    When Click on the "confirm" button
    Then Check penging popup "You have accepted this booking. Your DBS clearance is not complete. Please complete DBS clearance in your account or contact us for assistance."
    When Close popup
    When Click on the arrow down button
    When Click on the LOGOUT button

  Scenario: Approve booking as new school
    When Click on the login button
    When Enter login of new created user "school"
    When Enter password "Test123!"
    When Click on the Log in button
    When Click on the "Bookings" button in the header
    When Approve accepted invite with "Pending Teacher" name
    Then Popup with "Thank you for approving this booking. When approving bookings, you are re-confirming our terms and conditions." text is appeared
      |test|
    When Close popup
    When Click on the arrow down button
    When Click on the LOGOUT button



  Scenario: Create booking for new agency
    When Click on the login button
    When Enter login of new created user "school"
    When Enter password "Test123!"
    When Click on the Log in button
    When Click on the "Bookings" button in the header
    When Click on the "invites" tab
    When Click on the "New Supply Booking" button
    When Enter "Booking for agency" to the Name your job posting field
    When Enter "Booking Description" to the Describe the job field
    When Choose "Teacher" checkbox
    When Choose "TA" checkbox
    When Choose "Select day(s) and half day(s)" checkbox
    When Choose full day "24" in the "2" month of available calendar
    When Choose half day "25" in the "2" month of available calendar
    When Choose full day start time "8:00"
    When Choose full day end time "17:00"
    When Choose half day start time "11:00"
    When Choose half day end time "15:00"
    When Click on the "SHOW RESULTS" button
    When Click on the "AGENCIES" button
    When Click on the Invite to job button at the teacher with "AUTO AGENCY" name
    When Click on the "NEXT STEP" button
    When Click on the "SEND" button
    When Get names of teachers
    When Click on the "View all invites" button
    When Get Booking ID
    When Open booking section
    Then Appropriate teachers are displayed in the invites list

  Scenario: Accept booking as new agency
    When Click on the login button
    When Enter login of new created user "agency"
    When Enter password "Test123!"
    When Click on the Log in button
    When Click on the "Bookings" button in the header
    When Click on the "invites" tab
    When Click on the "accept" button of the appropriate booking
    When Fill required fields
      |Supply staff name|
      |123.21|
      |Subject                         |
    When Upload "Candidate_Summary.pdf" file
    When Choose "I confirm that this teacher is fully cleared with DBS." checkbox
    When Choose "I agree to RealiseMe" policy checkbox
    When Click on the "CONFIRM JOB" button
    When wait time


  Scenario: Approve booking as new school
    When Click on the login button
    When Enter login of new created user "school"
    When Enter password "Test123!"
    When Click on the Log in button
    When Click on the "Bookings" button in the header
    When Find accepted invite by booking ID with "Auto Agency" name
    Then Entered "Supply staff name" teacher name is displayed
    Then Attached "Candidate_Summary.pdf" file is displayed
    Then The "123.21" rate is displayed
    When Approve accepted invite with "Promise Education" name
    Then Popup with "Thank you for approving this booking. When approving bookings, you are re-confirming our terms and conditions." text is appeared
      |test|
    When Close popup