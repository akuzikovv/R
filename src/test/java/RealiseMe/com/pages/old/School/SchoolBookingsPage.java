package RealiseMe.com.pages.old.School;

import RealiseMe.com.xpath_locators.old.ILocators;
import RealiseMe.com.pages.old.CommonActions.CommonActions;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SchoolBookingsPage extends PageObject {

    private int counter;
    private static JSONParser parser = new JSONParser();
    CommonActions commonActions;

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
        commonActions.waitUntilElementVisible(ILocators.Name_your_job_posting_input,60);
//        try {
            $(ILocators.Name_your_job_posting_input).type(arg0);
//        } catch (Exception e) {
//        }
//        try {
//            $(ILocators.Name_your_job_posting_input_2).type(arg0);
//        } catch (Exception e) {
//        }

    }

    public void enterTextToTheDescribeTheJobField(String arg0) {
        $(ILocators.Describethe_job_input).sendKeys(arg0 + "\n" + "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. ");
    }

    public void chooseFullDayInTheMonthOfAvailableCalendar(String arg0, String arg1) {
        commonActions.waitUntilElementVisible("(//span[contains(.,'" + arg0 + "')])[" + arg1 + "]",60);
        WebElement xpath = getDriver().findElement(By.xpath("(//span[contains(.,'" + arg0 + "')])[" + arg1 + "]"));
        if (!xpath.getAttribute("class").equals("datepicker-table-cal datepicker-day available full-day")) {
            getDriver().findElement(By.xpath("//div[@class='right']")).click();
        }
        xpath = getDriver().findElement(By.xpath("(//span[contains(.,'" + arg0 + "')])[" + arg1 + "]"));
        xpath.click();
    }

    public void chooseHalfDayInTheMonthOfAvailableCalendar(String arg0, String arg1) {
        commonActions.waitUntilElementVisible("(//span[contains(.,'" + arg0 + "')])[" + arg1 + "]",60);
        WebElement xpath = getDriver().findElement(By.xpath("(//span[contains(.,'" + arg0 + "')])[" + arg1 + "]"));
        xpath.click();
        xpath.click();
    }

    public void chooseFullDayStartTime(String arg0) {
        commonActions.waitUntilElementVisible(ILocators.Full_day_start_clear_button,60);
        $(ILocators.Full_day_start_clear_button).click();
        commonActions.waitUntilElementVisible(ILocators.Full_Day_Start_time,60);
        $(ILocators.Full_Day_Start_time).click();
        WebElement xpath = getDriver().findElement(By.className("list")).findElement(By.xpath("//div[contains(@class,'__active')]//div[text()='" + arg0 + "']"));
        xpath.click();
    }

    public void chooseFullDayEndTime(String arg0) {
        $(ILocators.Full_day_end_clear_button).click();
        $(ILocators.Full_Day_End_time).click();
        WebElement xpath = getDriver().findElement(By.className("list")).findElement(By.xpath("//div[contains(@class,'__active')]//div[text()='" + arg0 + "']"));
        xpath.click();
    }

    public void chooseHalfDayStartTime(String arg0) {
        $(ILocators.Half_Day_Start_clear_button).click();
        $(ILocators.Half_Day_Start_time).click();
        WebElement xpath = getDriver().findElement(By.className("list")).findElement(By.xpath("//div[contains(@class,'__active')]//div[text()='" + arg0 + "']"));
        xpath.click();
    }

    public void chooseHalfDayEndTime(String arg0) {
        $(ILocators.Half_Day_end_clear_button).click();
        $(ILocators.Half_Day_End_time).click();
        WebElement xpath = getDriver().findElement(By.className("list")).findElement(By.xpath("//div[contains(@class,'__active')]//div[text()='" + arg0 + "']"));
        xpath.click();
    }

    public void enterRate(String arg0) {
        $(ILocators.Rate_input).type(arg0);
    }

    public ArrayList<String> checkUnclearedPopup(String arg0) {
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");
        if ($(ILocators.Uncleared_status).isPresent() & !getDriver().findElement(By.xpath("//div[@class='dialog Modal dialog--active dialog--persistent']//div[@class='title-body']")).getText().equals(arg0)) {
            results.set(0, "false");
            results.add("Text in the uncleared popup is absent or wrong" + "\n");
        } else {

        }
        return results;
    }

    public void clickOnTheButtonAtTheTeacherWithStatus(String arg0) {
        for (int i = 1; i < 11; i++) {
            if (getDriver().findElement(By.xpath("(//div[@class='table-status']//span)[" + i + "]")).getText().equals(arg0)) {
                getDriver().findElement(By.xpath("(//div[@class='invite-to-job'])[" + i + "]")).click();
                break;
            }
            if ((i == 10) & !getDriver().findElement(By.xpath("(//div[@class='table-status']//span)[" + i + "]")).getText().equals(arg0)) {
                getDriver().findElement(By.xpath("//span[contains(text(),'Next')]")).click();
                i = 0;
            }
        }
    }

    public ArrayList<String> checkPengingPopup(String arg0) {
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");
        if (!commonActions.isElementPresent("//div[@class='acceptDecline-body' and contains(.,'DBS')]")
                & !commonActions.isElementPresent("//div[contains(text(),'You have selected a teacher whose DBS clearance is')]")){
//        if ($(ILocators.Pending_status).isPresent() & !getDriver().findElement(By.xpath("//div[contains(text(),'You have selected a teacher whose DBS clearance is')]")).getText().equals(arg0)&
//        getDriver().findElement(By.xpath("//div[@class='acceptDecline-body' and contains(.,'DBS')]")).getText().equals(arg0)) {
            results.set(0, "false");
            results.add("Text in the pending popup is absent" + "\n");
        } else {


        }
        return results;
    }

    public boolean theOKButtonIsnTClickable() {
        if ($(ILocators.Disabled_OK).isPresent()) {
            return true;
        } else return false;
    }

    public void clickOnTheButtonAtTheTeacherWithName(String arg0) {
        if (getDriver().findElement(By.xpath("//a[contains(.,'AGENCIES')]")).getAttribute("class").equals("results router-link-exact-active active")) {
            for (int i = 1; i < 21; i++) {
//                i = i + 1;
                if (getDriver().findElement(By.xpath("(//div[@class='table-info']//p)[" + i + "]")).getText().equals(arg0)) {
                    getDriver().findElement(By.xpath("(//div[@class='invite-to-job'])[" + i + "]")).click();
                    break;
                }
                if ((i == 19) & !getDriver().findElement(By.xpath("(//div[@class='table-status']//span)[" + i + "]")).getText().equals(arg0) & (commonActions.isElementPresent("//span[contains(text(),'Next')]"))) {
                    getDriver().findElement(By.xpath("//span[contains(text(),'Next')]")).click();
                    i = 0;
                }
            }
        } else {
            for (int i = 0; i < 20; i++) {
                i = i + 1;
                waitABit(1000);
                if (getDriver().findElement(By.xpath("(//p[@class='name'])[" + i + "]")).getText().toLowerCase().equals(arg0.toLowerCase())) {
                    getDriver().findElement(By.xpath("(//div[@class='invite-to-job'])[" + i + "]")).click();
                    break;
                }
                if ((i == 19) & !getDriver().findElement(By.xpath("(//div[@class='table-status']//span)[" + i + "]")).getText().equals(arg0) & (commonActions.isElementPresent("//span[contains(text(),'Next')]"))) {
                    getDriver().findElement(By.xpath("//span[contains(text(),'Next')]")).click();
                    i = -1;
                }
            }

        }

    }

    public void approveAcceptedInviteWithName(String arg0) throws IOException, ParseException {
        if (getDriver().findElement(By.xpath("//div[@class='table-row red-background']//p[contains(.,'" + arg0 +"')]/..//../..//i[@class='icon-check icons']")).isDisplayed()) {
            getDriver().findElement(By.xpath("//div[@class='table-row red-background']//p[contains(.,'" + arg0 + "')]/..//../..//i[@class='icon-check icons']")).click();
            waitABit(2000);
            return;
        }
        if ((!commonActions.isElementPresent("//div[@class='table-cell table-cell_id' and contains(.,'" + Serenity.getCurrentSession().getMetaData().get("Accepted_Declined_Booking") + "')]"))
//                &
//                (!commonActions.isElementPresent("//div[@class='table-cell table-cell_id' and contains(.,'" + Serenity.getCurrentSession().getMetaData().get("BookingId2") + "')]")) &
//                (!commonActions.isElementPresent("//div[@class='table-cell table-cell_id' and contains(.,'" + Serenity.getCurrentSession().getMetaData().get("BookingId3") + "')]"))
        ) {
            getDriver().findElement(By.xpath("//span[contains(text(),'Next')]")).click();
            approveAcceptedInviteWithName(arg0);
        } else {
            if (commonActions.isElementPresent("//div[@class='table-cell table-cell_id' and contains(.,'" + Serenity.getCurrentSession().getMetaData().get("Accepted_Declined_Booking") + "')]")) {
                getDriver().findElement(By.xpath("//div[@class='table-cell table-cell_id' and contains(.,'" + Serenity.getCurrentSession().getMetaData().get("Accepted_Declined_Booking") + "')]/..//button")).click();
                waitABit(2000);
                if (getDriver().findElement(By.xpath("//div[@class='opened school-table-row']/..//div[@class='table-row red-background']//p[@class='booking-accept']//i[@class='icon-check icons']")).isDisplayed()) {
                    getDriver().findElement(By.xpath("//div[@class='opened school-table-row']/..//div[@class='table-row red-background']//p[@class='booking-accept']//i[@class='icon-check icons']")).click();

                    commonActions.waitUntilElementVisible("//div[@class='card']//div[@slot='bodyModal']",60);
                    waitABit(2000);
                    return;
                }
            }
//            if (commonActions.isElementPresent("//div[@class='table-cell table-cell_id' and contains(.,'" + Serenity.getCurrentSession().getMetaData().get("BookingId2") + "')]")) {
//                getDriver().findElement(By.xpath("//div[@class='table-cell table-cell_id' and contains(.,'" + Serenity.getCurrentSession().getMetaData().get("BookingId2") + "')]/..//button")).click();
//                waitABit(2000);
//                if (getDriver().findElement(By.xpath("//div[@class='opened school-table-row']/..//div[@class='table-row red-background']//p[@class='booking-accept']//i[@class='icon-check icons']")).isDisplayed()) {
//                    getDriver().findElement(By.xpath("//div[@class='opened school-table-row']/..//div[@class='table-row red-background']//p[@class='booking-accept']//i[@class='icon-check icons']")).click();
//
//                    commonActions.waitUntilElementVisible("//div[@class='card']//div[@slot='bodyModal']",60);
//                    waitABit(2000);
//                    return;
//                }
//            }
//            if (commonActions.isElementPresent("//div[@class='table-cell table-cell_id' and contains(.,'" + Serenity.getCurrentSession().getMetaData().get("BookingId3") + "')]")) {
//                getDriver().findElement(By.xpath("//div[@class='table-cell table-cell_id' and contains(.,'" + Serenity.getCurrentSession().getMetaData().get("BookingId3") + "')]/..//button")).click();
//                waitABit(2000);
//                if (getDriver().findElement(By.xpath("//div[@class='opened school-table-row']/..//div[@class='table-row red-background']//p[@class='booking-accept']//i[@class='icon-check icons']")).isDisplayed()) {
//                    getDriver().findElement(By.xpath("//div[@class='opened school-table-row']/..//div[@class='table-row red-background']//p[@class='booking-accept']//i[@class='icon-check icons']")).click();
//
//                    commonActions.waitUntilElementVisible("//div[@class='card']//div[@slot='bodyModal']",60);
//                    waitABit(2000);
//                }
//            }
        }
//        counter=0;
//        for (int y = 1; y < commonActions.getBookingCounter()+1; y++) {
//            if (((!commonActions.isElementPresent("(//div[@class='table-row red-background'])["+ y +"]//a[@class='role']"))
//                    & (commonActions.isElementPresent("//span[contains(text(),'Next')]")))){
////                getDriver().findElement(By.xpath("//span[contains(text(),'Next')]")).click();
//                y = 0;
//                continue;
//            }
//            if ((getDriver().findElement(By.xpath("(//div[@class='table-row red-background'])["+ y +"]//a[@class='role']")).getText().equals(arg0)) &
//                    getDriver().findElement(By.xpath("(//div[@class='table-row red-background'])["+ y +"]//a[@class='role']")).isEnabled()) {
//                counter = y;
//                break;
//            }
//        }
    }

    public void approveAppropriateBooking() {
        getDriver().findElement(By.xpath("(//i[@class='icon-check icons'])[" + counter + "]")).click();
    }

    public ArrayList<String> enteredTeacherNameIsDisplayed(String arg) {
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");
        if (!getDriver().findElement(By.xpath("//div[@class='opened school-table-row']/..//div[@class='table-row red-background']//p[contains(.,'Supply staff name')]")).getText().substring(19).equals(arg)) {
            results.set(0, "false");
            results.add("Expected: " + arg + "; but found: " +
                    getDriver().findElement(By.xpath("//div[@class='opened school-table-row']/..//div[@class='table-row red-background']//p[contains(.,'Supply staff name')]")).getText().substring(19) + "\n");
        }
        return results;

    }

    public ArrayList<String> attachedFileIsDisplayed(String arg0) {
        getDriver().findElement(By.xpath("//div[@class='opened school-table-row']/..//div[@class='table-row red-background']//div[@class='profile-content']")).click();
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");
        if (!getDriver().findElement(By.xpath("//div[@class='opened school-table-block']//div[@class='table-row red-background']//li//a")).getText().equals(arg0)) {
            results.set(0, "false");
            results.add("Expected: " + arg0 + "; but found: " +
                    getDriver().findElement(By.xpath("//div[@class='opened school-table-block']//div[@class='table-row red-background']//li//a")).getText() + "\n");
        }
        return results;

    }

    public ArrayList<String> theRateIsDisplayed(String arg0) {
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");
        if (!getDriver().findElement(By.xpath("//div[@class='opened school-table-block']//div[@class='table-row red-background']//span[contains(.,'£')]/..")).getText().substring(2).equals(arg0)) {
            results.set(0, "false");
            results.add("Expected: " + arg0 + "; but found: " +
                    getDriver().findElement(By.xpath("//div[@class='opened school-table-block']//div[@class='table-row red-background']//span[contains(.,'£')]/..")).getText().substring(2) + "\n");
        }
        return results;
    }

    public void declineAppropriateBooking() {
        getDriver().findElement(By.xpath("(//i[@class='icon-close icons'])[" + counter + "]")).click();
    }

    public ArrayList<String> popupWithTextIsAppeared(String arg0, List<String> list) {
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");
        if (arg0.contains("timesheet")){
            commonActions.waitUntilElementVisible("//div[@class='card']//div[@slot='bodyModal']",60);
            if (!getDriver().findElement(By.xpath("//div[@class='card']//div[@slot='bodyModal']")).getText().equals(arg0)) {
                results.set(0, "false");
                results.add("Expected: " + arg0 + "; but found: " +
                        getDriver().findElement(By.xpath("//div[@class='card']//div[@slot='bodyModal']")).getText() + "\n");
            }
        }
        if (arg0.contains("wow")){
            commonActions.waitUntilElementVisible("//div[@class='card']//div[@class='title-body']",60);
            String strMain = getDriver().findElement(By.xpath("//div[@class='card']//div[@class='title-body']")).getText();
            String[] arrSplit = strMain.split("\n");
            ArrayList<String> list2 = new ArrayList<>();
            for (int i=0; i < arrSplit.length; i++)
            {
                list2.add(arrSplit[i]);
            }
            if (!list2.get(0).equals(list.get(0))||
                    list2.get(1).equals(list.get(1))||
                            list2.get(2).equals(list.get(2))) {
                results.set(0, "false");
                results.add("Expected: " + arg0 + "; but found: " +
                        getDriver().findElement(By.xpath("//div[@class='card']//div[@class='title-body']")).getText() + "\n");
            }
        }else {
            commonActions.waitUntilElementVisible("//div[@class='card']//p[@slot='bodyModal']", 10);
            if ((commonActions.isElementPresent("//div[@class='card']//p[@slot='bodyModal']") && !getDriver().findElement(By.xpath("//div[@class='card']//p[@slot='bodyModal']")).getText().equals(arg0))&&
                    !getDriver().findElement(By.xpath("//div[@class='dialog Modal dialog--active dialog--persistent']//div[@class='card']//p")).getText().equals(arg0)) {
                results.set(0, "false");
                results.add("Expected: " + arg0 + "; but found: " +
                        getDriver().findElement(By.xpath("//div[@class='card']//p[@slot='bodyModal']")).getText() + "\n");
            }
        }
        return results;
    }


    public void openBookingSection() {
        if (!commonActions.isElementPresent("//div[@class='table-cell table-cell_id' and contains(.,'" + Serenity.getCurrentSession().getMetaData().get("BookingId1") + "')]")){
            getDriver().findElement(By.xpath("//span[contains(text(),'Next')]")).click();
           openBookingSection();
        } else {
                getDriver().findElement(By.xpath("//div[@class='table-cell table-cell_id' and contains(.,'" + Serenity.getCurrentSession().getMetaData().get("BookingId1") + "')]/..//button[contains(.,'+')]")).click();
        }
    }

    public void declineAcceptedInviteWithName(String arg0) throws IOException, ParseException {
        if (getDriver().findElement(By.xpath("//div[@class='table-row red-background']//p[contains(.,'" + arg0 +"')]/..//../..//i[@class='icon-close icons']")).isDisplayed()) {
            getDriver().findElement(By.xpath("//div[@class='table-row red-background']//p[contains(.,'" + arg0 + "')]/..//../..//i[@class='icon-close icons']")).click();
            waitABit(2000);
            return;
        }
        if ((!commonActions.isElementPresent("//div[@class='table-cell table-cell_id' and contains(.,'" + commonActions.getBookingIDFromJson().get(0) + "')]")) &
                (!commonActions.isElementPresent("//div[@class='table-cell table-cell_id' and contains(.,'" + commonActions.getBookingIDFromJson().get(1) + "')]")) &
                (!commonActions.isElementPresent("//div[@class='table-cell table-cell_id' and contains(.,'" + commonActions.getBookingIDFromJson().get(2) + "')]"))
        ) {
            getDriver().findElement(By.xpath("//span[contains(text(),'Next')]")).click();
//            declineAcceptedInviteWithName(arg0);
        } else {
            if (commonActions.isElementPresent("//div[@class='table-cell table-cell_id' and contains(.,'" + commonActions.getBookingIDFromJson().get(0) + "')]")) {
                getDriver().findElement(By.xpath("//div[@class='table-cell table-cell_id' and contains(.,'" + commonActions.getBookingIDFromJson().get(0) + "')]/..//button")).click();
                waitABit(2000);
                if (getDriver().findElement(By.xpath("//div[@class='table-row red-background']//p[contains(.,'" + arg0 + "')]/..//../..//i[@class='icon-close icons']")).isDisplayed()) {

                    getDriver().findElement(By.xpath("//div[@class='table-row red-background']//p[contains(.,'" + arg0 + "')]/..//../..//i[@class='icon-close icons']")).click();
                    waitABit(2000);
                    return;
                }
            }
            if (commonActions.isElementPresent("//div[@class='table-cell table-cell_id' and contains(.,'" + commonActions.getBookingIDFromJson().get(1) + "')]")) {
                getDriver().findElement(By.xpath("//div[@class='table-cell table-cell_id' and contains(.,'" + commonActions.getBookingIDFromJson().get(1) + "')]/..//button")).click();
                waitABit(2000);
                if (getDriver().findElement(By.xpath("//div[@class='table-row red-background']//p[contains(.,'" + arg0 + "')]/..//../..//i[@class='icon-close icons']")).isDisplayed()) {

                    getDriver().findElement(By.xpath("//div[@class='table-row red-background']//p[contains(.,'" + arg0 + "')]/..//../..//i[@class='icon-close icons']")).click();
                    waitABit(2000);
                    return;
                }
            }
            if (commonActions.isElementPresent("//div[@class='table-cell table-cell_id' and contains(.,'" + commonActions.getBookingIDFromJson().get(2) + "')]")) {
                getDriver().findElement(By.xpath("//div[@class='table-cell table-cell_id' and contains(.,'" + commonActions.getBookingIDFromJson().get(2) + "')]/..//button")).click();
                waitABit(2000);
                if (getDriver().findElement(By.xpath("//div[@class='table-row red-background']//p[contains(.,'" + arg0 + "')]/..//../..//i[@class='icon-close icons']")).isDisplayed()) {

                    getDriver().findElement(By.xpath("//div[@class='table-row red-background']//p[contains(.,'" + arg0 + "')]/..//../..//i[@class='icon-close icons']")).click();
                    waitABit(2000);
                    return;
                }
            }
        }
    }

    public ArrayList<String> findAcceptedInviteByBookingID(String arg0) throws IOException, ParseException {
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");
        System.out.println("Accepted_Declined_Booking = "+Serenity.getCurrentSession().getMetaData().get("Accepted_Declined_Booking"));
        if (!commonActions.isElementPresent("//div[@class='table-cell table-cell_id' and contains(.,'" + Serenity.getCurrentSession().getMetaData().get("Accepted_Declined_Booking") + "')]")) {
            if (commonActions.isElementPresent("//span[contains(text(),'Next')]")) {
                getDriver().findElement(By.xpath("//span[contains(text(),'Next')]")).click();
                findAcceptedInviteByBookingID(arg0);
            }else {
                results.set(0, "false");
                results.add("Accepted "+Serenity.getCurrentSession().getMetaData().get("Accepted_Declined_Booking")+" Booking isn't found");
            }
        } else {
            if (commonActions.isElementPresent("//div[@class='table-cell table-cell_id' and contains(.,'" + Serenity.getCurrentSession().getMetaData().get("Accepted_Declined_Booking") + "')]")) {
                getDriver().findElement(By.xpath("//div[@class='table-cell table-cell_id' and contains(.,'"+Serenity.getCurrentSession().getMetaData().get("Accepted_Declined_Booking")+"')]/..//button[contains(.,'+')]")).click();
                waitABit(2000);
                if (getDriver().findElement(By.xpath("//div[@class='opened school-table-row']/..//div[@class='table-row red-background']//p[@class='booking-accept']//span[@class='accept-school']")).getText().equals("accepted")) {
                    results.set(0, "true");
                }else {
                    results.set(0, "false");
                    results.add(Serenity.getCurrentSession().getMetaData().get("Accepted_Declined_Booking")+" Booking isn't accepted");
//                    getDriver().findElement(By.xpath("//div[@class='table-cell table-cell_id' and contains(.,'" + Serenity.getCurrentSession().getMetaData().get("Accepted_Declined_Booking") + "')]/..//button[contains(.,'-')]")).click();
                }
            }
//            if (commonActions.isElementPresent("//div[@class='table-cell table-cell_id' and contains(.,'" + Serenity.getCurrentSession().getMetaData().get("BookingId2") + "')]")) {
//                getDriver().findElement(By.xpath("//div[@class='table-cell table-cell_id' and contains(.,'" + Serenity.getCurrentSession().getMetaData().get("BookingId2") + "')]/..//button[contains(.,'+')]")).click();
//                waitABit(2000);
//                if (getDriver().findElement(By.xpath("//div[@class='opened school-table-row']/..//div[@class='table-row red-background']//p[@class='booking-accept']//span[@class='accept-school']")).getText().equals("accepted")) {
//                    return;
//                }else getDriver().findElement(By.xpath("//div[@class='table-cell table-cell_id' and contains(.,'" + Serenity.getCurrentSession().getMetaData().get("BookingId2") + "')]/..//button[contains(.,'-')]")).click();
//            }
//            if (commonActions.isElementPresent("//div[@class='table-cell table-cell_id' and contains(.,'" + Serenity.getCurrentSession().getMetaData().get("BookingId3") + "')]")) {
//                getDriver().findElement(By.xpath("//div[@class='table-cell table-cell_id' and contains(.,'" + Serenity.getCurrentSession().getMetaData().get("BookingId3") + "')]/..//button[contains(.,'+')]")).click();
//                waitABit(2000);
//                if (getDriver().findElement(By.xpath("//div[@class='opened school-table-row']/..//div[@class='table-row red-background']//p[@class='booking-accept']//span[@class='accept-school']")).getText().equals("accepted")) {
//                    return;
//                }else getDriver().findElement(By.xpath("//div[@class='table-cell table-cell_id' and contains(.,'" + Serenity.getCurrentSession().getMetaData().get("BookingId3") + "')]/..//button[contains(.,'-')]")).click();
//            }
        }
        return results;
    }
}

