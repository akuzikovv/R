package RealiseMe.com.xpath_locators.schoolProfile_locators;

public interface HeaderLocators {

    String XPATH_ACCOUNT_NAME = "//div[@class=\"header\"]//div[@class=\"profile-name\"]//span[.=\"$1\"]";
    String XPATH_DASHBOARD_BUTTON = "//div[@class=\"header\"]//li[@class=\"main-menu__item\"]//div[contains(text(),\"Dashboard\")]";
    String XPATH_JOBS_BUTTON = "//div[@class=\"header\"]//li[@class=\"main-menu__item\"]//div[contains(text(),\"Jobs\")]";
    String XPATH_BOOKINGS_BUTTON = "//div[@class=\"header\"]//li[@class=\"main-menu__item\"]//div[contains(text(),\"Bookings\")]";
    String XPATH_COMMUNITY_BUTTON = "//div[@class=\"header\"]//li[@class=\"main-menu__item\"]//div[contains(text(),\"Community\")]";

}
