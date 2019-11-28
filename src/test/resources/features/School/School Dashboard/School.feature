Feature: Teacher Other Home Page

  Background:
    Given open landing page
    When Click on the login button
    When Click on the sign in school button
    When Enter login "satintest1+school@gmail.com"
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
    Then  Header contains user name "Hermione Granger"
    Then  Header contains arrow down button
    When  Close window

  Scenario: Logout
    When Click on the arrow down button
    When Click on the LOGOUT button
    Then User is logout
    When  Close window

  Scenario: Left column contains all necessary elements
    Then  School Left panel contains all necessary elements:
      | rgba(220, 0, 142, 1)      |
      | Welcome,                  |
      | add a photo               |
      | Basic                     |
      | Membership                |
      | Who’s veiwed your profile |
      | Quick Links               |
      | Post a job                |
      | Search supply staff       |
      | Saved candidates          |
    When  Close window


  Scenario: Upcoming Supply Bookings table contains all necessary elements
    Then Second table contains "Upcoming Supply Bookings" title
    Then Table contains "view all" button
    Then School first Table contains next columns:
      | teacher     |
      | date       |
      | total days |
      | rate       |
      | action     |
    Then The five lines in the table are displayed
#   Then All lines sorted by date

