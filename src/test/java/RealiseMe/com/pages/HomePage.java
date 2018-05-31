package RealiseMe.com.pages;

import RealiseMe.com.ILocators;
import com.opera.core.systems.scope.protos.ExecProtos;
import net.thucydides.core.pages.PageObject;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends PageObject {



    public ArrayList<String> tableContainsTitle(String arg0) {
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");
        try {
            if (!$(ILocators.firstTable_titile1).isPresent()) {
                results.set(0, "false");
                results.add("Title is absent" + "\n");
            } else {
                if (!arg0.equals($(ILocators.firstTable_titile1).getText())) {
                    results.set(0, "false");
                    results.add("Expected: " + arg0 + "; but found: " + $(ILocators.firstTable_titile1).getText() + "\n");
                }
            }
        }catch (Exception e){}

        try {
            if (!$(ILocators.firstTable_titile2).isPresent()) {
                results.set(0, "false");
                results.add("Title is absent" + "\n");
            } else {
                if (!arg0.equals($(ILocators.firstTable_titile2).getText())) {
                    results.set(0, "false");
                    results.add("Expected: " + arg0 + "; but found: " + $(ILocators.firstTable_titile2).getText() + "\n");
                }
            }
        }catch (Exception e){}


        return results;
    }

    public boolean tableContainsViewAllButton(String arg0) {
        try {
            if (!$(ILocators.viewall_button1).getText().equals(arg0)) {
                return false;
            }

        }catch (Exception e){}

        try {
            if (!$(ILocators.viewall_button2).getText().equals(arg0)) {
                return false;
            }

        }catch (Exception e){}


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
