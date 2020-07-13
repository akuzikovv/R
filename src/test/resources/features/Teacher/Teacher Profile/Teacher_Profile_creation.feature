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
      | Account                                |
      | Enter your name                        |
      | Tell us your job title                 |
      | Tell us more about you…                |
      | Contact Details                        |
      | Email                                  |
      | Address                                |
      | Mobile                                 |
      | Distance willing to travel             |
      | Time zone                              |
      | Social Accounts                        |
      | Add social account                     |
      | CV & Additional Documents              |
      | Attach your CV and qualifications here |
    When Click on the "Teacher Details" tab
    Then Warning popup is opened with next text "Please, fill in all required information in My Info before continuing."
    When Click on the "Close" button
    When Click on the "Profiling Questions" tab
    Then The "Teacher" Profiling Questions page contains necessary elements
      | Profiling Questions                                                                     |
      | 1. How would you describe what drives you?                                              |
      | 2. What do you look for in a school’s environment?                                      |
      | 3. Do you work in a structured, methodical way or are you more flexible and adaptable?  |
      | 4. How would you describe your behaviour management style?                              |
      | 5. Do you enjoy working in a collaborative environment or prefer working independently? |
    When wait time
#    Then Delete "Teacher" account


  Scenario: Fill teacher's "Account" profile section
    Given open landing page
    When click on the agree button at the banner
    When Click on the login button
    When Enter login of new created user
#    When Enter login "newuatteacher167@sharklasers.com"
    When Enter password "Test123!"
    When Click on the Log in button
    When CLick on the "edit" button at the "Account" section
    When Enter the "Auto" to the "First name*" field
    When Enter the "Teacher" to the "Last name*" field
    When Click on the "Gender" dropdown
    Then Dropdown contains the next items:
      | Other             |
      | Male              |
      | Prefer not to say |
      | Female            |
    When Choose the "Male" item in the dropdown
    When Click on the "Ethnicity" dropdown
    Then Dropdown contains the next items:
      | English                                |
      | Welsh                                  |
      | Scottish                               |
      | Northern Irish                         |
      | Irish                                  |
      | Gypsy or Irish Traveller               |
      | Any other White background             |
      | White and Black Caribbean              |
      | White and Black African                |
      | Any other Mixed or Multiple background |
      | Indian                                 |
      | Pakistani                              |
      | Bangladeshi                            |
      | Chinese                                |
      | Any other Asian background             |
      | African                                |
      | African American                       |
      | Caribbean                              |
      | Any other Black background             |
      | Arab                                   |
      | Hispanic                               |
      | Latino                                 |
      | Native American                        |
      | Pacific Islander                       |
      | Any other ethnic group                 |
    When Choose the "Any other White background" item in the dropdown
    When Click on the "enter your date of birth" input field
    When Enter the "Job title" to the "Job title" field
    When Enter the "Short introduction" to the "Write a short introduction about your yourself" field
    When Click on the "save" button
    Then The all entered data to the Account section are saved
      | Auto Teacher       |
      | Job title          |
      | Short introduction |

  Scenario: Check required fields at the teacher's "Contact Details" profile section
    Given open landing page
    When click on the agree button at the banner
    When Click on the login button
    When Enter login of new created user
    When Enter password "Test123!"
    When Click on the Log in button
    When CLick on the "edit" button at the "Contact Details" section
    When Click on the "save" button
    Then Warning messages are appeared:
      | enter postcode       |
      | Phone |




  Scenario: Fill teacher's "Profiling Questions"  profile tab
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
      | Facts             |
      | Mostly facts      |
      | Even mixture      |
      | Mostly creativity |
      | Creativity        |
    When Choose the "1" item in the dropdown
    When Click on the "2" profiling question
    Then Dropdown contains the next items:
      | Academically focussed        |
      | Mostly academically focussed |
      | Even mixture                 |
      | Mostly creativity            |
      | Creativity                   |
    When Choose the "2" item in the dropdown
    When Click on the "3" profiling question
    Then Dropdown contains the next items:
      | Methodical        |
      | Mostly methodical |
      | Even mixture      |
      | Mostly flexible   |
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






