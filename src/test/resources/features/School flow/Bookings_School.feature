
Feature:  School Bookings

  Background:
    Given open landing page
    When click on the agree button at the banner
    When Click on the login button
    When Click on the school "Login as a school" button
    When Enter login "newtestschool2@yopmail.com"
    When Enter password "Test123!"
    When Click on the Log in button

  Scenario: Create booking with required fields
    When Click on the "bookings" button in the header
#    Then  Bookings page contains all necessary elements:
#      | Supply Bookings            |
#      | active            |
#      | completed        |
#      | invites           |
#      | expired       |
#      | NEW SUPPLY BOOKING          |
#    When Click on the "active" tab
    When Click on the "New Supply Booking" button
    Then  New Supply Booking page contains all necessary text:
    |Find Supply Staff|
    |START SEARCH |
    |SEARCH RESULTS |
    |REVIEW INVITATIONS|
    |INVITES           |
    |I want to use my saved search|
    |Job Details                  |
    |Name your job posting*       |
#    |EXAMPLE: Maths teacher in Essex|
    |Describe the job*              |
    |5000 characters left           |
    |Teacher type*                  |
    |Teacher                        |
    |TA                             |
    |Date(s) required*              |
    |Note: click on date to switch between full and half day. If the booking is less than half day, please contact us to proceed. |
    |Rate*                                                                                                                        |
    |Note: half day is two-third the rate you entered                                                                             |
    |Any specialist subject(s) required?                                                                                          |
    |Any age group(s) required?                                                                                                   |
    |Additional document(s)                                                                                                       |
    |Anonymisation                                                                                                                |
    |You have anonymisation turned OFF ON, if you wish to remove any bias in screening procress, please click to turn on. You can always change it in your account setting.|
    |I want to save this search for future use                                                                                    |
    |Invite a coworker to help you hire - you can easily add any coworkers as an admin in your account setting.                   |
    |SHOW RESULTS                                                                                                                 |
    |Please fill in all required fields to continue                                                                               |
    When Click on the "SHOW RESULTS" button
    Then The "name" field is highlighted red
#    Then The "describe" field is highlighted red
#    Then The "Choose Teacher type" is displayed above the
    When Enter text to the Name your job posting field
    When Enter text to the Describe the job field
    When Choose "Teacher" checkbox
    When Choose "TA" checkbox
    When Choose "I want to save this search for future use" checkbox
    When Choose full day "23" in the "2" month of available calendar
    When Choose half day "15" in the "2" month of available calendar
    When Choose full day start time "8:00"
    When Choose full day end time "17:00"
    When Choose half day start time "11:00"
    When Choose half day end time "15:00"
    When Enter "200" rate
    When Click on the "SHOW RESULTS" button
#    Then The SEARCH RESULTS page contains all necessary elements
    When Choose "I want to invite top THREE candidates" checkbox
    When Click on the "Review Invitations" button
#    When Check popup for UNCLEARED USERS
#    When Close popup
    When Click on the "SEND" button
#    When Choose "Agree to waiver and continue" checkbox
#    When Click on the "ok" button
    When Click on the "View all invites" button
    When  wait time

