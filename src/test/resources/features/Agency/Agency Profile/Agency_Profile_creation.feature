Feature:  Agency profile Creation

  Scenario: Create Agency profile
    Given open landing page
    When click on the agree button at the banner
    When Click on the Sign up button
    When Click on the "sign up as an agency" button
    When Enter login of new "newuatagency"
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
    Then Agency account page contains necessary elements
      | Agency details                               |
      | Enter your agency name                       |
      | Tell us more about your agency               |
      | Contact name                                 |
      | Enter name                                   |
      | Email                                        |
      | Address                                      |
      | Enter your agency address                    |
      | Website                                      |
      | Enter you agency website                     |
      | Age group(s)                                 |
      | Select age group(s) covered                  |
      | Landline                                     |
      | Enter your landline                          |
      | Mobile                                       |
      | Enter contact mobile number                  |
      | Areas covered                                |
      | Enter areas covered                          |
      | SLA                                          |
      | Please confirm Service Level Agreement (SLA) |
      | T&Cs                                         |
      | Please confirm our T&Cs                      |
    When wait time
#    Then Delete "Agency" account


  Scenario: Fill agency's "Account" profile section
    Given open landing page
    When click on the agree button at the banner
    When Click on the login button
#    When Click on the school "Login as a school" button
    When Enter login of new created user
    When Enter password "Test123!"
    When Click on the Log in button
    When CLick on the "edit" button at the "Agency details" section
    When Enter "N1C 4BT" postcode to the "enter postcode" field
    When Click on the "find address" button
    When Choose random address from the dropdown in the "5" range
    When Enter the short description "Auto Agency" to the "Enter agency name" field
    When Enter the "1234567890" to the "Enter the company number" field
    When Enter the "Short description" to the "enter introduction about your agency..." field
    When Enter the "Auto Agency contact name" to the "Start typing your contact name" field
    When Enter the "www.google.com" to the "Website" field
    When Enter the "1234567890" to the "Landline" field
    When Choose "primary" checkbox
    When Choose "Policies" checkbox
    When Choose "SLA" checkbox
    When Click on the "save" button
    Then The all entered data to the Account "" section are saved
      | Auto Agency                    |
      | 1234567890                     |
      | Short description              |
      | Auto Agency contact name       |
      | Community Centre               |
      | Mazenod Avenue                 |
      | London                         |
      | NW64LS                         |
      | www.google.com                 |
      | primary                        |
      | 1234567890                     |
      | you have agreed to our PSL     |
      | you have confirmed to our T&Cs |



