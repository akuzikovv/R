package RealiseMe.com.steps.schoolProfile;


import RealiseMe.com.pages.CorePageObjects;
import RealiseMe.com.xpath_locators.schoolProfile_locators.HeaderLocators;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;


public class HeaderSteps extends ScenarioSteps {

    private CorePageObjects core;

    @Then("^School \"([^\"]*)\" profile page is opened$")
    public void schoolProfilePageIsOpened(String accountName) {
        String xpath = HeaderLocators.XPATH_ACCOUNT_NAME.replace("$1", accountName);
        Assert.assertTrue("School " + accountName +  " profile page is not opened by xpath: " + xpath,
                core.elementByXpathIsVisible(60 ,xpath));
    }

    @And("^School profile page > Header > Click on the Bookings button$")
    public void schoolProfilePageHeaderClickOnTheBookingsButton() {
        core.clickOnElementByXpath(HeaderLocators.XPATH_BOOKINGS_BUTTON);
    }
}