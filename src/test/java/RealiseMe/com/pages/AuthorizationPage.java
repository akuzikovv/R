package RealiseMe.com.pages;

import RealiseMe.com.ILocators;
import RealiseMe.com.pages.CommonActions.CommonActions;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class AuthorizationPage extends PageObject {
    CommonActions commonActions;

    public ArrayList<String> authorizationPageContainsNecessaryElements(List<String> list) {
        ArrayList<String> labels = new ArrayList<>();
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");
        if (!$(ILocators.LOGO_IMAGE).isPresent()
                || !$(ILocators.Facebook).isPresent()
                ||!$(ILocators.Google).isPresent()
                ||!$(ILocators.Twitter).isPresent()
                ||!$(ILocators.OR_Image).isPresent()
                ||!$(ILocators.Email_field).isPresent()
                ||!$(ILocators.Password_field).isPresent()
                ||!$(ILocators.DontRememberPass).isPresent()
                ||!$(ILocators.Log_In).isPresent()
                ){
            results.set(0, "false");
            results.add("Text is absent" + "\n");
        }else {
            try {
                labels.add($(ILocators.DontRememberPass_for_school).getText());
            }catch (Exception e){}
            try {
                labels.add($(ILocators.DontRememberPass).getText());
            }catch (Exception e){}

            for (int i = 0; i < list.size(); i++) {
                if (!list.get(i).equals(labels.get(i))) {
                    results.set(0, "false");
                    results.add("Expected: " + list.get(i) + "; but found: " + labels.get(i) + "\n");
                }
            }
        }
        return results;
    }

    public void enterLogin(String arg0) {
        waitABit(4000);
        commonActions.wait = new WebDriverWait(getDriver(), 40);
        commonActions.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ILocators.Email_field)));
        $(ILocators.Email_field).type(arg0);
    }

    public void enterPassword(String arg0) {
        $(ILocators.Password_field).type(arg0);
    }

    public void clickOnTheLogInButton() {
        $(ILocators.Log_In).click();
    }

    public void clickOnTheSIGNUPButton() {
        $(ILocators.Sign_up).click();
    }

    public ArrayList<String> theMessageBeforeEmailVERIFICATIONIsDisplayed(String arg0) {
        ArrayList<String> labels = new ArrayList<>();
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");
        if (!commonActions.isElementPresent("//span[@class='animated fadeInUp']//span")){
            results.set(0, "false");
            results.add("Text is absent" + "\n");
        }else {
            waitABit(500);
                if (!getDriver().findElement(By.xpath("//span[@class='animated fadeInUp']//span")).getText().equals(arg0)) {
                    results.set(0, "false");
                    results.add("Expected: " + arg0 + "; but found: " + getDriver().findElement(By.xpath("//span[@class='animated fadeInUp']//span")).getText() + "\n");
                }
            }
        return results;
    }
}
