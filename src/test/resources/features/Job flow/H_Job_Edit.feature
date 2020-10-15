Feature:  Job Edit

  Background:
    Given open landing page
    When click on the agree button at the banner
    When Click on the login button
#    When Click on the school "Login as a school" button
    When Enter login "newuatschool28@yopmail.com"
#    When Enter email of new school user
    When Enter password "AutoTest123!"
    When Click on the Log in button
    When Click on the "Jobs" button in the header


  Scenario: Job edit
    When Click on the "edit" button at the appropriate job title
    When Add to the job name field "edited"
    When Choose "Interim" checkbox
    When Choose "Full-time" checkbox
    When Choose "Part-time" checkbox
    When Choose "Please tick if you want to request video prescreening questions to be answered for enhanced applications." checkbox
    When Enter the "08/12/2020" closing date
    When Choose "Social Augmentation with Sentiment Assimilation and Direct Targeting" radiobutton
    When Click on the Post Job button
    Then Job title is right displayed
