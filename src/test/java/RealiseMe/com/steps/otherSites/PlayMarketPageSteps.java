package RealiseMe.com.steps.otherSites;


import RealiseMe.com.pages.CorePageObjects;
import RealiseMe.com.xpath_locators.JobsPageLocators;
import RealiseMe.com.xpath_locators.otherSites.PlayMarketPageLocators;
import cucumber.api.java.en.Then;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;


public class PlayMarketPageSteps extends ScenarioSteps {

    private CorePageObjects core;

    @Then("^Play market website is opened$")
    public void playMarketWebsiteIsOpened() {
        String xpath = PlayMarketPageLocators.XPATH_PLAY_MARKET_PAGE;
        Assert.assertTrue("Play Market website is not opened by xpath: " + xpath,
                core.elementByXpathIsVisible(xpath));
    }

    @Then("^Play market website > RealiseMe app on the page$")
    public void playMarketWebsiteRealiseMeAppOnThePage() {
        String xpath = PlayMarketPageLocators.XPATH_REALISE_ME_ON_PLAY_MARKET_PAGE;
        Assert.assertTrue("RealiseMe app is not shown on the page by xpath: " + xpath,
                core.elementByXpathIsVisible(xpath));
    }
}