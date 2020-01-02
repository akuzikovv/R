Feature:  Timesheet flow for completed booking

  Background:
    Given open landing page
    When click on the agree button at the banner
    When Click on the login button

  Scenario: Approving timesheet by teacher and school by API
    When Create Booking using request API
      |"school_id":"ef1e8d35-5619-4a40-a76e-cd6b4eab07d6"|
      |"bookingName":"Booking for cleared teacher  20"|
      |"bookingDescription":"Booking Description text"|
      |"other_age_group":""                           |
      |"dates":[{"date":"2020-01-27T08:30:00+02:00","fullDay":true,"start_time":"2020-01-27T08:30:00+02:00","end_time":"2020-01-27T16:00:00+02:00"},{"date":"2020-01-28T08:30:00+02:00","fullDay":false,"start_time":"2020-01-28T08:30:00+02:00","end_time":"2020-01-28T13:00:00+02:00"}]|
      |"ageGroupIds":[{"age_group_id":"19abfc90-f45b-476b-920f-b05e6e3124a0"}]                                                              |
      |"schoolDocumentsIds":{"school_document_id":"18b36a8e-138e-401c-9b73-fddcb50b7d18"}                                                   |
      |"applyUsersIds":[{"user_id":"c93f0da1-4131-408a-8d09-eed7e5766a44","user_type":"TEACHER"}]                                           |
      |"teachersTypeIdsSchema":[{"teacher_type_id":"59153f42-83b1-4964-b3ad-5a50226c342a"},{"teacher_type_id":"5d714ae1-4fb4-4b89-a927-47c4396c418e"}]|
      |"creator_id":"f161024f-7d3a-4738-a804-8d9bfeeb9453"                                                                                            |
      |"anonymisation":false                                                                                                                          |
      |"documents":null                                                                                                                               |
      |"subjectIds":[{"subject_id":"e0eb4195-27e9-4a20-8a6a-c994d008cc61"}]                                                                           |
    When Accept booking as cleared teacher using request API
      |"userId":"c93f0da1-4131-408a-8d09-eed7e5766a44"|
      |"schoolId":"ef1e8d35-5619-4a40-a76e-cd6b4eab07d6"  |
    When Approve booking as school using request API
      |"userId":"c93f0da1-4131-408a-8d09-eed7e5766a44"|
      |"schoolId":"ef1e8d35-5619-4a40-a76e-cd6b4eab07d6"|
    When Change booking status to completed
    |admin_id:\"538e52d0-a7c0-4e89-9b48-80f0d0ec958d\"|
    When Click on the "Login as a teacher" button
    When Enter login "a.kuzikov@aimprosoft.com"
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
    When Enter login "newuatschool28@yopmail.com"
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

  Scenario: Declining timesheet by teacher
    When Create Booking using request API
      |"school_id":"ef1e8d35-5619-4a40-a76e-cd6b4eab07d6"|
      |"bookingName":"Booking for cleared teacher  20"|
      |"bookingDescription":"Booking Description text"|
      |"other_age_group":""                           |
      |"dates":[{"date":"2020-01-27T08:30:00+02:00","fullDay":true,"start_time":"2020-01-27T08:30:00+02:00","end_time":"2020-01-27T16:00:00+02:00"},{"date":"2020-01-28T08:30:00+02:00","fullDay":false,"start_time":"2020-01-28T08:30:00+02:00","end_time":"2020-01-28T13:00:00+02:00"}]|
      |"ageGroupIds":[{"age_group_id":"19abfc90-f45b-476b-920f-b05e6e3124a0"}]                                                              |
      |"schoolDocumentsIds":{"school_document_id":"18b36a8e-138e-401c-9b73-fddcb50b7d18"}                                                   |
      |"applyUsersIds":[{"user_id":"c93f0da1-4131-408a-8d09-eed7e5766a44","user_type":"TEACHER"}]                                           |
      |"teachersTypeIdsSchema":[{"teacher_type_id":"59153f42-83b1-4964-b3ad-5a50226c342a"},{"teacher_type_id":"5d714ae1-4fb4-4b89-a927-47c4396c418e"}]|
      |"creator_id":"f161024f-7d3a-4738-a804-8d9bfeeb9453"                                                                                            |
      |"anonymisation":false                                                                                                                          |
      |"documents":null                                                                                                                               |
      |"subjectIds":[{"subject_id":"e0eb4195-27e9-4a20-8a6a-c994d008cc61"}]                                                                           |
    When Accept booking as cleared teacher using request API
      |"userId":"c93f0da1-4131-408a-8d09-eed7e5766a44"|
      |"schoolId":"ef1e8d35-5619-4a40-a76e-cd6b4eab07d6"  |
    When Approve booking as school using request API
      |"userId":"c93f0da1-4131-408a-8d09-eed7e5766a44"|
      |"schoolId":"ef1e8d35-5619-4a40-a76e-cd6b4eab07d6"|
    When Change booking status to completed
      |admin_id:\"538e52d0-a7c0-4e89-9b48-80f0d0ec958d\"|
    When Click on the "Login as a teacher" button
    When Enter login "a.kuzikov@aimprosoft.com"
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

  Scenario: Declining timesheet by school
    When Create Booking using request API
      |"school_id":"ef1e8d35-5619-4a40-a76e-cd6b4eab07d6"|
      |"bookingName":"Booking for cleared teacher  20"|
      |"bookingDescription":"Booking Description text"|
      |"other_age_group":""                           |
      |"dates":[{"date":"2020-01-27T08:30:00+02:00","fullDay":true,"start_time":"2020-01-27T08:30:00+02:00","end_time":"2020-01-27T16:00:00+02:00"},{"date":"2020-01-28T08:30:00+02:00","fullDay":false,"start_time":"2020-01-28T08:30:00+02:00","end_time":"2020-01-28T13:00:00+02:00"}]|
      |"ageGroupIds":[{"age_group_id":"19abfc90-f45b-476b-920f-b05e6e3124a0"}]                                                              |
      |"schoolDocumentsIds":{"school_document_id":"18b36a8e-138e-401c-9b73-fddcb50b7d18"}                                                   |
      |"applyUsersIds":[{"user_id":"c93f0da1-4131-408a-8d09-eed7e5766a44","user_type":"TEACHER"}]                                           |
      |"teachersTypeIdsSchema":[{"teacher_type_id":"59153f42-83b1-4964-b3ad-5a50226c342a"},{"teacher_type_id":"5d714ae1-4fb4-4b89-a927-47c4396c418e"}]|
      |"creator_id":"f161024f-7d3a-4738-a804-8d9bfeeb9453"                                                                                            |
      |"anonymisation":false                                                                                                                          |
      |"documents":null                                                                                                                               |
      |"subjectIds":[{"subject_id":"e0eb4195-27e9-4a20-8a6a-c994d008cc61"}]                                                                           |
    When Accept booking as cleared teacher using request API
      |"userId":"c93f0da1-4131-408a-8d09-eed7e5766a44"|
      |"schoolId":"ef1e8d35-5619-4a40-a76e-cd6b4eab07d6"  |
    When Approve booking as school using request API
      |"userId":"c93f0da1-4131-408a-8d09-eed7e5766a44"|
      |"schoolId":"ef1e8d35-5619-4a40-a76e-cd6b4eab07d6"|
    When Change booking status to completed
      |admin_id:\"538e52d0-a7c0-4e89-9b48-80f0d0ec958d\"|
    When Click on the "Login as a teacher" button
    When Enter login "a.kuzikov@aimprosoft.com"
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
    When Enter login "newuatschool28@yopmail.com"
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