package RealiseMe.com;

import org.yecht.Data;

public interface ILocators {

///////////////////////////  HEADER ///////////////////////////
    String header = "//div[@class='Header']";
    String jobs = "//span[.='jobs']";
    String home = "//span[.='home']";
    String blog = "//span[.='blog']";
    String forum = "//span[.='forum']";
    String login = "//span[.='login']";
    String sign_up = "//span[.='sign up']";
    String messaging = "//span[.='messaging']";
    String bookings = "//span[.='bookings']";
    String bell_icon = "//i[@class='icon-bell icons']";
    String user_photo_icon = "//li[@class='user-name desktop']//img[@alt='users icon']";
    String user_name = "//li[@class='user-name desktop']//span";
    String arrow_down_button =  "//li[@class='user-name desktop']//i[@class='icon-arrow-down icons']";
    String LOGOUT_BUTTON = "//div[.='Logout']";


    /////////////////// LANDING PAGE ////////////////////////////

    String keyword_search = "//input[@class='input keyword']";
    String search_button ="//button[.='search']";
    String search_result = "//div[@class='result-wrapper']";
    String first_result = "(//p[@class='job-details-title']//a)[1]";
    String first_result_save_button = "(//p[@class='save'])[1]";
    String first_result_saved_button = "(//p[.=' Saved'])[1]";


    //////////////////  SCHOOL JOBS PAGE ///////////////////////


    String Jobs = "//h3[@class='booking-title']";
    String live = "(//a[@href='#/school/job/live'])[2]";
    String archived = "//a[@href='#/school/job/archived']";
    String draft = "//a[@href='#/school/job/draft']";
    String JOB_TITLE = "(//p[@class='name'])[1]";
    String JOB_STATUS = "(//p[@class='status'])[1]";
    String view_applicants1 = "(//p[@class='view'])[2]";
    String move_to_archive = "(//p[@class='archive'])[2]";
    String repost = "//a[@class='repost']";
    String CREATED = "(//p[@class='created'])[1]";
    String edit_and_post = "(//a[@href='#/school/post-new-job'])[2]";
    String Archived_on = "(//p)[4]";
    String Posted_on = "(//p[@class='name'])[2]";
    String Last_saved_on = "(//p[@class='name'])[2]";
    String POST_A_NEW_JOB = "//a[@href='#/school/post-new-job']";

    /////////////// SCHOOL POST JOB /////////////////////

    String Post_a_Job = "//span[@class='booking-search-title']";
    String choose_from_draft = "(//label[@for='savedSearch'])[1]";
    String draftDropdown ="(//i[@class='icon material-icons input-group__append-icon input-group__icon-cb'])[1]";
    String job_details = "//span[.='Job Details']";
    String jobName = "//label[@for='position-name']";
    String example_name_text = "//input[@placeholder='EXAMPLE: Maths teacher in Essex']";
    String jobDescription = "//label[@for='job-description']";
    String upload_text = "//p[.='Upload application form']";
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
    String I_want_to_request = "//label[.='I want to request video prescreening questions to be answered for enhanced application.']";
    String Video_interview = "(//p[@class='details-title'])[2]";
    String interview_checkbox_text = "//label[.='Please tick if you want to request first stage interview with the candidates.']";
    String Please_contact_us = "//span[.='Please contact us to arrange the interview.']";
    String Anonymisation = "//p[@class='anonymisation-title']";
    String anonimisation_text = "(//span[@class='note'])[2]";
    String Boost_your_job_s_visibility_by_enhancing_your_advert   = "(//div[@class='title'])[3]";
    String SASAD = "//label[.='SASAD - Socially Augmented, Sentiment and AI Direct']";
    String SAAID = "//label[.='SAAID - Socially Augmented and AI Direct']";
    String SA = "//label[.='SA - Socially Augmented']";
    String Invite_a_coworker = "(//div[@class='title']//span[@data-v-5f6cf490])[4]";
    String add_coworkers_as_an_admin = "(//span[@data-v-5f6cf490])[11]";
    String post_job_button = "//button[@class='post-job']";
    String save_draft_button = "//button[@class='save-draft']";











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
    String Email_field = "//input[@placeholder='yours@example.com']";
    String Password_field = "//input[@placeholder='your password']";
    String DontRememberPass = "(//a)[2]";
    String DontRememberPass_for_school = "(//a)[4]";
    String Log_In = "//button[@type='submit']";

    ////////////////////  Home Page ////////////////////

    //////left column//////////
    String left_panel = "//div[@class='LeftPanel']";
    String welcome = "//h3[@class='LeftPanel-user']";
    String add_photo = "//label[@class='LeftPanel-label']";
    String first_row ="//div[@class='LeftPanel-wrapper LeftPanel-profile']";
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


}
