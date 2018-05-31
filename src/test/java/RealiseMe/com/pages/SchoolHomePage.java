package RealiseMe.com.pages;

import RealiseMe.com.ILocators;
import net.thucydides.core.pages.PageObject;

import java.util.ArrayList;
import java.util.List;

public class SchoolHomePage  extends PageObject{

    public ArrayList<String> schoolLeftPanelContainsAllNecessaryElements(List<String> list) {
        ArrayList<String> labels = new ArrayList<>();
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");
        if (!$(ILocators.left_panel).isPresent()
                || !$(ILocators.welcome).isPresent()
                || !$(ILocators.add_photo).isPresent()
                || !$(ILocators.second_row).isPresent()
                || !$(ILocators.third_row).isPresent()
                || !$(ILocators.fourth_row).isPresent()
                || !$(ILocators.second_row_title).isPresent()
                || !$(ILocators.number_of_visitors).isPresent()
                ) {
            results.set(0, "false");
            results.add("Left column is wrong" + "\n");
        } else {
            labels.add($(ILocators.first_row).getCssValue("background-color"));
            labels.add($(ILocators.welcome).getText());
            labels.add($(ILocators.add_photo).getText());
            labels.add($(ILocators.second_row_title).getText());
            labels.add($(ILocators.second_row_link).getText());
            labels.add($(ILocators.third_row_link).getText());
            labels.add($(ILocators.fourth_row_title).getText());
            labels.add($(ILocators.fourth_row_1).getText());
            labels.add($(ILocators.fourth_row_2).getText());
            labels.add($(ILocators.fourth_row_3).getText());
            for (int i = 0; i < list.size(); i++) {
                if (!list.get(i).equals(labels.get(i))) {
                    results.set(0, "false");
                    results.add("Expected: " + list.get(i) + "; but found: " + labels.get(i) + "\n");
                }
            }
        }
        return results;
    }

    public ArrayList<String> schoolfirstTableContainsAllNecessaryColumns(List<String> list) {
        ArrayList<String> labels = new ArrayList<>();
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");
        if (!$(ILocators.table_columns_header).isPresent()) {
            results.set(0, "false");
            results.add("Table columns header is absent" + "\n");
        } else {
            labels.add($(ILocators.first_column).getText());
            labels.add($(ILocators.second_column).getText());
            labels.add($(ILocators.third_column).getText());
            labels.add($(ILocators.fourth_column).getText());
            labels.add($(ILocators.fifth_column).getText());
//            labels.add($(ILocators.sixth_column).getText());
            for (int i = 0; i < list.size(); i++) {
                if (!list.get(i).equals(labels.get(i))) {
                    results.set(0, "false");
                    results.add("Expected: " + list.get(i) + "; but found: " + labels.get(i) + "\n");
                }
            }
        }
        return results;
    }
}
