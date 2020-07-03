
Feature:  Booking Creation

  Background:
    Given open landing page
    When click on the agree button at the banner
    When Click on the login button
#    When Click on the school "Login as a school" button


  Scenario: Create booking for PENDING teacher
    When Enter login "newuatschool28@yopmail.com"
    When Enter password "Test123!"
    When Click on the Log in button
    When Click on the "Bookings" button in the header
    When Click on the "New Supply Booking" button
    When Enter "Booking for pending teacher" to the Name your job posting field
    When Enter "Booking Description" to the Describe the job field
    When Choose "Teacher" checkbox
    When Choose "TA" checkbox
#    When Choose "I want to save this search for future use" checkbox
    When Choose "Select day(s) and half day(s)" checkbox
    When Choose full day "26" in the "2" month of available calendar
    When Choose half day "28" in the "2" month of available calendar
#    When Enter "123.456" rate
    When Click on the "SHOW RESULTS" button
#    When Choose "I want to invite top THREE candidates" checkbox
##    When  Get statuses of teachers
#    When Click on the Invite to job button at the teacher with "pending" status
    When Click on the Invite to job button at the teacher with "pending teacher" name
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

  Scenario:  Check booking creation status
    When Check booking creation status
      |"bookingName":"Booking for pending teacher  20"|
      |"dates":[{"date":"2020-08-27T08:30:00+02:00","fullDay":true,"start_time":"2020-08-27T08:30:00+02:00","end_time":"2020-08-27T16:00:00+02:00"},{"date":"2020-08-28T08:30:00+02:00","fullDay":false,"start_time":"2020-08-28T08:30:00+02:00","end_time":"2020-08-28T13:00:00+02:00"}]|
      |"applyUsersIds":[{"user_id":"6e66c2e6-1970-4fb1-9d3d-307b7218ec4e","user_type":"TEACHER"}]                                                                                                                                     |
      |"teachersTypeIdsSchema":[{"teacher_type_id":"59153f42-83b1-4964-b3ad-5a50226c342a"},{"teacher_type_id":"5d714ae1-4fb4-4b89-a927-47c4396c418e"}]                                                                                |


  Scenario: Accept booking as PENDING teacher
#    When Click on the "Login as a teacher" button
    When Enter login "teachuatnew22@yopmail.com"
    When Enter password "Test123!"
    When Click on the Log in button
    When Click on the "Bookings" button in the header
    When Click on the "invites" tab
#    When Find invite with "Booking for cleared teacher" job title
    When Click on the "accept" button of the appropriate booking
    When Click on the "confirm" button
    Then Check penging popup "You have accepted this booking. Your DBS clearance is not complete. Please complete DBS clearance in your account or contact us for assistance."
    When Close popup
    When Click on the arrow down button
    When Click on the LOGOUT button

  Scenario: Approve booking as school
#    When Click on the "Login as a school" button
    When Enter login "newuatschool28@yopmail.com"
    When Enter password "Test123!"
    When Click on the Log in button
    When Click on the "Bookings" button in the header
    When Approve accepted invite with "Pending Teacher" name
#    When Approve appropriate booking
    Then Popup with "Thank you for approving this booking. When approving bookings, you are re-confirming our terms and conditions." text is appeared
    When Close popup
    When Click on the arrow down button
    When Click on the LOGOUT button

  Scenario: Accept booking as PENDING teacher and Decline booking as school
#    When Click on the "Login as a teacher" button
    When Enter login "teachuatnew22@yopmail.com"
    When Enter password "Test123!"
    When Click on the Log in button
    When Click on the "Bookings" button in the header
    When Click on the "invites" tab
#    When Find invite with "Booking for cleared teacher" job title
    When Click on the "accept" button of the appropriate booking
    When Click on the "confirm" button
    Then Check penging popup "You have accepted this booking. Your DBS clearance is not complete. Please complete DBS clearance in your account or contact us for assistance."
    When Close popup
    When wait time
    When Click on the arrow down button
    When Click on the LOGOUT button
    When Click on the login button
#    When Click on the "Login as a school" button
    When Enter login "newuatschool28@yopmail.com"
    When Enter password "Test123!"
    When Click on the Log in button
    When Click on the "Bookings" button in the header
#    When Find accepted invite with "Booking for cleared teacher" job title
#    When Decline appropriate booking
    When Decline accepted invite with "Pending Teacher" name
    When Click on the "Confirm cancellation" button
    When Click on the arrow down button
    When Click on the LOGOUT button

  Scenario: Decline booking as PENDING teacher
#    When Click on the "Login as a teacher" button
    When Enter login "teachuatnew22@yopmail.com"
    When Enter password "Test123!"
    When Click on the Log in button
    When Click on the "Bookings" button in the header
    When Click on the "invites" tab
#    When Find invite with "Booking for cleared teacher" job title
    When Click on the "decline" button of the appropriate booking
    When Click on the "confirm" button

  Scenario: Remove all user bookings
    When Remove all user bookings using request API
      | admin_id:\"538e52d0-a7c0-4e89-9b48-80f0d0ec958d\"|
      |user_id:\"6e66c2e6-1970-4fb1-9d3d-307b7218ec4e\"    |






