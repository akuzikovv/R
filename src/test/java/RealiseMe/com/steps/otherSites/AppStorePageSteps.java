package RealiseMe.com.steps.otherSites;


import RealiseMe.com.pages.CorePageObjects;
import RealiseMe.com.xpath_locators.JobsPageLocators;
import RealiseMe.com.xpath_locators.otherSites.AppStorePageLocators;
import cucumber.api.java.en.Then;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;


public class AppStorePageSteps extends ScenarioSteps {

    private CorePageObjects core;

    @Then("^App store website is opened$")
    public void appStoreWebsiteIsOpened() {
        String xpath = AppStorePageLocators.XPATH_APP_STORE_PAGE;
        Assert.assertTrue("App store website is not opened by xpath: " + xpath,
                core.elementByXpathIsVisible(xpath));
    }

    @Then("^App store website > RealiseMe app on the page$")
    public void appStoreWebsiteRealiseMeAppOnThePage() {
        String xpath = AppStorePageLocators.XPATH_REALISE_ME_ON_APP_STORE_PAGE;
        Assert.assertTrue("RealiseMe app is not shown on the page by xpath: " + xpath,
                core.elementByXpathIsVisible(xpath));
    }
}