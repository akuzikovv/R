package RealiseMe.com.steps.serenity;

import RealiseMe.com.ILocators;
import RealiseMe.com.pages.Agency.AgencyAccountPage;
import RealiseMe.com.pages.Agency.AgencyBookingPage;
import RealiseMe.com.pages.AuthorizationPage;
import RealiseMe.com.pages.CommonActions.CommonActions;
import RealiseMe.com.pages.Header.Header;
import RealiseMe.com.pages.HomePage;
import RealiseMe.com.pages.LandingPage;
import RealiseMe.com.pages.LoginPage;
import RealiseMe.com.pages.School.SchoolAccountPage;
import RealiseMe.com.pages.School.SchoolBookingsPage;
import RealiseMe.com.pages.School.SchoolHomePage;
import RealiseMe.com.pages.School.SchoolJobsPage;
import RealiseMe.com.pages.Teacher.OtherTeacherHomePage;
import RealiseMe.com.pages.Teacher.SupplyTeacherHomePage;
import RealiseMe.com.pages.Teacher.TeacherProfilePage;
import RealiseMe.com.pages.Teacher.TeacherTimesheetsPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
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
    CommonActions commonActions;
    SchoolBookingsPage schoolBookingsPage;
    AgencyBookingPage agencyBookingPage;
    SchoolAccountPage schoolAccountPage;
    TeacherProfilePage teacherProfilePage;
    AgencyAccountPage agencyAccountPage;
    TeacherTimesheetsPage teacherTimesheetsPage;

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
        getDriver().manage().window();
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
        header.clickOnTheButtonInTheHeader(arg0);
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
    public void clickOnTheTab(String arg0) {
        commonActions.clickOnTheTab(arg0);
    }


    @Step
    public void draftTabIsOpenedWithAllNecessaryElements(List<String> list) {
        ArrayList<String> results = schoolJobsPage.draftTabIsOpenedWithAllNecessaryElements(list);
        Assert.assertTrue("Draft tab is wrong"+ results, "true".equals(results.get(0)));
    }

    @Step
    public void clickOnTheButton(String arg0) {
        commonActions.clickOnTheButton(arg0);
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
        ArrayList<String> results =  schoolJobsPage.warningMessagesAreAppeared(list);
        Assert.assertTrue("Create jpb page is wrong"+ results, "true".equals(results.get(0)));

    }

    @Step
    public void clickOnTheSignSchool_Landing_Button(String arg0) {
        ArrayList<String> results =  landingPage.clickOnTheSignSchool_Landing_Button(arg0);
        Assert.assertTrue("Button is absent Or"+ results,"true".equals(results.get(0)));

    }

    @Step
    public void clickOnTheAgreeButtonAtTheBanner() {
        landingPage.clickOnTheAgreeButtonAtTheBanner();
    }

    @Step
    public void bookingsPageContainsAllNecessaryElements(List<String>list) {
        ArrayList<String> results = schoolJobsPage.jobsPageContainsAllNecessaryElements(list);
        Assert.assertTrue("Jobs page is wrong"+ results, "true".equals(results.get(0)));
    }

    @Step
    public void newSupplyBookingPageContainsAllNecessaryText(List<String> list) {
        ArrayList<String> results = schoolBookingsPage.newSupplyBookingPageContainsAllNecessaryText(list);
        Assert.assertTrue("Create booking page is wrong"+ results, "true".equals(results.get(0)));
    }

    @Step
    public void theFieldIsHighlightedRed(String arg0) {
        Assert.assertTrue(arg0 + " "+"Field isn't highlighted red", commonActions.theFieldIsHighlightedRed(arg0));
    }

    @Step
    public void enterTextToTheNameYourJobPostingField(String arg0) {
        schoolBookingsPage.enterTextToTheNameYourJobPostingField(arg0);
    }

    @Step
    public void enterTextToTheDescribeTheJobField(String arg0) {
        schoolBookingsPage.enterTextToTheDescribeTheJobField(arg0);
    }

    @Step
    public void chooseCheckbox(String arg0) {
        commonActions.chooseCheckbox(arg0);
    }

    @Step
    public void chooseFullDayInTheMonthOfAvailableCalendar(String arg0, String arg1) {
        schoolBookingsPage.chooseFullDayInTheMonthOfAvailableCalendar(arg0,arg1);
    }

    @Step
    public void chooseHalfDayInTheMonthOfAvailableCalendar(String arg0, String arg1) {
        schoolBookingsPage.chooseHalfDayInTheMonthOfAvailableCalendar(arg0,arg1);
    }

    @Step
    public void chooseFullDayStartTime(String arg0) {
        schoolBookingsPage.chooseFullDayStartTime(arg0);
    }

    @Step
    public void chooseFullDayEndTime(String arg0) {
        schoolBookingsPage.chooseFullDayEndTime(arg0);
    }

    @Step
    public void chooseHalfDayStartTime(String arg0) {
        schoolBookingsPage.chooseHalfDayStartTime(arg0);
    }

    @Step
    public void chooseHalfDayEndTime(String arg0) {
        schoolBookingsPage.chooseHalfDayEndTime(arg0);
    }

    @Step
    public void enterRate(String arg0) {
        schoolBookingsPage.enterRate(arg0);
    }

    @Step
    public void closePopup() {
        commonActions.closePopup();
    }

    @Step
    public void waitTime() {
        waitABit(7000);
    }
    @Step
    public void getNamesOfTeachers() {
        commonActions.getNamesOfTeachers();
    }

    @Step
    public void appropriateTeachersAreDisplayedInTheInvitesList() {
        ArrayList<String> results = commonActions.appropriateTeachersAreDisplayedInTheInvitesList();
        Assert.assertTrue("Teacher aren't invited" + results, "true".equals(results.get(0)));
    }

    @Step
    public void checkUnclearedPopup(String arg0) {
        ArrayList<String> results = schoolBookingsPage.checkUnclearedPopup(arg0);
        Assert.assertTrue("Popup is incorrect" + results, "true".equals(results.get(0)));
    }

    @Step
    public void getStatusesOfTeachers() {
        commonActions.getStatusOfTeachers();
    }

    @Step
    public void clickOnTheButtonAtTheTeacherWithStatus(String arg0) {
        schoolBookingsPage.clickOnTheButtonAtTheTeacherWithStatus(arg0);
    }

    @Step
    public void checkPengingPopup(String arg0) {
        ArrayList<String> results = schoolBookingsPage.checkPengingPopup(arg0);
        Assert.assertTrue("Popup is incorrect" + results, "true".equals(results.get(0)));
    }

    @Step
    public void theOKButtonIsnTClickable() {
        Assert.assertTrue("Field isn't highlighted red", schoolBookingsPage.theOKButtonIsnTClickable());

    }

    @Step
    public void checkPopupsDependingOfTeacherSStatus() {
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "false");
        if (commonActions.getStatusOfTeachers().get(0).equals("uncleared")||
                commonActions.getStatusOfTeachers().get(1).equals("uncleared")||
                commonActions.getStatusOfTeachers().get(2).equals("uncleared")){
           checkUnclearedPopup((ILocators.Uncleared_popup_text).toString());
            closePopup();
            results.set(0, "true");
        }
        if (commonActions.getStatusOfTeachers().get(0).equals("pending")||
                commonActions.getStatusOfTeachers().get(1).equals("pending")||
                commonActions.getStatusOfTeachers().get(2).equals("pending")){
            clickOnTheButton("SEND");
            checkPengingPopup((ILocators.Pending_popup_text).toString());
            chooseCheckbox("Agree to waiver and continue");
            clickOnTheButton("Ok");
            results.set(0, "true");
        }
        else {
            clickOnTheButton("SEND");
            results.set(0, "true");
        }
        Assert.assertTrue("Popups are incorrect" + results, "true".equals(results.get(0)));
    }

    @Step
    public void clickOnTheButtonAtTheTeacherWithName(String arg0) {
        schoolBookingsPage.clickOnTheButtonAtTheTeacherWithName(arg0);
    }

    @Step
    public void findInviteWithJobTitle(String arg0) {
        commonActions.findInviteWithJobTitle(arg0);
        waitABit(5000);
    }

    @Step
    public void clickOnTheButtonOfTheAppropriateBooking(String arg0) throws IOException, ParseException {
        commonActions.clickOnTheButtonOfTheAppropriateBooking(arg0);
    }

    @Step
    public void fillRequiredFields(List<String> list) {
        agencyBookingPage.fillRequiredFields(list);
    }

    @Step
    public void uploadFile(String arg0) {
        commonActions.uploadFile(arg0);
    }

    @Step
    public void choosePolicyCheckbox(String arg0) {
        agencyBookingPage.choosePolicyCheckbox();
    }

    @Step
    public void approveAcceptedInviteWithName(String arg0) throws IOException, ParseException {
        schoolBookingsPage.approveAcceptedInviteWithName(arg0);
    }

    @Step
    public void approveAppropriateBooking() {
        schoolBookingsPage.approveAppropriateBooking();
    }

    @Step
    public void enteredTeacherNameIsDisplayed(String arg0) {
        ArrayList<String> results = schoolBookingsPage.enteredTeacherNameIsDisplayed(arg0);
        Assert.assertTrue(String.valueOf(results), "true".equals(results.get(0)));

    }

    @Step
    public void attachedFileIsDisplayed(String arg0) {
        ArrayList<String> results = schoolBookingsPage.attachedFileIsDisplayed(arg0);
        Assert.assertTrue(String.valueOf(results), "true".equals(results.get(0)));
    }

    @Step
    public void theRateIsDisplayed(String arg0) {
        ArrayList<String> results = schoolBookingsPage.theRateIsDisplayed(arg0);
        Assert.assertTrue(String.valueOf(results), "true".equals(results.get(0)));
    }

    @Step
    public void declineAppropriateBooking() {
        schoolBookingsPage.declineAppropriateBooking();
    }

    @Step
    public void popupWithTextIsAppeared(String arg0) {
        ArrayList<String> results = schoolBookingsPage.popupWithTextIsAppeared(arg0);
        Assert.assertTrue(String.valueOf(results), "true".equals(results.get(0)));
    }

    @Step
    public void enterLoginOfNewUser(String arg0) {
        commonActions.enterLoginOfNewUser(arg0);
    }

    @Step
    public void theMessageAfterSignUpIsDisplayed(String arg0) {
        Assert.assertTrue(getDriver().findElement(By.xpath("//span[contains(.,'Thanks for signing up')]")).getText(), arg0.equals(getDriver().findElement(By.xpath("//span[contains(.,'Thanks for signing up')]")).getText()));
    }

    @Step
    public void clickOnTheSIGNUPButton() {
       authorizationPage.clickOnTheSIGNUPButton();

    }

    @Step
    public void refreshThePage() {
        commonActions.refreshThePage();
    }

    @Step
    public void enterLoginOfNewCreatedUser() {
        commonActions.enterLoginOfNewCreatedUser();
    }

    @Step
    public void theMessageBeforeEmailVERIFICATIONIsDisplayed(String arg0) {
        ArrayList<String> results = authorizationPage.theMessageBeforeEmailVERIFICATIONIsDisplayed(arg0);
        Assert.assertTrue(String.valueOf(results), "true".equals(results.get(0)));
//        Assert.assertTrue(getDriver().findElement(By.xpath("//span[@class='animated fadeInUp']//span")).getText(), arg0.equals(getDriver().findElement(By.xpath("//span[@class='animated fadeInUp']//span")).getText()));
    }

    @Step
    public void openInTheNewTab(String arg0) {
        commonActions.openInTheNewTab(arg0);
    }

    @Step
    public void enterEmailOfNewUser() {
        commonActions.enterEmailOfNewUser();
    }

    @Step
    public void backToTheFirstTab() {
        commonActions.backToTheFirstTab();
    }

    @Step
    public void deleteAccount(String arg0) throws IOException, ParseException {
        String results =  commonActions.deleteAccount(arg0);;
        Assert.assertTrue(String.valueOf(results), "true".equals(results));

    }

    @Step
    public void clickOnTheSignUpButton() {
        commonActions.clickOnTheSignUpButton();
    }

    @Step
    public void schoolAccountPageContainsNecessaryElements(List<String> list) {
        ArrayList<String> results = schoolAccountPage.schoolAccountPageContainsNecessaryElements(list);
        Assert.assertTrue("Account page is wrong"+ results, "true".equals(results.get(0)));
    }

    @Step
    public void adminDetailsPageIsOpened(List<String> list) {
        ArrayList<String> results = schoolAccountPage.adminDetailsPageIsOpened(list);
        Assert.assertTrue("Account page is wrong"+ results, "true".equals(results.get(0)));
    }

    @Step
    public void theButtonIsDisabled(String arg0) {
        Assert.assertTrue("The \""+arg0+"\"Button isn't disabled", getDriver().findElement(By.xpath("//button[contains(.,'"+arg0+"')]")).getAttribute("disabled").equals("true"));
    }

    @Step
    public void theProfilingQuestionsPageContainsNecessaryElements(List<String> list, String arg0) {
        ArrayList<String> results = commonActions.theProfilingQuestionsPageContainsNecessaryElements(list, arg0);
        Assert.assertTrue("Profiling Questions page is wrong"+ results, "true".equals(results.get(0)));
    }

    @Step
    public void warningPopupIsOpenedWithNextText(String arg0) {
        Assert.assertTrue("Popup is wrong", arg0.equals(getDriver().findElement(By.xpath("(//p[contains(.,'Please')])[3]")).getText()));
    }

    @Step
    public void teacherAccountPageContainsNecessaryElements(List<String> list) {
        ArrayList<String> results = teacherProfilePage.teacherAccountPageContainsNecessaryElements(list);
        Assert.assertTrue("Profiling Questions page is wrong"+ results, "true".equals(results.get(0)));
    }

    @Step
    public void agencyAccountPageContainsNecessaryElements(List<String> list) {
        ArrayList<String> results = agencyAccountPage.agencyAccountPageContainsNecessaryElements(list);
        Assert.assertTrue("Profiling Questions page is wrong"+ results, "true".equals(results.get(0)));
    }

    @Step
    public void getBookingID() throws IOException, ParseException {
        commonActions.getBookingID();
    }

    @Step
    public void openBookingSection() {
        schoolBookingsPage.openBookingSection();
    }

    @Step
    public void declineAcceptedInviteWithName(String arg0) throws IOException, ParseException {
        schoolBookingsPage.declineAcceptedInviteWithName(arg0);
    }

    @Step
    public void findAcceptedInviteByBookingID(String arg0) throws IOException, ParseException {
        schoolBookingsPage.findAcceptedInviteByBookingID(arg0);
    }

    @Step
    public void createBookingUsingRequestAPI(List<String> list) throws IOException, ParseException {
        commonActions.createBookingUsingRequestAPI(list);
    }

    @Step
    public void acceptBookingAsClearedTeacherUsingRequestAPI(List<String> list) throws IOException, ParseException {
        commonActions.acceptBookingAsClearedTeacherUsingRequestAPI(list);
    }

    @Step
    public void approveBookingAsSchoolUsingRequestAPI(List<String> list) throws IOException, ParseException {
        commonActions.approveBookingAsSchoolUsingRequestAPI(list);
    }

    @Step
    public void appropriateBookingIdIsDisplayed() {
        ArrayList<String> results =  teacherTimesheetsPage.appropriateBookingIdIsDisplayed();
        Assert.assertTrue("Booking id is wrong"+ results, "true".equals(results.get(0)));

    }

    @Step
    public void theRateIsDisplayedAtTheTimesheetPage(String arg0) {
        ArrayList<String> results =  teacherTimesheetsPage.theRateIsDisplayedAtTheTimesheetPage(arg0);
        Assert.assertTrue("Rate is wrong"+ results, "true".equals(results.get(0)));
    }

    @Step
    public void totalRateIsRightCalculated() {
        ArrayList<String> results =  teacherTimesheetsPage.totalRateIsRightCalculated();
        Assert.assertTrue("Total rate is wrong"+ results, "true".equals(results.get(0)));
    }

    @Step
    public void acceptTimesheet() {
        teacherTimesheetsPage.acceptTimesheet();
    }

    @Step
    public void currentSubmissionDateIsAppeared() {
        ArrayList<String> results =  teacherTimesheetsPage.currentSubmissionDateIsAppeared();
        Assert.assertTrue("Total rate is wrong"+ results, "true".equals(results.get(0)));
    }


//    @Step
//    public void openReport() {
//        getDriver().manage().window().maximize();
//        getDriver().get("file:///home/akuzikov/IdeaProjects/RealiseMecom/target/site/serenity/index.html");
//
//    }
}