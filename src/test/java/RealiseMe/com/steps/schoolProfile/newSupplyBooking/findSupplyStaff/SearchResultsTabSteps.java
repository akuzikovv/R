package RealiseMe.com.steps.schoolProfile.newSupplyBooking.findSupplyStaff;


import RealiseMe.com.pages.CorePageObjects;
import RealiseMe.com.xpath_locators.schoolProfile_locators.newSupplyBooking.findSupplyStaff.SearchResultsTabLocators;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;


public class SearchResultsTabSteps extends ScenarioSteps {

    private CorePageObjects core;

    @Then("^School profile page > Supply Bookings page > Find Supply Staff page > Search results page is opened$")
    public void schoolProfilePageSupplyBookingsPageFindSupplyStaffPageSearchResultsPageIsOpened() {
        String xpath = SearchResultsTabLocators.XPATH_SEARCH_RESULTS_TAB;
        Assert.assertTrue("Search results page is not opened by xpath: " + xpath,
                core.elementByXpathIsVisible(60, xpath));
    }

    @And("^School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Click on the \"([^\"]*)\" tab$")
    public void schoolProfilePageSupplyBookingsPageFindSupplyStaffPageSearchResultsPageClickOnTheTab(String tabName) {
        core.clickOnElementByXpath(SearchResultsTabLocators.XPATH_TABS_NOT_ACTIVE.replace("$1", tabName));
    }

    @Then("^School profile page > Supply Bookings page > Find Supply Staff page > Search results page > The \"([^\"]*)\" tab is opened$")
    public void schoolProfilePageSupplyBookingsPageFindSupplyStaffPageSearchResultsPageTheTabIsOpened(String tabName) {
        String xpath = SearchResultsTabLocators.XPATH_TABS_ACTIVE.replace("$1", tabName);
        Assert.assertTrue( tabName + " tab is not opened by xpath: " + xpath,
                core.elementByXpathIsVisible(xpath));
    }

    @Then("^School profile page > Supply Bookings page > Find Supply Staff page > Search results page > The \"([^\"]*)\" user is shown$")
    public void schoolProfilePageSupplyBookingsPageFindSupplyStaffPageSearchResultsPageTheUserIsShown(String userName) {
        String xpath = SearchResultsTabLocators.XPATH_USER_LINK.replace("$1", userName);
        Assert.assertTrue( userName + "user is not shown by xpath: " + xpath,
                core.elementByXpathIsVisible(xpath));
    }

    @And("^School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Click on the \"([^\"]*)\" user$")
    public void schoolProfilePageSupplyBookingsPageFindSupplyStaffPageSearchResultsPageClickOnTheUser(String userName) {
        core.clickOnElementByXpath(SearchResultsTabLocators.XPATH_USER_LINK.replace("$1", userName));
    }
}