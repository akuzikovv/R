
Feature:  Booking flow for agency

  Background:
    Given open landing page
    When click on the agree button at the banner
    When Click on the login button


  Scenario: Create booking for agency
    When Click on the "Login as a school" button
    When Enter login "newuatschool28@yopmail.com"
    When Enter password "Test123!"
    When Click on the Log in button
    When Click on the "bookings" button in the header
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
    When Click on the Invite to job button at the teacher with "PROMISE EDUCATION" name
    When Click on the "NEXT STEP" button
    When Click on the "SEND" button
    When Click on the "REVIEW INVITATIONS" button
    When Click on the "SEND" button
    When Click on the "REVIEW INVITATIONS" button
    When Click on the "SEND" button
    When Click on the "REVIEW INVITATIONS" button
    When Click on the "SEND" button
    When Get names of teachers
    When Click on the "View all invites" button
    When Get Booking ID
    When Open booking section
    Then Appropriate teachers are displayed in the invites list


  Scenario: Accept booking as agency
    When Click on the "Login as an agency" button
    When Enter login "newagencyuat18@yopmail.com"
    When Enter password "Test123!"
    When Click on the Log in button
    When Click on the "bookings" button in the header
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

  Scenario: Approve booking as school
    When Click on the "Login as a school" button
    When Enter login "newuatschool28@yopmail.com"
    When Enter password "Test123!"
    When Click on the Log in button
    When Click on the "bookings" button in the header
    When Find accepted invite by booking ID with "Promise Education" name
    Then Entered "Supply staff name" teacher name is displayed
    Then Attached "Candidate_Summary.pdf" file is displayed
    Then The "123.21" rate is displayed
    When Approve accepted invite with "Promise Education" name
    Then Popup with "Thank you for approving this booking. When approving bookings, you are re-confirming our terms and conditions." text is appeared
    When Close popup

  Scenario: Accept booking as agency and Decline booking as school
    When Click on the "Login as an agency" button
    When Enter login "newagencyuat18@yopmail.com"
    When Enter password "Test123!"
    When Click on the Log in button
    When Click on the "bookings" button in the header
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
    When Click on the arrow down button
    When Click on the LOGOUT button
    When Click on the login button
    When Click on the "Login as a school" button
    When Enter login "newuatschool28@yopmail.com"
    When Enter password "Test123!"
    When Click on the Log in button
    When Click on the "bookings" button in the header
    When Find accepted invite by booking ID with "Promise Education" name
    Then Entered "Supply staff name" teacher name is displayed
    Then Attached "Candidate_Summary.pdf" file is displayed
    Then The "123.21" rate is displayed
    When Decline accepted invite with "Promise Education" name

  Scenario: Decline booking as agency
    When Click on the "Login as an agency" button
    When Enter login "newagencyuat18@yopmail.com"
    When Enter password "Test123!"
    When Click on the Log in button
    When Click on the "bookings" button in the header
#    When Find invite with "Booking for agency" job title
    When Click on the "decline" button of the appropriate booking
    When Click on the "confirm" button





