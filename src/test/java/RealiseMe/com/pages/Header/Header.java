package RealiseMe.com.pages.Header;

import RealiseMe.com.ILocators;
import RealiseMe.com.pages.CommonActions.CommonActions;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class Header extends PageObject {
    CommonActions commonActions;

    public ArrayList<String> landingPageHeaderContainsTextbuttons(List<String> list) {
        ArrayList<String> labels = new ArrayList<>();
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");
        if (!$(ILocators.blog).isPresent()) {
            results.set(0, "false");
            results.add("Header is absent" + "\n");
        } else {
            labels.add($(ILocators.blog).getText());
            labels.add($(ILocators.forum).getText());
            labels.add($(ILocators.login).getText());
            labels.add($(ILocators.sign_up).getText());
            for (int i = 0; i < list.size(); i++) {
                if (!list.get(i).equals(labels.get(i))) {
                    results.set(0, "false");
                    results.add("Expected: " + list.get(i) + "; but found: " + labels.get(i) + "\n");
                }
            }
        }
        return results;
    }

    public ArrayList<String> headerContainsTextbuttons(List<String> list) {
        ArrayList<String> labels = new ArrayList<>();
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");
        if (!$(ILocators.dashboard).isPresent()) {
            results.set(0, "false");
            results.add("Header is absent" + "\n");
        } else {
            labels.add($(ILocators.dashboard).getText());
//            labels.add($(ILocators.messaging).getText());
            labels.add($(ILocators.jobs).getText());
            labels.add($(ILocators.bookings).getText());
            for (int i = 0; i < list.size(); i++) {
                if (!list.get(i).equals(labels.get(i))) {
                    results.set(0, "false");
                    results.add("Expected: " + list.get(i) + "; but found: " + labels.get(i) + "\n");
                }
            }
        }
        return results;
    }

    public boolean headerContainsBellIcon() {
        $(ILocators.bell_icon).isPresent();
        return true;
    }

    public boolean headerContainsUserPhotoIcon() {
        $(ILocators.user_photo_icon).isPresent();
        return true;
    }

    public String headerContainsUserName(String arg0) {
        String results = "true";
        if (!$(ILocators.user_name).getText().trim().equals(arg0)) {
            results = ("Expected: " + arg0 + "; but found: " + $(ILocators.user_name).getText() + "\n");
        }
        return results;
    }

    public boolean headerContainsArrowDownButton() {
        $(ILocators.arrow_down_button).isPresent();
        return true;
    }

    public boolean clickOnTheArrowDownButton() {
        commonActions.waitUntilElementVisible(ILocators.arrow_down_button,60);
        if (!$(ILocators.arrow_down_button).isPresent()) {
            return false;
        } else {
//            waitABit(2000);
            commonActions.waitUntilElementIsClickable(ILocators.arrow_down_button,60);
            $(ILocators.arrow_down_button).click();

            return true;
        }
    }

    public boolean clickOnTheLOGOUTButton() {

        commonActions.waitUntilElementVisible(ILocators.LOGOUT_BUTTON,60);
        if (!$(ILocators.LOGOUT_BUTTON).isPresent()) {
            return false;
        } else {
            commonActions.waitUntilElementVisible(ILocators.LOGOUT_BUTTON,60);
            $(ILocators.LOGOUT_BUTTON).click();
            return true;
        }

    }

    public void clickOnTheButtonInTheHeader(String arg0) {
        waitABit(5000);
        commonActions.waitUntilElementVisible("//div[@class='btn__content' and contains(.,'" + arg0 +"')]",60);
        WebElement xpath = getDriver().findElement(By.xpath("//div[@class='btn__content' and contains(.,'" + arg0 +"')]"));
        xpath.click();
    }
}
