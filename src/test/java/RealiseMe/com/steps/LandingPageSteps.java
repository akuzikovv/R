package RealiseMe.com.steps;


import RealiseMe.com.pages.CorePageObjects;
import RealiseMe.com.xpath_locators.LandingPageLocators;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;


public class LandingPageSteps extends ScenarioSteps {

    private CorePageObjects core;

    @Then("^Landing page > Agree button is shown$")
    public void landingPageAgreeButtonIsShown() {
        String xpath = LandingPageLocators.XPATH_AGREE_BUTTON;
        Assert.assertTrue("Agree button is not shown by xpath: " + xpath,
                core.elementByXpathIsVisible(xpath));
    }

    @And("^Landing page > Click on the Agree button$")
    public void landingPageClickOnTheAgreeButton() {
        core.clickOnElementByXpath(LandingPageLocators.XPATH_AGREE_BUTTON);
    }

    @Then("^Landing page > Header > The \"([^\"]*)\" link is shown$")
    public void landingPageHeaderTheLinkIsShown(String links) {
        String xpath = LandingPageLocators.XPATH_LINKS_IN_THE_HEADER.replace("$1", links);
        Assert.assertTrue("Media file is not shown by xpath: " + xpath,
                core.elementByXpathIsVisible(xpath));
    }

    @And("^Landing page > Click on the \"([^\"]*)\" link$")
    public void landingPageClickOnTheLink(String link) {
        core.clickOnElementByXpath(LandingPageLocators.XPATH_LINKS_IN_THE_HEADER.replace("$1", link));
    }

    @Then("^Landing page > \"([^\"]*)\" menu is shown$")
    public void landingPageMenuIsShown(String menu) {
        String xpath = LandingPageLocators.XPATH_DROP_DOWN_MENU.replace("$1", menu);
        Assert.assertTrue("Menu is not shown by xpath: " + xpath,
                core.elementByXpathIsVisible(xpath));
    }

    @And("^Landing page > Our mission menu > Click on the \"([^\"]*)\" link$")
    public void landingPageOurMissionMenuClickOnTheLink(String link) {
        core.clickOnElementByXpath(LandingPageLocators.XPATH_DROP_DOWN_MENU_LINKS.replace("$1", link));
    }

    @And("^Landing page > Community menu > Click on the \"([^\"]*)\" link$")
    public void landingPageCommunityMenuClickOnTheLink(String link) {
        core.clickOnElementByXpath(LandingPageLocators.XPATH_DROP_DOWN_MENU_LINKS.replace("$1", link));
    }

    @And("^Landing page > Mouse move to the \"([^\"]*)\" link$")
    public void landingPageMouseMoveToTheLink(String link) {
        core.moveToElement(LandingPageLocators.XPATH_LINKS_IN_THE_HEADER.replace("$1", link));
    }

    @Then("^Landing page > Partner \"([^\"]*)\" link is shown$")
    public void landingPagePartnerLinkIsShown(String partnerLink) {
        String xpath = LandingPageLocators.XPATH_PARTNER_LINKS.replace("$1", partnerLink);
        Assert.assertTrue("Partner link is not shown by xpath: " + xpath,
                core.elementByXpathIsVisible(xpath));
    }

    @And("^Landing page > Click on the partner \"([^\"]*)\" link$")
    public void landingPageClickOnThePartnerLink(String link) {
        core.clickOnElementByXpath(LandingPageLocators.XPATH_PARTNER_LINKS.replace("$1", link));
    }

    @And("^Landing page > Click on the Play market link$")
    public void landingPageClickOnThePlayMarketLink() {
        core.clickOnElementByXpath(LandingPageLocators.XPATH_PLAY_MARKET_LINK);
    }

    @And("^Landing page > Click on the App store link$")
    public void landingPageClickOnTheAppStoreLink() {
        core.clickOnElementByXpath(LandingPageLocators.XPATH_APP_STORE_LINK);
    }

    @And("^Landing page > Footer > Click on the \"([^\"]*)\" link$")
    public void landingPageFooterClickOnTheLink(String buttonInFooter) {
        core.clickOnElementByXpath(LandingPageLocators.XPATH_BUTTONS_IN_FOOTER.replace("$1", buttonInFooter));
    }

    @And("^Landing page > Second part > Click on the \"([^\"]*)\" link$")
    public void landingPageSecondPartClickOnTheLink(String nameButton) {
        core.clickOnElementByXpath(LandingPageLocators.XPATH_LINKS_IN_SECOND_PART.replace("$1", nameButton));
    }

    @Then("^Landing page > Agree button is not shown$")
    public void landingPageAgreeButtonIsNotShown() {
        String xpath = LandingPageLocators.XPATH_AGREE_BUTTON;
        Assert.assertTrue("Agree button is shown by xpath: " + xpath,
                core.elementByXpathIsInvisible(xpath));
    }
}