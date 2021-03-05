package RealiseMe.com.xpath_locators.schoolProfile_locators.newSupplyBooking.findSupplyStaff;

public interface SearchResultsTabLocators {

    String XPATH_SEARCH_RESULTS_TAB = "//div[@class=\"booking-creation-header\"]//a[contains(@class,\"search-results active\")]";
    String XPATH_TABS_ACTIVE = "//div[@class=\"results-tabs\"]//a[contains(@class,'router-link-exact-active active')][contains(text(),\"$1\")]";
    String XPATH_TABS_NOT_ACTIVE = "//div[@class=\"results-tabs\"]//a[contains(text(),\"$1\")]";
    String XPATH_USER_LINK = "//div[@class=\"table-row\"]//div[@class=\"table-info\"]//p[@class=\"name\"][contains(text(),\"$1\")]";

}
