package RealiseMe.com.pages;

import RealiseMe.com.ILocators;
import RealiseMe.com.pages.CommonActions.CommonActions;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

@DefaultUrl("http://uat.realiseme.com.s3-website-us-east-1.amazonaws.com")
public class LandingPage extends PageObject {
    CommonActions commonActions;

    public void enterToTheSearchField(String arg0) {
        $(ILocators.keyword_search).type(arg0);
    }

    public void clickSearchButton() {
        $(ILocators.search_button).click();
        waitABit(1000);
    }

    public ArrayList<String> firstSearchResult(String arg0) {
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");
        if (arg0.equals($(ILocators.first_result).getText())) {
            results.set(0, "true");

        } else {
            results.set(0, "false");
            results.add("Expected: " + arg0 + "; but found: " + $(ILocators.first_result).getText() + "\n");
        }
        return results;
    }

    public void clickOnTheSaveButton() {
        $(ILocators.first_result_save_button).click();

    }

    public boolean theButtonIsHighlighted(String arg0) {
        if (arg0.equals($(ILocators.first_result_saved_button).getText())) {
            return true;
        }
        else return false;
    }

    public void clickOnTheJobTitle() {
        $(ILocators.first_result).click();
    }

    public ArrayList<String> theJobPreviewPageIsOpenedWithNecessaryElements(List<String> list) {
        ArrayList<String> labels = new ArrayList<>();
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");
        if (!$(ILocators.preview).isPresent()||
                !$(ILocators.job_title).isPresent()||
                !$(ILocators.location).isPresent()||
                !$(ILocators.location_icon).isPresent()||
                !$(ILocators.calendar_icon).isPresent()||
                !$(ILocators.posted).isPresent()||
                !$(ILocators.alarm_icon).isPresent()||
                !$(ILocators.apply_on).isPresent()||
                !$(ILocators.school).isPresent()||
                !$(ILocators.job_description).isPresent()||
                !$(ILocators.apply_button).isPresent()||
                !$(ILocators.contract_type).isPresent()||
                !$(ILocators.contract_term).isPresent()||
                !$(ILocators.salary).isPresent()||
                !$(ILocators.school_profile).isPresent()||
                !$(ILocators.skills).isPresent()||
                !$(ILocators.documents).isPresent()||
                !$(ILocators.video_prescreening).isPresent()||
                !$(ILocators.video_interview).isPresent()
                ) {
            results.set(0, "false");
            results.add("Table columns header is absent" + "\n");
        } else {
            labels.add($(ILocators.preview).getText());
            labels.add($(ILocators.job_title).getText());
            labels.add($(ILocators.posted).getText().trim());
            labels.add($(ILocators.apply_on).getText().trim());
            labels.add($(ILocators.school).getText());
            labels.add($(ILocators.job_description).getText());
            labels.add($(ILocators.apply_button).getText());
            labels.add($(ILocators.contract_type).getText());
            labels.add($(ILocators.contract_term).getText());
            labels.add($(ILocators.salary).getText());
            labels.add($(ILocators.school_profile).getText());
            labels.add($(ILocators.skills).getText());
            labels.add($(ILocators.documents).getText());
            labels.add($(ILocators.video_prescreening).getText());
            labels.add($(ILocators.video_interview).getText());
            for (int i = 0; i < list.size(); i++) {
                if (!list.get(i).equals(labels.get(i))) {
                    results.set(0, "false");
                    results.add("Expected: " + list.get(i) + "; but found: " + labels.get(i) + "\n");
                }
            }
        }
        return results;
    }

    public void clickOnTheApplyButton() {
        $(ILocators.apply_button).click();
    }

    public void clickOnTheLoginButton() {
//        waitFor($(ILocators.login).waitUntilClickable());
      commonActions.waitUntilElementVisible(ILocators.login,60);
        $(ILocators.login).click();
    }

    public ArrayList<String> clickOnTheSignSchool_Landing_Button(String arg0) {
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");
        commonActions.waitUntilElementVisible(ILocators.school_sign_in,60);
        if ($(ILocators.school_sign_in).getText().replace("\n", " ").equals(arg0)){
            $(ILocators.school_sign_in).click();
            results.set(0, "true");
        }else {
            results.set(0, "false");
            results.add("Expected: " + arg0 + "; but found: " + $(ILocators.school_sign_in).getText().replace("\n", " ") + "\n");
        }
            return results;
    }

    public void clickOnTheAgreeButtonAtTheBanner() {
       commonActions.waitUntilElementVisible(ILocators.cookies_button,60);
        $(ILocators.cookies_button).click();
    }

    public void enterJobTitleToTheSearchField() {
//        System.out.println("SOUT="+Serenity.getCurrentSession().getMetaData().get("job name").toString());
        commonActions.waitUntilElementVisible("//input[@placeholder='enter keyword']",60);
        getDriver().findElement(By.xpath("//input[@placeholder='enter keyword']")).sendKeys(Serenity.getCurrentSession().getMetaData().get("job name"));

    }

    public void clickOnTheAppropriateJobTitle() {
        try {
            getDriver().findElement(By.xpath("//div[@class='job-table__item desktop']//a[@class='job-header__title' and contains(.,'" + Serenity.getCurrentSession().getMetaData().get("job name") + "')]")).click();
        }catch (Exception e){}
        try {
            getDriver().findElement(By.xpath("//a[contains(.,'"+Serenity.getCurrentSession().getMetaData().get("job name")+"')]")).click();
            }catch (Exception e){}

    }

    public void clickOnTheButtonAtTheAppropriateJob(String arg0) {
        try {
            getDriver().findElement(By.xpath("//div[@class='job-table__item desktop']//a[@class='job-header__title' and contains(.,'" + Serenity.getCurrentSession().getMetaData().get("job name") + "')]//./../..//button[contains(.,'" + arg0 + "')]")).click();
        }catch (Exception e){}
        try {
            getDriver().findElement(By.xpath("//div[@class='job-table__item desktop']//a[@class='job-header__title' and contains(.,'" + Serenity.getCurrentSession().getMetaData().get("job name") + "')]//./../..//a[contains(.,'" + arg0 + "')]")).click();
        }catch (Exception e){}
        try {
            getDriver().findElement(By.xpath(" //a[contains(.,'"+ Serenity.getCurrentSession().getMetaData().get("job name") +"')]/../../..//div[contains(.,'"+arg0+"')]")).click();
        }catch (Exception e){}
    }

    public void clickOnTheAppropriateJobTitleAtTheBanner() {
        getDriver().findElement(By.xpath("//span[contains(.,'"+Serenity.getCurrentSession().getMetaData().get("job name")+"')]")).click();
    }
}
