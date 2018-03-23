package RealiseMe.com;

public interface ILocators {

///////////////////////////  HEADER ///////////////////////////
    String header = "//div[@class='Header']";
    String jobs = "//span[.='jobs']";
    String home = "//span[.='home']";
    String messaging = "//span[.='messaging']";
    String bookings = "//span[.='bookings']";
    String bell_icon = "//i[@class='icon-bell icons']";
    String user_photo_icon = "//li[@class='user-name desktop']//img[@alt='users icon']";
    String user_name = "//li[@class='user-name desktop']//span";
    String arrow_down_button =  "//li[@class='user-name desktop']//i[@class='icon-arrow-down icons']";

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
    String second_row_link = "//span[@class='LeftPanel-link']";
    String number_of_visitors = "//div[@class='LeftPanel-wrapper LeftPanel-visited']";
    String third_row_link = "//div[@class='LeftPanel-wrapper LeftPanel-visited']//a[@class='LeftPanel-link']";
    String fourth_row_title = "//div[@class='LeftPanel-wrapper LeftPanel-links']//h3";
    String fourth_row_1 = "//a[.='Job search']";
    String fourth_row_2 = "//a[.='Saved jobs']";
    String fourth_row_3 = "//li[@class='LeftPanel-item']//a[.='Blog']";
    String fourth_row_4 = "//li[@class='LeftPanel-item']//a[.='Forum']";
    String clearance_status_link = "//a[.='Clearance status']";



}
