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
    When Enter login of new created user "teacher"
    When Enter password "Test123!"
    When Click on the Log in button
    When The "Sorry, you need to verify your email before you can login. Check your email for a verification link." message before email VERIFICATION is displayed
    When Open "https://www.guerrillamail.com/" in  the new tab
    When Enter email of new user
    When Click on the "Confirm my account" button
    When wait time
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



  Scenario: Fill teacher's "Account" profile section
    Given open landing page
    When click on the agree button at the banner
    When Click on the login button
    When Enter login of new created user "teacher"
#    When Enter login "newuatteacher167@sharklasers.com"
    When Enter password "Test123!"
    When Click on the Log in button
    When CLick on the "edit" button at the "Account" section
    When Enter the "Auto" to the "First name*" field
    When Enter the "Teacher" to the "Last name*" field
    When Click on the "Gender" "" dropdown
    Then Dropdown contains the next items:
      | Other             |
      | Male              |
      | Prefer not to say |
      | Female            |
    When Choose the "Male" item in the dropdown
    When Click on the "Ethnicity" "" dropdown
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
    When Choose "1970" year
    When Choose "Oct" month
    When Choose "22" date
    When Enter the "Job title" to the "Job title" field
    When Enter the "Short introduction" to the "Write a short introduction about your yourself" field
    When Click on the "save" button
    Then The all entered data to the Account "" section are saved
      | Auto Teacher               |
      | Male                       |
      | 22/10/1970                 |
      | Any other White background |
      | Job title                  |
      | Short introduction         |


  Scenario: Fill teacher's "Profiling Questions"  profile tab
    Given open landing page
    When click on the agree button at the banner
    When Click on the login button
#    When Click on the school "Login as a school" button
    When Enter login of new created user "teacher"
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


  Scenario: Check required fields at the teacher's "Contact Details" profile section
    Given open landing page
    When click on the agree button at the banner
    When Click on the login button
#    When Enter login "newuatteacher246@sharklasers.com"
    When Enter login of new created user "teacher"
    When Enter password "Test123!"
    When Click on the Log in button
    When CLick on the "edit" button at the "Contact Details" section
    When Click on the "save" button
    Then Warning messages are appeared:
      | enter postcode |
      | Phone          |
      | Policies       |

  Scenario: Fill "Contact Details" profile section as admin using request API
    When Fill "Contact Details" profile section as admin using request API
    Given open landing page
    When click on the agree button at the banner
    When Click on the login button
    When Enter login of new created user "teacher"
    When Enter password "Test123!"
    When Click on the Log in button
    When Click on the arrow down button
    When Click on the "Account" button
    Then The all entered data to the Account "Contact Details" section are saved
      | address line 1 |
      | address line 2 |
      | City           |
      | Postcode       |
      | County         |
      | +44 0635094915 |

  Scenario: Check popup of invalid postcode at the "Contact Details" profile section
    Given open landing page
    When click on the agree button at the banner
    When Click on the login button
#    When Enter login "newuatteacher214@sharklasers.com"
    When Enter login of new created user "teacher"
    When Enter password "Test123!"
    When Click on the Log in button
    When Click on the arrow down button
    When Click on the "Account" button
    When CLick on the "edit" button at the "Contact Details" section
    When Choose "Policies" checkbox
    When Click on the "save" button
    Then Popup with "Sorry, your postcode can not be found. This will make it harder for schools to find you when searching for candidates. Please contact us for assistance." text is appeared
      | popup text |
    When Click on the "Ok" button
    Then The all entered data to the Account "Contact Details" section are saved
      | Postcode       |
      | address line 1 |
      | address line 2 |
      | City           |
      | County         |
      | +44 0635094915 |


  Scenario: Fill "Contact Details" profile section as user
    Given open landing page
    When click on the agree button at the banner
    When Click on the login button
    When Enter login of new created user "teacher"
#    When Enter login "newuatteacher156@sharklasers.com"
    When Enter password "Test123!"
    When Click on the Log in button
    When Click on the arrow down button
    When Click on the "Account" button
    When CLick on the "edit" button at the "Contact Details" section
    When Enter "NW3 5SQ" postcode to the "enter postcode" field
    When Click on the "find address" button
    When Choose random address from the dropdown in the "2" range
    When Click on the "save" button
    Then The all entered data to the Account "Contact Details" section are saved
#      | Holy Trinity Primary School |
      | Trinity Walk   |
      | London         |
      | NW35SQ         |
      | +44 0635094915 |


  Scenario: Fill "Teacher Details" profile section as supply user
    Given open landing page
    When click on the agree button at the banner
    When Click on the login button
#    When Enter login "uatteach18@yopmail.com"
    When Enter login of new created user "teacher"
    When Enter password "Test123!"
    When Click on the Log in button
    When Click on the arrow down button
    When Click on the "Account" button
    When Click on the "Teacher Details" tab
    Then The all necessary text at the Account "Teacher Details" section are displayed
      | Are you a teacher or TA?                |
      | Where do you currently work? (optional) |
      | Complete our prescreening questions     |
      | Please read and accept our T&Cs         |
    When CLick on the "edit" button at the "Teacher Details" section
    When Click on the "select teacher type" "" dropdown
    When Choose the "Teacher" item in the dropdown
    When Enter the "123456789" to the "GTC number" field
    When Click on the "Supply" "" dropdown
    When Choose the "Yes - I am looking for supply work" item in the dropdown
    When Choose "I confirm I have read and understand the" checkbox
    When Enter the "123456" to the "Enter your name" field
    When Click on the "save" button
    Then The all entered data to the Account "Teacher Details" section are saved
      | Teacher                                 |
      | 123456789                               |
      | I am looking for supply work            |
      | Where do you currently work? (optional) |
      | Complete our prescreening questions     |
      | confirmed                               |


  Scenario: Fill "Supply Details" profile section as supply user
    Given open landing page
    When click on the agree button at the banner
    When Click on the login button
#    When Enter login "uatteach18@yopmail.com"
    When Enter login of new created user "teacher"
    When Enter password "Test123!"
    When Click on the Log in button
    When Click on the arrow down button
    When Click on the "Account" button
    When Click on the "Supply Details" tab
    Then The all necessary text at the Account "Supply Details" section are displayed
      | I am not on the DBS Update Service                  |
      | Enter your primary subject                          |
      | Enter your secondary subjects                       |
      | Tell us your extracurricular activities             |
      | Enter your preferred daily pay rate                 |
      | Enter your preferred long-term pay rate             |
      | Enter your payment preference                       |
      | Enter your payment method                           |
      | Enter your national insurance number                |
      | Provide at least one reference                      |
      | Provide at least one reference                      |
      | Have you worked in a school in the past 3 months?   |
      | I have not completed the safeguarding questionnaire |
      | I have not completed the medical declaration        |
    When CLick on the "edit" button at the "Supply Details" section
    When Choose "Already registered for Update Service (DBS)" radiobutton
    When Enter the "123456789012" to the "Enter 12 character certificate number" field
    When Upload "Candidate_Summary.pdf" file
    When Click on the "Primary subject" input field
    When Choose the "biology" item in the dropdown
    When Click on the "Secondary subject" input field
    When Choose the "classics" item in the dropdown
    When Click on the "Extracurricular(s)" input field
    When Choose the "careers" item in the dropdown
    When Enter the "123" to the "Preferred daily rate" field
    When Enter the "123" to the "Preferred long-term rate" field
    When Enter the "123" to the "Preferred hourly rate" field
#  When Click on the "Payment preference" "" dropdown
    When Click on the "Select payment preference" "" dropdown
    When Choose the "umbrella" item in the dropdown
    When Click on the "Select payment preference" "2" dropdown
    When Choose the "Key" item in the dropdown
    When Click on the "NI" "" dropdown
    When Choose the "Other" item in the dropdown
    When Enter the "1234567890" to the "enter..." field
    When Enter the "Name" to the "Full name" field
    When Enter the "test@test.test" to the "Email" field
    When Enter the "123123123123" to the "Mobile" field
    When Choose "yes" radiobutton
    When Choose "Supply Teaching Policies" checkbox
    When Choose "Medical confirmation" checkbox
    When Click on the "save" button
    Then The all necessary text at the Account "Supply Details" section are displayed
      | completed                                           |
      | biology                                             |
      | classics                                            |
      | careers                                             |
      | £123                                                |
      | £123                                                |
      | umbrella                                            |
      | Key                                                 |
      | 1234567890                                          |
      | Name: Name                                          |
      | Email: test@test.test                               |
      | Mobile: 123123123123                                |
      | yes                                                 |
      | I have not completed the safeguarding questionnaire |
      | you have confirmed you are...                       |


  Scenario: Fill "Clearance Documents" profile section as supply user
    Given open landing page
    When click on the agree button at the banner
    When Click on the login button
#    When Enter login "teachuatnew2224@yopmail.com"
    When Enter login of new created user "teacher"
    When Enter password "Test123!"
    When Click on the Log in button
    When Click on the arrow down button
    When Click on the "Account" button
    When Click on the "Supply Details" tab
    When CLick on the "edit" button at the "Clearance Documents" section
    When Upload "Candidate_Summary.pdf" file to the "CV" field
    When Upload "Candidate_Summary1.pdf" file to the "Proof of address" field
    When Upload "Candidate_Summary2.pdf" file to the "Proof of address" field
    When Upload "Candidate_Summary3.pdf" file to the "Right to work" field
    When Click on the "save" button
    Then The all necessary text at the Account "Clearance Documents" section are displayed
      | Candidate_Summary.pdf  |
      | Candidate_Summary1.pdf |
      | Candidate_Summary2.pdf |
      | Candidate_Summary3.pdf |



#   Scenario: Delete "Teacher" account
#   Then Delete "Teacher" account
  


