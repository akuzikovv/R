package RealiseMe.com.steps.informationPage;


import RealiseMe.com.pages.CorePageObjects;
import RealiseMe.com.xpath_locators.informationPages.HowItWorksPageLocators;
import cucumber.api.java.en.Then;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;


public class HowItWorksPageSteps extends ScenarioSteps {

    private CorePageObjects core;

    @Then("^Landing page > Our mission menu > How it works page is opened$")
    public void landingPageOurMissionMenuHowItWorksPageIsOpened() {
        String xpath = HowItWorksPageLocators.XPATH_HOW_IT_WORKS_PAGE;
        Assert.assertTrue("How it works page is not opened by xpath: " + xpath,
                core.elementByXpathIsVisible(xpath));
    }
}