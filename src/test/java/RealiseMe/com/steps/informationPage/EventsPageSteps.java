package RealiseMe.com.steps.informationPage;


import RealiseMe.com.pages.CorePageObjects;
import RealiseMe.com.xpath_locators.informationPages.EventsPageLocators;
import cucumber.api.java.en.Then;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;


public class EventsPageSteps extends ScenarioSteps {

    private CorePageObjects core;

    @Then("^Landing page > Community menu > Events page is opened$")
    public void landingPageCommunityMenuEventsPageIsOpened() {
        String xpath = EventsPageLocators.XPATH_EVENTS_PAGE;
        Assert.assertTrue("Events page is not opened by xpath: " + xpath,
                core.elementByXpathIsVisible(xpath));
    }
}