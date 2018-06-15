package RealiseMe.com.pages;

import RealiseMe.com.ILocators;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

import java.util.ArrayList;
import java.util.List;

@DefaultUrl("http://qa.realiseme.com.s3-website-us-east-1.amazonaws.com")

public class LoginPage extends PageObject {

    public boolean loginPageContainsPictures() {
        $(ILocators.image_school).isPresent();
        $(ILocators.image_teacher).isPresent();
        return true;
    }

    public ArrayList<String> loginPageContains(List<String> list) {
        ArrayList<String> labels = new ArrayList<>();
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");
        if (!$(ILocators.text_teacher).isPresent()
                || !$(ILocators.text_school).isPresent()
                ||!$(ILocators.sign_in_teacher).isPresent()
                ||!$(ILocators.sign_in_school).isPresent()){
            results.set(0, "false");
            results.add("Text is absent" + "\n");
        }else {
            labels.add($(ILocators.text_teacher).getText().replaceAll("\n"," "));
            labels.add($(ILocators.text_school).getText().replaceAll("\n"," "));
            labels.add($(ILocators.sign_in_teacher).getText());
            labels.add($(ILocators.sign_in_school).getText());

            for (int i = 0; i < list.size(); i++) {
                if (!list.get(i).equals(labels.get(i))) {
                    results.set(0, "false");
                    results.add("Expected: " + list.get(i) + "; but found: " + labels.get(i) + "\n");
                }
            }
        }
        return results;
    }

    public void clickOnTheSignInTeacherButton() {
        $(ILocators.sign_in_teacher).click();
    }

    public void clickOnTheSignInSchoolButton() {
        $(ILocators.sign_in_school).click();
    }
}
