package RealiseMe.com.xpath_locators.schoolProfile_locators.newSupplyBooking.findSupplyStaff;

public interface StartSearchTabLocators {

    String XPATH_START_SEARCH_TAB_ACTIVE = "//div[@class=\"booking-creation-header\"]//a[contains(@class,\"start-search active\")]";
    String XPATH_START_SEARCH_TAB_NOT_ACTIVE = "//div[@class=\"booking-creation-header\"]//a[@class=\"booking-creation-step start-search\"]";
    String XPATH_NAME_JOB_POSITION_INPUT_FIELD = "//input[@name=\"name\"]";
    String XPATH_DESCRIPTION_INPUT_FIELD = "//textarea[@name=\"describe\"]";
    String XPATH_TEACHER_TYPE = "//div[@aria-label=\"Teacher\"]//div[@class=\"input-group--selection-controls__ripple\"]";
    String XPATH_DATES_REQUIRED = "//div[@aria-label=\"$1\"]//div[@class=\"input-group--selection-controls__ripple\"]";
    String XPATH_CALENDAR = "//div[@class=\"showCalendar\"]";
    String XPATH_DATE_IN_CALENDAR = XPATH_CALENDAR + "//p[@class=\"datepicker-table-cal datepicker-day available\"][1]";
    String XPATH_SHEETS_TIME = "//div[@class=\"full-day\"]";
    String XPATH_ANONYMISATION_RADIO_BUTTON_ACTIVE = "//div[@class=\"anonym-switcher\"]//div[@class=\"input-group--selection-controls__ripple input-group--selection-controls__ripple--active\"]";
    String XPATH_ANONYMISATION_RADIO_BUTTON_NOT_ACTIVE = "//div[@class=\"anonym-switcher\"]//div[@class=\"input-group--selection-controls__ripple\"]";
    String XPATH_SHOW_RESULTS_BUTTON = "//div[@class=\"show-results\"]//a[.=\"SHOW RESULTS\"]";

}
