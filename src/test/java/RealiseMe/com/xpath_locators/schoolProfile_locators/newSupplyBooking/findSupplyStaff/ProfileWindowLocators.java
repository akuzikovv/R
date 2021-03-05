package RealiseMe.com.xpath_locators.schoolProfile_locators.newSupplyBooking.findSupplyStaff;

public interface ProfileWindowLocators {

    String XPATH_PROFILE_WINDOW = "//div[contains(@class,\"dialog teacher-profile-modal Modal dialog--active\")]//div[@class=\"card\"]";
    String XPATH_NAME_FIELD = XPATH_PROFILE_WINDOW + "//p[@class=\"teacher-name\"][contains(.,\"$1\")]";
    String XPATH_LOCATION_FIELD = XPATH_PROFILE_WINDOW + "//span[@class=\"teacher-city\"][contains(.,\"$1\")]";
    String XPATH_BIRTHDAY_FIELD = XPATH_PROFILE_WINDOW + "//span[@class=\"birthday-text\"][contains(text(),\"$1\")]";
    String XPATH_JOB_TITLE_FIELD = XPATH_PROFILE_WINDOW + "//div[@class=\"about-the-teacher\"]//div[@class=\"about-teacher\"]//strong[contains(text(),\"$1\")]";
    String XPATH_ABOUT_ME_FIELD = XPATH_PROFILE_WINDOW + "//div[@class=\"about-the-teacher\"]//div[@class=\"about-teacher\"]//p[contains(text(),\"$1\")]";
    String XPATH_PRESCREENING_QUESTIONS = XPATH_PROFILE_WINDOW + "//div[@class=\"about-the-teacher\"]//p[contains(text(),\"PRESCREENING QUESTIONS\")]";
    String XPATH_TEACHER_CHARACTERISTICS = XPATH_PROFILE_WINDOW + "//div[@class=\"teacher-characteristics-container\"]";
    String XPATH_CV_DOCUMENT = XPATH_PROFILE_WINDOW + "//div[@class=\"about-teacher\"]//p[contains(text(),\"CV\")]//..//p[@class=\"MyInfoDocuments-file\"][contains(text(),\"$1\")]";
    String XPATH_DOCUMENTS = XPATH_PROFILE_WINDOW + "//div[@class=\"about-teacher\"]//p[contains(text(),\"Documents\")]//..//p[@class=\"MyInfoDocuments-file\"][contains(text(),\"$1\")]";
    String XPATH_STATUS_USER = XPATH_PROFILE_WINDOW + "//div[@class=\"about-the-teacher\"]//p[@class=\"about-teacher-title\"][contains(text(),\"Clearance\")]//..//span[@class=\"$1\"]";

}
