package RealiseMe.com.pages;


import RealiseMe.com.pages.utils.DataHelper;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.steps.ScenarioSteps;


public class BrowserSteps extends ScenarioSteps {

    private CorePageObjects core;

    @When("^Open chat$")
    public void openPortal() {
        core.goToURL(DataHelper.URL);
    }

    @When("^Open a new tab of browser$")
    public void openANewTabOfBrowser() throws Throwable {
        core.openNewTab();
    }

    @When("^Switch to first tab$")
    public void switchToFirstTab() {
        core.switchToTab(1);
    }

    @When("^Switch to second tab$")
    public void switchToSecondTab() {
        core.switchToTab(2);
    }

    @When("^Switch to third tab$")
    public void switchToThirdTab() {
        core.switchToTab(3);
    }

    @When("^Wait (\\d+) seconds$")
    public void waitSeconds(int sec) {
        core.waitSec(sec);
    }

    @When("^Scroll up the page to the top$")
    public void scrollUpThePageToTheTop() {
        core.scrollUpThePageToTheTop();
    }

    @Given("^Reload page$")
    public void reloadPage() {
        core.reloadPage();
    }

    @When("^Click on browser's Back button$")
    public void clickOnBrowserSBackButton() {
        core.clickOnBrowserSBackButton();
    }

}
