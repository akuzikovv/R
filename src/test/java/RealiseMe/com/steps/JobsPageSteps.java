package RealiseMe.com.steps;


import RealiseMe.com.pages.CorePageObjects;
import RealiseMe.com.xpath_locators.JobsPageLocators;
import cucumber.api.java.en.Then;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;


public class JobsPageSteps extends ScenarioSteps {

    private CorePageObjects core;

    @Then("^Jobs page is opened$")
    public void jobsPageIsOpened() {
        String xpath = JobsPageLocators.XPATH_JOBS_PAGE;
        Assert.assertTrue("Jobs page is not opened by xpath: " + xpath,
                core.elementByXpathIsVisible(xpath));
    }
}