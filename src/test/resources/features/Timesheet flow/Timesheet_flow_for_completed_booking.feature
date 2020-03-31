Feature:  Timesheet flow for completed booking

  Background:
    Given open landing page
    When click on the agree button at the banner
    When Click on the login button

  Scenario: Approving timesheet by teacher and school by API
    When Create Booking using request API
      |"school_id":"9b3daa63-4ef8-43a4-8e7c-8b62ff6367f1"|
      |"bookingName":"Booking for cleared teacher  20"|
      |"bookingDescription":"Booking Description text"|
      |"other_age_group":""                           |
      |"dates":[{"date":"2020-08-27T08:30:00+02:00","fullDay":true,"start_time":"2020-08-27T08:30:00+02:00","end_time":"2020-08-27T16:00:00+02:00"},{"date":"2020-08-28T08:30:00+02:00","fullDay":false,"start_time":"2020-08-28T08:30:00+02:00","end_time":"2020-08-28T13:00:00+02:00"}]|
      |"ageGroupIds":[{"age_group_id":"19abfc90-f45b-476b-920f-b05e6e3124a0"}]                                                              |
      |"schoolDocumentsIds":{"school_document_id":"9c78412f-fe27-4fcc-b527-405e903810e2"}                                                   |
      |"applyUsersIds":[{"user_id":"827fc573-d555-4cf8-9e6d-4d85e7d0e554","user_type":"TEACHER"}]                                           |
      |"teachersTypeIdsSchema":[{"teacher_type_id":"59153f42-83b1-4964-b3ad-5a50226c342a"},{"teacher_type_id":"5d714ae1-4fb4-4b89-a927-47c4396c418e"}]|
      |"creator_id":"f161024f-7d3a-4738-a804-8d9bfeeb9453"                                                                                            |
      |"anonymisation":false                                                                                                                          |
      |"documents":null                                                                                                                               |
      |"subjectIds":[{"subject_id":"e0eb4195-27e9-4a20-8a6a-c994d008cc61"}]                                                                              |
    When Accept booking as cleared teacher using request API
      |"userId":"827fc573-d555-4cf8-9e6d-4d85e7d0e554"|
      |"schoolId":"9b3daa63-4ef8-43a4-8e7c-8b62ff6367f1"  |
    When Approve booking as school using request API
      |"userId":"827fc573-d555-4cf8-9e6d-4d85e7d0e554"|
      |"schoolId":"9b3daa63-4ef8-43a4-8e7c-8b62ff6367f1"|
    When Change booking status to completed
    |admin_id:\"538e52d0-a7c0-4e89-9b48-80f0d0ec958d\"|
    When Click on the "Login as a teacher" button
    When Enter login "newuatteacher176@sharklasers.com"
    When Enter password "Test123!"
    When Click on the Log in button
    When Click on the "bookings" button in the header
    When Click on the "past booking" tab
    When Click on the "timesheet" button of the appropriate booking
    Then Appropriate booking id is displayed
    Then The "12" rate is displayed at the timesheet page
    Then Total rate for teacher is right calculated
    When Accept timesheet
    Then Current submission date is appeared
    When Open "https://www.guerrillamail.com/" in  the new tab
    When Enter "newuatteacher176" email of appropriate teacher
    When Choose appropriate email message "Confirmation of your timesheet submission"
    Then Email body contains necessary text "This is to confirm that your recent timesheet has been submitted to The Camden School for Girls for approval.Once the school has approved the timesheet, payment to you will be authorised."
    When Back to the first tab
    When Click on the arrow down button
    When Click on the LOGOUT button
    When Click on the login button
    When Click on the "Login as a school" button
    When Enter login "newuatschool501@sharklasers.com"
    When Enter password "Test123!"
    When Click on the Log in button
    When Click on the "bookings" button in the header
    When Click on the "completed" tab
    Then Teacher rate for school is right calculated
    When Click on the "Booking for cleared teacher" button of the appropriate booking
    Then Total rate for school is right calculated
    When Accept timesheet
    Then Popup with "Thank you for confirming this timesheet. When confirming timesheets, you are re-confirming our terms and conditions." text is appeared
    When Close popup
    Then Approve/Decline buttons are disabled
    When Open "https://www.guerrillamail.com/" in  the new tab
    When Enter "newuatteacher176" email of appropriate teacher
    When Choose appropriate email message "Your timesheet has been approved"
    Then Email body contains necessary text "Your timesheet has been approved by The Camden School for Girls. Your payment can now be authorised.RealiseMe Team"
    When Back to the first tab

  Scenario: Declining timesheet by teacher
    When Create Booking using request API
      |"school_id":"9b3daa63-4ef8-43a4-8e7c-8b62ff6367f1"|
      |"bookingName":"Booking for cleared teacher  20"|
      |"bookingDescription":"Booking Description text"|
      |"other_age_group":""                           |
      |"dates":[{"date":"2020-08-27T08:30:00+02:00","fullDay":true,"start_time":"2020-08-27T08:30:00+02:00","end_time":"2020-08-27T16:00:00+02:00"},{"date":"2020-08-28T08:30:00+02:00","fullDay":false,"start_time":"2020-08-28T08:30:00+02:00","end_time":"2020-08-28T13:00:00+02:00"}]|
      |"ageGroupIds":[{"age_group_id":"19abfc90-f45b-476b-920f-b05e6e3124a0"}]                                                              |
      |"schoolDocumentsIds":{"school_document_id":"9c78412f-fe27-4fcc-b527-405e903810e2"}                                                   |
      |"applyUsersIds":[{"user_id":"827fc573-d555-4cf8-9e6d-4d85e7d0e554","user_type":"TEACHER"}]                                           |
      |"teachersTypeIdsSchema":[{"teacher_type_id":"59153f42-83b1-4964-b3ad-5a50226c342a"},{"teacher_type_id":"5d714ae1-4fb4-4b89-a927-47c4396c418e"}]|
      |"creator_id":"f161024f-7d3a-4738-a804-8d9bfeeb9453"                                                                                            |
      |"anonymisation":false                                                                                                                          |
      |"documents":null                                                                                                                               |
      |"subjectIds":[{"subject_id":"e0eb4195-27e9-4a20-8a6a-c994d008cc61"}]                                                                              |
    When Accept booking as cleared teacher using request API
      |"userId":"827fc573-d555-4cf8-9e6d-4d85e7d0e554"|
      |"schoolId":"9b3daa63-4ef8-43a4-8e7c-8b62ff6367f1"  |
    When Approve booking as school using request API
      |"userId":"827fc573-d555-4cf8-9e6d-4d85e7d0e554"|
      |"schoolId":"9b3daa63-4ef8-43a4-8e7c-8b62ff6367f1"|
    When Change booking status to completed
      |admin_id:\"538e52d0-a7c0-4e89-9b48-80f0d0ec958d\"|
    When Click on the "Login as a teacher" button
    When Enter login "newuatteacher176@sharklasers.com"
    When Enter password "Test123!"
    When Click on the Log in button
    When Click on the "bookings" button in the header
    When Click on the "past booking" tab
    When Click on the "timesheet" button of the appropriate booking
    Then Appropriate booking id is displayed
    Then The "12" rate is displayed at the timesheet page
    Then Total rate for teacher is right calculated
    When Decline timesheet
    When Enter "Decline teacher" to the text field in the popup
    When Click on the "Confirm" button
    Then The "declined" status is displayed
    When Open "https://www.guerrillamail.com/" in  the new tab
    When Enter "newuatteacher176" email of appropriate teacher
    When Choose appropriate email message "You declined a timesheet"
    Then Email body contains necessary text "You’ve declined a timesheet for The Camden School for Girls. Contact us for help with how to resolve this issue.RealiseMe Team"
    When Back to the first tab

  Scenario: Declining timesheet by school
    When Create Booking using request API
      |"school_id":"9b3daa63-4ef8-43a4-8e7c-8b62ff6367f1"|
      |"bookingName":"Booking for cleared teacher  20"|
      |"bookingDescription":"Booking Description text"|
      |"other_age_group":""                           |
      |"dates":[{"date":"2020-08-27T08:30:00+02:00","fullDay":true,"start_time":"2020-08-27T08:30:00+02:00","end_time":"2020-08-27T16:00:00+02:00"},{"date":"2020-08-28T08:30:00+02:00","fullDay":false,"start_time":"2020-08-28T08:30:00+02:00","end_time":"2020-08-28T13:00:00+02:00"}]|
      |"ageGroupIds":[{"age_group_id":"19abfc90-f45b-476b-920f-b05e6e3124a0"}]                                                              |
      |"schoolDocumentsIds":{"school_document_id":"9c78412f-fe27-4fcc-b527-405e903810e2"}                                                   |
      |"applyUsersIds":[{"user_id":"827fc573-d555-4cf8-9e6d-4d85e7d0e554","user_type":"TEACHER"}]                                           |
      |"teachersTypeIdsSchema":[{"teacher_type_id":"59153f42-83b1-4964-b3ad-5a50226c342a"},{"teacher_type_id":"5d714ae1-4fb4-4b89-a927-47c4396c418e"}]|
      |"creator_id":"f161024f-7d3a-4738-a804-8d9bfeeb9453"                                                                                            |
      |"anonymisation":false                                                                                                                          |
      |"documents":null                                                                                                                               |
      |"subjectIds":[{"subject_id":"e0eb4195-27e9-4a20-8a6a-c994d008cc61"}]                                                                              |
    When Accept booking as cleared teacher using request API
      |"userId":"827fc573-d555-4cf8-9e6d-4d85e7d0e554"|
      |"schoolId":"9b3daa63-4ef8-43a4-8e7c-8b62ff6367f1"  |
    When Approve booking as school using request API
      |"userId":"827fc573-d555-4cf8-9e6d-4d85e7d0e554"|
      |"schoolId":"9b3daa63-4ef8-43a4-8e7c-8b62ff6367f1"|
    When Change booking status to completed
      |admin_id:\"538e52d0-a7c0-4e89-9b48-80f0d0ec958d\"|
    When Click on the "Login as a teacher" button
    When Enter login "newuatteacher176@sharklasers.com"
    When Enter password "Test123!"
    When Click on the Log in button
    When Click on the "bookings" button in the header
    When Click on the "past booking" tab
    When Click on the "timesheet" button of the appropriate booking
    Then Appropriate booking id is displayed
    Then The "12" rate is displayed at the timesheet page
    Then Total rate for teacher is right calculated
    When Accept timesheet
    Then Current submission date is appeared
    When Click on the arrow down button
    When Click on the LOGOUT button
    When Click on the login button
    When Click on the "Login as a school" button
    When Enter login "newuatschool501@sharklasers.com"
    When Enter password "Test123!"
    When Click on the Log in button
    When Click on the "bookings" button in the header
    When Click on the "completed" tab
    Then Teacher rate for school is right calculated
    When Click on the "Booking for cleared teacher" button of the appropriate booking
    Then Total rate for school is right calculated
    When Decline timesheet
    When Enter "Decline school" to the text field in the popup
    When Click on the "Confirm" button
    Then Approve/Decline buttons are disabled
    When Open "https://www.guerrillamail.com/" in  the new tab
    When Enter "newuatteacher176" email of appropriate teacher
    When Choose appropriate email message "Your timesheet has been declined"
    Then Email body contains necessary text "Sorry, The Camden School for Girls has declined your timesheet. Contact us for help with how to resolve this issue.RealiseMe Team"
    When Back to the first tab


#  Scenario: Remove all user bookings
#    When Remove all user bookings using request API
#      | admin_id:\"538e52d0-a7c0-4e89-9b48-80f0d0ec958d\"|
#      |user_id:\"827fc573-d555-4cf8-9e6d-4d85e7d0e554\"    |