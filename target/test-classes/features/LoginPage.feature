Feature: Login page
#    Background:
#        Given open custom login page
#        When  enter Login And Pass Of User 2
#        When  open Dashboard page

      Scenario: Login page
            Given open login page
            Then  Header contains textbuttons:
                |home|
                |messaging|
                |bookings|
                |jobs    |
            Then Login page contains pictures
            Then Login page contains
                |I AM A TEACHER|
                |I AM A SCHOOL|
                |sign in      |
                |sign in      |



