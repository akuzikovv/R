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
        steps.approveAcceptedInviteWithName(arg0);
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

    @When("^Approve accepted invite with \"([^\"]*)\" name$")
    public void approveAcceptedInviteWithName(String arg0) throws Throwable {
        steps.approveAcceptedInviteWithName(arg0);
    }

    @When("^Decline accepted invite with \"([^\"]*)\" name$")
    public void declineAcceptedInviteWithName(String arg0) throws Throwable {
       steps.declineAcceptedInviteWithName(arg0);
    }

    @When("^Find accepted invite by booking ID with \"([^\"]*)\" name$")
    public void findAcceptedInviteByBookingID(String arg0) throws IOException, ParseException {
        steps.findAcceptedInviteByBookingID(arg0);
    }

    @When("^Create Booking using request API$")
    public void createBookingUsingRequestAPI(List<String>list) throws IOException, ParseException {
        steps.createBookingUsingRequestAPI(list);
    }

    @When("^Accept booking as cleared teacher using request API$")
    public void acceptBookingAsClearedTeacherUsingRequestAPI(List<String>list) throws IOException, ParseException {
        steps.acceptBookingAsClearedTeacherUsingRequestAPI(list);
    }

    @When("^Approve booking as school using request API$")
    public void approveBookingAsSchoolUsingRequestAPI(List<String>list) throws IOException, ParseException {
        steps.approveBookingAsSchoolUsingRequestAPI(list);
    }

    @Then("^Appropriate booking id is displayed$")
    public void appropriateBookingIdIsDisplayed() {
        steps.appropriateBookingIdIsDisplayed();
    }

    @Then("^The \"([^\"]*)\" rate is displayed at the timesheet page$")
    public void theRateIsDisplayedAtTheTimesheetPage(String arg0) throws Throwable {
        steps.theRateIsDisplayedAtTheTimesheetPage(arg0);
    }

    @Then("^Total rate for teacher is right calculated$")
    public void totalRateForTeacherIsRightCalculated() {
        steps.totalRateForTeacherIsRightCalculated();
    }

    @When("^Accept timesheet$")
    public void acceptTimesheet() {
        steps.acceptTimesheet();
    }

    @Then("^Current submission date is appeared$")
    public void currentSubmissionDateIsAppeared() {
        steps.currentSubmissionDateIsAppeared();
    }

    @Then("^Total rate for school is right calculated$")
    public void totalRateForSchoolIsRightCalculated() {
        steps.totalRateForSchoolIsRightCalculated();
    }

    @Then("^Teacher rate for school is right calculated$")
    public void teacherRateForSchoolIsRightCalculated() {
        steps.teacherRateForSchoolIsRightCalculated();
    }

    @Then("^Approve/Decline buttons are disabled$")
    public void approveDeclineButtonsAreDisabled() {
        steps.approveButtonIsDisabled();
    }

    @When("^Decline timesheet$")
    public void declineTimesheet() {
        steps.declineTimesheet();

    }

    @When("^Enter \"([^\"]*)\" to the text field in the popup$")
    public void enterToTheTextFieldInThePopup(String arg0) throws Throwable {
        steps.enterToTheTextFieldInThePopup(arg0);
    }

    @Then("^The \"([^\"]*)\" status is displayed$")
    public void theStatusIsDisplayed(String arg0) throws Throwable {
        steps.theStatusIsDisplayed(arg0);
    }

    @When("^Change booking status to completed$")
    public void changeBookingStatusToCompleted(List<String>list) throws IOException, ParseException {
        steps.changeBookingStatusToCompleted(list);
    }

    @When("^Enter \"([^\"]*)\" email of appropriate teacher$")
    public void enterEmailOfAppropriateTeacher(String arg0) throws Throwable {
        steps.enterEmailOfAppropriateTeacher(arg0);
    }

    @When("^Choose appropriate email message \"([^\"]*)\"$")
    public void chooseAppropriateEmailMessage(String arg0) throws Throwable {
        steps.chooseAppropriateEmailMessage(arg0);
    }

    @Then("^Email body contains necessary text \"([^\"]*)\"$")
    public void emailBodyContainsNecessaryText(String arg0) throws Throwable {
        steps.emailBodyContainsNecessaryText(arg0);
    }

    @When("^Remove all user bookings using request API$")
    public void removeAllUserBookingsUsingRequestAPI(List<String>list) throws IOException, ParseException {
        steps.removeAllUserBookingsUsingRequestAPI(list);
    }

    @When("^Fill all necessary fields$")
    public void fillAllNecessaryFields(List<String>list) {
        steps.fillAllNecessaryFields(list);
    }

    @When("^Enter the \"([^\"]*)\" closing date$")
    public void enterTheClosingDate(String arg0) throws Throwable {
        steps.enterTheClosingDate(arg0);
    }

    @When("^Choose \"([^\"]*)\" radiobutton$")
    public void chooseRadiobutton(String arg0) throws Throwable {
      steps.chooseRadiobutton(arg0);
    }

    @Then("^The job name is right displayed$")
    public void theJobNameIsRightDisplayed() {
        steps.theJobNameIsRightDisplayed();
    }

    @Then("^the job description is right displayed$")
    public void theJobDescriptionIsRightDisplayed() {
        steps.theJobDescriptionIsRightDisplayed();
    }

    @Then("^Current posted date is displayed$")
    public void currentPostedDateIsDisplayed() {
        steps.currentPostedDateIsDisplayed();
    }

    @When("^Choose skills$")
    public void chooseSkills(List<String>list) {
        steps.chooseSkills(list);
    }

    @When("^Chosen skills are displayed$")
    public void chosenSkillsAreDisplayed() {
        steps.chosenSkillsAreDisplayed();
    }

    @Then("^Chosen closed date is displayed$")
    public void chosenClosedDateIsDisplayed() {
        steps.chosenClosedDateIsDisplayed();
    }

    @Then("^Contract type is right displayed$")
    public void contractTypeIsRightDisplayed(List<String>list) {
        steps.contractTypeIsRightDisplayed(list);
    }

    @Then("^Contract term \"([^\"]*)\" is right displayd$")
    public void contractTermIsRightDisplayd(String arg0) throws Throwable {
        steps.contractTermIsRightDisplayd(arg0);
    }

    @Then("^Salary is right displayed$")
    public void salaryIsRightDisplayed() {
        steps.salaryIsRightDisplayed();
    }

    @Then("^The \"([^\"]*)\" text is displayed at the Video prescreening field$")
    public void theTextIsDisplayedAtTheVideoPrescreeningField(String arg0) throws Throwable {
        steps.theTextIsDisplayedAtTheVideoPrescreeningField(arg0);
    }

    @When("^Enter job title to the search field$")
    public void enterJobTitleToTheSearchField() {
        steps.enterJobTitleToTheSearchField();
    }

    @Then("^Appropriate job is displayed in the search result$")
    public void appropriateJobIsDisplayedInTheSearchResult() {
        steps.appropriateJobIsDisplayedInTheSearchResult();
    }

    @When("^Click on the appropriate job title$")
    public void clickOnTheAppropriateJobTitle() {
        steps.clickOnTheAppropriateJobTitle();
    }

    @When("^Enter \"([^\"]*)\" to the postcode field$")
    public void enterToThePostcodeField(String arg0) throws Throwable {
        steps.enterToThePostcodeField(arg0);

    }

    @When("^Choose \"([^\"]*)\" distance$")
    public void chooseDistance(String arg0) throws Throwable {
        steps.chooseDistance(arg0);

    }

    @Then("^The \"([^\"]*)\" job is displayed in the search result$")
    public void theJobIsDisplayedInTheSearchResult(String arg0) throws Throwable {
      steps.theJobIsDisplayedInTheSearchResult(arg0);

    }

    @Then("^Click on the \"([^\"]*)\" button at the appropriate job$")
    public void clickOnTheButtonAtTheAppropriateJob(String arg0) throws Throwable {
        steps.clickOnTheButtonAtTheAppropriateJob(arg0);
    }



    @Then("^The \"([^\"]*)\" button is highlighted red at the appropriate job$")
    public void theButtonIsHighlightedRedAtTheAppropriateJob(String arg0) throws Throwable {
        steps.theSaveButtonIsHighlightedRedAtTheAppropriateJob(arg0);
    }

    @Then("^The \"([^\"]*)\" button displayed as saved$")
    public void theButtonDisplayedAsSaved(String arg0) throws Throwable {
        steps.theButtonDisplayedAsSaved(arg0);
    }

    @When("^Enter \"([^\"]*)\" text to the text field$")
    public void enterTextToTheTextField(String arg0) throws Throwable {
       steps.enterTextToTheTextField(arg0);
    }

    @Then("^Applied job is displayed in the \"([^\"]*)\" tab$")
    public void appliedJobIsDisplayedInTheTab(String arg0) throws Throwable {
        steps.appliedJobIsDisplayedInTheTab(arg0);
    }



    @When("^Click on the \"([^\"]*)\" button at the appropriate job title$")
    public void clickOnTheButtonAtTheAppropriateJobTitle(String arg0) throws Throwable {
        steps.clickOnTheButtonAtTheAppropriateJobTitle(arg0);
    }

    @When("^Click on the \"([^\"]*)\" button at the job preview page$")
    public void clickOnTheButtonAtTheJobPreviewPage(String arg0) throws Throwable {
        steps.clickOnTheButtonAtTheJobPreviewPage(arg0);
    }

    @Then("^The job name is displayed at the applicants page$")
    public void theJobNameIsDisplayedAtTheApplicantsPage() {
        steps.theJobNameIsDisplayedAtTheApplicantsPage();
    }



    @Then("^The \"([^\"]*)\" name of first applicant is displayed$")
    public void theNameOfFirstApplicantIsDisplayed(String arg0) throws Throwable {
      steps.theNameOfFirstApplicantIsDisplayed(arg0);
    }

    @Then("^The \"([^\"]*)\" name of second applicant is displayed$")
    public void theNameOfSecondApplicantIsDisplayed(String arg0) throws Throwable {
      steps.theNameOfSecondApplicantIsDisplayed(arg0);
    }

    @Then("^The current received date is displayed$")
    public void theCurrentReceivedDateIsDisplayed() {
        steps.theCurrentReceivedDateIsDisplayed();
    }


    @Then("^The message link of first applicant has right email address \"([^\"]*)\"$")
    public void theMessageLinkOfFirstApplicantHasRightEmailAddress(String arg0) throws Throwable {
        steps.theMessageLinkOfFirstApplicantHasRightEmailAddress(arg0);
    }

    @When("^Open profile details popup of the first applicant$")
    public void openProfileDetailsPopupOfTheFirstApplicant() {
        steps.openProfileDetailsPopupOfTheFirstApplicant();
    }

    @Then("^The \"([^\"]*)\" teacher name is displayed$")
    public void theTeacherNameIsDisplayed(String arg0) throws Throwable {
       steps.theTeacherNameIsDisplayed(arg0);
    }

    @Then("^The \"([^\"]*)\" section is displayed$")
    public void theSectionIsDisplayed(String arg0) throws Throwable {
        steps.theSectionIsDisplayed(arg0);
    }

    @Then("^The \"([^\"]*)\" teacher name is displayed at the accordion section$")
    public void theTeacherNameIsDisplayedAtTheAccordionSection(String arg0) throws Throwable {
    steps.theTeacherNameIsDisplayedAtTheAccordionSection(arg0);
    }

    @Then("^The \"([^\"]*)\" field contains the \"([^\"]*)\" attached document$")
    public void theFieldContainsTheAttachedDocument(String arg0, String arg1) throws Throwable {
       steps.theFieldContainsTheAttachedDocument(arg0,arg1);
    }

    @Then("^The covering message is displayed$")
    public void theCoveringMessageIsDisplayed() {
        steps.theCoveringMessageIsDisplayed();
    }

    @Then("^The odro site is opened in the new tab after clicking on the prescreening questions link$")
    public void theOdroSiteIsOpenedInTheNewTabAfterClickingOnThePrescreeningQuestionsLink(List<String>list) {
        steps.theOdroSiteIsOpenedInTheNewTabAfterClickingOnThePrescreeningQuestionsLink(list);
    }

    @When("^Click on the link at the Video Prescreening Questions field$")
    public void clickOnTheLinkAtTheVideoPrescreeningQuestionsField() {
        steps.clickOnTheLinkAtTheVideoPrescreeningQuestionsField();

    }

    @Then("^Applied job isn't displayed in the \"([^\"]*)\" tab$")
    public void appliedJobIsnTDisplayedInTheTab(String arg0) throws Throwable {
        steps.appliedJobIsnTDisplayedInTheTab(arg0);
        }

    @When("^Click on the appropriate job title at the \"([^\"]*)\" tab$")
    public void clickOnTheAppropriateJobTitleAtTheTab(String arg0) throws Throwable {
       steps.clickOnTheAppropriateJobTitleAtTheTab(arg0);
    }

    @When("^Add to the job name field \"([^\"]*)\"$")
    public void addToTheJobNameField(String arg0) throws Throwable {
         steps.addToTheJobNameField(arg0);
    }

    @Then("^Job title is right displayed$")
    public void jobTitleIsRightDisplayed() {
        steps.jobTitleIsRightDisplayed();
    }

    @When("^Check if entered user already exists and regenerate new email$")
    public void checkIfEnteredUserAlreadyExistsAndRegenerateNewEmail() {
        steps.checkIfEnteredUserAlreadyExistsAndRegenerateNewEmail();
    }

    @When("^Create Logic Melon job through API$")
    public void createLogicMelonJobThroughAPI(List<String>list) throws IOException, ParseException {
        steps.createLogicMelonJobThroughAPI(list);
    }

    @Then("^Appropriate job is displayed in the TRENDING JOBS banner$")
    public void appropriateJobIsDisplayedInTheTRENDINGJOBSBanner() {
        steps.appropriateJobIsDisplayedInTheTRENDINGJOBSBanner();
    }

    @When("^Click on the appropriate job title at the banner$")
    public void clickOnTheAppropriateJobTitleAtTheBanner() {
        steps.clickOnTheAppropriateJobTitleAtTheBanner();
    }

    @When("^Check booking creation status$")
    public void checkBookingCreationStatus() throws IOException, ParseException {
        steps.checkBookingCreationStatus();
    }


    //    @When("^Open report$")
//    public void openReport() throws Throwable {
//        steps.openReport();
//    }
}

