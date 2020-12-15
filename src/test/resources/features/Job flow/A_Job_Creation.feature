Feature:  Job Creation

  Background:
    Given open landing page
    When click on the agree button at the banner


#  Scenario: "Post a new job" page contains necessary elements
#    Then  Post a Job page contains all necessary elements:
#      | Post a Job Vacancy                                                                                                                                                          |
#      | Choose from draft                                                                                                                                                   |
#      | Job Details                                                                                                                                                         |
#      | Job title*                                                                                                                                            |
##    |EXAMPLE: Maths teacher in Essex|
#      | Job description*                                                                                                                                      |
#      | Upload application form and other relevant documents                                                                                                                                             |
#      | You may attach up to 5 files under 100 Mb.                                                                                                                          |
#      | Salary*                                                                                                                                                             |
#      | Contract term*                                                                                                                                                      |
#      | Flexi/ Job share                                                                                                                                                    |
#      | Permanent                                                                                                                                                           |
#      | Contract type*                                                                                                                                                      |
#      | Part-time                                                                                                                                                           |
#      | Full-time                                                                                                                                                           |
#      | Closing date*                                                                                                                                                       |
##    |DD/MM/YYYY                                 |
#      | Enter skills needed                                                                                                                                                 |
#      | Additional Details                                                                                                                                                  |
#      | Video prescreening questions                                                                                                                                        |
#      | Please tick if you want to request video prescreening questions to be answered for enhanced applications.                                                                         |
#      | Video interview                                                                                                                                                     |
#      | Please tick if you want to request first stage interview with the candidates.                                                                                       |
#      | Please contact us to arrange the interview.                                                                                                                         |
#      | Anonymisation                                                                                                                                                       |
#      | You have anonymisation turned OFF, if you wish to remove any bias in screening procress, please click to turn ON. You can always change it in your account setting. |
#      | Boost your job's visibility by enhancing your advert                                                                                                                |
#      | SASAD- Social Augmentation with Sentiment Assimilation and Direct Targeting  |
#      | SAAID - Social Augmentation with AI Direct Targeting  |
#      | SA- Social Augmentation|
##    |Invite a coworker to help you hire                                                                                                                                  |
##    |You can easily add any coworkers as an admin in your account setting.                                                                                               |
#      | POST JOB                                                                                                                                                            |
#      | SAVE DRAFT                                                                                                                                                          |
#
#
#  Scenario: Validation of required fields after clicking on the Post button
#    When Click on the Post Job button
#    Then Warning messages are appeared:
#      | The job name field is required.        |
#      | The job description field is required. |
#      | The job salary field is required.      |
#      | The contract term field is required.   |
#      | The contract types field is required.  |
#      | The closing date field is required.    |

  Scenario: Logic Melon Job creation
    When Create Logic Melon job through API
#    uat
    |"school_id":"ef1e8d35-5619-4a40-a76e-cd6b4eab07d6"|
    #dev
#    |"school_id":"2b0a40e1-78db-4c0f-a9ba-eedd505c586c"|
    |"closing_date":"2020/09/22"|
    When Click on the "Jobs" button in the header
    Then Appropriate job is displayed in the TRENDING JOBS banner
    When Click on the appropriate job title at the banner
    Then The job name is right displayed
    Then the job description is right displayed
    Then Current posted date is displayed
#    Then Chosen closed date is displayed
#    Then Contract type is right displayed
#      |Part-time|
#    Then Contract term "Interim" is right displayd
    Then Salary is right displayed



  Scenario: Job creation
    When Click on the login button
#    When Click on the school "Login as a school" button
    When Enter login "newuatschool28@yopmail.com"
#    When Enter email of new school user
    When Enter password "AutoTest123!"
    When Click on the Log in button
    When Click on the "Jobs" button in the header
    When Click on the "POST A NEW JOB" button
    When Fill all necessary fields
    |Job|
    |Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede mollis pretium. Integer tincidunt. Cras dapibus. Vivamus elementum semper nisi. Aenean vulputate eleifend tellus. Aenean leo ligula, porttitor eu, consequat vitae, eleifend ac, enim. Aliquam lorem ante, dapibus in, viverra quis, feugiat a, tellus. Phasellus viverra nulla ut metus varius laoreet. Quisque rutrum. Aenean imperdiet. Etiam ultricies nisi vel augue. Curabitur ullamcorper ultricies nisi. Nam eget dui. Etiam rhoncus. Maecenas tempus, tellus eget condimentum rhoncus, sem quam semper libero, sit amet adipiscing sem neque sed ipsum. Nam quam nunc, blandit vel, luctus pulvinar, hendrerit id, lorem. Maecenas nec odio et ante tincidunt tempus. Donec vitae sapien ut libero venenatis faucibus. Nullam quis ante. Etiam sit amet orci eget eros faucibus tincidunt. Duis leo. Sed fringilla mauris sit amet nibh. Donec sodales sagittis magna. Sed consequat, leo eget bibendum sodales, augue velit cursus nunc, quis gravida magna mi a libero. Fusce vulputate eleifend sapien. Vestibulum purus quam, scelerisque ut, mollis sed, nonummy id, metus. Nullam accumsan lorem in dui. Cras ultricies mi eu turpis hendrerit fringilla. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; In ac dui quis mi consectetuer lacinia. Nam pretium turpis et arcu. Duis arcu tortor, suscipit eget, imperdiet nec, imperdiet iaculis, ipsum. Sed aliquam ultrices mauris. Integer ante arcu, accumsan a, consectetuer eget, posuere ut, mauris. Praesent adipiscing. Phasellus ullamcorper ipsum rutrum nunc. Nunc nonummy metus. Vestibulum volutpat pretium libero. Cras id dui. Aenean ut eros et nisl sagittis vestibulum. Nullam nulla eros, ultricies sit amet, nonummy id, imperdiet feugiat, pede. Sed lectus. Donec mollis hendrerit risus. Phasellus nec sem in justo pellentesque facilisis. Etiam imperdiet imperdiet orci. Nunc nec neque. Phasellus leo dolor, tempus non, auctor et, hendrerit quis, nisi. Curabitur ligula sapien, tincidunt non, euismod vitae, posuere imperdiet, leo. Maecenas malesuada. Praesent congue erat at massa..|
#    |qwerr|
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
#    |maths|
    When Click on the Post Job button
    Then The job name is right displayed
    Then the job description is right displayed
    Then Current posted date is displayed
    Then Chosen skills are displayed
#    Then Chosen closed date is displayed
    Then Contract type is right displayed
    |Full-time|
    Then Contract term "Interim" is right displayd
    Then Salary is right displayed
    Then The "requested" text is displayed at the Video prescreening field
    When Click on the "submit" button
    Then Appropriate job is displayed in "live" jobs tab
