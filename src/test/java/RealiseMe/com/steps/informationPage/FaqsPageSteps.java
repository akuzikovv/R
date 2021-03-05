package RealiseMe.com.steps.informationPage;


import RealiseMe.com.pages.CorePageObjects;
import RealiseMe.com.xpath_locators.informationPages.FaqsPageLocators;
import cucumber.api.java.en.Then;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;


public class FaqsPageSteps extends ScenarioSteps {

    private CorePageObjects core;

    @Then("^FAQs page is opened$")
    public void faqsPageIsOpened() {
        String xpath = FaqsPageLocators.XPATH_FAQS_PAGE;
        Assert.assertTrue("FAQs page is not opened by xpath: " + xpath,
                core.elementByXpathIsVisible(xpath));
    }
}