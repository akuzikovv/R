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

    @Then("^Table contains \"([^\"]*)\" title$")
    public void tableContainsTitle(String arg0) throws Throwable {
        steps.tableContainsTitle();
    }
}

