package RealiseMe.com.steps.old.serenity;

import RealiseMe.com.xpath_locators.old.ILocators;
import RealiseMe.com.pages.old.Agency.AgencyAccountPage;
import RealiseMe.com.pages.old.Agency.AgencyBookingPage;
import RealiseMe.com.pages.old.AuthorizationPage;
import RealiseMe.com.pages.old.CommonActions.CommonActions;
import RealiseMe.com.pages.old.Header.Header;
import RealiseMe.com.pages.old.HomePage;
import RealiseMe.com.pages.old.LandingPage;
import RealiseMe.com.pages.old.LoginPage;
import RealiseMe.com.pages.old.School.*;
import RealiseMe.com.pages.old.Teacher.*;
import net.serenitybdd.core.Serenity;
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
    SchoolTimesheetPage schoolTimesheetPage;
    TeacherJobsPage teacherJobsPage;

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
       // ArrayList<String> results =  authorizationPage.clickOnTheLogInButton();
      // Assert.assertTrue("User isn't logged in"+ results, "true".equals(results.get(0)));
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
        Assert.assertTrue("Arrow Down button is absent",header.clickOnTheArrowDownButton());
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
        ArrayList<String> results =  commonActions.warningMessagesAreAppeared(list);
        Assert.assertTrue("Warning messages aren't appeared"+ results, "true".equals(results.get(0)));

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

        ArrayList<String> results =  commonActions.chooseCheckbox(arg0);
        Assert.assertTrue("Checkbox isn't found"+ results, "true".equals(results.get(0)));
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
        waitABit(3000);
    }
    @Step
    public void getNamesOfTeachers() {
        commonActions.getNamesOfTeachers();
    }

    @Step
    public void appropriateTeachersAreDisplayedInTheInvitesList() {
        ArrayList<String> results = commonActions.appropriateTeachersAreDisplayedInTheInvitesList();
        Assert.assertTrue("Teacher isn't displayed" + results, "true".equals(results.get(0)));
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
//        waitABit(5000);
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
    public void popupWithTextIsAppeared(String arg0, List<String> list) {
        ArrayList<String> results = schoolBookingsPage.popupWithTextIsAppeared(arg0,list);
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
    public void enterLoginOfNewCreatedUser(String arg0) {
        commonActions.enterLoginOfNewCreatedUser(arg0);
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

        ArrayList<String> results =    schoolBookingsPage.findAcceptedInviteByBookingID(arg0);;
        Assert.assertTrue("Booking id is wrong"+ results, "true".equals(results.get(0)));
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
    public void totalRateForTeacherIsRightCalculated() {
        ArrayList<String> results =  teacherTimesheetsPage.totalRateForTeacherIsRightCalculated();
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

    @Step
    public void totalRateForSchoolIsRightCalculated() {
        ArrayList<String> results =  schoolTimesheetPage.totalRateForSchoolIsRightCalculated();
        Assert.assertTrue("Total rate is wrong"+ results, "true".equals(results.get(0)));
    }

    @Step
    public void teacherRateForSchoolIsRightCalculated() {
        ArrayList<String> results =  schoolTimesheetPage.teacherRateForSchoolIsRightCalculated();
        Assert.assertTrue("Total rate is wrong"+ results, "true".equals(results.get(0)));
    }

    @Step
    public void approveButtonIsDisabled() {
        Assert.assertTrue("Approve button isn't disabled", getDriver().findElement(By.xpath("//i[@class='icon-check icons disable']")).isDisplayed());
    }

    @Step
    public void declineTimesheet() {
        teacherTimesheetsPage.declineTimesheet();
    }

    @Step
    public void enterToTheTextFieldInThePopup(String arg0) {
        teacherTimesheetsPage.enterToTheTextFieldInThePopup(arg0);
    }

    @Step
    public void theStatusIsDisplayed(String arg0) {
        waitABit(1000);
        commonActions.waitUntilElementIsNotVisible("//textarea",60);
        Assert.assertTrue("Incorrect status is displayed: "+ getDriver().findElement(By.xpath("(//p[@class='status'])[2]")).getText(), arg0.equals(getDriver().findElement(By.xpath("(//p[@class='status'])[2]")).getText()));
    }

    @Step
    public void changeBookingStatusToCompleted(List<String> list) throws IOException, ParseException {
        commonActions.changeBookingStatusToCompleted(list);
    }

    @Step
    public void enterEmailOfAppropriateTeacher(String arg0) {
        commonActions.enterEmailOfAppropriateTeacher(arg0);
    }

    @Step
    public void chooseAppropriateEmailMessage(String arg0) {
        commonActions.chooseAppropriateEmailMessage(arg0);
    }

    @Step
    public void emailBodyContainsNecessaryText(String arg0) {
        String message = getDriver().findElement(By.xpath("((//tbody)[6]//tr)[4]")).getText()+getDriver().findElement(By.xpath("((//tbody)[6]//tr)[5]")).getText();
        Assert.assertTrue("Incorrect text is displayed. Expected: "+arg0+" But found:  "+ message,arg0.equals(message));
    }


    @Step
    public void removeAllUserBookingsUsingRequestAPI(List<String> list) throws IOException, ParseException {
        commonActions.removeAllUserBookingsUsingRequestAPI(list);
    }

    @Step
    public void fillAllNecessaryFields(List<String> list) {
        schoolJobsPage.fillAllNecessaryFields(list);
    }

    @Step
    public void enterTheClosingDate(String arg0) {
        schoolJobsPage.enterTheClosingDate(arg0);
    }

    @Step
    public void chooseRadiobutton(String arg0) {
        commonActions.chooseRadiobutton(arg0);
    }

    @Step
    public void theJobNameIsRightDisplayed() {
        commonActions.waitUntilElementVisible("//p[@class='specialty']",60);
        if (!getDriver().findElement(By.xpath("//p[@class='specialty']")).isDisplayed()){
            commonActions.refreshThePage();
            commonActions.waitUntilElementVisible("//p[@class='specialty']",60);
        }
        Assert.assertTrue("Incorrect job name is displayed. Expected: "+Serenity.getCurrentSession().getMetaData().get("job name")+" But found:  " +getDriver().findElement(By.xpath("//p[@class='specialty']")).getText(),getDriver().findElement(By.xpath("//p[@class='specialty']")).getText().equals(Serenity.getCurrentSession().getMetaData().get("job name")));
    }

    @Step
    public void theJobDescriptionIsRightDisplayed() {
        String job_description = getDriver().findElement(By.xpath("//div[@class='all-description']//p")).getText();
        Assert.assertTrue("Incorrect job description is displayed. Expected: "+Serenity.getCurrentSession().getMetaData().get("job description")+" But found:  " +job_description,job_description.equals(Serenity.getCurrentSession().getMetaData().get("job description")));

    }

    @Step
    public void currentPostedDateIsDisplayed() {
        ArrayList<String> results =  schoolJobsPage.currentPostedDateIsDisplayed();
        Assert.assertTrue("Posted date is wrong"+ results, "true".equals(results.get(0)));
    }

    @Step
    public void chooseSkills(List<String> list) {
        schoolJobsPage.chooseSkills(list);
    }

    @Step
    public void chosenSkillsAreDisplayed() {
        ArrayList<String> results =  schoolJobsPage.chosenSkillsAreDisplayed();
        Assert.assertTrue("Chosen Skills Aren't Displayed"+ results, "true".equals(results.get(0)));

    }

    @Step
    public void chosenClosedDateIsDisplayed() {
        ArrayList<String> results =  schoolJobsPage.chosenClosedDateIsDisplayed();
        Assert.assertTrue("Chosen closed date isn't displayed"+ results, "true".equals(results.get(0)));
//        getDriver().findElement(By.xpath("//p[@class='apply-by' and contains(.,'"+Serenity.getCurrentSession().getMetaData().get("Closed date")+"')]")).isDisplayed());
    }


    @Step
    public void contractTypeIsRightDisplayed(List<String> list) {
        Assert.assertTrue("Chosen Contract Type isn't displayed", list.get(0).equals(getDriver().findElement(By.xpath("(//p[contains(.,'Contract Type')]/..//p)[1]")).getText()));
    }

    @Step
    public void contractTermIsRightDisplayd(String arg0) {
            Assert.assertTrue("Chosen Contract Term isn't displayed", arg0.equals(getDriver().findElement(By.xpath("(//p[contains(.,'Contract Term')]/..//p)[7]")).getText()));
    }

    @Step
    public void salaryIsRightDisplayed() {
        Assert.assertTrue("Chosen Salary isn't displayed", Serenity.getCurrentSession().getMetaData().get("Salary").equals(getDriver().findElement(By.xpath("(//p[contains(.,'Salary')]/..//p)[1]")).getText()));
    }

    @Step
    public void theTextIsDisplayedAtTheVideoPrescreeningField(String arg0) {
        Assert.assertTrue("\""+arg0+"\" text isn't displayed", arg0.equals(getDriver().findElement(By.xpath("(//p[@class='essential-title'])[3]/..//p[@class='sub-title']")).getText()));
    }

    @Step
    public void enterJobTitleToTheSearchField() {
        landingPage.enterJobTitleToTheSearchField();
    }

    @Step
    public void appropriateJobIsDisplayedInTheSearchResult() {
        Assert.assertTrue("\""+Serenity.getCurrentSession().getMetaData().get("job name")+"\" job isn't displayed in the search result", getDriver().findElement(By.xpath("//div[@class='job-table__item desktop']//a[@class='job-header__title' and contains(.,'"+Serenity.getCurrentSession().getMetaData().get("job name")+"')]")).isDisplayed());
    }

    @Step
    public void clickOnTheAppropriateJobTitle() {
        landingPage.clickOnTheAppropriateJobTitle();
    }

    @Step
    public void enterToThePostcodeField(String arg0) {
        teacherJobsPage.enterToThePostcodeField(arg0);
    }

    @Step
    public void chooseDistance(String arg0) {
        teacherJobsPage.chooseDistance(arg0);
    }

    @Step
    public void theJobIsDisplayedInTheSearchResult(String arg0) {
        commonActions.waitUntilElementVisible("//div[@class='job-table__item desktop']//a[@class='job-header__title' and contains(.,'"+arg0+"')]",60);
        Assert.assertTrue("\""+arg0+"\" job isn't displayed in the search result", getDriver().findElement(By.xpath("//div[@class='job-table__item desktop']//a[@class='job-header__title' and contains(.,'"+arg0+"')]")).isDisplayed());
    }

    @Step
    public void clickOnTheButtonAtTheAppropriateJob(String arg0) {
        landingPage.clickOnTheButtonAtTheAppropriateJob(arg0);
    }

    @Step
    public void theSaveButtonIsHighlightedRedAtTheAppropriateJob(String arg0) {
        commonActions.waitUntilElementVisible("//div[@class='job-table__item desktop']//a[@class='job-header__title' and contains(.,'"+ Serenity.getCurrentSession().getMetaData().get("job name")+"')]//./../..//button[contains(.,'"+arg0+"')]",60);
        Assert.assertTrue("\""+Serenity.getCurrentSession().getMetaData().get("job name")+"\" job isn't displayed as saved",  getDriver().findElement(By.xpath("//div[@class='job-table__item desktop']//a[@class='job-header__title' and contains(.,'"+ Serenity.getCurrentSession().getMetaData().get("job name")+"')]//./../..//button[contains(.,'"+arg0+"')]")).isDisplayed());
    }


    @Step
    public void theButtonDisplayedAsSaved(String arg0) {
        waitABit(3000);
        commonActions.waitUntilElementVisible("(//button[contains(.,'"+arg0+"')])[1]",60);
        System.out.println(getDriver().findElement(By.xpath("(//button[contains(.,'"+arg0+"')])[1]")).getAttribute("class"));
        Assert.assertTrue("\""+Serenity.getCurrentSession().getMetaData().get("job name")+"\" job isn't displayed as saved", getDriver().findElement(By.xpath("(//button[contains(.,'"+arg0+"')])[1]")).getAttribute("class").equals("save unsave"));
    }

    @Step
    public void enterTextToTheTextField(String arg0) {
        commonActions.enterTextToTheTextField(arg0);
    }

    @Step
    public void appliedJobIsDisplayedInTheTab(String arg0) {
         commonActions.waitUntilElementVisible("//a[contains(.,'"+Serenity.getCurrentSession().getMetaData().get("job name")+"')]",60);
        Assert.assertTrue("\""+Serenity.getCurrentSession().getMetaData().get("job name")+"\" job isn't displayed as applied",  getDriver().findElement(By.xpath("//a[contains(.,'"+Serenity.getCurrentSession().getMetaData().get("job name")+"')]")).isDisplayed());
    }

    @Step
    public void clickOnTheButtonAtTheAppropriateJobTitle(String arg0) {
        schoolJobsPage.clickOnTheButtonAtTheAppropriateJobTitle(arg0);
    }

    @Step
    public void clickOnTheButtonAtTheJobPreviewPage(String arg0) {
        teacherJobsPage.clickOnTheButtonAtTheJobPreviewPage(arg0);
    }

    @Step
    public void theJobNameIsDisplayedAtTheApplicantsPage() {
        commonActions.waitUntilElementVisible("//div[@class='app-header']//a",60);
        waitABit(2000);
        Assert.assertTrue("Expected name : \""+Serenity.getCurrentSession().getMetaData().get("job name")+"\" but found: \""+getDriver().findElement(By.xpath("//div[@class='app-header']//a")).getText()+"\"",  Serenity.getCurrentSession().getMetaData().get("job name").equals(getDriver().findElement(By.xpath("//div[@class='app-header']//a")).getText()));
    }


    @Step
    public void theNameOfFirstApplicantIsDisplayed(String arg0) {
        Assert.assertTrue("Expected name : \""+arg0+"\" but found: "+getDriver().findElement(By.xpath("(//button[@class='applicant'])[1]")).getText(),  arg0.equals(getDriver().findElement(By.xpath("(//button[@class='applicant'])[1]")).getText()));
    }

    @Step
    public void theNameOfSecondApplicantIsDisplayed(String arg0) {
        Assert.assertTrue("Expected name : \""+arg0+"\" but found: "+getDriver().findElement(By.xpath("(//button[@class='applicant'])[2]")).getText(),  arg0.equals(getDriver().findElement(By.xpath("(//button[@class='applicant'])[2]")).getText()));
    }

    @Step
    public void theCurrentReceivedDateIsDisplayed() {
        ArrayList<String> results =  schoolJobsPage.theCurrentReceivedDateIsDisplayed();
        Assert.assertTrue("Received date is wrong"+ results, "true".equals(results.get(0)));
    }

    @Step
    public void theMessageLinkOfFirstApplicantHasRightEmailAddress(String arg0) {
        ArrayList<String> results =  commonActions.theMessageLinkOfFirstApplicantHasRightEmailAddress(arg0);
        Assert.assertTrue("Email in the message link is wrong"+ results, "true".equals(results.get(0)));
    }

    @Step
    public void openProfileDetailsPopupOfTheFirstApplicant() {
        schoolJobsPage.openProfileDetailsPopupOfTheFirstApplicant();
    }

    @Step
    public void theTeacherNameIsDisplayed(String arg0) {
        Assert.assertTrue("Expected name : \""+arg0+"\" but found: "+getDriver().findElement(By.xpath("//p[@class='teacher-name']")).getText(),  arg0.equals(getDriver().findElement(By.xpath("//p[@class='teacher-name']")).getText()));

    }

    @Step
    public void theSectionIsDisplayed(String arg0) {
        Assert.assertTrue("The \""+arg0+"\" section isn't displayed",  getDriver().findElement(By.xpath("//p[contains(.,'"+arg0+"')]")).isDisplayed());

    }

    @Step
    public void theTeacherNameIsDisplayedAtTheAccordionSection(String arg0) {
        Assert.assertTrue("Expected name : \""+arg0+"\" but found: "+getDriver().findElement(By.xpath("//h2[@class='header__title']")).getText(),  arg0.equals(getDriver().findElement(By.xpath("//h2[@class='header__title']")).getText()));

    }

    @Step
    public void theFieldContainsTheAttachedDocument(String arg0, String arg1) {
        Assert.assertTrue("The \""+arg1+"\" document isn't displayed at the "+arg0+" field",  getDriver().findElement(By.xpath("//div[@class='hidden-content__wrap']//span[contains(.,'"+arg0+"')]/..//span[contains(.,'"+arg1+"')]")).isDisplayed());
    }

    @Step
    public void theCoveringMessageIsDisplayed() {
        Assert.assertTrue("Expected message : \""+Serenity.getCurrentSession().getMetaData().get("covering message")+"\" but found: "+getDriver().findElement(By.xpath("//div[@class='hidden-content__wrap']//span[contains(.,'Covering Message')]/..//p")).getText(), Serenity.getCurrentSession().getMetaData().get("covering message").equals(getDriver().findElement(By.xpath("//div[@class='hidden-content__wrap']//span[contains(.,'Covering Message')]/..//p")).getText()));

    }

    @Step
    public void theOdroSiteIsOpenedInTheNewTabAfterClickingOnThePrescreeningQuestionsLink(List<String> list) {
        Assert.assertTrue("Expected urk : \""+list.get(0)+"\" but found: "+getDriver().getCurrentUrl(),  list.get(0).equals(getDriver().getCurrentUrl()));
    }

    @Step
    public void clickOnTheLinkAtTheVideoPrescreeningQuestionsField() {
        schoolJobsPage.clickOnTheLinkAtTheVideoPrescreeningQuestionsField();
    }

    @Step
    public void appliedJobIsnTDisplayedInTheTab(String arg0) {
        Assert.assertTrue("\""+Serenity.getCurrentSession().getMetaData().get("job name")+"\" job still displayed as applied", !commonActions.isElementPresent("//a[contains(.,'"+Serenity.getCurrentSession().getMetaData().get("job name")+"')]"));

    }

    @Step
    public void clickOnTheAppropriateJobTitleAtTheTab(String arg0) {
        teacherJobsPage.clickOnTheAppropriateJobTitleAtTheTab(arg0);
    }

    @Step
    public void addToTheJobNameField(String arg0) {
        schoolJobsPage.addToTheJobNameField(arg0);
    }

    @Step
    public void jobTitleIsRightDisplayed() {
        Assert.assertTrue("\""+Serenity.getCurrentSession().getMetaData().get("job name")+"\" job still displayed as non edited. Expected: "+Serenity.getCurrentSession().getMetaData().get("edited job title")+" But found: "+ getDriver().findElement(By.xpath("//span[contains(.,'"+Serenity.getCurrentSession().getMetaData().get("job name")+"')]")).getText(), Serenity.getCurrentSession().getMetaData().get("edited job title").equals(getDriver().findElement(By.xpath("//span[contains(.,'"+Serenity.getCurrentSession().getMetaData().get("job name")+"')]")).getText()));

    }

    @Step
    public void checkIfEnteredUserAlreadyExistsAndRegenerateNewEmail() {
        authorizationPage.checkIfEnteredUserAlreadyExistsAndRegenerateNewEmail();


    }

    @Step
    public void createLogicMelonJobThroughAPI(List<String> list) throws IOException, ParseException {
        commonActions.createLogicMelonJobThroughAPI(list);
    }

    @Step
    public void appropriateJobIsDisplayedInTheTRENDINGJOBSBanner() {
        commonActions.waitUntilElementVisible("//span[contains(.,'"+Serenity.getCurrentSession().getMetaData().get("job name")+"')]",60);
        Assert.assertTrue("\""+Serenity.getCurrentSession().getMetaData().get("job name")+"\" job isn't displayed in the banner", getDriver().findElement(By.xpath("//span[contains(.,'"+Serenity.getCurrentSession().getMetaData().get("job name")+"')]")).isDisplayed());
    }
    @Step
    public void clickOnTheAppropriateJobTitleAtTheBanner() {
        landingPage.clickOnTheAppropriateJobTitleAtTheBanner();
    }

    @Step
    public void checkBookingCreationStatus(List<String> list2) throws IOException, ParseException {
        commonActions.checkBookingCreationStatus(list2);
    }

    @Step
    public void appropriateJobIsDisplayedInJobsTab(String arg0) {
        commonActions.waitUntilElementVisible("//span[contains(.,'"+Serenity.getCurrentSession().getMetaData().get("job name")+"')]",60);
        Assert.assertTrue("Created Job "+Serenity.getCurrentSession().getMetaData().get("job name")+" isn't displayed",getDriver().findElement(By.xpath("//span[contains(.,'"+Serenity.getCurrentSession().getMetaData().get("job name")+"')]")).isDisplayed());
    }

    @Step
    public void theButtonOfTheAppropriateBookingIsnTClickable(String arg0) throws IOException, ParseException {

        ArrayList<String> results =   commonActions.theButtonOfTheAppropriateBookingIsnTClickable(arg0);
        System.out.println("results"+results.get(0));
        Assert.assertTrue("The "+arg0+"Button is clickable"+ results, "true".equals(results.get(0)));
    }

    @Step
    public void clickOnTheLink(String arg0) {
        commonActions.clickOnTheLink(arg0);
    }

    @Step
    public void theSectionIsOpened(String arg0) {

        ArrayList<String> results =    teacherProfilePage.theSectionIsOpened(arg0);
        Assert.assertTrue("The "+arg0+" section isn't opened "+ results, "true".equals(results.get(0)));
    }

    @Step
    public void clickOnTheButtonAtTheSection(String arg0, String arg1) {
        commonActions.clickOnTheButtonAtTheSection(arg0,arg1);
    }

    @Step
    public void enterPostcodeToTheField(String arg0, String arg1) {
        commonActions.enterPostcodeToTheField(arg0,arg1);
    }

    @Step
    public void chooseRandomAddressFromTheDropdownInTheRange(String arg0) {
        commonActions.chooseRandomAddressFromTheDropdownInTheRange(arg0);
    }

    @Step
    public void enterTheSchoolNameToTheField(String arg0) {
        schoolAccountPage.enterTheSchoolNameToTheField(arg0);
    }

    @Step
    public void enterTheShortDescriptionToTheField(String arg1, String arg0) {
        ArrayList<String> results =  schoolAccountPage.enterTheShortDescriptionToTheField(arg0,arg1);
        Assert.assertTrue("Can't find input field"+ results, "true".equals(results.get(0)));
    }

    @Step
    public void enterTheToTheField(String arg0, String arg1) {
        ArrayList<String> results = commonActions.enterTheToTheField(arg0,arg1);
        Assert.assertTrue("Can't find input field"+ results, "true".equals(results.get(0)));
    }

    @Step
    public void theAllEnteredDataToTheAccountSectionAreSaved(List<String> list, String arg0) {
        ArrayList<String> results = commonActions.theAllEnteredDataToTheAccountSectionAreSaved(list,arg0);
        Assert.assertTrue("Account page is wrong"+ results, "true".equals(results.get(0)));

    }

    @Step
    public void theTextIsDisplayedAtTheSection(String arg0, String arg1) {
        ArrayList<String> results = commonActions.theTextIsDisplayedAtTheSection(arg0,arg1);
        Assert.assertTrue("Text isn't displayed"+ results, "true".equals(results.get(0)));
    }

    @Step
    public void uploadedFileIsSaved(String arg0) {
        ArrayList<String> results = commonActions.uploadedFileIsSaved(arg0);
        Assert.assertTrue("File isn't saved"+ results, "true".equals(results.get(0)));
    }

    @Step
    public void adminDetailsPageIsSaved(List<String> list) {
        ArrayList<String> results = schoolAccountPage.adminDetailsPageIsSaved(list);
        Assert.assertTrue("Section isn't saved"+ results, "true".equals(results.get(0)));
    }

    @Step
    public void clickOnTheProfilingQuestion(String arg0) {
        commonActions.clickOnTheProfilingQuestion(arg0);
    }

    @Step
    public void dropdownContainsTheNextItems(List<String> list) throws InterruptedException {
        ArrayList<String> results =   commonActions.dropdownContainsTheNextItems(list);
        Assert.assertTrue("Dropdown contains wrong items"+ results, "true".equals(results.get(0)));
    }

    @Step
    public void chooseTheItemInTheDropdown(String arg0) {
        ArrayList<String> results =    commonActions.chooseTheItemInTheDropdown(arg0);
        Assert.assertTrue("The '"+arg0+"' Item in the Dropdown isn't clickable"+ results, "true".equals(results.get(0)));
    }

    @Step
    public void enterEmailOfNewSchoolUser() {
        commonActions.enterEmailOfNewSchoolUser();
    }

    @Step
    public void clickOnTheDropdown(String arg1, String arg0) {
        ArrayList<String> results =    commonActions.clickOnTheDropdown(arg0,arg1);
        Assert.assertTrue("Dropdown isn't found","true".equals(results.get(0)));

    }

    @Step
    public void clickOnTheInputField(String arg0) {
        commonActions.clickOnTheInputField(arg0);
    }

    @Step
    public void chooseYear(String arg0) {
        commonActions.chooseYear(arg0);
    }
    @Step
    public void chooseMonth(String arg0) {
        commonActions.chooseMonth(arg0);
    }

    @Step
    public void chooseDate(String arg0) {
        commonActions.chooseDate(arg0);
    }

    @Step
    public void fillProfileSectionAsAdminUsingRequestAPI(List<String> list) throws IOException, ParseException {
           commonActions.fillProfileSectionAsAdminUsingRequestAPI(list);

    }

    @Step
    public void getUsersEmailsAtTheFirstTabs(String arg0,String arg1) {
        commonActions.getUsersEmailsAtTheFirstTabs(arg0,arg1);
    }

    @Step
    public void deleteAccounts(String arg0) throws IOException, ParseException {
       commonActions.deleteAccounts(arg0);;
    }

    @Step
    public void theAllNecessaryTextAtTheAccountSectionAreDisplayed(String arg0, List<String> list) {
        ArrayList<String> results = commonActions.theAllNecessaryTextAtTheAccountSectionAreDisplayed(list,arg0);
        Assert.assertTrue("Text at the page is wrong or absent"+ results, "true".equals(results.get(0)));
    }

    @Step
    public void uploadFileToTheField(String arg0, String arg1) {
        commonActions.uploadFileToTheField(arg0,arg1);
    }

    @Step
    public void getPasswordFromMail() {
        ArrayList<String> results = commonActions.getPasswordFromMail();
        Assert.assertTrue("Can't get a password"+ results, "true".equals(results.get(0)));
    }

    @Step
    public void setSchoolSStatusToAsAdminUsingRequestAPI(String arg0) throws IOException, ParseException {
        ArrayList<String> results = commonActions.setSchoolSStatusToAsAdminUsingRequestAPI(arg0);
        Assert.assertTrue("Can't set status to active"+ results, "true".equals(results.get(0)));

    }

    @Step
    public void enterEmailOfNewAdmin() {
        commonActions.enterEmailOfNewAdmin();
    }

    @Step
    public void enterPasswordOfNewCreatedAdmin() {
        commonActions.enterPasswordOfNewCreatedAdmin();
    }

    @Step
    public void clickOnTheButtonAtTheSectionWith(String arg0, String arg1) {
        commonActions.clickOnTheButtonAtTheSectionWith(arg0,arg1);

    }

    @Step
    public void appropriateAdminIsDeleted() {
        ArrayList<String> results = commonActions.appropriateAdminIsDeleted();
        Assert.assertTrue("Admin isn't deleted"+ results, "true".equals(results.get(0)));
    }


//    @Step
//    public void openReport() {
//        getDriver().manage().window().maximize();
//        getDriver().get("file:///home/akuzikov/IdeaProjects/RealiseMecom/target/site/serenity/index.html");
//
//    }
}