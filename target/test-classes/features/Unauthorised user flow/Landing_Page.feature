Feature: Landing page

#  Scenario: Unauthorised user job search and save
#    Given open landing page
#    Then  Landing page header contains textbuttons:
#      | blog         |
#      | forum        |
#      | login        |
#      | sign up      |
#    When Enter "Head of Herbology" to the search field
#    When Click search button
#    Then The "Head of Herbology" is displayed in the search result
#    When Click on the Save button
#    Then  Authorization page contains necessary elements
#    | Don't remember your password? |
#    When Enter login "satintest1+teacherSupply@gmail.com"
#    When Enter password "Test123!"
#    When Click on the Log in button
#    When Enter "Head of Herbology" to the search field
#    When Click search button
#    Then The "Head of Herbology" is displayed in the search result
#    Then The "Saved" button is highlighted
#
#
#  Scenario: Unauthorised user job search and apply
#    Given open landing page
#    When Enter "Head of Herbology" to the search field
#    When Click search button
#    Then The "Head of Herbology" is displayed in the search result
#    When Click on the job title
#    Then The job preview page is opened with necessary elements
#    |Preview             |
#    |Head of Herbology   |
#    |Posted:             |
#    |Apply by:           |
#    |School              |
#    |Job Description     |
#    |APPLY               |
#    |Contract Type       |
#    |Contract Term       |
#    |Salary              |
#    |School Profile      |
#    | Skills & Essentials|
#    | Documents          |
#    |Video prescreening  |
#    |Video interview     |
#    When Click on the Apply button

  Scenario: Check the display of buttons in the Header as Unauthorised user
    Given open landing page
    Then Landing page > Agree button is shown
    And Landing page > Click on the Agree button
    Then Landing page > Agree button is not shown
    Then Landing page > Header > The "Our mission" link is shown
    Then Landing page > Header > The "Solutions" link is shown
    Then Landing page > Header > The "Community" link is shown
    Then Landing page > Header > The "Jobs" link is shown
    Then Landing page > Header > The "Book a demo" link is shown
    Then Landing page > Header > The "Supply" link is shown
    Then Landing page > Header > The "Work with us" link is shown
    Then Landing page > Header > The "Login" link is shown
    Then Landing page > Header > The "sign up" link is shown

  Scenario: Check "Our mission" menu as Unauthorised user
    Given open landing page
    Then Landing page > Agree button is shown
    And Landing page > Click on the Agree button
    Then Landing page > Agree button is not shown
    Then Landing page > Header > The "Our mission" link is shown
    And Landing page > Click on the "Our mission" link
    Then Landing page > "Our mission" menu is shown

  Scenario: Check "About us" link in the "Our mission" menu as Unauthorised user
    Given open landing page
    Then Landing page > Agree button is shown
    And Landing page > Click on the Agree button
    Then Landing page > Agree button is not shown
    Then Landing page > Header > The "Our mission" link is shown
    And Landing page > Click on the "Our mission" link
    Then Landing page > "Our mission" menu is shown
    And Landing page > Our mission menu > Click on the "About Us" link
    Then Landing page > Our mission menu > About us page is opened

  Scenario: Check "How it works" link in the "Our mission" menu as Unauthorised user
    Given open landing page
    Then Landing page > Agree button is shown
    And Landing page > Click on the Agree button
    Then Landing page > Agree button is not shown
    Then Landing page > Header > The "Our mission" link is shown
    And Landing page > Click on the "Our mission" link
    Then Landing page > "Our mission" menu is shown
    And Landing page > Our mission menu > Click on the "How It Works" link
    Then Landing page > Our mission menu > How it works page is opened

  Scenario: Check transition "Solutions" link as Unauthorised user
    Given open landing page
    Then Landing page > Agree button is shown
    And Landing page > Click on the Agree button
    Then Landing page > Agree button is not shown
    Then Landing page > Header > The "Solutions" link is shown
    And Landing page > Click on the "Solutions" link
    Then Landing page > Solutions page is opened

  Scenario: Check "Community" menu as Unauthorised user
    Given open landing page
    Then Landing page > Agree button is shown
    And Landing page > Click on the Agree button
    Then Landing page > Agree button is not shown
    Then Landing page > Header > The "Community" link is shown
    And Landing page > Mouse move to the "Community" link
    Then Landing page > "Community" menu is shown

  Scenario: Check "Blog" link in the "Community" menu as Unauthorised user
    Given open landing page
    Then Landing page > Agree button is shown
    And Landing page > Click on the Agree button
    Then Landing page > Agree button is not shown
    Then Landing page > Header > The "Community" link is shown
    And Landing page > Mouse move to the "Community" link
    Then Landing page > "Community" menu is shown
    And Landing page > Community menu > Click on the "blog" link
    Then Landing page > Blog page is opened

  Scenario: Check "Forum" link in the "Community" menu as Unauthorised user
    Given open landing page
    Then Landing page > Agree button is shown
    And Landing page > Click on the Agree button
    Then Landing page > Agree button is not shown
    Then Landing page > Header > The "Community" link is shown
    And Landing page > Mouse move to the "Community" link
    Then Landing page > "Community" menu is shown
    And Landing page > Community menu > Click on the "forum" link
    Then Login page is opened

  Scenario: Check "Events" link in the "Community" menu as Unauthorised user
    Given open landing page
    Then Landing page > Agree button is shown
    And Landing page > Click on the Agree button
    Then Landing page > Agree button is not shown
    Then Landing page > Header > The "Community" link is shown
    And Landing page > Mouse move to the "Community" link
    Then Landing page > "Community" menu is shown
    And Landing page > Community menu > Click on the "events" link
    Then Landing page > Community menu > Events page is opened

  Scenario: Check transition "Book a demo" link as Unauthorised user
    Given open landing page
    Then Landing page > Agree button is shown
    And Landing page > Click on the Agree button
    Then Landing page > Agree button is not shown
    Then Landing page > Header > The "Book a demo" link is shown
    And Landing page > Click on the "Book a demo" link
    Then Landing page > Book a demo page is opened

  Scenario: Check transition "Work with us" link as Unauthorised user
    Given open landing page
    Then Landing page > Agree button is shown
    And Landing page > Click on the Agree button
    Then Landing page > Agree button is not shown
    Then Landing page > Header > The "Work with us" link is shown
    And Landing page > Click on the "Work with us" link
    Then Landing page > Work with us page is opened

  Scenario: Check transition "Login" link as Unauthorised user
    Given open landing page
    Then Landing page > Agree button is shown
    And Landing page > Click on the Agree button
    Then Landing page > Agree button is not shown
    Then Landing page > Header > The "Login" link is shown
    And Landing page > Click on the "Login" link
    Then Login page is opened
    Then Login page > "Log In" tab is selected

  Scenario: Check the visibility of Partners links as Unauthorised user
    Given open landing page
    Then Landing page > Agree button is shown
    And Landing page > Click on the Agree button
    Then Landing page > Agree button is not shown
    Then Landing page > Partner "Logo and strap" link is shown
    Then Landing page > Partner "South West Essex Community logo" link is shown
    Then Landing page > Partner "mpaLogo image" link is shown
    Then Landing page > Partner "edtechdigest logo" link is shown
    Then Landing page > Partner "cjkassociates logo" link is shown
    Then Landing page > Partner "capacityhr logo" link is shown
    Then Landing page > Partner "evolve image" link is shown
    Then Landing page > Partner "success for all image" link is shown
    Then Landing page > Partner "Educate" link is shown
    Then Landing page > Partner "besa" link is shown
    Then Landing page > Partner "RDLC 4 schools" link is shown
    Then Landing page > Partner "AWS EdStart Member" link is shown

  Scenario: Check transition partner "Logo and strap" link as Unauthorised user
    Given open landing page
    Then Landing page > Agree button is shown
    And Landing page > Click on the Agree button
    Then Landing page > Agree button is not shown
    And Landing page > Click on the partner "Logo and strap" link
    And Switch to second tab
    Then Success for All – Evidence-based school improvement strategy website is opened

  Scenario: Check transition partner "South West Essex Community logo" link as Unauthorised user
    Given open landing page
    Then Landing page > Agree button is shown
    And Landing page > Click on the Agree button
    Then Landing page > Agree button is not shown
    And Landing page > Click on the partner "South West Essex Community logo" link
    And Switch to second tab
    Then Home - South West Essex Community Education Trust website is opened

  Scenario: Check transition partner "mpaLogo image" link as Unauthorised user
    Given open landing page
    Then Landing page > Agree button is shown
    And Landing page > Click on the Agree button
    Then Landing page > Agree button is not shown
    And Landing page > Click on the partner "mpaLogo image" link
    And Switch to second tab
    Then Marshalls Park Academy website is opened

  Scenario: Check transition partner "edtechdigest logo" link as Unauthorised user
    Given open landing page
    Then Landing page > Agree button is shown
    And Landing page > Click on the Agree button
    Then Landing page > Agree button is not shown
    And Landing page > Click on the partner "edtechdigest logo" link
    And Switch to second tab
    Then EdTech Digest | Who's who and what's next in edtech website is opened

  Scenario: Check transition partner "cjkassociates logo" link as Unauthorised user
    Given open landing page
    Then Landing page > Agree button is shown
    And Landing page > Click on the Agree button
    Then Landing page > Agree button is not shown
    And Landing page > Click on the partner "cjkassociates logo" link
    And Switch to second tab
    Then Education Consulting | United Kingdom | CJK Associates Ltd website is opened

  Scenario: Check transition partner "capacityhr logo" link as Unauthorised user
    Given open landing page
    Then Landing page > Agree button is shown
    And Landing page > Click on the Agree button
    Then Landing page > Agree button is not shown
    And Landing page > Click on the partner "capacityhr logo" link
    And Switch to second tab
    Then HR Services for schools website is opened

  Scenario: Check transition partner "evolve image" link as Unauthorised user
    Given open landing page
    Then Landing page > Agree button is shown
    And Landing page > Click on the Agree button
    Then Landing page > Agree button is not shown
    And Landing page > Click on the partner "evolve image" link
    And Switch to second tab
    Then EvolveTrust website is opened

  Scenario: Check transition partner "success for all image" link as Unauthorised user
    Given open landing page
    Then Landing page > Agree button is shown
    And Landing page > Click on the Agree button
    Then Landing page > Agree button is not shown
    And Landing page > Click on the partner "success for all image" link
    And Switch to second tab
    Then Academies Enterprise trust website is opened

  Scenario: Check transition partner "Educate" link as Unauthorised user
    Given open landing page
    Then Landing page > Agree button is shown
    And Landing page > Click on the Agree button
    Then Landing page > Agree button is not shown
    And Landing page > Click on the partner "Educate" link
    And Switch to second tab
    Then educate.london - educate Resources and Information. website is opened

  Scenario: Check partner "besa" link as Unauthorised user
    Given open landing page
    Then Landing page > Agree button is shown
    And Landing page > Click on the Agree button
    Then Landing page > Agree button is not shown
    And Landing page > Click on the partner "besa" link
    And Switch to second tab
    Then BESA website is opened

  Scenario: Check transition partner "RDLC 4 schools" link as Unauthorised user
    Given open landing page
    Then Landing page > Agree button is shown
    And Landing page > Click on the Agree button
    Then Landing page > Agree button is not shown
    And Landing page > Click on the partner "RDLC 4 schools" link
    And Switch to second tab
    Then RDLC website is opened

  Scenario: Check transition partner "AWS EdStart Member" link as Unauthorised user
    Given open landing page
    Then Landing page > Agree button is shown
    And Landing page > Click on the Agree button
    Then Landing page > Agree button is not shown
    And Landing page > Click on the partner "AWS EdStart Member" link
    And Switch to second tab
    Then AWS EdStart | EdTech Startup Accelerator website is opened

  Scenario: Check transition Play market link as Unauthorised user
    Given open landing page
    Then Landing page > Agree button is shown
    And Landing page > Click on the Agree button
    Then Landing page > Agree button is not shown
    And Landing page > Click on the Play market link
    And Switch to second tab
    Then Play market website is opened
    Then Play market website > RealiseMe app on the page

  Scenario: Check transition App store link as Unauthorised user
    Given open landing page
    Then Landing page > Agree button is shown
    And Landing page > Click on the Agree button
    Then Landing page > Agree button is not shown
    And Landing page > Click on the App store link
    And Switch to second tab
    Then App store website is opened
    Then App store website > RealiseMe app on the page

  Scenario: Check "Blog" link in the Footer as Unauthorised user
    Given open landing page
    Then Landing page > Agree button is shown
    And Landing page > Click on the Agree button
    Then Landing page > Agree button is not shown
    And Landing page > Footer > Click on the "Blog" link
    Then Landing page > Blog page is opened

  Scenario: Check "Forum" link in the Footer as Unauthorised user
    Given open landing page
    Then Landing page > Agree button is shown
    And Landing page > Click on the Agree button
    Then Landing page > Agree button is not shown
    And Landing page > Footer > Click on the "Forum" link
    Then Login page is opened

  Scenario: Check "FAQs" link in the Footer as Unauthorised user
    Given open landing page
    Then Landing page > Agree button is shown
    And Landing page > Click on the Agree button
    Then Landing page > Agree button is not shown
    And Landing page > Footer > Click on the "FAQs" link
    Then FAQs page is opened

  Scenario: Check "Terms & Conditions" link in the Footer as Unauthorised user
    Given open landing page
    Then Landing page > Agree button is shown
    And Landing page > Click on the Agree button
    Then Landing page > Agree button is not shown
    And Landing page > Footer > Click on the "Terms & Conditions" link
    Then Terms & Conditions page is opened

  Scenario: Check "Privacy Policy" link in the Footer as Unauthorised user
    Given open landing page
    Then Landing page > Agree button is shown
    And Landing page > Click on the Agree button
    Then Landing page > Agree button is not shown
    And Landing page > Footer > Click on the "Privacy Policy" link
    Then Privacy Policy page is opened

  Scenario: Check transition "Schools & MATs" link
    Given open landing page
    Then Landing page > Agree button is shown
    And Landing page > Click on the Agree button
    Then Landing page > Agree button is not shown
    And Landing page > Second part > Click on the "Schools & MATs" link
    Then Login page is opened
    Then Login page > "Sign Up" tab is selected
    Then Login page > The "School" role is selected

  Scenario: Check transition "Teachers & TAs" link
    Given open landing page
    Then Landing page > Agree button is shown
    And Landing page > Click on the Agree button
    Then Landing page > Agree button is not shown
    And Landing page > Second part > Click on the "Teachers & TAs" link
    Then Login page is opened
    Then Login page > "Sign Up" tab is selected
    Then Login page > The "Teacher" role is selected

  Scenario: Check transition "Agencies" link
    Given open landing page
    Then Landing page > Agree button is shown
    And Landing page > Click on the Agree button
    Then Landing page > Agree button is not shown
    And Landing page > Second part > Click on the "Agencies" link
    Then Login page is opened
    Then Login page > "Sign Up" tab is selected
    Then Login page > The "Agency" role is selected

  Scenario: Check transition "Careers Board" link
    Given open landing page
    Then Landing page > Agree button is shown
    And Landing page > Click on the Agree button
    Then Landing page > Agree button is not shown
    And Landing page > Second part > Click on the "Careers Board" link
    Then Jobs page is opened