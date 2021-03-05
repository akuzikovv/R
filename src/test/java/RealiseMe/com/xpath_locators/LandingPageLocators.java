package RealiseMe.com.xpath_locators;

public interface LandingPageLocators {

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
    String XPATH_LINKS_IN_SECOND_PART = "//div[@class=\"LandingTestimonials-logos\"]//a[.=\"$1\"]";
    String XPATH_BUTTONS_IN_FOOTER = "//div[@class=\"Footer-menu\"]//a[.=\"$1\"]";

}
