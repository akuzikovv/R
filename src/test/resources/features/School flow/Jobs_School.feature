Feature: School Jobs

  Background:
    Given open landing page
    When Click on the login button
    When Click on the sign in school button
    When Enter login "satintest1+school@gmail.com"
    When Enter password "Test123!"
    When Click on the Log in button

  Scenario: Header contains all necessary elements
    Then  Header contains textbuttons:
      | home      |
      | messaging |
      | bookings  |
      | jobs      |
    Then  Header contains bell icon
    Then  Header contains user photo icon
    Then  Header contains user name "Hermione Granger"
    Then  Header contains arrow down button
    When  Close window



  Scenario: Jobs page contains necessary elements
    When Click on the "jobs" button in the header
    Then  Jobs page contains all necessary elements:
      | Jobs      |
      | live      |
      | archived  |
      | draft     |
      | JOB TITLE |
      | STATUS    |
      | view applicants |
      | move to archive |
    When Click on the archived tab
    Then Archived tab is opened with all necessary elements:
      | Jobs      |
      | live      |
      | archived  |
      | draft     |
      | JOB TITLE |
      | view applicants |
      | repost |
    When Click on the draft tab
    Then Draft tab is opened with all necessary elements:
      | Jobs      |
      | live      |
      | archived  |
      | draft     |
      | JOB TITLE |
      | CREATED    |
      | edit and post |

  Scenario: Post a new job
    When Click on the "jobs" button in the header
    When Click on the "POST A NEW JOB" button
    Then  Post a Job page contains all necessary elements:
      | Post a Job      |
      | Choose from draft|
    |Job Details       |
    |Name your job posting*|
#    |EXAMPLE: Maths teacher in Essex|
    |Describe the job*              |
    |Upload application form        |
    |You may attach up to 5 files under 100 Mb. |
    |Salary*                                    |
    |Contract term*                             |
    |Flexi/ Job share                           |
    |Permanent                                  |
    |Contract type*                             |
    |Part-time                                  |
    |Full-time                                  |
    |Closing date*                              |
#    |DD/MM/YYYY                                 |
    |Enter skills needed                        |
    |Additional Details                         |
    |Video prescreening questions               |
    |I want to request video prescreening questions to be answered for enhanced application.|
    |Video interview                                                                        |
    |Please tick if you want to request first stage interview with the candidates.          |
    |Please contact us to arrange the interview.                                            |
    |Anonymisation                                                                          |
    |You have anonymisation turned OFF, if you wish to remove any bias in screening procress, please click to turn ON. You can always change it in your account setting.|
    |Boost your job's visibility by enhancing your advert                                                                                                                |
    |SASAD - Socially Augmented, Sentiment and AI Direct                                                                                                                 |
    |SAAID - Socially Augmented and AI Direct                                                                                                                            |
    |SA - Socially Augmented                                                                                                                                             |
#    |Invite a coworker to help you hire                                                                                                                                  |
#    |You can easily add any coworkers as an admin in your account setting.                                                                                               |
    |POST JOB                                                                                                                                                           |
    |SAVE DRAFT                                                                                                                                                         |

