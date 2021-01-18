package RealiseMe.com.pages;

import RealiseMe.com.ILocators;
import RealiseMe.com.pages.CommonActions.CommonActions;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;

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
        commonActions.waitUntilElementVisible(ILocators.Email_field,60);
        if (commonActions.isElementPresent(ILocators.Email_field)) {
            $(ILocators.Email_field).type(arg0);
        }else {
            commonActions.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ILocators.Email_field)));
            $(ILocators.Email_field).type(arg0);
        }

    }

    public void enterPassword(String arg0) {
        $(ILocators.Password_field).type(arg0);
    }

    public void clickOnTheLogInButton() {
//        ArrayList<String> results = new ArrayList<>();
//        results.add(0, "true");
        $(ILocators.Log_In).click();
//        commonActions.waitUntilElementVisible("//div[@class='btn__content' and contains(.,'Dashboard')]",100);
//        if (!commonActions.isElementPresent("//div[@class='btn__content' and contains(.,'Dashboard')]")&& !commonActions.isElementPresent("//span[@class='animated fadeInUp']//span")){
//            results.set(0,"false");
//            System.out.println("false");
//        }
//        return results;
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

    public void checkIfEnteredUserAlreadyExistsAndRegenerateNewEmail() {
        commonActions.waitUntilElementVisible("//span[@class='animated fadeInUp']//span",5);
        if (commonActions.isElementPresent("//span[@class='animated fadeInUp']//span")) {
            System.out.println(getDriver().findElement(By.xpath("//span[@class='animated fadeInUp']//span")).getText());
            if (getDriver().findElement(By.xpath("//span[@class='animated fadeInUp']//span")).getText().equals("User already exists.")) {
                commonActions.waitUntilElementVisible(ILocators.Email_field,5);
                getDriver().findElement(By.xpath(ILocators.Email_field)).click();
                for (int i = 0; i < 50; i++) {
                    getDriver().findElement(By.xpath(ILocators.Email_field)).sendKeys(Keys.ARROW_RIGHT);
                }
                for (int i = 0; i < 50; i++) {
                    getDriver().findElement(By.xpath(ILocators.Email_field)).sendKeys(Keys.BACK_SPACE);
                }
//                getDriver().findElement(By.xpath(ILocators.Email_field)).clear();
                commonActions.enterLoginOfNewUser(Serenity.getCurrentSession().getMetaData().get("user type"));
                clickOnTheSIGNUPButton();
                checkIfEnteredUserAlreadyExistsAndRegenerateNewEmail();
            }
        }
    }
}
