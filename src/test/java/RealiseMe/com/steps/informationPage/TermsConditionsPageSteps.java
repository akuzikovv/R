package RealiseMe.com.steps.informationPage;


import RealiseMe.com.pages.CorePageObjects;
import RealiseMe.com.xpath_locators.informationPages.TermsConditionsPageLocators;
import cucumber.api.java.en.Then;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;


public class TermsConditionsPageSteps extends ScenarioSteps {

    private CorePageObjects core;

    @Then("^Terms & Conditions page is opened$")
    public void termsConditionsPageIsOpened() {
        String xpath = TermsConditionsPageLocators.XPATH_TERMS_AND_CONDITIONS_PAGE;
        Assert.assertTrue("Terms & Conditions page is not opened by xpath: " + xpath,
                core.elementByXpathIsVisible(xpath));
    }
}