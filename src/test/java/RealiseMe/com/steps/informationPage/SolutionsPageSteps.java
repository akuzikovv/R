package RealiseMe.com.steps.informationPage;


import RealiseMe.com.pages.CorePageObjects;
import RealiseMe.com.xpath_locators.informationPages.SolutionsPageLocators;
import cucumber.api.java.en.Then;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;


public class SolutionsPageSteps extends ScenarioSteps {

    private CorePageObjects core;

    @Then("^Landing page > Solutions page is opened$")
    public void landingPageSolutionsPageIsOpened() {
        String xpath = SolutionsPageLocators.XPATH_SOLUTIONS_PAGE;
        Assert.assertTrue("Solutions page is not opened by xpath: " + xpath,
                core.elementByXpathIsVisible(xpath));
    }
}