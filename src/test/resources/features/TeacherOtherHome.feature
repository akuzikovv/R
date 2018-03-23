Feature: Teacher Other Home Page

  Background:
    Given open login page
    When Click on the sign in teacher button
    When Enter login "satintest1+teacherOther@gmail.com"
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
    Then  Header contains user name "Test"
    Then  Header contains arrow down button
    When  Close window

  Scenario: Logout
    When Click on the arrow down button
    Then User is logout
    When  Close window

  Scenario: Left column contains all necessary elements
    Then  Other Teacher's Left panel contains all necessary elements:
      | rgba(220, 0, 142, 1)      |
      | add a photo               |
      | Looking for supply jobs?  |
      | Update your profile here  |
      | Who’s veiwed your profile |
      | Quick Links               |
      | Job search                |
      | Saved jobs                |
      | Blog                      |
      | Forum                     |

