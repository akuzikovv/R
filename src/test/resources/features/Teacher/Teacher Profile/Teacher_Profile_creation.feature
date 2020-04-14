Feature:  Teacher profile Creation

  Scenario: Create teacher profile
    Given open landing page
    When click on the agree button at the banner
    When Click on the Sign up button
    When Click on the "sign up as a teacher" button
    When Enter login of new "newuatteacher"
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
    Then Teacher account page contains necessary elements
      |Account|
      |Enter your name|
      |Tell us your job title      |
      |Tell us more about you…|
      |Contact Details|
      |Email|
      |Address |
      |Mobile|
      |Distance willing to travel|
      |Time zone|
      |Social Accounts|
      |Add social account|
      |CV & Additional Documents|
      |Attach your CV and qualifications here|
    When Click on the "Teacher Details" tab
    Then Warning popup is opened with next text "Please, fill in all required information in My Info before continuing."
    When Click on the "Close" button
    When Click on the "Profiling Questions" tab
    Then The "Teacher" Profiling Questions page contains necessary elements
      |Profiling Questions|
      |1. How would you describe what drives you?|
      |2. What do you look for in a school’s environment?|
      |3. Do you work in a structured, methodical way or are you more flexible and adaptable?|
      |4. How would you describe your behaviour management style?|
      |5. Do you enjoy working in a collaborative environment or prefer working independently?|
    When wait time
    Then Delete "Teacher" account




