package RealiseMe.com.steps.schoolProfile.newSupplyBooking.findSupplyStaff;


import RealiseMe.com.pages.CorePageObjects;
import RealiseMe.com.xpath_locators.schoolProfile_locators.newSupplyBooking.findSupplyStaff.StartSearchTabLocators;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;


public class StartSearchTabSteps extends ScenarioSteps {

    private CorePageObjects core;

    @Then("^School profile page > Supply Bookings page > Find Supply Staff page > Start search page is opened$")
    public void schoolProfilePageSupplyBookingsPageFindSupplyStaffPageStartSearchPageIsOpened() {
        String xpath = StartSearchTabLocators.XPATH_START_SEARCH_TAB_ACTIVE;
        Assert.assertTrue("Start search page is not opened by xpath: " + xpath,
                core.elementByXpathIsVisible(xpath));
    }

    @And("^School profile page > Supply Bookings page > Find Supply Staff page > Start search page > enter \"([^\"]*)\" text into Name your job posting$")
    public void schoolProfilePageSupplyBookingsPageFindSupplyStaffPageStartSearchPageEnterTextIntoNameYourJobPosting(String nameJob) {
        core.typeTextIntoInputFieldByXpath(StartSearchTabLocators.XPATH_NAME_JOB_POSITION_INPUT_FIELD, nameJob);
    }

    @And("^School profile page > Supply Bookings page > Find Supply Staff page > Start search page > enter \"([^\"]*)\" text into Describe the job$")
    public void schoolProfilePageSupplyBookingsPageFindSupplyStaffPageStartSearchPageEnterTextIntoDescribeTheJob(String description) {
        core.typeTextIntoInputFieldByXpath(StartSearchTabLocators.XPATH_DESCRIPTION_INPUT_FIELD, description);
    }

    @And("^School profile page > Supply Bookings page > Find Supply Staff page > Start search page > Click on the \"([^\"]*)\" checkbox$")
    public void schoolProfilePageSupplyBookingsPageFindSupplyStaffPageStartSearchPageClickOnTheCheckbox(String typeTeacher) {
        core.clickOnElementByXpath(StartSearchTabLocators.XPATH_TEACHER_TYPE.replace("$1", typeTeacher));
    }

    @And("^School profile page > Supply Bookings page > Find Supply Staff page > Start search page > Click on the Dates required \"([^\"]*)\" checkbox$")
    public void schoolProfilePageSupplyBookingsPageFindSupplyStaffPageStartSearchPageClickOnTheDatesRequiredCheckbox(String date) {
        core.clickOnElementByXpath(StartSearchTabLocators.XPATH_DATES_REQUIRED.replace("$1", date));
    }

    @Then("^School profile page > Supply Bookings page > Find Supply Staff page > Start search page > Calendar is opened$")
    public void schoolProfilePageSupplyBookingsPageFindSupplyStaffPageStartSearchPageCalendarIsOpened() {
        String xpath = StartSearchTabLocators.XPATH_CALENDAR;
        Assert.assertTrue("Calendar is not opened by xpath: " + xpath, core.elementByXpathIsVisible(xpath));
    }

    @And("^School profile page > Supply Bookings page > Find Supply Staff page > Start search page > Calendar > Select available day$")
    public void schoolProfilePageSupplyBookingsPageFindSupplyStaffPageStartSearchPageCalendarSelectAvailableDay() {
        core.clickOnElementByXpath(StartSearchTabLocators.XPATH_DATE_IN_CALENDAR);
    }

    @Then("^School profile page > Supply Bookings page > Find Supply Staff page > Start search page > Select time sheets is shown$")
    public void schoolProfilePageSupplyBookingsPageFindSupplyStaffPageStartSearchPageSelectTimeSheetsIsShown() {
        String xpath = StartSearchTabLocators.XPATH_SHEETS_TIME;
        Assert.assertTrue("Select time sheets is not shown by xpath: " + xpath,
                core.elementByXpathIsVisible(xpath));
    }

    @And("^School profile page > Supply Bookings page > Find Supply Staff page > Start search page > Click on the Show Results button$")
    public void schoolProfilePageSupplyBookingsPageFindSupplyStaffPageStartSearchPageClickOnTheShowResultsButton() {
        core.clickOnElementByXpath(StartSearchTabLocators.XPATH_SHOW_RESULTS_BUTTON);
    }

    @And("^School profile page > Supply Bookings page > Find Supply Staff page > Start search page > Click on the Anonymous radio button$")
    public void schoolProfilePageSupplyBookingsPageFindSupplyStaffPageStartSearchPageClickOnTheAnonymousRadioButton() {
        core.clickOnElementByXpath(StartSearchTabLocators.XPATH_ANONYMISATION_RADIO_BUTTON_NOT_ACTIVE);
    }

    @Then("^School profile page > Supply Bookings page > Find Supply Staff page > Start search page > Anonymous radio button is selected$")
    public void schoolProfilePageSupplyBookingsPageFindSupplyStaffPageStartSearchPageAnonymousRadioButtonIsSelected() {
        String xpath = StartSearchTabLocators.XPATH_ANONYMISATION_RADIO_BUTTON_ACTIVE;
        Assert.assertTrue("Anonymous radio button is not selected by xpath: " + xpath,
                core.elementByXpathIsVisible(xpath));
    }
}