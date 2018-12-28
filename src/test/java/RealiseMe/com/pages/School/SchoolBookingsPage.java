package RealiseMe.com.pages.School;

import RealiseMe.com.ILocators;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SchoolBookingsPage extends PageObject {

    public ArrayList<String> newSupplyBookingPageContainsAllNecessaryText(List<String> list) {
        ArrayList<String> labels = new ArrayList<>();
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");
        if (!$(ILocators.Find_Supply_Staff).isPresent() ||
                !$(ILocators.START_SEARCH).isPresent() ||
                !$(ILocators.I_want_to_use_my_saved_search).isPresent()
                ) {
            results.set(0, "false");
            results.add("Some Text are absent or wrong" + "\n");
        } else {
            labels.add($(ILocators.Find_Supply_Staff).getText().trim());
            labels.add($(ILocators.START_SEARCH).getText().trim());
            labels.add($(ILocators.SEARCH_RESULTS).getText().trim());
            labels.add($(ILocators.REVIEW_INVITATIONS).getText().trim().substring(0, 18));
            labels.add($(ILocators.INVITES).getText().trim().substring(0, 7));
            labels.add($(ILocators.I_want_to_use_my_saved_search).getText().trim());
            labels.add($(ILocators.Job_Details).getText().trim());
            labels.add($(ILocators.Name_your_job_posting_title).getText().trim());
//                labels.add($(ILocators.Name_your_job_posting_input).getText().trim());
            labels.add($(ILocators.Describethe_job_title).getText().trim());
            labels.add($(ILocators.characters_left).getText().trim());
            labels.add($(ILocators.Teacher_type).getText().trim());
            labels.add($(ILocators.Teacher_checkbox_title).getText().trim());
            labels.add($(ILocators.TA_checkbox_title).getText().trim());
            labels.add($(ILocators.Dates_required).getText().trim());
            labels.add($(ILocators.Note1).getText().trim());
            labels.add($(ILocators.Rate_title).getText().trim());
            labels.add($(ILocators.Note2).getText().trim());
            labels.add($(ILocators.Any_specialist_subject_required_title).getText().trim());
            labels.add($(ILocators.Any_age_group_required_title).getText().trim());
            labels.add($(ILocators.Additional_documents_title).getText().trim());
            labels.add($(ILocators.Anonymisation_title).getText().trim());
            labels.add($(ILocators.Anonymisation_text).getText().trim());
            labels.add($(ILocators.I_want_to_save_this_search_for_future_use_title).getText().trim());
            labels.add($(ILocators.Invite_a_coworker_booking).getText().trim());
            labels.add($(ILocators.SHOW_RESULTS).getText().trim());
            labels.add($(ILocators.Please_fill_in_all_required_fields_to_continue).getText().trim());
            for (int i = 0; i < list.size(); i++) {
                if (!list.get(i).equals(labels.get(i))) {
                    results.set(0, "false");
                    results.add("Expected: " + list.get(i) + "; but found: " + labels.get(i) + "\n");
                }
            }
        }
        return results;
    }

    public void enterTextToTheNameYourJobPostingField() {
        $(ILocators.Name_your_job_posting_input).type("Autotest Booking");
    }

    public void enterTextToTheDescribeTheJobField() {
        $(ILocators.Describethe_job_input).sendKeys("Lorem ipsum dolor sit amet, consectetuer adipiscing elit. ");
    }

    public void chooseFullDayInTheMonthOfAvailableCalendar(String arg0, String arg1) {
        WebElement xpath = getDriver().findElement(By.xpath("(//span[contains(.,'" + arg0 + "')])[" + arg1 + "]"));
        xpath.click();
    }

    public void chooseHalfDayInTheMonthOfAvailableCalendar(String arg0, String arg1) {
        WebElement xpath = getDriver().findElement(By.xpath("(//span[contains(.,'" + arg0 + "')])[" + arg1 + "]"));
        xpath.click();
        xpath.click();
    }

    public void chooseFullDayStartTime(String arg0) {
        $(ILocators.Full_Day_Start_time).click();
        WebElement xpath = getDriver().findElement(By.className("list")).findElement(By.xpath("//div[contains(@class,'__active')]//div[text()='"+arg0+"']"));
        xpath.click();
    }

    public void chooseFullDayEndTime(String arg0) {
        $(ILocators.Full_Day_End_time).click();
        WebElement xpath = getDriver().findElement(By.className("list")).findElement(By.xpath("//div[contains(@class,'__active')]//div[text()='"+arg0+"']"));
        xpath.click();
    }

    public void chooseHalfDayStartTime(String arg0) {
        $(ILocators.Half_Day_Start_time).click();
        WebElement xpath = getDriver().findElement(By.className("list")).findElement(By.xpath("//div[contains(@class,'__active')]//div[text()='"+arg0+"']"));
        xpath.click();
    }

    public void chooseHalfDayEndTime(String arg0) {
        $(ILocators.Half_Day_End_time).click();
        WebElement xpath = getDriver().findElement(By.className("list")).findElement(By.xpath("//div[contains(@class,'__active')]//div[text()='"+arg0+"']"));
        xpath.click();
    }

    public void enterRate(String arg0) {
        $(ILocators.Rate_input).type(arg0);
    }
}

