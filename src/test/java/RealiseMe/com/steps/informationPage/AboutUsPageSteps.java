package RealiseMe.com.steps.informationPage;


import RealiseMe.com.pages.CorePageObjects;
import RealiseMe.com.xpath_locators.informationPages.AboutUsPageLocators;
import cucumber.api.java.en.Then;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;


public class AboutUsPageSteps extends ScenarioSteps {

    private CorePageObjects core;

    @Then("^Landing page > Our mission menu > About us page is opened$")
    public void landingPageOurMissionMenuAboutUsPageIsOpened() {
        String xpath = AboutUsPageLocators.XPATH_ABOUT_US_PAGE;
        Assert.assertTrue("About us page is not opened by xpath: " + xpath,
                core.elementByXpathIsVisible(xpath));
    }

}