
Feature:  Booking Creation

  Background:
    Given open landing page
    When click on the agree button at the banner
    When Click on the login button



  Scenario: Create booking for CLEARED teacher
    When Click on the "Login as a school" button
    When Enter login "newuatschool28@yopmail.com"
    When Enter password "Test123!"
    When Click on the Log in button
    When Click on the "bookings" button in the header
    When Click on the "New Supply Booking" button
    When Enter "Booking for cleared teacher" to the Name your job posting field
    When Enter "Booking Description" to the Describe the job field
    When Choose "Teacher" checkbox
    When Choose "TA" checkbox
    When Choose "I want to save this search for future use" checkbox
    When Choose full day "24" in the "2" month of available calendar
    When Choose half day "25" in the "2" month of available calendar
    When Choose full day start time "8:00"
    When Choose full day end time "17:00"
    When Choose half day start time "11:00"
    When Choose half day end time "15:00"
    When Enter "123.456" rate
    When Click on the "SHOW RESULTS" button
    When Click on the Invite to job button at the teacher with "cleared" status
    When Click on the "Review Invitations" button
    When Click on the "SEND" button
    When Get names of teachers
    When Click on the "View all invites" button
    Then Appropriate teachers are displayed in the invites list


  Scenario: Accept booking as CLEARED teacher
    When Click on the "Login as a teacher" button
    When Enter login "a.kuzikov@aimprosoft.com"
    When Enter password "Test123!"
    When Click on the Log in button
    When Click on the "bookings" button in the header
#    When Click on the "New Supply Booking" button
#    When Enter "Booking for cleared teacher" to the Name your job posting field
#    When Enter "Booking Description" to the Describe the job field
#    When Choose "Teacher" checkbox
#    When Choose "TA" checkbox
#  #    When Choose "I want to save this search for future use" checkbox
#    When Choose full day "24" in the "2" month of available calendar
#    When Choose half day "25" in the "2" month of available calendar
#    When Choose full day start time "8:00"
#    When Choose full day end time "17:00"
#    When Choose half day start time "11:00"
#    When Choose half day end time "15:00"
#    When Enter "123.456" rate
#    When Click on the "SHOW RESULTS" button
#    When Click on the Invite to job button at the teacher with "cleared" status
#    When Click on the "Review Invitations" button
#    When Click on the "SEND" button
#    When Get names of teachers
#    When Click on the "View all invites" button
#    Then Appropriate teachers are displayed in the invites list

