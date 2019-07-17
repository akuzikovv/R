package RealiseMe.com.steps;
import RealiseMe.com.steps.serenity.EndUserSteps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class DefinitionSteps {

    @Steps
    EndUserSteps steps;

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


//    @When("^Open report$")
//    public void openReport() throws Throwable {
//        steps.openReport();
//    }
}

