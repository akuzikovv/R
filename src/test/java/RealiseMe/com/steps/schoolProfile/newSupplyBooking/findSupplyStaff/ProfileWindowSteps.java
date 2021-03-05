package RealiseMe.com.steps.schoolProfile.newSupplyBooking.findSupplyStaff;


import RealiseMe.com.pages.CorePageObjects;
import RealiseMe.com.xpath_locators.schoolProfile_locators.newSupplyBooking.findSupplyStaff.ProfileWindowLocators;
import RealiseMe.com.xpath_locators.schoolProfile_locators.newSupplyBooking.findSupplyStaff.SearchResultsTabLocators;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;


public class ProfileWindowSteps extends ScenarioSteps {

    private CorePageObjects core;

    @Then("^School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window is opened$")
    public void schoolProfilePageSupplyBookingsPageFindSupplyStaffPageSearchResultsPageProfileWindowIsOpened() {
        String xpath = ProfileWindowLocators.XPATH_PROFILE_WINDOW;
        Assert.assertTrue("Profile window is not shown by xpath: " + xpath,
                core.elementByXpathIsVisible(60 ,xpath));
    }

    @Then("^School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The \"([^\"]*)\" name is shown$")
    public void schoolProfilePageSupplyBookingsPageFindSupplyStaffPageSearchResultsPageProfileWindowTheNameIsShown(String name) {
        String xpath = ProfileWindowLocators.XPATH_NAME_FIELD.replace("$1", name);
        Assert.assertTrue(name + "name is not shown by xpath: " + xpath,
                core.elementByXpathIsVisible(xpath));
    }

    @Then("^School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The \"([^\"]*)\" location is shown$")
    public void schoolProfilePageSupplyBookingsPageFindSupplyStaffPageSearchResultsPageProfileWindowTheLocationIsShown(String location) {
        String xpath = ProfileWindowLocators.XPATH_LOCATION_FIELD.replace("$1", location);
        Assert.assertTrue(location + "is not shown by xpath: " + xpath,
                core.elementByXpathIsVisible(xpath));
    }

    @Then("^School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The \"([^\"]*)\" birthday is shown$")
    public void schoolProfilePageSupplyBookingsPageFindSupplyStaffPageSearchResultsPageProfileWindowTheBirthdayIsShown(String birthday) {
        String xpath = ProfileWindowLocators.XPATH_BIRTHDAY_FIELD.replace("$1", birthday);
        Assert.assertTrue(birthday + "is not shown by xpath: " + xpath,
                core.elementByXpathIsVisible(xpath));
    }

    @Then("^School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The \"([^\"]*)\" job title is shown$")
    public void schoolProfilePageSupplyBookingsPageFindSupplyStaffPageSearchResultsPageProfileWindowTheJobTitleIsShown(String jobTitle) {
        String xpath = ProfileWindowLocators.XPATH_JOB_TITLE_FIELD.replace("$1", jobTitle);
        Assert.assertTrue(jobTitle + "job title is not shown by xpath: " + xpath,
                core.elementByXpathIsVisible(xpath));
    }

    @Then("^School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The \"([^\"]*)\" about me is shown$")
    public void schoolProfilePageSupplyBookingsPageFindSupplyStaffPageSearchResultsPageProfileWindowTheAboutMeIsShown(String aboutMe) {
        String xpath = ProfileWindowLocators.XPATH_ABOUT_ME_FIELD.replace("$1", aboutMe);
        Assert.assertTrue(aboutMe + "about me is not shown by xpath: " + xpath,
                core.elementByXpathIsVisible(xpath));
    }

    @Then("^School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The prescreening questions is shown$")
    public void schoolProfilePageSupplyBookingsPageFindSupplyStaffPageSearchResultsPageProfileWindowThePrescreeningQuestionsIsShown() {
        String xpath = ProfileWindowLocators.XPATH_PRESCREENING_QUESTIONS;
        Assert.assertTrue("The prescreening questions is not shown by xpath: " + xpath,
                core.elementByXpathIsVisible(xpath));
    }

    @Then("^School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The teacher characteristics is shown$")
    public void schoolProfilePageSupplyBookingsPageFindSupplyStaffPageSearchResultsPageProfileWindowTheTeacherCharacteristicsIsShown() {
        String xpath = ProfileWindowLocators.XPATH_TEACHER_CHARACTERISTICS;
        Assert.assertTrue("The teacher characteristics is not shown by xpath: " + xpath,
                core.elementByXpathIsVisible(xpath));
    }

    @Then("^School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The \"([^\"]*)\" CV document is shown$")
    public void schoolProfilePageSupplyBookingsPageFindSupplyStaffPageSearchResultsPageProfileWindowTheCVDocumentIsShown(String cvDocument) {
        String xpath = ProfileWindowLocators.XPATH_CV_DOCUMENT.replace("$1", cvDocument);
        Assert.assertTrue(cvDocument + "CV document is not shown by xpath: " + xpath,
                core.elementByXpathIsVisible(xpath));
    }

    @Then("^School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The \"([^\"]*)\" document is shown$")
    public void schoolProfilePageSupplyBookingsPageFindSupplyStaffPageSearchResultsPageProfileWindowTheDocumentIsShown(String document) {
        String xpath = ProfileWindowLocators.XPATH_DOCUMENTS.replace("$1", document);
        Assert.assertTrue(document + "document is not shown by xpath: " + xpath,
                core.elementByXpathIsVisible(xpath));
    }

    @Then("^School profile page > Supply Bookings page > Find Supply Staff page > Search results page > Profile window > The \"([^\"]*)\" user status is shown$")
    public void schoolProfilePageSupplyBookingsPageFindSupplyStaffPageSearchResultsPageProfileWindowTheUserStatusIsShown(String userStatus) {
        String xpath = ProfileWindowLocators.XPATH_STATUS_USER.replace("$1", userStatus);
        Assert.assertTrue(userStatus + "user status is not shown by xpath: " + xpath,
                core.elementByXpathIsVisible(xpath));
    }
}