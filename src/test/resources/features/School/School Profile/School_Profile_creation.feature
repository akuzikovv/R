
Feature:  Teacher profile Creation

  Scenario: Create teacher profile
    Given open landing page
    When click on the agree button at the banner
    When Click on the "sign up" button
    When Click on the "sign up as a teacher" button
    When Enter login of new "newuatteacher"
    When Enter password "Test123!"
    When Click on the SIGN UP button
    Then The "Thanks for signing up. Please check your email in order to verify your account. Please also check your spam." message after Sign Up is displayed
    When refresh the page
    When Click on the "Log In" tab
    When Enter login of new created teacher
    When Enter password "Test123!"
    When Click on the Log in button
    When The "SORRY, YOU NEED TO VERIFY YOUR EMAIL BEFORE YOU CAN LOGIN. CHECK YOUR EMAIL FOR A VERIFICATION LINK." message before email VERIFICATION is displayed
    When Open "https://www.guerrillamail.com/" in  the new tab
    When Enter email of new user
    When Click on the "Confirm my account" button
    When Back to the first tab
    When Click on the Log in button
    When wait time
    Then Delete "Teacher" account




