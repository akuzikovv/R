package RealiseMe.com.steps;


import RealiseMe.com.pages.CorePageObjects;
import RealiseMe.com.xpath_locators.LoginPageLocators;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;


public class LogInPageSteps extends ScenarioSteps {

    private CorePageObjects core;

    @Then("^Login page is opened$")
    public void landingPageLoginPageIsOpened() {
        String xpath = LoginPageLocators.XPATH_LOGIN_PAGE;
        Assert.assertTrue("Login page is not opened by xpath: " + xpath,
                core.elementByXpathIsVisible(xpath));
    }

    @Then("^Login page > \"([^\"]*)\" tab is selected$")
    public void landingPageLoginPageTabIsSelected(String nameButton) {
        String xpath = LoginPageLocators.XPATH_LOG_IN_AND_SIGN_UP_BUTTONS.replace("$1", nameButton);
        Assert.assertTrue("Log In or Sign Up button is not selected by xpath: " + xpath,
                core.elementByXpathIsVisible(xpath));
    }

    @Then("^Login page > The \"([^\"]*)\" role is selected$")
    public void loginPageTheRoleIsSelected(String nameRole) {
        String xpath = LoginPageLocators.XPATH_ROLE_FIELD.replace("$1", nameRole);
        Assert.assertTrue("Needed role is not selected by xpath: " + xpath,
                core.elementByXpathIsVisible(xpath));
    }

    @And("^Login page > Click on the Login button$")
    public void loginPageClickOnTheLoginButton() {
        core.clickOnElementByXpath(LoginPageLocators.XPATH_LOGIN_BUTTON);
    }

    @And("^Login page > Enter \"([^\"]*)\" text into Login input field$")
    public void loginPageEnterTextIntoLoginInputField(String login) {
        core.typeTextIntoInputFieldByXpath(LoginPageLocators.XPATH_LOGIN_INPUT_FIELD, login);
    }

    @And("^Login page > Enter \"([^\"]*)\" text into Password field$")
    public void loginPageEnterTextIntoPasswordField(String password) {
        core.typeTextIntoInputFieldByXpath(LoginPageLocators.XPATH_PASSWORD_INPUT_FIELD, password );
    }
}