package RealiseMe.com.steps;

import RealiseMe.com.steps.serenity.EndUserSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.model.CucumberScenario;
import net.thucydides.core.annotations.Steps;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.List;

public class DefinitionSteps {

    @Steps
    EndUserSteps steps;
    DefinitionSteps definitionSteps;
    private Class<CucumberScenario> cucumberScenarioClass;

    @Given("open login page")
    public void checkThatLoginPageIsOpened() {
        steps.openLoginPage();
    }

    @Then("^Landing page header contains textbuttons:$")
    public void landingPageHeaderContainsTextbuttons(List<String> list) throws Throwable {
        steps.landingPageHeaderContainsTextbuttons(list);
    }

    @Then("^Header contains textbuttons:$")
    public void headerContainsTextbuttons(List<String> list) throws Throwable {
        steps.headerContainsTextbuttons(list);
    }

    @Then("^Login page contains pictures$")
    public void loginPageContainsPictures() throws Throwable {
        steps.loginPageContainsPictures();
    }

    @Then("^Login page contains$")
    public void loginPageContains(List<String> list) throws Throwable {
        steps.loginPageContains1(list);
    }

    @Then("^Authorization page contains necessary elements$")
    public void authorizationPageContainsNecessaryElements(List<String> list) throws Throwable {
        steps.authorizationPageContainsNecessaryElements(list);
    }

    @When("^Click on the sign in teacher button$")
    public void clickOnTheSignInTeacherButton() throws Throwable {
        steps.clickOnTheSignInTeacherButton();
    }

    @When("^Click on the sign in school button$")
    public void clickOnTheSignInSchoolButton() throws Throwable {
        steps.clickOnTheSignInSchoolButton();
    }

    @When("^Enter login \"([^\"]*)\"$")
    public void enterLogin(String arg0) throws Throwable {
        steps.enterLogin(arg0);
    }

    @When("^Enter password \"([^\"]*)\"$")
    public void enterPassword(String arg0) throws Throwable {
        steps.enterPassword(arg0);
    }

    @When("^Click on the Log in button$")
    public void clickOnTheLogInButton() throws Throwable {
        steps.clickOnTheLogInButton();
    }

    @Then("^Header contains bell icon$")
    public void headerContainsBellIcon() throws Throwable {
        steps.headerContainsBellIcon();
    }

    @Then("^Header contains user photo icon$")
    public void headerContainsUserPhotoIcon() throws Throwable {
       steps.headerContainsUserPhotoIcon();
    }

    @Then("^Header contains user name \"([^\"]*)\"$")
    public void headerContainsUserName(String arg0) throws Throwable {
        steps.headerContainsUserName(arg0);
    }

    @Then("^Header contains arrow down button$")
    public void headerContainsArrowDownButton() throws Throwable {
        steps.headerContainsArrowDownButton();
    }

    @When("^Click on the arrow down button$")
    public void clickOnTheArrowDownButton() throws Throwable {
        steps.clickOnTheArrowDownButton();
    }

    @Then("^User is logout$")
    public void userIsLogout() throws Throwable {
        steps.userIsLogout();
    }

    @When("^Close window$")
    public void closeWindow() throws Throwable {
        steps.closeWindow();
    }

    @Then("^Other Teacher's Left panel contains all necessary elements:$")
    public void otherTeacherSLeftPanelContainsAllNecessaryElements(List<String> list) throws Throwable {
        steps.otherTeacherSLeftPanelContainsAllNecessaryElements(list);
    }

    @Then("^Supply Teacher's Left panel contains all necessary elements:$")
    public void supplyTeacherSLeftPanelContainsAllNecessaryElements(List<String> list) throws Throwable {
        steps.supplyTeacherSLeftPanelContainsAllNecessaryElements(list);
    }


    @When("^Click on the LOGOUT button$")
    public void clickOnTheLOGOUTButton() throws Throwable {
        steps.clickOnTheLOGOUTButton();
    }

    @Then("^First table contains \"([^\"]*)\" title$")
    public void firstTableContainsTitle(String arg0) throws Throwable {
        steps.firstTableContainsTitle(arg0);
    }

    @Then("^Second table contains \"([^\"]*)\" title$")
    public void secondTableContainsTitle(String arg0) throws Throwable {
        steps.secondTableContainsTitle(arg0);
    }

    @Then("^Table contains \"([^\"]*)\" button$")
    public void tableContainsButton(String arg0) throws Throwable {
        steps.tableContainsViewAllButton(arg0);
    }

    @Then("^Teacher Supply first Table contains next columns:$")
    public void teacherSupplyfirstTableContainsNextColumns(List<String> list) throws Throwable {
       steps.teacherSupplyfirstTableContainsAllNecessaryColumns(list);
    }

    @Then("^Teacher Other first Table contains next columns:$")
    public void teacherOtherfirstTableContainsNextColumns(List<String> list) throws Throwable {
        steps.teacherOtherfirstTableContainsAllNecessaryColumns(list);
    }

    @Then("^School first Table contains next columns:$")
    public void schoolfirstTableContainsNextColumns(List<String> list) throws Throwable {
        steps.schoolfirstTableContainsAllNecessaryColumns(list);
    }

    @Then("^The five lines in the table are displayed$")
    public void theFiveLinesInTheTableAreDisplayed() throws Throwable {
        steps.theFiveLinesInTheTableAreDisplayed();
    }

    @Then("^School Left panel contains all necessary elements:$")
    public void schoolLeftPanelContainsAllNecessaryElements(List<String>list) throws Throwable {
        steps.schoolLeftPanelContainsAllNecessaryElements(list);
    }

    @Given("^open landing page$")
    public void openLandingPage() throws Throwable {
        steps.openLandingPage();
    }

    @When("^Enter \"([^\"]*)\" to the search field$")
    public void enterToTheSearchField(String arg0) throws Throwable {
        steps.enterToTheSearchField(arg0);
    }

    @When("^Click search button$")
    public void clickSearchButton() throws Throwable {
        steps.clickSearchButton();
    }

    @Then("^The \"([^\"]*)\" is displayed in the search result$")
    public void theIsDisplayedInTheSearchResult(String arg0) throws Throwable {
        steps.theIsDisplayedInTheSearchResult(arg0);
    }

    @When("^Click on the Save button$")
    public void clickOnTheSaveButton() throws Throwable {
       steps.clickOnTheSaveButton();
    }

    @Then("^The \"([^\"]*)\" button is highlighted$")
    public void theButtonIsHighlighted(String arg0) throws Throwable {
        steps.theButtonIsHighlighted(arg0);
    }

    @When("^Click on the job title$")
    public void clickOnTheJobTitle() throws Throwable {
        steps.clickOnTheJobTitle();
    }


    @Then("^The job preview page is opened with necessary elements$")
    public void theJobPreviewPageIsOpenedWithNecessaryElements(List<String>list) throws Throwable {
        steps.theJobPreviewPageIsOpenedWithNecessaryElements(list);
    }

    @When("^Click on the Apply button$")
    public void clickOnTheApplyButton() throws Throwable {
        steps.clickOnTheApplyButton();
    }

    @When("^Click on the login button$")
    public void clickOnTheLoginButton() throws Throwable {
        steps.clickOnTheLoginButton();
    }

    @When("^Click on the \"([^\"]*)\" button in the header$")
    public void clickOnTheButtonInTheHeader(String arg0) throws Throwable {
        steps.clickOnTheButtonInTheHeader(arg0);
    }

    @Then("^Jobs page contains all necessary elements:$")
    public void jobsPageContainsAllNecessaryElements(List<String>list) throws Throwable {
        steps.jobsPageContainsAllNecessaryElements(list);
    }

    @When("^Click on the archived tab$")
    public void clickOnTheArchivedTab() throws Throwable {
       steps.clickOnTheArchivedTab();
    }

    @Then("^Archived tab is opened with all necessary elements:$")
    public void archivedTabIsOpenedWithAllNecessaryElements(List<String>list) throws Throwable {
        steps.archivedTabIsOpenedWithAllNecessaryElements(list);
    }



    @When("^Click on the \"([^\"]*)\" tab$")
    public void clickOnTheTab(String arg0) throws Throwable {
        steps.clickOnTheTab(arg0);
    }

    @Then("^Draft tab is opened with all necessary elements:$")
    public void draftTabIsOpenedWithAllNecessaryElements(List<String>list) throws Throwable {
       steps.draftTabIsOpenedWithAllNecessaryElements(list);
    }

    @When("^Click on the \"([^\"]*)\" button$")
    public void clickOnTheButton(String arg0) throws Throwable {
        steps.clickOnTheButton(arg0);
    }

    @Then("Post a Job page contains all necessary elements:$")
    public void postJobPageContainsAllNecessaryElements(List<String>list) throws Throwable {
        steps.postJobPageContainsAllNecessaryElements(list);
    }

    @When("^Click on the Post Job button$")
    public void clickOnThePostJobButton() throws Throwable {
       steps.clickOnThePostJobButton();
    }

    @Then("^Warning messages are appeared:$")
    public void warningMessagesAreAppeared(List<String>list) throws Throwable {
       steps.warningMessagesAreAppeared(list);
    }

    @When("^Click on the school \"([^\"]*)\" button$")
    public void clickOnTheSchoolButton(String arg0) throws Throwable {
        steps.clickOnTheSignSchool_Landing_Button(arg0);
    }

    @When("^click on the agree button at the banner$")
    public void clickOnTheAgreeButtonAtTheBanner() throws Throwable {
       steps.clickOnTheAgreeButtonAtTheBanner();
    }

    @Then("^Bookings page contains all necessary elements:$")
    public void bookingsPageContainsAllNecessaryElements(List<String>list) throws Throwable {
       steps.bookingsPageContainsAllNecessaryElements(list);
    }

    @Then("^New Supply Booking page contains all necessary text:$")
    public void newSupplyBookingPageContainsAllNecessaryText(List<String>list) throws Throwable {
        steps.newSupplyBookingPageContainsAllNecessaryText(list);
    }

    @Then("^The \"([^\"]*)\" field is highlighted red$")
    public void theFieldIsHighlightedRed(String arg0) throws Throwable {
       steps.theFieldIsHighlightedRed(arg0);
    }

    @When("^Enter \"([^\"]*)\" to the Name your job posting field$")
    public void enterTextToTheNameYourJobPostingField(String arg0) throws Throwable {
        steps.enterTextToTheNameYourJobPostingField(arg0);
    }

    @When("^Enter \"([^\"]*)\" to the Describe the job field$")
    public void enterTextToTheDescribeTheJobField(String arg0) throws Throwable {
        steps.enterTextToTheDescribeTheJobField(arg0);
    }

    @When("^Choose \"([^\"]*)\" checkbox$")
    public void chooseCheckbox(String arg0) throws Throwable {
       steps.chooseCheckbox(arg0);
    }

    @When("^Choose full day \"([^\"]*)\" in the \"([^\"]*)\" month of available calendar$")
    public void chooseFullDayInTheMonthOfAvailableCalendar(String arg0, String arg1) throws Throwable {
        steps.chooseFullDayInTheMonthOfAvailableCalendar(arg0,arg1);
    }

    @When("^Choose half day \"([^\"]*)\" in the \"([^\"]*)\" month of available calendar$")
    public void chooseHalfDayInTheMonthOfAvailableCalendar(String arg0, String arg1) throws Throwable {
        steps.chooseHalfDayInTheMonthOfAvailableCalendar(arg0,arg1);
    }

    @When("^Choose full day start time \"([^\"]*)\"$")
    public void chooseFullDayStartTime(String arg0) throws Throwable {
       steps.chooseFullDayStartTime(arg0);
    }

    @When("^Choose full day end time \"([^\"]*)\"$")
    public void chooseFullDayEndTime(String arg0) throws Throwable {
        steps.chooseFullDayEndTime(arg0);
    }

    @When("^Choose half day start time \"([^\"]*)\"$")
    public void chooseHalfDayStartTime(String arg0) throws Throwable {
        steps.chooseHalfDayStartTime(arg0);
    }

    @When("^Choose half day end time \"([^\"]*)\"$")
    public void chooseHalfDayEndTime(String arg0) throws Throwable {
        steps.chooseHalfDayEndTime(arg0);
    }



    @When("^Enter \"([^\"]*)\" rate$")
    public void enterRate(String arg0) throws Throwable {
        steps.enterRate(arg0);
    }

    @When("^Close popup$")
    public void closePopup() throws Throwable {
        steps.closePopup();
    }

    @When("^wait time$")
    public void waitTime() throws Throwable {
        steps.waitTime();
    }

    @When("^Get names of teachers$")
    public void getNamesOfTeachers() throws Throwable {
        steps.getNamesOfTeachers();
    }

    @Then("^Appropriate teachers are displayed in the invites list$")
    public void appropriateTeachersAreDisplayedInTheInvitesList() throws Throwable {
        steps.appropriateTeachersAreDisplayedInTheInvitesList();
    }

    @When("^Check uncleared popup \"([^\"]*)\"$")
    public void checkUnclearedPopup(String arg0) throws Throwable {
       steps.checkUnclearedPopup(arg0);
    }

    @When("^Get statuses of teachers$")
    public void getStatusesOfTeachers() throws Throwable {
        steps.getStatusesOfTeachers();

    }

    @When("^Click on the Invite to job button at the teacher with \"([^\"]*)\" status$")
    public void clickOnTheButtonAtTheTeacherWithStatus(String arg0) throws Throwable {
        steps.clickOnTheButtonAtTheTeacherWithStatus(arg0);
    }

    @Then("^Check penging popup \"([^\"]*)\"$")
    public void checkPengingPopup(String arg0) throws Throwable {
        steps.checkPengingPopup(arg0);
    }

    @Then("^The OK button isn't clickable$")
    public void theOKButtonIsnTClickable() throws Throwable {
        steps.theOKButtonIsnTClickable();
    }

    @When("^Check popups depending of teacher's status and click on the \"SEND\" button$")
    public void checkPopupsDependingOfTeacherSStatus() throws Throwable {
        steps.checkPopupsDependingOfTeacherSStatus();
    }

    @When("^Click on the Invite to job button at the teacher with \"([^\"]*)\" name$")
    public void clickOnTheInviteToJobButtonAtTheTeacherAgencyWithName(String arg0) throws Throwable {
        steps.clickOnTheButtonAtTheTeacherWithName(arg0);
    }

    @When("^Find invite with \"([^\"]*)\" job title$")
    public void findInviteWithJobTitle(String arg0) throws Throwable {
        steps.findInviteWithJobTitle(arg0);
    }

    @When("^Click on the \"([^\"]*)\" button of the appropriate booking$")
    public void clickOnTheButtonOfTheAppropriateBooking(String arg0) throws Throwable {
        steps.clickOnTheButtonOfTheAppropriateBooking(arg0);
    }



    @When("^Fill required fields$")
    public void fillRequiredFields(List<String>list) throws Throwable {
        steps.fillRequiredFields(list);
    }

    @When("^Upload \"([^\"]*)\" file$")
    public void uploadFile(String arg0) throws Throwable {
       steps.uploadFile(arg0);
    }

    @When("^Choose \"([^\"]*)\" policy checkbox$")
    public void choosePolicyCheckbox(String arg0) throws Throwable {
        steps.choosePolicyCheckbox(arg0);
    }

    @When("^Find accepted invite with \"([^\"]*)\" job title$")
    public void findAcceptedInviteWithJobTitle(String arg0) throws Throwable {
        steps.findAcceptedInviteWithJobTitle(arg0);
    }

    @When("^Approve appropriate booking$")
    public void approveAppropriateBooking() throws Throwable {
       steps.approveAppropriateBooking();
    }

    @Then("^Entered \"([^\"]*)\" teacher name is displayed$")
    public void enteredTeacherNameIsDisplayed(String arg0) throws Throwable {
        steps.enteredTeacherNameIsDisplayed(arg0);
    }

    @Then("^Attached \"([^\"]*)\" file is displayed$")
    public void attachedFileIsDisplayed(String arg0) throws Throwable {
        steps.attachedFileIsDisplayed(arg0);
    }

    @Then("^The \"([^\"]*)\" rate is displayed$")
    public void theRateIsDisplayed(String arg0) throws Throwable {
        steps.theRateIsDisplayed(arg0);
    }

    @When("^Decline appropriate booking$")
    public void declineAppropriateBooking() throws Throwable {
       steps.declineAppropriateBooking();
    }

    @Then("^Popup with \"([^\"]*)\" text is appeared$")
    public void popupWithTextIsAppeared(String arg0) throws Throwable {
       steps.popupWithTextIsAppeared(arg0);
    }

    @When("^Enter login of new \"([^\"]*)\"$")
    public void enterLoginOfNew(String arg0) throws Throwable {
        steps.enterLoginOfNewUser(arg0);
    }

    @Then("^The \"([^\"]*)\" message after Sign Up is displayed$")
    public void theMessageAfterSignUpIsDisplayed(String arg0) throws Throwable {
       steps.theMessageAfterSignUpIsDisplayed(arg0);
    }

    @When("^Click on the SIGN UP button$")
    public void clickOnTheSIGNUPButton() {
        steps.clickOnTheSIGNUPButton();
    }

    @When("^refresh the page$")
    public void refreshThePage() {
        steps.refreshThePage();
    }

    @When("^Enter login of new created user$")
    public void enterLoginOfNewCreatedUser() {
        steps.enterLoginOfNewCreatedUser();
    }

    @When("^The \"([^\"]*)\" message before email VERIFICATION is displayed$")
    public void theMessageBeforeEmailVERIFICATIONIsDisplayed(String arg0) throws Throwable {
        steps.theMessageBeforeEmailVERIFICATIONIsDisplayed(arg0);
    }

    @When("^Open \"([^\"]*)\" in  the new tab$")
    public void openInTheNewTab(String arg0) throws Throwable {
       steps.openInTheNewTab(arg0);
    }

    @When("^Enter email of new user$")
    public void enterEmailOfNewUser() {
        steps.enterEmailOfNewUser();
    }

    @When("^Back to the first tab$")
    public void backToTheFirstTab() {
        steps.backToTheFirstTab();
    }

    @Then("^Delete \"([^\"]*)\" account$")
    public void deleteAccount(String arg0) throws Throwable {
        steps.deleteAccount(arg0);
    }

    @When("^Click on the Sign up button$")
    public void clickOnTheSignUpButton() {
        steps.clickOnTheSignUpButton();
    }

    @Then("^School account page contains necessary elements$")
    public void schoolAccountPageContainsNecessaryElements(List<String>list) {
        steps.schoolAccountPageContainsNecessaryElements(list);
    }

    @Then("^Admin Details page is opened$")
    public void adminDetailsPageIsOpened(List<String>list) {
        steps.adminDetailsPageIsOpened(list);
    }

    @Then("^The \"([^\"]*)\" button is disabled$")
    public void theButtonIsDisabled(String arg0) throws Throwable {
        steps.theButtonIsDisabled(arg0);
    }


    @Then("^The \"([^\"]*)\" Profiling Questions page contains necessary elements$")
    public void theProfilingQuestionsPageContainsNecessaryElements(String arg0, List<String>list) {
        steps.theProfilingQuestionsPageContainsNecessaryElements(list, arg0);
    }

    @Then("^Warning popup is opened with next text \"([^\"]*)\"$")
    public void warningPopupIsOpenedWithNextText(String arg0) throws Throwable {
        steps.warningPopupIsOpenedWithNextText(arg0);
    }

    @Then("^Teacher account page contains necessary elements$")
    public void teacherAccountPageContainsNecessaryElements(List<String>list) {
        steps.teacherAccountPageContainsNecessaryElements(list);
    }

    @Then("^Agency account page contains necessary elements$")
    public void agencyAccountPageContainsNecessaryElements(List<String>list) {
        steps.agencyAccountPageContainsNecessaryElements(list);
    }

    @When("^Get Booking ID$")
    public void getBookingID() throws IOException, ParseException {
        steps.getBookingID();
    }

    @When("^Open booking section$")
    public void openBookingSection() {
        steps.openBookingSection();
    }




    //    @When("^Open report$")
//    public void openReport() throws Throwable {
//        steps.openReport();
//    }
}

