package RealiseMe.com.Header;

import RealiseMe.com.ILocators;
import net.thucydides.core.pages.PageObject;

import java.util.ArrayList;
import java.util.List;

public class Header extends PageObject {

    public ArrayList<String> headerContainsTextbuttons(List<String> list) {
        ArrayList<String> labels = new ArrayList<>();
        ArrayList<String> results = new ArrayList<>();
        try {
            results.add(0, "true");
            if (!$(ILocators.home).isPresent()) {
                results.set(0, "false");
                results.add("Header is absent" + "\n");
            } else {
                labels.add($(ILocators.home).getText());
                labels.add($(ILocators.messaging).getText());
                labels.add($(ILocators.bookings).getText());
                labels.add($(ILocators.jobs).getText());
                for (int i = 0; i < list.size(); i++) {
                    if (!list.get(i).equals(labels.get(i))) {
                        results.set(0, "false");
                        results.add("Expected: " + list.get(i) + "; but found: " + labels.get(i) + "\n");
                    }
                }
            }
        } catch (Exception e) {
        }
        try {
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
        } catch (Exception e) {
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
        if (!$(ILocators.user_name).getText().equals(arg0)) {
            results = ("Expected: " + arg0 + "; but found: " + $(ILocators.user_name).getText() + "\n");
        }
        return results;
    }

    public boolean headerContainsArrowDownButton() {
        $(ILocators.arrow_down_button).isPresent();
        return true;
    }

    public boolean clickOnTheArrowDownButton() {
        if (!$(ILocators.arrow_down_button).isPresent()) {
            return false;
        } else $(ILocators.arrow_down_button).click();
        return true;
    }

    public boolean clickOnTheLOGOUTButton() {
        if (!$(ILocators.LOGOUT_BUTTON).isPresent()) {
            return false;
        } else $(ILocators.LOGOUT_BUTTON).click();
        return true;
    }
}
