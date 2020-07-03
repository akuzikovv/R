Feature:  Booking flow for CLEARED teacher

  Background:
    Given open landing page
    When click on the agree button at the banner
    When Click on the login button

  Scenario: Create booking for CLEARED teacher
#    When Click on the "Login as a school" button
    When Enter login "newuatschool28@yopmail.com"
    When Enter password "Test123!"
    When Click on the Log in button
    When Click on the "Bookings" button in the header
    When Click on the "New Supply Booking" button
    When Enter "Booking for cleared teacher" to the Name your job posting field
    When Enter "Booking Description" to the Describe the job field
    When Choose "Teacher" checkbox
    When Choose "TA" checkbox
#    When Choose "I want to save this search for future use" checkbox
    When Choose "Select day(s) and half day(s)" checkbox
    When Choose full day "26" in the "2" month of available calendar
    When Choose half day "28" in the "2" month of available calendar
    When Choose full day start time "8:00"
    When Choose full day end time "17:00"
    When Choose half day start time "11:00"
    When Choose half day end time "15:00"
#    When Enter "123.456" rate
    When Click on the "SHOW RESULTS" button
#    When Click on the Invite to job button at the teacher with "cleared" status
    When Click on the Invite to job button at the teacher with "jeffrey lebowski2" name
    When Click on the "NEXT STEP" button
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
    When Click on the arrow down button
    When Click on the LOGOUT button

  Scenario:  Check booking creation status
      When Check booking creation status
    |"bookingName":"Booking for cleared teacher  20"|
    |"dates":[{"date":"2020-08-27T08:30:00+02:00","fullDay":true,"start_time":"2020-08-27T08:30:00+02:00","end_time":"2020-08-27T16:00:00+02:00"},{"date":"2020-08-28T08:30:00+02:00","fullDay":false,"start_time":"2020-08-28T08:30:00+02:00","end_time":"2020-08-28T13:00:00+02:00"}]|
    |"applyUsersIds":[{"user_id":"c93f0da1-4131-408a-8d09-eed7e5766a44","user_type":"TEACHER"}]                                                                                                                                     |
    |"teachersTypeIdsSchema":[{"teacher_type_id":"59153f42-83b1-4964-b3ad-5a50226c342a"},{"teacher_type_id":"5d714ae1-4fb4-4b89-a927-47c4396c418e"}]                                                                                |


  Scenario: Accept booking as CLEARED teacher
#    When Click on the "Login as a teacher" button
    When Enter login "a.kuzikov@aimprosoft.com"
    When Enter password "Test123!"
    When Click on the Log in button
    When Click on the "Bookings" button in the header
    When Click on the "invites" tab
#    When Find invite with "Booking for cleared teacher" job title
    When Click on the "accept" button of the appropriate booking
    When Click on the "confirm" button
    When Click on the arrow down button
    When Click on the LOGOUT button

  Scenario: Approve booking as school
#    When Click on the "Login as a school" button
    When Enter login "newuatschool28@yopmail.com"
    When Enter password "Test123!"
    When Click on the Log in button
    When Click on the "Bookings" button in the header
    When Approve accepted invite with "Jeffrey Lebowski2" name
#    When Approve appropriate booking
    Then Popup with "Thank you for approving this booking. When approving bookings, you are re-confirming our terms and conditions." text is appeared
    When Close popup
    When Click on the arrow down button
    When Click on the LOGOUT button

  Scenario: Accept booking as CLEARED teacher and Decline booking as school
#    When Click on the "Login as a teacher" button
    When Enter login "a.kuzikov@aimprosoft.com"
    When Enter password "Test123!"
    When Click on the Log in button
    When Click on the "Bookings" button in the header
    When Click on the "invites" tab
#    When Find invite with "Booking for cleared teacher" job title
    When Click on the "accept" button of the appropriate booking
    When Click on the "confirm" button
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
    When Decline accepted invite with "Jeffrey Lebowski2" name
    When Click on the "Confirm cancellation" button
    When Click on the arrow down button
    When Click on the LOGOUT button

  Scenario: Decline booking as CLEARED teacher
#    When Click on the "Login as a teacher" button
    When Enter login "a.kuzikov@aimprosoft.com"
    When Enter password "Test123!"
    When Click on the Log in button
    When Click on the "Bookings" button in the header
    When Click on the "invites" tab
#    When Find invite with "Booking for cleared teacher" job title
    When Click on the "decline" button of the appropriate booking
    When Click on the "confirm" button







