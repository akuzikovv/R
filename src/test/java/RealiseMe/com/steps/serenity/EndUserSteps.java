package RealiseMe.com.steps.serenity;

import RealiseMe.com.pages.Header.Header;
import RealiseMe.com.pages.*;
import RealiseMe.com.pages.School.SchoolHomePage;
import RealiseMe.com.pages.School.SchoolJobsPage;
import RealiseMe.com.pages.Teacher.OtherTeacherHomePage;
import RealiseMe.com.pages.Teacher.SupplyTeacherHomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class EndUserSteps  extends ScenarioSteps {

    Header header;
    LoginPage loginPage;
    AuthorizationPage authorizationPage;
    HomePage HomePage;
    SupplyTeacherHomePage supplyTeacherHomePage;
    OtherTeacherHomePage otherTeacherHomePage;
    SchoolHomePage schoolHomePage;
    LandingPage landingPage;
    SchoolJobsPage schoolJobsPage;


    @Step
    public void openLoginPage() {
        String os = System.getProperty("os.name").toLowerCase();
        WebDriver driver = new ChromeDriver();
        if (os.contains("mac")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
            driver.manage().window().maximize();
        } else {
            getDriver().manage().window().maximize();
            loginPage.open();
        }
    }

    @Step
    public void landingPageHeaderContainsTextbuttons(List<String> list) {
        ArrayList<String> results = header.landingPageHeaderContainsTextbuttons(list);
        Assert.assertTrue("Header is wrong"+ results, "true".equals(results.get(0)));
    }

    @Step
    public void headerContainsTextbuttons(List<String> list) {
        ArrayList<String> results = header.headerContainsTextbuttons(list);
        Assert.assertTrue("Header is wrong"+ results, "true".equals(results.get(0)));
    }

    @Step
    public void loginPageContainsPictures() {
        Assert.assertTrue("Pictures are absent" ,loginPage.loginPageContainsPictures());
    }

    @Step
    public void loginPageContains1(List<String> list) {
        ArrayList<String> results = loginPage.loginPageContains(list);
        Assert.assertTrue("Text is wrong"+ results, "true".equals(results.get(0)));
    }

    @Step
    public void authorizationPageContainsNecessaryElements(List<String> list) {
        ArrayList<String> results = authorizationPage.authorizationPageContainsNecessaryElements(list);
        Assert.assertTrue("Text is wrong"+ results, "true".equals(results.get(0)));
    }

    @Step
    public void clickOnTheSignInTeacherButton() {
        loginPage.clickOnTheSignInTeacherButton();
    }

    @Step
    public void clickOnTheSignInSchoolButton() {
        loginPage.clickOnTheSignInSchoolButton();
    }

    @Step
    public void enterLogin(String arg0) {
        authorizationPage.enterLogin(arg0);
    }

    @Step
    public void enterPassword(String arg0) {
        authorizationPage.enterPassword(arg0);
    }

    @Step
    public void clickOnTheLogInButton() {
        authorizationPage.clickOnTheLogInButton();
    }

    @Step
    public void headerContainsBellIcon() {
        Assert.assertTrue("Bell icon is absent",header.headerContainsBellIcon());
    }

    @Step
    public void headerContainsUserPhotoIcon() {
        Assert.assertTrue("User Photo Icon is absent",header.headerContainsUserPhotoIcon());
    }
    @Step
    public void headerContainsUserName(String arg0) {
        String results = header.headerContainsUserName(arg0);
        Assert.assertTrue("Name is wrong. "+ results, "true".equals(results));
    }
    @Step
    public void headerContainsArrowDownButton() {
        Assert.assertTrue("Arrow Down Button is absent",header.headerContainsArrowDownButton());
    }
    @Step
    public void clickOnTheArrowDownButton() {
        Assert.assertTrue("Log out button is absent",header.clickOnTheArrowDownButton());
    }
    @Step
    public void userIsLogout() {
        Assert.assertTrue("User isn't logout" ,loginPage.loginPageContainsPictures());
    }

    @Step
    public void closeWindow() {
        getDriver().close();
    }

    @Step
    public void otherTeacherSLeftPanelContainsAllNecessaryElements(List<String> list) {
        ArrayList<String> results = otherTeacherHomePage.otherTeacherleftPanelContainsAllNecessaryElements(list);
        Assert.assertTrue("Left panel is wrong. "+ results, "true".equals(results.get(0)));
    }
    @Step
    public void supplyTeacherSLeftPanelContainsAllNecessaryElements(List<String> list) {
        ArrayList<String> results = supplyTeacherHomePage.supplyTeacherleftPanelContainsAllNecessaryElements(list);
        Assert.assertTrue("Left panel is wrong. "+ results, "true".equals(results.get(0)));
    }

    @Step
    public void clickOnTheLOGOUTButton() {
        header.clickOnTheLOGOUTButton();
    }

    @Step
    public void firstTableContainsTitle(String arg0) {
        ArrayList<String> results = HomePage.firstTableContainsTitle(arg0);
        Assert.assertTrue("Title is wrong. "+ results, "true".equals(results.get(0)));
    }

    @Step
    public void secondTableContainsTitle(String arg0) {
        ArrayList<String> results = HomePage.secondTableContainsTitle(arg0);
        Assert.assertTrue("Title is wrong. "+ results, "true".equals(results.get(0)));
    }

    @Step
    public void tableContainsViewAllButton(String arg0) {
        Assert.assertTrue("'"+arg0+"' button is absent", HomePage.tableContainsViewAllButton(arg0));
    }

    @Step
    public void teacherSupplyfirstTableContainsAllNecessaryColumns(List<String> list) {
        ArrayList<String> results = supplyTeacherHomePage.teacherSupplyfirstTableContainsAllNecessaryColumns(list);
        Assert.assertTrue("Table is wrong. "+ results, "true".equals(results.get(0)));
    }

    @Step
    public void teacherOtherfirstTableContainsAllNecessaryColumns(List<String> list) {
        ArrayList<String> results = otherTeacherHomePage.teacherOtherfirstTableContainsAllNecessaryColumns(list);
        Assert.assertTrue("Table is wrong. "+ results, "true".equals(results.get(0)));
    }

    @Step
    public void schoolfirstTableContainsAllNecessaryColumns(List<String> list) {
        ArrayList<String> results = schoolHomePage.schoolfirstTableContainsAllNecessaryColumns(list);
        Assert.assertTrue("Table is wrong. "+ results, "true".equals(results.get(0)));
    }

    @Step
    public void theFiveLinesInTheTableAreDisplayed() {
        Assert.assertTrue("Table contains less then 5 lines", HomePage.theFiveLinesInTheTableAreDisplayed());
    }

    @Step
    public void schoolLeftPanelContainsAllNecessaryElements(List<String> list) {
        ArrayList<String> results = schoolHomePage.schoolLeftPanelContainsAllNecessaryElements(list);
        Assert.assertTrue("Left panel is wrong. "+ results, "true".equals(results.get(0)));
    }

    @Step
    public void openLandingPage() {
        getDriver().manage().window().maximize();
        landingPage.open();

    }

    @Step
    public void enterToTheSearchField(String arg0) {
        landingPage.enterToTheSearchField(arg0);
    }

    @Step
    public void clickSearchButton() {
        landingPage.clickSearchButton();
    }

    @Step
    public void theIsDisplayedInTheSearchResult(String arg0) {
        ArrayList<String> results = landingPage.firstSearchResult(arg0);
        Assert.assertTrue("Job isn't found"+ results, "true".equals(results.get(0)));

    }

    @Step
    public void clickOnTheSaveButton() {
        landingPage.clickOnTheSaveButton();
    }

    @Step
    public void theButtonIsHighlighted(String arg0) {
        Assert.assertTrue("Button isn't highlighted as saved",landingPage.theButtonIsHighlighted(arg0));
    }

    @Step
    public void clickOnTheJobTitle() {
        landingPage.clickOnTheJobTitle();
    }


    @Step
    public void theJobPreviewPageIsOpenedWithNecessaryElements(List<String> list) {
        ArrayList<String> results = landingPage.theJobPreviewPageIsOpenedWithNecessaryElements(list);
        Assert.assertTrue("Preview page is wrong "+ results, "true".equals(results.get(0)));

    }

    @Step
    public void clickOnTheApplyButton() {
        landingPage.clickOnTheApplyButton();
    }



    @Step
    public void clickOnTheLoginButton() {
        landingPage.clickOnTheLoginButton();
    }



    @Step
    public void clickOnTheButtonInTheHeader(String arg0) {
        schoolJobsPage.clickOnTheButtonInTheHeader(arg0);
    }

    @Step
    public void jobsPageContainsAllNecessaryElements(List<String>list) {
        ArrayList<String> results = schoolJobsPage.jobsPageContainsAllNecessaryElements(list);
        Assert.assertTrue("Jobs page is wrong"+ results, "true".equals(results.get(0)));
    }

    @Step
    public void clickOnTheArchivedTab() {
        schoolJobsPage.clickOnTheArchivedTab();
    }

    @Step
    public void archivedTabIsOpenedWithAllNecessaryElements(List<String> list) {
        ArrayList<String> results = schoolJobsPage.archivedTabIsOpenedWithAllNecessaryElements(list);
        Assert.assertTrue("Archived tab is wrong"+ results, "true".equals(results.get(0)));
    }

    @Step
    public void clickOnTheDraftTab() {
        schoolJobsPage.clickOnTheDraftTab();
    }


    @Step
    public void draftTabIsOpenedWithAllNecessaryElements(List<String> list) {
        ArrayList<String> results = schoolJobsPage.draftTabIsOpenedWithAllNecessaryElements(list);
        Assert.assertTrue("Archived tab is wrong"+ results, "true".equals(results.get(0)));
    }

    @Step
    public void clickOnThePostNewJobButton(String arg0) {
        schoolJobsPage.clickOnThePostNewJobButton(arg0);
    }

    @Step
    public void postJobPageContainsAllNecessaryElements(List<String> list) {
        ArrayList<String> results = schoolJobsPage.postJobPageContainsAllNecessaryElements(list);
        Assert.assertTrue("Create jpb page is wrong"+ results, "true".equals(results.get(0)));
    }

    @Step
    public void clickOnThePostJobButton() {
        schoolJobsPage.clickOnThePostJobButton();
    }

    @Step
    public void warningMessagesAreAppeared(List<String> list) {
        ArrayList<String> results =  schoolJobsPage.warningMessagesAreAppeared(list);;
        Assert.assertTrue("Create jpb page is wrong"+ results, "true".equals(results.get(0)));

    }

    @Step
    public void clickOnTheSignSchool_Landing_Button(String arg0) {
        Assert.assertTrue("Button is absent",landingPage.clickOnTheSignSchool_Landing_Button(arg0));

    }

    @Step
    public void clickOnTheAgreeButtonAtTheBanner() {
        landingPage.clickOnTheAgreeButtonAtTheBanner();
    }

//    @Step
//    public void openReport() {
//        getDriver().manage().window().maximize();
//        getDriver().get("file:///home/akuzikov/IdeaProjects/RealiseMecom/target/site/serenity/index.html");
//
//    }
}