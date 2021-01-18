Feature: School's additional admins flow

  Scenario: Create additional admin
    Given open landing page
    When click on the agree button at the banner
    When Click on the login button
    When Enter login "newuatschool28@yopmail.com"
    When Enter password "AutoTest123!"
    When Click on the Log in button
    When Click on the arrow down button
    When Click on the "Account" button
    When Click on the "Admin Details" tab
    When Click on the "+ add" button
    When CLick on the "edit" button at the "Additional admin 5" section
    When Enter the "Additional" to the "First name" field
    When Enter the "Admin13" to the "Last name" field
    When Enter login of new "newuatschool28admin"
    When Click on the "save" button
    Then Admin Details page is saved
      | Additional Admin13 |


    Scenario: Check email with password of new user and login
      Given Open "https://www.guerrillamail.com/" in  the new tab
      When Enter email of new admin
      When Choose appropriate email message "Your RealiseMe Account Details"
      When Get password from mail
      When Back to the first tab
      When open landing page
      When click on the agree button at the banner
      When Click on the login button
      When Enter login of new created user "admin"
      When Enter password of new created admin
      When Click on the Log in button
      Then  Header contains textbuttons:
        | dashboard      |
        | jobs  |
        | bookings      |
        | community |

    Scenario:  Create new job as new additional admin
      Given open landing page
      When click on the agree button at the banner
      When Click on the login button
      When Enter login of new created user "admin"
      When Enter password of new created admin
      When Click on the Log in button
      When Click on the "Jobs" button in the header
      When Click on the "POST A NEW JOB" button
      When Fill all necessary fields
        |Job|
        |Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede mollis pretium. Integer tincidunt. Cras dapibus. Vivamus elementum semper nisi. Aenean vulputate eleifend tellus. Aenean leo ligula, porttitor eu, consequat vitae, eleifend ac, enim. Aliquam lorem ante, dapibus in, viverra quis, feugiat a, tellus. Phasellus viverra nulla ut metus varius laoreet. Quisque rutrum. Aenean imperdiet. Etiam ultricies nisi vel augue. Curabitur ullamcorper ultricies nisi. Nam eget dui. Etiam rhoncus. Maecenas tempus, tellus eget condimentum rhoncus, sem quam semper libero, sit amet adipiscing sem neque sed ipsum. Nam quam nunc, blandit vel, luctus pulvinar, hendrerit id, lorem. Maecenas nec odio et ante tincidunt tempus. Donec vitae sapien ut libero venenatis faucibus. Nullam quis ante. Etiam sit amet orci eget eros faucibus tincidunt. Duis leo. Sed fringilla mauris sit amet nibh. Donec sodales sagittis magna. Sed consequat, leo eget bibendum sodales, augue velit cursus nunc, quis gravida magna mi a libero. Fusce vulputate eleifend sapien. Vestibulum purus quam, scelerisque ut, mollis sed, nonummy id, metus. Nullam accumsan lorem in dui. Cras ultricies mi eu turpis hendrerit fringilla. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; In ac dui quis mi consectetuer lacinia. Nam pretium turpis et arcu. Duis arcu tortor, suscipit eget, imperdiet nec, imperdiet iaculis, ipsum. Sed aliquam ultrices mauris. Integer ante arcu, accumsan a, consectetuer eget, posuere ut, mauris. Praesent adipiscing. Phasellus ullamcorper ipsum rutrum nunc. Nunc nonummy metus. Vestibulum volutpat pretium libero. Cras id dui. Aenean ut eros et nisl sagittis vestibulum. Nullam nulla eros, ultricies sit amet, nonummy id, imperdiet feugiat, pede. Sed lectus. Donec mollis hendrerit risus. Phasellus nec sem in justo pellentesque facilisis. Etiam imperdiet imperdiet orci. Nunc nec neque. Phasellus leo dolor, tempus non, auctor et, hendrerit quis, nisi. Curabitur ligula sapien, tincidunt non, euismod vitae, posuere imperdiet, leo. Maecenas malesuada. Praesent congue erat at massa..|
        |Salary 1234    |
      When Choose "Supply" checkbox
      When Choose "Interim" checkbox
      When Choose "Full-time" checkbox
      When Choose "Please tick if you want to request video prescreening questions to be answered for enhanced applications." checkbox
      When Upload "Candidate_Summary.pdf" file
      When Enter the "05/12/2021" closing date
      When Choose "Social Augmentation with AI Direct Targeting" radiobutton
      When Choose skills
        |write|
      When Click on the Post Job button
      Then The job name is right displayed
      Then the job description is right displayed
      Then Current posted date is displayed
      Then Chosen skills are displayed
      Then Contract type is right displayed
        |Full-time|
      Then Contract term "Interim" is right displayd
      Then Salary is right displayed
      Then The "requested" text is displayed at the Video prescreening field
      When Click on the "submit" button
      Then Appropriate job is displayed in "live" jobs tab

  Scenario: Create booking for first three teachers in the search result list
    Given open landing page
    When click on the agree button at the banner
    When Click on the login button
    When Enter login of new created user "admin"
    When Enter password of new created admin
    When Click on the Log in button
    When Click on the "Bookings" button in the header
    When Click on the "New Supply Booking" button
    When Enter "Booking for first three teachers in the search result list" to the Name your job posting field
    When Enter "Booking Description" to the Describe the job field
    When Choose "Teacher" checkbox
    When Choose "TA" checkbox
    When Choose full day "26" in the "2" month of available calendar
    When Choose half day "28" in the "2" month of available calendar
    When Choose full day start time "8:00"
    When Choose full day end time "17:00"
    When Choose half day start time "11:00"
    When Choose half day end time "15:00"
    When Click on the "SHOW RESULTS" button
    When Choose "I want to invite top THREE candidates" checkbox
    When Click on the "Review Invitations" button
    When Check popups depending of teacher's status and click on the "SEND" button
    When Get names of teachers
    When Click on the "View all invites" button
    Then Appropriate teachers are displayed in the invites list

  Scenario: Delete new additional admin
    Given open landing page
    When click on the agree button at the banner
    When Click on the login button
    When Enter login "newuatschool28@yopmail.com"
    When Enter password "AutoTest123!"
    When Click on the Log in button
    When Click on the arrow down button
    When Click on the "Account" button
    When Click on the "Admin Details" tab
    When CLick on the "Delete" button at the section with "Additional Admin13"
    Then Popup with "Are you sure you want to delete this additional admin account? They will no longer be able to access this account." text is appeared
    ||
    When Click on the "Ok" button
    Then Appropriate admin is deleted
