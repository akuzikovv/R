package RealiseMe.com.pages.School;

import RealiseMe.com.ILocators;
import RealiseMe.com.pages.CommonActions.CommonActions;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;

public class SchoolBookingsPage extends PageObject {

    private int counter;
    CommonActions  commonActions;

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

    public void enterTextToTheNameYourJobPostingField(String arg0) {
        $(ILocators.Name_your_job_posting_input).waitUntilVisible().type(arg0);
//        $(ILocators.Name_your_job_posting_input).type(arg0);

    }

    public void enterTextToTheDescribeTheJobField(String arg0) {
        $(ILocators.Describethe_job_input).sendKeys(arg0+ "\n"+"Lorem ipsum dolor sit amet, consectetuer adipiscing elit. ");
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

    public ArrayList<String> checkUnclearedPopup(String arg0) {
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");
        if ($(ILocators.Uncleared_status).isPresent() & !getDriver().findElement(By.xpath("//div[contains(text(),'You have selected a teacher that has not yet completed clearance.')]")).getText().equals(arg0) ) {
            results.set(0, "false");
            results.add("Text in the uncleared popup is absent or wrong" + "\n");
        } else {

        }
        return results;
    }

    public void clickOnTheButtonAtTheTeacherWithStatus(String arg0) {
      for (int i = 1 ; i <11 ;i++){
          if (getDriver().findElement(By.xpath("(//div[@class='table-status']//span)[" + i + "]")).getText().equals(arg0)){
              getDriver().findElement(By.xpath("(//div[@class='invite-to-job'])[" + i + "]")).click();
              break;
          }
          if ((i==10) & !getDriver().findElement(By.xpath("(//div[@class='table-status']//span)[" + i + "]")).getText().equals(arg0)) {
              getDriver().findElement(By.xpath("//span[contains(text(),'Next')]")).click();
          i=0;
          }
      }
    }

    public ArrayList<String> checkPengingPopup(String arg0) {
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");
        if ($(ILocators.Pending_status).isPresent() & !getDriver().findElement(By.xpath("//div[contains(text(),'You have selected a teacher whose DBS clearance is')]")).getText().equals(arg0) ) {
            results.set(0, "false");
            results.add("Text in the uncleared popup is absent or wrong" + "\n");
        } else {

        }
        return results;
    }

    public boolean theOKButtonIsnTClickable() {
        if ($(ILocators.Disabled_OK).isPresent()){
            return true;
        }
        else return false;
    }

    public void clickOnTheButtonAtTheTeacherWithName(String arg0) {
        for (int i = 0 ; i <20 ;i++){
            i=i+1;
            if (getDriver().findElement(By.xpath("(//div[@class='table-info']//p)[" + i + "]")).getText().equals(arg0)){
                getDriver().findElement(By.xpath("(//div[@class='invite-to-job'])[" + i + "]")).click();
                break;
            }
            if ((i==19) & !getDriver().findElement(By.xpath("(//div[@class='table-status']//span)[" + i + "]")).getText().equals(arg0) & (commonActions.isElementPresent("//span[contains(text(),'Next')]"))) {
                getDriver().findElement(By.xpath("//span[contains(text(),'Next')]")).click();
                i=0;
            }
        }
    }

    public void findAcceptedInviteWithJobTitle(String arg0) {
        counter=0;
        for (int y = 1; y < commonActions.getBookingCounter()+1; y++) {
            if (((!commonActions.isElementPresent("(//div[@class='table-row red-background'])["+ y +"]//a[@class='role']")) &
                    (commonActions.getBookingCounter() > 10) & (commonActions.isElementPresent("//span[contains(text(),'Next')]"))) ||
                    (y == 10) & (commonActions.getBookingCounter() > 10) & (commonActions.isElementPresent("//span[contains(text(),'Next')]"))){
                getDriver().findElement(By.xpath("//span[contains(text(),'Next')]")).click();
                y = 1;
                waitABit(1000);
            }
            if ((getDriver().findElement(By.xpath("(//div[@class='table-row red-background'])["+ y +"]//a[@class='role']")).getText().equals(arg0)) &
                    getDriver().findElement(By.xpath("(//div[@class='table-row red-background'])["+ y +"]//a[@class='role']")).isEnabled()) {
                counter = y;
                break;
            }
//            if ((y == 10) & (commonActions.getBookingCounter() > 10) & (getDriver().findElement(By.xpath("//span[contains(text(),'Next')]")).isDisplayed())) {
//                    getDriver().findElement(By.xpath("//span[contains(text(),'Next')]")).click();
//                    y = 1;
//            }
        }
    }

    public void approveAppropriateBooking() {
        getDriver().findElement(By.xpath("(//i[@class='icon-check icons'])["+ counter +"]")).click();
    }

    public ArrayList<String> enteredTeacherNameIsDisplayed(String arg) {
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");
        if (!getDriver().findElement(By.xpath("(//div[@class='table-row red-background']//p[contains(.,'Supply staff name')])["+counter+"]")).getText().substring(19).equals(arg)){
            results.set(0, "false");
            results.add("Expected: " + arg + "; but found: " +
                    getDriver().findElement(By.xpath("(//div[@class='table-row red-background']//p[contains(.,'Supply staff name')])["+counter+"]")).getText().substring(19) + "\n");
        }
        return results;

        }

    public ArrayList<String> attachedFileIsDisplayed(String arg0) {
        getDriver().findElement(By.xpath("(//div[@class='table-row red-background']//div[@class='profile-content'])["+counter+"]")).click();
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");
        if (!getDriver().findElement(By.xpath("(//div[@class='table-row red-background']//li//a)["+counter+"]")).getText().equals(arg0)){
            results.set(0, "false");
            results.add("Expected: " + arg0 + "; but found: " +
                    getDriver().findElement(By.xpath("(//div[@class='table-row red-background']//li//a)["+counter+"]")).getText() + "\n");
        }
        return results;

    }

    public ArrayList<String> theRateIsDisplayed(String arg0) {
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");
        if (!getDriver().findElement(By.xpath("(//div[@class='table-row red-background']//span[contains(.,'£')]/..)["+counter+"]")).getText().substring(2).equals(arg0)){
            results.set(0, "false");
            results.add("Expected: " + arg0 + "; but found: " +
                    getDriver().findElement(By.xpath("(//div[@class='table-row red-background']//span[contains(.,'£')]/..)["+counter+"]")).getText().substring(2) + "\n");
        }
        return results;
    }

    public void declineAppropriateBooking() {
        getDriver().findElement(By.xpath("(//i[@class='icon-close icons'])["+ counter +"]")).click();
    }
}

