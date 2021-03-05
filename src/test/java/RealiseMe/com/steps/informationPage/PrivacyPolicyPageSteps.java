package RealiseMe.com.steps.informationPage;


import RealiseMe.com.pages.CorePageObjects;
import RealiseMe.com.xpath_locators.informationPages.PrivacyPolicyPageLocators;
import cucumber.api.java.en.Then;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;


public class PrivacyPolicyPageSteps extends ScenarioSteps {

    private CorePageObjects core;

    @Then("^Privacy Policy page is opened$")
    public void privacyPolicyPageIsOpened() {
        String xpath = PrivacyPolicyPageLocators.XPATH_PRIVACY_AND_COOKIE_POLICY_PAGE;
        Assert.assertTrue("Privacy Policy page is not opened by xpath: " + xpath,
                core.elementByXpathIsVisible(xpath));
    }
}