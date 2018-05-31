Feature: Teacher Other Home Page

  Background:
    Given open login page
    When Click on the sign in teacher button
    When Enter login "satintest1+teacherSupply@gmail.com"
    When Enter password "Test123!"
    When Click on the Log in button

  Scenario: Header contains all necessary elements
    Then  Header contains textbuttons:
      | home      |
      | messaging |
      | bookings  |
      | jobs      |
    Then  Header contains bell icon
    Then  Header contains user photo icon
    Then  Header contains user name "Test3 Test3"
    Then  Header contains arrow down button
    When  Close window

  Scenario: Logout
    When Click on the arrow down button
    When Click on the LOGOUT button
    Then User is logout
    When  Close window

  Scenario: Left column contains all necessary elements
    Then  Supply Teacher's Left panel contains all necessary elements:
      | rgba(220, 0, 142, 1)      |
      | add a photo               |
      | Clearance status          |
      | Who’s veiwed your profile |
      | Quick Links               |
      | Job search                |
      | Saved jobs                |
      | Blog                      |
      | Forum                     |
    When  Close window


  Scenario: Recent Invites table contains all necessary elements
    Then Table contains "Recent Invites" title
    Then Table contains "view all" button
    Then Teacher Supply first Table contains next columns:
    |school|
    |date|
    |total days|
    |rate      |
    |accept    |
    |decline   |
    Then The five lines in the table are displayed
#    Then All lines sorted by date

  Scenario: Recent active bookings  table contains all necessary elements
    Then Table contains "Recent active bookings" title
    Then Table contains "view all" button
    Then Teacher Supply second Table contains next columns:
      |school|
      |date|
      |total days|
      |rate      |
      |cancel |
    Then The five lines in the table are displayed
#    Then All lines sorted by date

