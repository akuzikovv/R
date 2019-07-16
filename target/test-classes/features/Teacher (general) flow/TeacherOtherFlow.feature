Feature: Teacher Other Flow

  Background:
    Given open landing page
    When click on the agree button at the banner
    When Click on the login button
    When Click on the "Login as a teacher" button
    When Enter login "newqateacher29@yopmail.com"
    When Enter password "Test123!"
    When Click on the Log in button


  Scenario: Dashboard contains all necessary elements
    Then  Header contains textbuttons:
      | dashboard      |
      | jobs |
      | bookings  |
    Then  Header contains bell icon
    Then  Header contains user photo icon
    Then  Header contains user name "First name Last name"
    Then  Header contains arrow down button
    Then  Other Teacher's Left panel contains all necessary elements:
#      | rgba(220, 0, 142, 1)      |
      | add a photo               |
#      | Looking for supply jobs?  |
#      | Update your profile here  |
#      | Who’s veiwed your profile |
      | Quick Links               |
      | Job search                |
      | Saved jobs                |
      | Blog                      |
      | Forum                     |
    When  Close window

  Scenario: Logout
    When Click on the arrow down button
    When Click on the LOGOUT button
    Then User is logout
    When  Close window


  Scenario: The booking page isn't available for teacher with UNCLEARED status
    When Click on the "bookings" button in the header

