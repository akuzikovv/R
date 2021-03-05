package RealiseMe.com.pages.old.Teacher;

import RealiseMe.com.xpath_locators.old.ILocators;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class OtherTeacherHomePage extends PageObject {

    public ArrayList<String> otherTeacherleftPanelContainsAllNecessaryElements(List<String> list) {
        ArrayList<String> labels = new ArrayList<>();
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");
//        if (!$(ILocators.left_panel).isPresent()
//                || !$(ILocators.second_row).isPresent()
//                || !$(ILocators.third_row).isPresent()
//                || !$(ILocators.fourth_row).isPresent()
////                || !$(ILocators.number_of_visitors).isPresent()
//                ) {
//            results.set(0, "false");
//            results.add("Left column is wrong" + "\n");
//        } else {
//        labels.add($(ILocators.first_row).getCssValue("background-color"));
        labels.add($(ILocators.add_photo).getText());
        labels.add(getDriver().findElement(By.xpath("//h3[contains(.,'" + list.get(1) + "')]")).getText());
        labels.add(getDriver().findElement(By.xpath("//a[contains(text(),'" + list.get(2) + "')]")).getText());
        labels.add(getDriver().findElement(By.xpath("//a[contains(text(),'" + list.get(3) + "')]")).getText());
        labels.add(getDriver().findElement(By.xpath("(//a[contains(text(),'" + list.get(4) + "')])[2]")).getText());
        labels.add(getDriver().findElement(By.xpath("(//a[contains(text(),'" + list.get(5) + "')])[2]")).getText());
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).equals(labels.get(i))) {
                results.set(0, "false");
                results.add("Expected: " + list.get(i) + "; but found: " + labels.get(i) + "\n");
            }
        }
//        }
        return results;
    }

    public ArrayList<String> teacherOtherfirstTableContainsAllNecessaryColumns(List<String> list) {
        ArrayList<String> labels = new ArrayList<>();
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");
        if (!$(ILocators.table_columns_header).isPresent()) {
            results.set(0, "false");
            results.add("Table columns header is absent" + "\n");
        } else {
//            labels.add($(ILocators.school_column).getText());
//            labels.add($(ILocators.date_column).getText());
//            labels.add($(ILocators.total_days_column).getText());
//            labels.add($(ILocators.rate_column).getText());
//            labels.add($(ILocators.accept_column).getText());
//            labels.add($(ILocators.decline_column).getText());
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
