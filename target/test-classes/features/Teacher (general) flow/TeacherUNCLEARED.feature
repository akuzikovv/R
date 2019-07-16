Feature: Teacher UNCLEARED flow

   Background:
    Given open landing page
    When click on the agree button at the banner
    When Click on the login button
    When Click on the "Login as a teacher" button
    When Enter login "newqateacher29@yopmail.com"
    When Enter password "Test123!"
    When Click on the Log in button

  Scenario: The booking page isn't available for teacher with UNCLEARED status
    When Click on the "bookings" button in the header