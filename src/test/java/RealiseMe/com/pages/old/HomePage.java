package RealiseMe.com.pages.old;

import RealiseMe.com.xpath_locators.old.ILocators;
import net.serenitybdd.core.pages.PageObject;

import java.util.ArrayList;

public class HomePage extends PageObject {

    public ArrayList<String> firstTableContainsTitle(String arg0) {
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");
        if (arg0.equals($(ILocators.firstTable_titile1).getText())) {
            results.set(0, "true");
        } else {
            results.set(0, "false");
            results.add("Expected: " + arg0 + "; but found: " + $(ILocators.firstTable_titile1).getText() + "\n");
        }
        return results;
    }

    public ArrayList<String> secondTableContainsTitle(String arg0) {
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");
        if (arg0.equals($(ILocators.firstTable_titile2).getText())) {
            results.set(0, "true");
        } else {
            results.set(0, "false");
            results.add("Expected: " + arg0 + "; but found: " + $(ILocators.firstTable_titile2).getText() + "\n");
        }
        return results;
    }

    public boolean tableContainsViewAllButton(String arg0) {
        try {
            if (!$(ILocators.viewall_button1).getText().equals(arg0)) {
                return false;
            }
        } catch (Exception e) {
        }
        try {
            if (!$(ILocators.viewall_button2).getText().equals(arg0)) {
                return false;
            }
        } catch (Exception e) {
        }
        return true;
    }

    public boolean theFiveLinesInTheTableAreDisplayed() {
        if (!$(ILocators.first_line).isPresent() &&
                !$(ILocators.second_line).isPresent() &&
                !$(ILocators.third_line).isPresent() &&
                !$(ILocators.fourth_line).isPresent() &&
                !$(ILocators.fifth_line).isPresent()) {
            return false;
        } else return true;
    }
}
