
Feature:  Booking Creation

  Background:
    Given open landing page
    When click on the agree button at the banner
    When Click on the login button
    When Click on the school "Login as a school" button
    When Enter login "newuatschool28@yopmail.com"
    When Enter password "Test123!"
    When Click on the Log in button


  Scenario: Create booking for UNCLEARED teacher
    When Click on the "bookings" button in the header
    When Click on the "New Supply Booking" button
    When Enter "Booking for uncleared teacher" to the Name your job posting field
    When Enter "Booking Description" to the Describe the job field
    When Choose "Teacher" checkbox
    When Choose "TA" checkbox
    When Choose "I want to save this search for future use" checkbox
    When Choose full day "23" in the "2" month of available calendar
    When Choose half day "25" in the "2" month of available calendar
    When Choose full day start time "8:00"
    When Choose full day end time "17:00"
    When Choose half day start time "11:00"
    When Choose half day end time "15:00"
    When Enter "200" rate
    When Click on the "SHOW RESULTS" button
#    When Choose "I want to invite top THREE candidates" checkbox
##    When  Get statuses of teachers
    When Click on the Invite to job button at the teacher with "uncleared" status
    When Click on the "Review Invitations" button
    Then Check uncleared popup "You have selected a teacher that has not yet completed clearance. They will not be able to accept this booking until they are fully cleared."
    When Close popup
    When Click on the "SEND" button
#    When Choose "Agree to waiver and continue" checkbox
#    When Click on the "ok" button
    When Get names of teachers
    When Click on the "View all invites" button
    Then Appropriate teachers are displayed in the invites list
#    When  wait time


