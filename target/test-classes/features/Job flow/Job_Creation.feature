Feature:  Job Creation

  Background:
    Given open landing page
    When click on the agree button at the banner
    When Click on the login button
    When Click on the school "Login as a school" button
    When Enter login "newuatschool28@yopmail.com"
    When Enter password "Test123!"
    When Click on the Log in button

  Scenario: "Post a new job" page contains necessary elements
    When Click on the "jobs" button in the header
    When Click on the "POST A NEW JOB" button
    Then  Post a Job page contains all necessary elements:
      | Post a Job                                                                                                                                                          |
      | Choose from draft                                                                                                                                                   |
      | Job Details                                                                                                                                                         |
      | Name your job posting*                                                                                                                                              |
#    |EXAMPLE: Maths teacher in Essex|
      | Describe the job*                                                                                                                                                   |
      | Upload application form                                                                                                                                             |
      | You may attach up to 5 files under 100 Mb.                                                                                                                          |
      | Salary*                                                                                                                                                             |
      | Contract term*                                                                                                                                                      |
      | Flexi/ Job share                                                                                                                                                    |
      | Permanent                                                                                                                                                           |
      | Contract type*                                                                                                                                                      |
      | Part-time                                                                                                                                                           |
      | Full-time                                                                                                                                                           |
      | Closing date*                                                                                                                                                       |
#    |DD/MM/YYYY                                 |
      | Enter skills needed                                                                                                                                                 |
      | Additional Details                                                                                                                                                  |
      | Video prescreening questions                                                                                                                                        |
      | I want to request video prescreening questions to be answered for enhanced application.                                                                             |
      | Video interview                                                                                                                                                     |
      | Please tick if you want to request first stage interview with the candidates.                                                                                       |
      | Please contact us to arrange the interview.                                                                                                                         |
      | Anonymisation                                                                                                                                                       |
      | You have anonymisation turned OFF, if you wish to remove any bias in screening procress, please click to turn ON. You can always change it in your account setting. |
      | Boost your job's visibility by enhancing your advert                                                                                                                |
      | SASAD - Socially Augmented, Sentiment and AI Direct                                                                                                                 |
      | SAAID - Socially Augmented and AI Direct                                                                                                                            |
      | SA - Socially Augmented                                                                                                                                             |
#    |Invite a coworker to help you hire                                                                                                                                  |
#    |You can easily add any coworkers as an admin in your account setting.                                                                                               |
      | POST JOB                                                                                                                                                            |
      | SAVE DRAFT                                                                                                                                                          |


  Scenario: Validation of required fields after clicking on the Post button
    When Click on the "jobs" button in the header
    When Click on the "POST A NEW JOB" button
    When Click on the Post Job button
    Then Warning messages are appeared:
      | The jobname field is required.        |
      | The jobdescription field is required. |
      | The jobsalary field is required.      |
      | The contractTerm field is required.   |
      | The contractTypes field is required.  |
      | The closingDate field is required.    |