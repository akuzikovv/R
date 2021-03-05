package RealiseMe.com.steps.informationPage;


import RealiseMe.com.pages.CorePageObjects;
import RealiseMe.com.xpath_locators.informationPages.WorksWithUsPageLocators;
import cucumber.api.java.en.Then;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;


public class WorksWithUsPageSteps extends ScenarioSteps {

    private CorePageObjects core;

    @Then("^Landing page > Work with us page is opened$")
    public void landingPageWorkWithUsPageIsOpened() {
        String xpath = WorksWithUsPageLocators.XPATH_WORK_WITH_US_PAGE;
        Assert.assertTrue("Works with us page is not opened by xpath: " + xpath,
                core.elementByXpathIsVisible(xpath));
    }
}