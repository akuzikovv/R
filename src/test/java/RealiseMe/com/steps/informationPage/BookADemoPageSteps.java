package RealiseMe.com.steps.informationPage;


import RealiseMe.com.pages.CorePageObjects;
import RealiseMe.com.xpath_locators.informationPages.BookADemoPageLocators;
import cucumber.api.java.en.Then;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;


public class BookADemoPageSteps extends ScenarioSteps {

    private CorePageObjects core;

    @Then("^Landing page > Book a demo page is opened$")
    public void landingPageBookADemoPageIsOpened() {
        String xpath = BookADemoPageLocators.XPATH_BOOK_A_DEMO;
        Assert.assertTrue("Book a demo is not opened by xpath: " + xpath,
                core.elementByXpathIsVisible(xpath));
    }
}