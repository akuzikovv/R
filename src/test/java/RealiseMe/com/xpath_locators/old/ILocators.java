package RealiseMe.com.xpath_locators.old;

public interface ILocators {

///////////////////////////  HEADER ///////////////////////////
    String header = "//div[@class='Header']";
    String jobs = "//div[@class='btn__content' and contains(.,'Jobs')]";
    String dashboard = "//div[@class='btn__content' and contains(.,'Dashboard')]";
    String community = "//div[@class='btn__content' and contains(.,'Community')]";
    String blog = "//div[.='blog']";
    String forum = "//div[.='forum']";
    String login = "//div[@class='btn__content' and contains(.,'Login')]";
    String sign_up = "//div[@class='btn__content' and contains(.,'sign up')]";
    String messaging = "//div[.='messaging']";
    String bookings = "//div[@class='btn__content' and contains(.,'Bookings')]";
    String bell_icon = "//i[@class='icon-bell icons']";
    String user_photo_icon = "//li[@class='user-name desktop']//img[@alt='users icon']";
    String user_name = "//div[@class='btn__content']//div[@class='profile-name']";
    String arrow_down_button =  "//div[@class='btn__content']//div[@class='avatar']";
    String LOGOUT_BUTTON = "//div[@class='list__tile__title' and contains(.,'Logout')]";
    String spinner = "//div[@class='spinner-wrapper']";
    String button = "//button";
    String span = "//span";
//[@class='button']

    /////////////////// LANDING PAGE ////////////////////////////

    String XPATH_AGREE_BUTTON = "//div[@class='Cookie__button' and contains(.,'I agree')]";
    String keyword_search = "//input[@class='input keyword']";
    String search_button ="//button[.='search']";
    String search_result = "//div[@class='result-wrapper']";
    String first_result = "(//p[@class='job-details-title']//a)[1]";
    String first_result_save_button = "(//p[@class='save'])[1]";
    String first_result_saved_button = "(//p[.=' Saved'])[1]";
    String school_sign_in = "//button[contains(.,'Login as a school')]";
    String teacher_sign_in = "//button[contains(.,'Login as a teacher')]";
    String XPATH_LINKS_IN_THE_HEADER = "//div[@class=\"header transparent\"]//div[@class=\"btn__content\"][contains(text(),\"$1\")]";
    String XPATH_DROP_DOWN_MENU = "//div[@class=\"menu__activator menu__activator--active\"]//div[@class='btn__content'][contains(text(),\"$1\")]";
    String XPATH_DROP_DOWN_MENU_LINKS = "//div[@class='list__tile__title'][contains(text(),\"$1\")]";
    String XPATH_PARTNER_LINKS = "//div[@class=\"LandingPartner-items\"]//img[@alt=\"$1\"]";
    String XPATH_PLAY_MARKET_LINK = "//div[@class='app-links']//a[1]";
    String XPATH_APP_STORE_LINK = "//div[@class='app-links']//a[2]";

    String XPATH_PLAY_MARKET_PAGE = "//a[@title=\"Google Play Logo\"]";
    String XPATH_REALISE_ME_ON_PLAY_MARKET_PAGE = "//h1[@class=\"AHFaub\"]//span[contains(text(),\"RealiseMe\")]";

    String XPATH_APP_STORE_PAGE = "//nav[@data-www-domain=\"www.apple.com\"]";
    String XPATH_REALISE_ME_ON_APP_STORE_PAGE = "//h1[contains(@class,\"title app-header\")][contains(text(),\"RealiseM\u202Ae\u202C\")]";

    String XPATH_BUTTONS_IN_FOOTER = "//div[@class=\"Footer-menu\"]//a[.=\"$1\"]";

    String XPATH_FAQS_PAGE = "//h4[.=\"FAQs\"]";

    String XPATH_TERMS_AND_CONDITIONS_PAGE = "//div[@class=\"terms-and-conditions\"]";

    String XPATH_PRIVACY_AND_COOKIE_POLICY_PAGE = "//div[@class=\"privacy-policy\"]";

    String XPATH_ABOUT_US_PAGE = "//div[@class=\"AboutUsPage\"]";

    String XPATH_HOW_IT_WORKS_PAGE = "//div[@class=\"HowItWorks\"]";

    String XPATH_SOLUTIONS_PAGE = "//div[@class=\"solutions\"]";

    String XPATH_BLOG_PAGE = "//body[contains(@class,\"home page\")]";

    String XPATH_LOGIN_PAGE = "//button[@type=\"submit\"]//span[.=\"Log In\"]";

    String XPATH_EVENTS_PAGE = "//div[@class=\"events\"]";

    String XPATH_BOOK_A_DEMO = "//button[@data-qa=\"start-button\"]//span[contains(@class,\"text\")][.=\"BOOK A DEMO\"]";

    String XPATH_WORK_WITH_US_PAGE = "//h1[.=\"Careers at RealiseMe\"]";

    //////////////////  PARTNER LINKS  //////////////////////////
    String XPATH_SUCCESSFORALL_SITE = "//h2[.=\"Empowering Teachers,Inspiring Learners\"]";
    String XPATH_SOUTH_WEST_ESSEX_SITE = "//h1[.=\"We are South West Essex Community Education Trust\"]";

    //////////////////  SCHOOL Bookings PAGE ///////////////////////
    String Find_Supply_Staff = "//span[contains(.,'Find Supply Staff')]";
    String START_SEARCH  = "//a[contains(.,'START SEARCH')]";
    String SEARCH_RESULTS  = "//a[contains(.,'SEARCH RESULTS')]";
    String REVIEW_INVITATIONS = "//a[@class='booking-creation-step review-invitations']";
    String  INVITES = "//a[@class='booking-creation-step invites']";
    String I_want_to_use_my_saved_search = "//label[contains(.,'I want to use my saved search')]";
    String Job_Details = "//span[contains(.,'Job Details')]";
    String Name_your_job_posting_title = "//label[contains(.,'Name your job posting*')]";
    String Name_your_job_posting_input = "//input[@placeholder='EXAMPLE: Maths teacher in Essex']";
    String Name_your_job_posting_input_2="//input[@name='name']";
    String Describethe_job_title = "//label[contains(.,'Describe the job*')]";
    String Describethe_job_input = "//textarea[@id='job-description']";
    String characters_left = "//span[@class='char-left'][contains(.,'5000 characters left')]";
    String Teacher_type = "//h3[contains(.,'Teacher type*')]";
    String Teacher_checkbox_title = "//label[contains(.,'Teacher')]";
    String TA_checkbox_title = "//label[contains(.,'TA')]";
    String Dates_required = "//p[contains(.,'Date(s) required*')]";
    String Full_Day_Start_time = "//input[@id='full-day-start-time']";
    String Full_day_start_clear_button = "//input[@id='full-day-start-time']/../..//i[contains(.,'clear')]";
    String Full_Day_End_time = "//input[contains(@id,'full-day-end-time')]";
    String Full_day_end_clear_button = "//input[@id='full-day-end-time']/../..//i[contains(.,'clear')]";
    String Half_Day_Start_time = "//input[contains(@id,'half-day-start-time')]";
    String Half_Day_Start_clear_button = "//input[@id='half-day-start-time']/../..//i[contains(.,'clear')]";
    String Half_Day_End_time = "//input[contains(@id,'half-day-end-time')]";
    String Half_Day_end_clear_button = "//input[@id='half-day-end-time']/../..//i[contains(.,'clear')]";
    String Rate_input = "//input[@id='rate-for-day']";
    String Note1  = "//span[contains(.,'Note: click on date to switch between full and half day. If the booking is less than half day, please contact us to proceed.')]";
    String Rate_title = "//label[contains(.,'Rate*')]";
    String Note2 = "//span[contains(.,'Note: half day is two-third the rate you entered')]";
    String Any_specialist_subject_required_title = "//p[contains(.,'Any specialist subject(s) required?')]";
    String Any_age_group_required_title = "//p[contains(.,'Any age group(s) required?')]";
    String Additional_documents_title = "//p[contains(.,'Additional document(s)')]";
    String Anonymisation_title = "//p[contains(.,'Anonymisation')]";
    String Anonymisation_text = "//span[contains(.,'You have anonymisation turned OFF ON,\n" +
            "      if you wish to remove any bias in screening procress,\n" +
            "      please click to turn on. You can always change it in your account setting.')]";
    String I_want_to_save_this_search_for_future_use_title = "//label[@for='save-search'][contains(.,'I want to save this search for future use')]";
    String Invite_a_coworker_booking = "//span[contains(.,'Invite a coworker to help you hire - you can easily add any coworkers as an admin in your\n" +
            "        account setting.')]";
    String SHOW_RESULTS = "//a[contains(.,'SHOW RESULTS')]";
    String Please_fill_in_all_required_fields_to_continue = "//span[contains(.,'Please fill in all required fields to continue')]";
    String CLose_popup = "//div[contains(@class,'g--active dialog')]//div[@class='close']";
    String Uncleared_status = "//span[@class='uncleared']";
    String Pending_status = "//span[@class='pending']";
    String Uncleared_popup = "//div[@class='title-body']";
    String Disabled_OK = "//button[@class='action-btn confirm-btn btn-disabled']";
    String Uncleared_popup_text = "You have selected a teacher that has not yet completed clearance. They will not be able to accept this booking until they are fully cleared.";
    String Pending_popup_text = "You have selected a teacher whose DBS clearance is still pending. Before continuing, you will need to agree to our clearance waiver.";



    //////////////////  SCHOOL JOBS PAGE ///////////////////////


    String Jobs = "//h3[@class='booking-title']";
    String live = "//a[contains(text(),'live')]";
    String live_qty = "//a[contains(text(),'live')]//span";
    String archived_qty = "//a[contains(text(),'archived')]//span";
    String draft_qty = "//a[contains(text(),'draft')]//span";
    String archived = "//a[contains(text(),'archived')]";
    String draft = "//a[contains(text(),'draft')]";
    String JOB_TITLE = "(//p[@class='name'])[1]";
    String JOB_STATUS = "(//p[@class='status'])[1]";
    String view_applicants1 = "//a[contains(text(),'view applicants')]";
    String move_to_archive = "(//p[@class='archive'])[2]";
    String repost = "//a[@class='repost']";
    String CREATED = "(//p[@class='created'])[1]";
    String edit_and_post = "//a[contains(text(),'edit and post')]";
    String Archived_on = "(//p)[4]";
    String Posted_on = "(//p[@class='name'])[2]";
    String Last_saved_on = "//p[contains(text(),'Last saved on')]";
    String POST_A_NEW_JOB = "//a[@href='#/school/post-new-job']";

    /////////////// SCHOOL POST JOB /////////////////////

    String Post_a_Job = "//span[@class='booking-search-title']";
    String choose_from_draft = "(//label[@for='savedSearch'])[1]";
    String draftDropdown ="(//i[@class='icon material-icons input-group__append-icon input-group__icon-cb'])[1]";
    String job_details = "//span[.='Job Details']";
    String jobName = "//label[@for='position-name']";
    String example_name_text = "//input[@placeholder='EXAMPLE: Maths teacher in Essex']";
    String jobDescription = "//label[@for='job-description']";
    String upload_text = "//p[contains(.,'Upload application form')]";
    String note_upload_text = "//p[@class='add-documents-note']";
    String salary_text = "//label[@for='salary']";
    String Contract_term = "//p[.='Contract term*']";
    String Flexi_Job_share = "//label[.='Flexi/ Job share']";
    String Permanent = "//label[.='Permanent']";
    String Contract_type = "//p[.='Contract type*']";
    String Part_time = "//label[.='Part-time']";
    String Full_time = "//label[.='Full-time']";
    String Closing_date = "//p[@class='date-title']";
    String date_format = "//input[@placeholder='DD/MM/YYYY']";
    String Enter_skills_needed = "//p[@class='skills-needed-title']";
    String Additional_Details = "//span[.='Additional Details']";
    String Video_prescreening_questions = "(//p[@class='details-title'])[1]";
    String I_want_to_request = "//span[contains(.,'Please tick if you want to request video prescreening questions to be answered for enhanced applications.')]";
    String Video_interview = "(//p[@class='details-title'])[2]";
    String interview_checkbox_text = "//span[contains(.,'Please tick if you want to request first stage interview with the candidates.')]";
    String Please_contact_us = "//span[.='Please contact us to arrange the interview.']";
    String Anonymisation = "//p[@class='anonymisation-title']";
    String anonimisation_text = "(//span[@class='note'])[2]";
    String Boost_your_job_s_visibility_by_enhancing_your_advert   = "(//div[@class='title'])[3]";
    String SASAD = "//span[contains(.,' SASAD- Social Augmentation with Sentiment Assimilation and Direct Targeting')]";
    String SAAID = "//span[contains(.,'SAAID - Social Augmentation with AI Direct Targeting')]";
    String SA = "//span[contains(.,'SA- Social Augmentation')]";
    String Invite_a_coworker = "(//div[@class='title']//span[@data-v-5f6cf490])[4]";
    String add_coworkers_as_an_admin = "(//span[@data-v-5f6cf490])[11]";
    String post_job_button = "//button[@class='post-job']";
    String save_draft_button = "//button[@class='save-draft']";
    String warning_name = "//span[contains(.,'The job name field is required.')]";
    String warning_description = "//span[.='The job description field is required.']";
    String warning_salary = "//span[.='The job salary field is required.']";
    String warning_contactTerm = "//span[.='The contract term field is required.']";
    String warning_contactType = "//span[.='The contract types field is required.']";
    String warning_closingDate = "//span[.='The closing date field is required.']";












    ///////////////////////// PREVIEW PAGE //////////////////////
    String preview = "//span[@class='job-preview-title']";
    String job_title = "//p[@class='specialty']";
    String location = "//p[@class='location']";
    String location_icon = "//i[@class='icon-location-pin icons']";
    String calendar_icon = "(//i[@class='icon-calendar icons'])[1]";
    String posted = "//p[@class='posted']//span";
    String alarm_icon = "(//i[@class='material-icons'])[1]";
    String apply_on = "//p[@class='apply-by']//span";
    String school = "//p[@class='school']";
    String job_description = "//div[@class='job-description']//p[@class='section-title']";
    String apply_button = "//button[@class='apply']";
    String contract_type = "(//p[@class='detail-type'])[1]";
    String contract_term = "(//p[@class='detail-type'])[2]";
    String salary = "(//p[@class='detail-type'])[3]";
    String school_profile = "//a[.='School Profile']";
    String skills = "//div[@class='preview-skills-essentials-wrapper']//p[@class='section-title']";
    String documents = "//div[@class='essential documents']//p[@class='essential-title']";
    String video_prescreening = "//div[@class='essential video-prescreening']//p[@class='essential-title']";
    String video_interview = "//div[@class='essential video-interview']//p[@class='essential-title']";


    ///////////////////LOGIN PAGE ///////////////////////////

    String image_teacher = "//div[@class='Login-wrapper teacher']";
    String image_school = "//div[@class='Login-wrapper school']";
    String text_teacher = "//h3[.='i am a teacher']";
    String text_school = "(//h3)[2]";
    String sign_in_teacher = "(//button[@class='sign-in-button'])[1]";
    String sign_in_school = "(//button[@class='sign-in-button'])[2]";


    //////////////////// AUTHORIZATION PAGE /////////////
    String LOGO_IMAGE = "//img[@src='https://realiseme.com/assets/frontpage/logo.png']";
    String Facebook = "//button[@data-provider='facebook']";
    String Google = "//button[@data-provider='google-oauth2']";
    String Twitter = "//button[@data-provider='twitter']";
    String OR_Image = "//div[@class='auth0-lock-pane-separator']";
    String Email_field = "//input[@type='email']";
    String Password_field = "//input[@placeholder='your password']";
    String DontRememberPass = "(//a)[2]";
    String DontRememberPass_for_school = "(//a)[4]";
    String Log_In = "//button[@type='submit']";
    String Sign_up = "//button[@type='submit']";

    ////////////////////  Home Page ////////////////////

    //////left column//////////
    String left_panel = "//div[@class='LeftPanel']";
    String welcome = "//h3[@class='LeftPanel-user']";
    String add_photo = "//label[@class='LeftPanel-label']";
    String first_row ="//div[@class='spinner-wrap LeftPanel-wrapper LeftPanel-profile']";
    String second_row = "//div[@class='LeftPanel-wrapper LeftPanel-verified']";
    String third_row = "//div[@class='LeftPanel-wrapper LeftPanel-visited']";
    String fourth_row = "//div[@class='LeftPanel-wrapper LeftPanel-links']";
    String second_row_title = "//div[@class='LeftPanel-wrapper LeftPanel-verified']//h3[@class='LeftPanel-title']";
    String second_row_link = "(//a[@href='#'])[1]";
    String second_row_link1 = "//span[@class='LeftPanel-link']";
    String number_of_visitors = "(//h3[@class='LeftPanel-title'])[2]";
    String third_row_link = "//div[@class='LeftPanel-wrapper LeftPanel-visited']//a[@class='LeftPanel-link']";
    String fourth_row_title = "//div[@class='LeftPanel-wrapper LeftPanel-links']//h3";
    String fourth_row_1 = "(//a[@href='#'])[3]";
    String fourth_row_2 = "(//a[@href='#'])[4]";
    String fourth_row_3 = "(//a[@href='#'])[5]";
    String fourth_row_4 = "(//a[@href='#'])[6]";
    String clearance_status_link = "//a[.='Clearance status']";

    //////////////////////  first table

    String firstTable_titile1 = "(//div[@class='components-name'])[2]";
    String firstTable_titile2 = "(//div[@class='components-name'])[4]";
    String first_column1 = "(//div[@class='table-header']//p)[7]";
    String second_column1 = "(//div[@class='table-header']//p)[8]";
    String third_column1= "(//div[@class='table-header']//p)[9]";
    String fourth_column1= "(//div[@class='table-header']//p)[10]";
    String fifth_column1= "(//div[@class='table-header']//p)[11]";
    String sixth_column1= "(//div[@class='table-header']//p)[12]";
    String first_column = "(//div[@class='table-header']//p)[1]";
    String second_column = "(//div[@class='table-header']//p)[2]";
    String third_column= "(//div[@class='table-header']//p)[3]";
    String fourth_column= "(//div[@class='table-header']//p)[4]";
    String fifth_column= "(//div[@class='table-header']//p)[5]";
    String sixth_column= "(//div[@class='table-header']//p)[6]";
    String viewall_button1 = "(//a[.='view all'])[1]";
    String viewall_button2 = "(//a[.='view all'])[2]";
    String table_columns_header = "(//div[@class='table-header'])[2]";
    String first_line ="(//div[@class='table-body'])[1]";
    String second_line ="(//div[@class='table-body'])[2]";
    String third_line ="(//div[@class='table-body'])[3]";
    String fourth_line ="(//div[@class='table-body'])[4]";
    String fifth_line ="(//div[@class='table-body'])[5]";



    /////////////////////////  AGENCY /////////////////////////
    String Supply_staff_name = "//div[contains(.,'Supply staff name')]/input";
    String Gross_Daily_Charge = "//div[contains(.,'Gross Daily Charge')]/input";
    String Subject = "//div[contains(.,'Subject')]/input";
    String drag_drop = "//div[contains(.,'Profile / Confirmation of checks')]//input[@type='file']";



}
