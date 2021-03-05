package RealiseMe.com.xpath_locators;

public interface LoginPageLocators {

    String XPATH_LOGIN_PAGE = "//button[@type=\"submit\"]";
    String XPATH_LOG_IN_AND_SIGN_UP_BUTTONS = "//li[contains(@class,'tabs-current')]//a[.=\"$1\"]";
    String XPATH_ROLE_FIELD = "//input[@value=\"$1\"]";
    String XPATH_LOGIN_BUTTON = "//button[@type=\"submit\"]//span[contains(text(),\"Log In\")]";
    String XPATH_LOGIN_INPUT_FIELD = "//input[@name=\"email\"]";
    String XPATH_PASSWORD_INPUT_FIELD = "//input[@name=\"password\"]";

}
