Feature: School's additional admins flow
  Background:
    Given open landing page
    When click on the agree button at the banner
    When Click on the login button


  Scenario: Create additional admin
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


    Scenario: Check email with password of new user
      When Open "https://www.guerrillamail.com/" in  the new tab
      When Enter "newuatteacher176" email of appropriate teacher
      When Choose appropriate email message "Your RealiseMe Account Details"
      When Get password from mail

      When Back to the first tab

    Scenario:  Create new job as new additional admin
      When Enter login of new created user ""
