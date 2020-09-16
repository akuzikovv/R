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
      | Tell us more about your school…                                                             |
      | Anonymisation                                                                               |
      | Address                                                                                     |
      | Please enter your school address                                                            |
      | Website                                                                                     |
      | Enter a link to your school website                                                         |
      | Age group(s)                                                                                |
      | What age groups does your school teach?                                                     |
      | School type                                                                                 |
      | What type of school are you?                                                                |
      | Landline                                                                                    |
      | Please enter your landline                                                                  |
      | Out of hours mobile                                                                         |
      | Please enter your out of hours mobile number                                                |
      | Gender pay gap                                                                              |
      | Policies                                                                                    |
      | Please read and confirm our T&Cs                                                            |
      | Add social account                                                                          |
      | Attach documents that may be useful to teachers, such as a school map and behaviour policy. |
    When Click on the "Admin Details" tab
    Then Admin Details page is opened
      | Main Admin Details |
      | Name               |
      | Email              |
      | Mobile             |
    Then The "+ add" button is disabled
    When Click on the "Profiling Questions" tab
    Then The "School" Profiling Questions page contains necessary elements
      | Profiling Questions                                                                        |
      | 1. Is your school driven more by?                                                          |
      | 2. How would you describe your school’s environment?                                       |
      | 3. Is your school run on a tight methodical basis or a more adaptable, flexible one?       |
      | 4. Is your school strict on discipline or more lenient and individual-based?               |
      | 5. Does your school participate in collaboration with other schools or work independently? |
#    Then Delete "School" account


  Scenario: Fill school's "Account" profile section
    Given open landing page
    When click on the agree button at the banner
    When Click on the login button
#    When Click on the school "Login as a school" button
    When Enter login of new created user
    When Enter password "Test123!"
    When Click on the Log in button
    When CLick on the "edit" button at the "Account" section
    When Enter "N1C 4BT" postcode to the "enter postcode" field
    When Click on the "Find Address" button
    When Choose random address from the dropdown in the "5" range
    When Enter the school name to the field "Auto school"
    When Enter the short description "Short description" to the "Tell us about your school…" field
    When Enter the "www.google.com" to the "Website" field
    When Enter the "1234567890" to the "Landline" field
    When Choose "primary" checkbox
    When Choose "academy" checkbox
    When Choose "Policies" checkbox
    When Click on the "save" button
    Then The all entered data to the Account "" section are saved
      | Auto school                 |
      | Short description           |
      | Apartment                   |
      | 2 Wollstonecraft Street     |
      | London                      |
      | N1C4BT                      |
      | www.google.com              |
      | primary                     |
      | Academy                     |
      | 1234567890                  |
      | you have agreed to our T&Cs |

  Scenario: Fill school's "Additional Document(s)" profile section
    Given open landing page
    When click on the agree button at the banner
    When Click on the login button
#    When Click on the school "Login as a school" button
    When Enter login of new created user
    When Enter password "Test123!"
    When Click on the Log in button
    Then The "Attach documents that may be useful to teachers, such as a school map and behaviour policy." text is displayed at the "Additional Document(s)" section
    When CLick on the "edit" button at the "Additional Document(s)" section
    When Upload "Candidate_Summary.pdf" file
    When Click on the "save" button
    Then Uploaded "Candidate_Summary.pdf" file is saved

  Scenario: Fill school's "Admin Details"  profile tab
    Given open landing page
    When click on the agree button at the banner
    When Click on the login button
#    When Click on the school "Login as a school" button
    When Enter login of new created user
    When Enter password "Test123!"
    When Click on the Log in button
    When Click on the "Admin Details" tab
    Then Admin Details page is opened
      | Main Admin Details |
      | Name               |
      | Email              |
      | Mobile             |
    When CLick on the "edit" button at the "Main Admin Details" section
    When Enter the "Main" to the "First name" field
    When Enter the "Admin" to the "Last name" field
    When Click on the "save" button
    Then Admin Details page is saved
      | Main Admin |

  Scenario: Fill school's "Profiling Questions"  profile tab
    Given open landing page
    When click on the agree button at the banner
    When Click on the login button
#    When Click on the school "Login as a school" button
    When Enter login of new created user
    When Enter password "Test123!"
    When Click on the Log in button
    When Click on the arrow down button
    When Click on the "Account" button
    When Click on the "Profiling Questions" tab
    When CLick on the "edit" button at the "Profiling Questions" section
    When Click on the "1" profiling question
    Then Dropdown contains the next items:
      | Academic rigour             |
      | Mostly academic rigour      |
      | Even mixture                |
      | Mostly personal development |
      | Personal development        |
    When Choose the "1" item in the dropdown
    When Click on the "2" profiling question
    Then Dropdown contains the next items:
      | Academically focussed        |
      | Mostly academically focussed |
      | Even mixture                 |
      | Mostly creative              |
      | Creative                     |
    When Choose the "2" item in the dropdown
    When Click on the "3" profiling question
    Then Dropdown contains the next items:
      | Methodical        |
      | Mostly methodical |
      | Even mixture      |
      | Mostly Flexible   |
      | Flexible          |
    When Choose the "3" item in the dropdown
    When Click on the "4" profiling question
    Then Dropdown contains the next items:
      | Strict           |
      | Somewhat strict  |
      | Even mixture     |
      | Somewhat lenient |
      | Lenient          |
    When Choose the "4" item in the dropdown
    When Click on the "5" profiling question
    Then Dropdown contains the next items:
      | Independent          |
      | Mostly independent   |
      | Even mixture         |
      | Mostly collaborative |
      | Very collaborative   |
    When Choose the "5" item in the dropdown
    When Click on the "save" button
    When wait time
    When wait time
