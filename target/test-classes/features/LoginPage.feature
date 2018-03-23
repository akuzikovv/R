Feature: Login page

  Scenario: Login page
    Given open login page
    Then  Header contains textbuttons:
      | home      |
      | messaging |
      | bookings  |
      | jobs      |
    Then Login page contains pictures
    Then Login page contains
      | I AM A TEACHER |
      | I AM A SCHOOL  |
      | sign in        |
      | sign in        |



