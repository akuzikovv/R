Feature: Teacher Profile during Supply Search

  Scenario: Displaying a regular cleared user in the Results tab
    Given open landing page
    Then Landing page > Agree button is shown
    And Landing page > Click on the Agree button
    Then Landing page > Agree button is not shown
    And Landing page > Click on the "Login" link
    Then Login page is opened
    Then Login page > "Log In" tab is selected
    And Login page > Enter "school_test@yopmail.com" text into Login input field
    And Login page > Enter "Test123!" text into Password field
    And Login page > Click on the Login button
    Then School "Your Daddy" profile page is opened
    And School profile page > Header > Click on the Bookings button
    Then School profile page > Supply Bookings page is opened
    And School profile page > Supply Bookings page > Click on the New Supply Booking
    Then School profile page > Supply Bookings page > Find Supply Staff page > Start search page is opened
    And School profile page > Supply Bookings page > Find Supply Staff page > Start search page > enter "Job position" text into Name your job posting
    And School profile page > Supply Bookings page > Find Supply Staff page > Start search page > enter "Description" text into Describe the job
    And School profile page > Supply Bookings page > Find Supply Staff page > Start search page > Click on the "Teacher" checkbox
    And School profile page > Supply Bookings page > Find Supply Staff page > Start search page > Click on the Dates required "Select day(s) and half day(s)" checkbox
    Then School profile page > Supply Bookings page > Find Supply Staff page > Start search page > Calendar is opened
    And School profile page > Supply Bookings page > Find Supply Staff page > Start search page > Calendar > Select available day
    Then School profile page > Supply Bookings page > Find Supply Staff page > Start search page > Select time sheets is shown
    And School profile page > Supply Bookings page > Find Supply Staff page > Start search page > Click on the Show Results button
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page is opened
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > The "RESULTS" tab is opened
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > The "Denny Devito" user is shown
    And School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Click on the "Denny Devito" user
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window is opened
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The "Denny Devito" name is shown
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The "London" location is shown
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The "17/11/1994" birthday is shown
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The "Job title" job title is shown
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The "About me" about me is shown
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The prescreening questions is shown
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The teacher characteristics is shown
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The "Candidate Clearance Summary (1).pdf" CV document is shown
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The "Aimprosoft_profile.pdf" document is shown
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The "BK8000L_CN.pdf" document is shown
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The "Aimprosoft_profile.pdf" document is shown
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The "sobaka-ulibaka.jpg" document is shown
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The "cleared" user status is shown


  Scenario: Displaying a regular cleared user in the Saved tab
    Given open landing page
    Then Landing page > Agree button is shown
    And Landing page > Click on the Agree button
    Then Landing page > Agree button is not shown
    And Landing page > Click on the "Login" link
    Then Login page is opened
    Then Login page > "Log In" tab is selected
    And Login page > Enter "school_test@yopmail.com" text into Login input field
    And Login page > Enter "Test123!" text into Password field
    And Login page > Click on the Login button
    Then School "Your Daddy" profile page is opened
    And School profile page > Header > Click on the Bookings button
    Then School profile page > Supply Bookings page is opened
    And School profile page > Supply Bookings page > Click on the New Supply Booking
    Then School profile page > Supply Bookings page > Find Supply Staff page > Start search page is opened
    And School profile page > Supply Bookings page > Find Supply Staff page > Start search page > enter "Job position" text into Name your job posting
    And School profile page > Supply Bookings page > Find Supply Staff page > Start search page > enter "Description" text into Describe the job
    And School profile page > Supply Bookings page > Find Supply Staff page > Start search page > Click on the "Teacher" checkbox
    And School profile page > Supply Bookings page > Find Supply Staff page > Start search page > Click on the Dates required "Select day(s) and half day(s)" checkbox
    Then School profile page > Supply Bookings page > Find Supply Staff page > Start search page > Calendar is opened
    And School profile page > Supply Bookings page > Find Supply Staff page > Start search page > Calendar > Select available day
    Then School profile page > Supply Bookings page > Find Supply Staff page > Start search page > Select time sheets is shown
    And School profile page > Supply Bookings page > Find Supply Staff page > Start search page > Click on the Show Results button
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page is opened
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > The "RESULTS" tab is opened
    And School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Click on the "SAVED" tab
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > The "SAVED" tab is opened
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > The "Test Teacher" user is shown
    And School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Click on the "Test Teacher" user
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window is opened
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The "Test Teacher" name is shown
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The "London" location is shown
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The "1/01/2000" birthday is shown
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The "Job title......" job title is shown
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The "About me......" about me is shown
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The teacher characteristics is shown
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The "pdf-test.pdf" CV document is shown
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The "pdf-test (1).pdf" document is shown
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The "pdf-test (2).pdf" document is shown
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The "pdf-test (3).pdf" document is shown
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The "pdf-test (4).pdf" document is shown
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The "cleared" user status is shown

  Scenario: Displaying a regular cleared user in the Past hires tab
    Given open landing page
    Then Landing page > Agree button is shown
    And Landing page > Click on the Agree button
    Then Landing page > Agree button is not shown
    And Landing page > Click on the "Login" link
    Then Login page is opened
    Then Login page > "Log In" tab is selected
    And Login page > Enter "school_test@yopmail.com" text into Login input field
    And Login page > Enter "Test123!" text into Password field
    And Login page > Click on the Login button
    Then School "Your Daddy" profile page is opened
    And School profile page > Header > Click on the Bookings button
    Then School profile page > Supply Bookings page is opened
    And School profile page > Supply Bookings page > Click on the New Supply Booking
    Then School profile page > Supply Bookings page > Find Supply Staff page > Start search page is opened
    And School profile page > Supply Bookings page > Find Supply Staff page > Start search page > enter "Job position" text into Name your job posting
    And School profile page > Supply Bookings page > Find Supply Staff page > Start search page > enter "Description" text into Describe the job
    And School profile page > Supply Bookings page > Find Supply Staff page > Start search page > Click on the "Teacher" checkbox
    And School profile page > Supply Bookings page > Find Supply Staff page > Start search page > Click on the Dates required "Select day(s) and half day(s)" checkbox
    Then School profile page > Supply Bookings page > Find Supply Staff page > Start search page > Calendar is opened
    And School profile page > Supply Bookings page > Find Supply Staff page > Start search page > Calendar > Select available day
    Then School profile page > Supply Bookings page > Find Supply Staff page > Start search page > Select time sheets is shown
    And School profile page > Supply Bookings page > Find Supply Staff page > Start search page > Click on the Show Results button
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page is opened
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > The "RESULTS" tab is opened
    And School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Click on the "PAST HIRES" tab
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > The "PAST HIRES" tab is opened
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > The "Test Teacher" user is shown
    And School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Click on the "Test Teacher" user
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window is opened
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The "Test Teacher" name is shown
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The "London" location is shown
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The "1/01/2000" birthday is shown
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The "Job title......" job title is shown
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The "About me......" about me is shown
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The teacher characteristics is shown
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The "pdf-test.pdf" CV document is shown
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The "pdf-test (1).pdf" document is shown
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The "pdf-test (2).pdf" document is shown
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The "pdf-test (3).pdf" document is shown
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The "pdf-test (4).pdf" document is shown
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The "cleared" user status is shown

  Scenario: Displaying a anonymous cleared user in the Results tab
    Given open landing page
    Then Landing page > Agree button is shown
    And Landing page > Click on the Agree button
    Then Landing page > Agree button is not shown
    And Landing page > Click on the "Login" link
    Then Login page is opened
    Then Login page > "Log In" tab is selected
    And Login page > Enter "school_test@yopmail.com" text into Login input field
    And Login page > Enter "Test123!" text into Password field
    And Login page > Click on the Login button
    Then School "Your Daddy" profile page is opened
    And School profile page > Header > Click on the Bookings button
    Then School profile page > Supply Bookings page is opened
    And School profile page > Supply Bookings page > Click on the New Supply Booking
    Then School profile page > Supply Bookings page > Find Supply Staff page > Start search page is opened
    And School profile page > Supply Bookings page > Find Supply Staff page > Start search page > enter "Job position" text into Name your job posting
    And School profile page > Supply Bookings page > Find Supply Staff page > Start search page > enter "Description" text into Describe the job
    And School profile page > Supply Bookings page > Find Supply Staff page > Start search page > Click on the "Teacher" checkbox
    And School profile page > Supply Bookings page > Find Supply Staff page > Start search page > Click on the Dates required "Select day(s) and half day(s)" checkbox
    Then School profile page > Supply Bookings page > Find Supply Staff page > Start search page > Calendar is opened
    And School profile page > Supply Bookings page > Find Supply Staff page > Start search page > Calendar > Select available day
    Then School profile page > Supply Bookings page > Find Supply Staff page > Start search page > Select time sheets is shown
    And School profile page > Supply Bookings page > Find Supply Staff page > Start search page > Click on the Anonymous radio button
    Then School profile page > Supply Bookings page > Find Supply Staff page > Start search page > Anonymous radio button is selected
    And School profile page > Supply Bookings page > Find Supply Staff page > Start search page > Click on the Show Results button
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page is opened
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > The "RESULTS" tab is opened
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > The "D. D." user is shown
    And School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Click on the "D. D." user
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window is opened
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The "D. D." name is shown
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The "London" location is shown
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The "Job title" job title is shown
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The "About me" about me is shown
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The teacher characteristics is shown
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The "cleared" user status is shown

  Scenario: Displaying a anonymous cleared user in the Saved tab
    Given open landing page
    Then Landing page > Agree button is shown
    And Landing page > Click on the Agree button
    Then Landing page > Agree button is not shown
    And Landing page > Click on the "Login" link
    Then Login page is opened
    Then Login page > "Log In" tab is selected
    And Login page > Enter "school_test@yopmail.com" text into Login input field
    And Login page > Enter "Test123!" text into Password field
    And Login page > Click on the Login button
    Then School "Your Daddy" profile page is opened
    And School profile page > Header > Click on the Bookings button
    Then School profile page > Supply Bookings page is opened
    And School profile page > Supply Bookings page > Click on the New Supply Booking
    Then School profile page > Supply Bookings page > Find Supply Staff page > Start search page is opened
    And School profile page > Supply Bookings page > Find Supply Staff page > Start search page > enter "Job position" text into Name your job posting
    And School profile page > Supply Bookings page > Find Supply Staff page > Start search page > enter "Description" text into Describe the job
    And School profile page > Supply Bookings page > Find Supply Staff page > Start search page > Click on the "Teacher" checkbox
    And School profile page > Supply Bookings page > Find Supply Staff page > Start search page > Click on the Dates required "Select day(s) and half day(s)" checkbox
    Then School profile page > Supply Bookings page > Find Supply Staff page > Start search page > Calendar is opened
    And School profile page > Supply Bookings page > Find Supply Staff page > Start search page > Calendar > Select available day
    Then School profile page > Supply Bookings page > Find Supply Staff page > Start search page > Select time sheets is shown
    And School profile page > Supply Bookings page > Find Supply Staff page > Start search page > Click on the Anonymous radio button
    Then School profile page > Supply Bookings page > Find Supply Staff page > Start search page > Anonymous radio button is selected
    And School profile page > Supply Bookings page > Find Supply Staff page > Start search page > Click on the Show Results button
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page is opened
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > The "RESULTS" tab is opened
    And School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Click on the "SAVED" tab
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > The "SAVED" tab is opened
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > The "T. T." user is shown
    And School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Click on the "T. T." user
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window is opened
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The "T. T." name is shown
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The "London" location is shown
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The "Job title......" job title is shown
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The "About me......" about me is shown
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The teacher characteristics is shown
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The "cleared" user status is shown

  Scenario: Displaying a anonymous cleared user in the Past hires tab
    Given open landing page
    Then Landing page > Agree button is shown
    And Landing page > Click on the Agree button
    Then Landing page > Agree button is not shown
    And Landing page > Click on the "Login" link
    Then Login page is opened
    Then Login page > "Log In" tab is selected
    And Login page > Enter "school_test@yopmail.com" text into Login input field
    And Login page > Enter "Test123!" text into Password field
    And Login page > Click on the Login button
    Then School "Your Daddy" profile page is opened
    And School profile page > Header > Click on the Bookings button
    Then School profile page > Supply Bookings page is opened
    And School profile page > Supply Bookings page > Click on the New Supply Booking
    Then School profile page > Supply Bookings page > Find Supply Staff page > Start search page is opened
    And School profile page > Supply Bookings page > Find Supply Staff page > Start search page > enter "Job position" text into Name your job posting
    And School profile page > Supply Bookings page > Find Supply Staff page > Start search page > enter "Description" text into Describe the job
    And School profile page > Supply Bookings page > Find Supply Staff page > Start search page > Click on the "Teacher" checkbox
    And School profile page > Supply Bookings page > Find Supply Staff page > Start search page > Click on the Dates required "Select day(s) and half day(s)" checkbox
    Then School profile page > Supply Bookings page > Find Supply Staff page > Start search page > Calendar is opened
    And School profile page > Supply Bookings page > Find Supply Staff page > Start search page > Calendar > Select available day
    Then School profile page > Supply Bookings page > Find Supply Staff page > Start search page > Select time sheets is shown
    And School profile page > Supply Bookings page > Find Supply Staff page > Start search page > Click on the Anonymous radio button
    Then School profile page > Supply Bookings page > Find Supply Staff page > Start search page > Anonymous radio button is selected
    And School profile page > Supply Bookings page > Find Supply Staff page > Start search page > Click on the Show Results button
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page is opened
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > The "RESULTS" tab is opened
    And School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Click on the "PAST HIRES" tab
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > The "PAST HIRES" tab is opened
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > The "T. T." user is shown
    And School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Click on the "T. T." user
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window is opened
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The "T. T." name is shown
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The "London" location is shown
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The "Job title......" job title is shown
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The "About me......" about me is shown
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The teacher characteristics is shown
    Then School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The "cleared" user status is shown