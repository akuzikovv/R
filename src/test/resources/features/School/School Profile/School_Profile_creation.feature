Feature:  School profile Creation

  Scenario: Create school profile
    Given open landing page
    When click on the agree button at the banner
    When Click on the Sign up button
    When Click on the "sign up your school" button
    When Enter login of new "newuatschool"
    When Enter password "Test123!"
    When Click on the SIGN UP button
    When Check if entered user already exists and regenerate new email
    Then The "Thanks for signing up. Please check your email in order to verify your account. Please also check your spam." message after Sign Up is displayed
    When refresh the page
    When Click on the "Log In" tab
    When Enter login of new created user
    When Enter password "Test123!"
    When Click on the Log in button
    When The "Sorry, you need to verify your email before you can login. Check your email for a verification link." message before email VERIFICATION is displayed
    When Open "https://www.guerrillamail.com/" in  the new tab
    When Enter email of new user
    When Click on the "Confirm my account" button
    When Back to the first tab
    When Click on the Log in button
    Then School account page contains necessary elements
    |Tell us more about your school…|
    |Anonymisation|
    |Address      |
    |Please enter your school address|
    |Website                         |
    |Enter a link to your school website|
    |Age group(s)                       |
    |What age groups does your school teach?|
    |School type                            |
    |What type of school are you?           |
    |Landline                               |
    |Please enter your landline             |
    |Out of hours mobile                    |
    |Please enter your out of hours mobile number|
    |Gender pay gap                              |
    |Policies                                    |
    |Please read and confirm our T&Cs            |
    |Add social account                          |
    |Attach documents that may be useful to teachers, such as a school map and behaviour policy.|
    When Click on the "Admin Details" tab
    Then Admin Details page is opened
    |Main Admin Details|
    |Name              |
    |Email             |
    |Mobile            |
    Then The "+ add" button is disabled
    When Click on the "Profiling Questions" tab
    Then The "School" Profiling Questions page contains necessary elements
    |Profiling Questions|
    |1. Is your school driven more by?|
    |2. How would you describe your school’s environment?|
    |3. Is your school run on a tight methodical basis or a more adaptable, flexible one?|
    |4. Is your school strict on discipline or more lenient and individual-based?        |
    |5. Does your school participate in collaboration with other schools or work independently?|
    Then Delete "School" account




