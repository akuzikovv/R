Feature: Agencies additional admins flow

  Scenario: Create additional admin
    Given open landing page
    When click on the agree button at the banner
    When Click on the login button
    When Enter login "newagencyuat18@yopmail.com"
    When Enter password "AutoTest123!"
    When Click on the Log in button
    When Click on the arrow down button
    When Click on the "Account" button
    When Click on the "Admin Details" tab
    When Click on the "+ add" button
    When CLick on the "edit" button at the "Additional admin 3" section
    When Enter the "Additional" to the "First name" field
    When Enter the "Admin3" to the "Last name" field
    When Enter login of new "newagencyuat18admin"
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


  Scenario: Delete new additional admin
    Given open landing page
    When click on the agree button at the banner
    When Click on the login button
    When Enter login "newagencyuat18@yopmail.com"
    When Enter password "AutoTest123!"
    When Click on the Log in button
    When Click on the arrow down button
    When Click on the "Account" button
    When Click on the "Admin Details" tab
    When CLick on the "Delete" button at the section with "Additional Admin3"
    Then Popup with "Are you sure you want to delete this additional admin account? They will no longer be able to access this account." text is appeared
    ||
    When Click on the "Ok" button
    Then Appropriate admin is deleted
