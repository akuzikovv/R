package RealiseMe.com.steps.schoolProfile;


import RealiseMe.com.pages.CorePageObjects;
import RealiseMe.com.xpath_locators.schoolProfile_locators.HeaderLocators;
import RealiseMe.com.xpath_locators.schoolProfile_locators.SupplyBookingsPageLocators;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;


public class SupplyBookingsPageSteps extends ScenarioSteps {

    private CorePageObjects core;

    @Then("^School profile page > Supply Bookings page is opened$")
    public void schoolProfilePageSupplyBookingsPageIsOpened() {
        String xpath = SupplyBookingsPageLocators.XPATH_SUPPLY_BOOKINGS_PAGE;
        Assert.assertTrue("Supply Bookings page is not opened by xpath: " + xpath,
                core.elementByXpathIsVisible(xpath));
    }

    @And("^School profile page > Supply Bookings page > Click on the New Supply Booking$")
    public void schoolProfilePageSupplyBookingsPageClickOnTheNewSupplyBooking() {
        core.clickOnElementByXpath(SupplyBookingsPageLocators.XPATH_NEW_SUPPLY_BOKKING_BUTTON);
    }
}