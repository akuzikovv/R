package RealiseMe.com.steps.informationPage;


import RealiseMe.com.pages.CorePageObjects;
import RealiseMe.com.xpath_locators.informationPages.BlogPageLocators;
import cucumber.api.java.en.Then;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;


public class BlogPageSteps extends ScenarioSteps {

    private CorePageObjects core;

    @Then("^Landing page > Blog page is opened$")
    public void landingPageBlogPageIsOpened() {
        String xpath = BlogPageLocators.XPATH_BLOG_PAGE;
        Assert.assertTrue("Blog page is not opened by xpath: " + xpath,
                core.elementByXpathIsVisible(xpath));
    }
}