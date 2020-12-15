Feature: Teacher Other Flow

  Background:
    Given open landing page
    When click on the agree button at the banner
    When Click on the login button
    When Enter login "uatteacher22@yopmail.com"
    #DEV
#    When Enter login "newuatteacher229@sharklasers.com"
    When Enter password "Test123!"
    When Click on the Log in button


  Scenario: Dashboard contains all necessary elements
    Then  Header contains textbuttons:
      | dashboard      |
      | jobs |
      | bookings  |
    |community  |
    Then  Header contains user photo icon
    Then  Header contains user name "Teacher Other"
    Then  Header contains arrow down button
    Then  Other Teacher's Left panel contains all necessary elements:
#      | rgba(220, 0, 142, 1)      |
      | upload               |
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


  Scenario: The booking page isn't available for teacher Other
    When Click on the "Bookings" button in the header
    Then Popup with "No bookings yet, wow, we must be missing some information." text is appeared
      |No bookings yet, wow, we must be missing some information.|
  |Don’t worry, it only takes a few minutes to complete your profile and to be searchable by schools in your area. Click here to join the ReMe supply community and to receive a bonus after only your first 5 days work.|
  |Realise your worth, realiseme."                                                                                                                                                               |
    When Close popup
    When Click on the "Bookings" button in the header
    When Click on the "here" link
    Then The "Teacher Details" section is opened

