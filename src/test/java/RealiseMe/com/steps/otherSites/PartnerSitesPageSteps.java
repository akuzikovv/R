package RealiseMe.com.steps.otherSites;


import RealiseMe.com.pages.CorePageObjects;
import RealiseMe.com.xpath_locators.otherSites.PartnerSitesPageLocators;
import RealiseMe.com.xpath_locators.otherSites.PlayMarketPageLocators;
import cucumber.api.java.en.Then;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;


public class PartnerSitesPageSteps extends ScenarioSteps {

    private CorePageObjects core;

    @Then("^Success for All – Evidence-based school improvement strategy website is opened$")
    public void successForAllEvidenceBasedSchoolImprovementStrategyWebsiteIsOpened() {
        String xpath = PartnerSitesPageLocators.XPATH_SUCCESSFORALL_SITE;
        Assert.assertTrue("Success for All – Evidence-based school improvement strategy website is opened by xpath: " + xpath,
                core.elementByXpathIsVisible(xpath));
    }

    @Then("^Home - South West Essex Community Education Trust website is opened$")
    public void homeSouthWestEssexCommunityEducationTrustWebsiteIsOpened() {
        String xpath = PartnerSitesPageLocators.XPATH_SOUTH_WEST_ESSEX_SITE;
        Assert.assertTrue("Home - South West Essex Community Education Trust website is not opened by xpath: " + xpath,
                core.elementByXpathIsVisible(xpath));
    }

    @Then("^Marshalls Park Academy website is opened$")
    public void marshallsParkAcademyWebsiteIsOpened() {
        String xpath = PartnerSitesPageLocators.XPATH_MARSHALLS_PARK_ACADEMY_SITE;
        Assert.assertTrue("Marshalls Park Academy website is not opened by xpath: " + xpath,
                core.elementByXpathIsVisible(xpath));
    }

    @Then("^EdTech Digest | Who's who and what's next in edtech website is opened$")
    public void edtechDigestWhoSWhoAndWhatSNextInEdtechWebsiteIsOpened() {
        String xpath = PartnerSitesPageLocators.XPATH_EDTECH_DIQEST_SITE;
        Assert.assertTrue("EdTech Digest | Who's who and what's next in edtech website is not opened by xpath: " + xpath,
                core.elementByXpathIsVisible(xpath));
    }

    @Then("^Education Consulting | United Kingdom | CJK Associates Ltd website is opened$")
    public void educationConsultingUnitedKingdomCJKAssociatesLtdWebsiteIsOpened() {
        String xpath = PartnerSitesPageLocators.XPATH_CJK_ASSOCIATES_SITE;
        Assert.assertTrue("Education Consulting | United Kingdom | CJK Associates Ltd website is not opened by xpath: " + xpath,
                core.elementByXpathIsVisible(xpath));
    }

    @Then("^HR Services for schools website is opened$")
    public void hrServicesForSchoolsWebsiteIsOpened() {
        String xpath = PartnerSitesPageLocators.XPATH_CAPACITY_SITE;
        Assert.assertTrue("HR Services for schools website is not opened by xpath: " + xpath,
                core.elementByXpathIsVisible(xpath));
    }

    @Then("^EvolveTrust website is opened$")
    public void evolvetrustWebsiteIsOpened() {
        String xpath = PartnerSitesPageLocators.XPATH_EVOLVE_TRUST_SITE;
        Assert.assertTrue("EvolveTrust website is not opened by xpath: " + xpath,
                core.elementByXpathIsVisible(xpath));
    }

    @Then("^Academies Enterprise trust website is opened$")
    public void academiesEnterpriseTrustWebsiteIsOpened() {
        String xpath = PartnerSitesPageLocators.XPATH_ACADEMIES_ENTERPRISE_TRUST_SITE;
        Assert.assertTrue("Academies Enterprise trust website is not opened by xpath: " + xpath,
                core.elementByXpathIsVisible(xpath));
    }

    @Then("^educate\\.london - educate Resources and Information\\. website is opened$")
    public void educateLondonEducateResourcesAndInformationWebsiteIsOpened() {
        String xpath = PartnerSitesPageLocators.XPATH_EDUCATE_LONDON_SITE;
        Assert.assertTrue("Educate London website is not opened by xpath: " + xpath,
                core.elementByXpathIsVisible(xpath));
    }

    @Then("^BESA website is opened$")
    public void besaWebsiteIsOpened() {
        String xpath = PartnerSitesPageLocators.XPATH_BESA_SITE;
        Assert.assertTrue("Besa website is not opened by xpath: " + xpath,
                core.elementByXpathIsVisible(xpath));
    }

    @Then("^RDLC website is opened$")
    public void rdlcWebsiteIsOpened() {
        String xpath = PartnerSitesPageLocators.XPATH_RDLC_SITE;
        Assert.assertTrue("RDLC website is not opened by xpath: " + xpath,
                core.elementByXpathIsVisible(xpath));
    }

    @Then("^AWS EdStart | EdTech Startup Accelerator website is opened$")
    public void awsEdStartEdTechStartupAcceleratorWebsiteIsOpened() {
        String xpath = PartnerSitesPageLocators.XPATH_AWS_SITE;
        Assert.assertTrue("AWS website is not opened by xpath: " + xpath,
                core.elementByXpathIsVisible(xpath));
    }
}