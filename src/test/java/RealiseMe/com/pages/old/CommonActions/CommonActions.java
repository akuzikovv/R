package RealiseMe.com.pages.old.CommonActions;

import RealiseMe.com.xpath_locators.old.ILocators;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.apache.commons.io.IOUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

//import com.github.cliftonlabs.json_simple.Jsoner;

public class CommonActions extends PageObject {
    private ArrayList<String> status_of_teacher;
    private ArrayList<String> users_emails;
    private ArrayList<String> names = new ArrayList<>();
    private int counter, counterDecline;
    private int b;
    public WebDriverWait wait;
    public static int random;
    public static int ProfilingQuestion_dropdown_counter;
    public String email_of_new_user;
    public String parentHandle;
    private static JSONParser parser = new JSONParser();
    private static URL urlObject;
    private static StringBuffer response;
    private String token;
    private String bookingID1;
    private String bookingID2;
    private String bookingID3;
    public String delete_request_result;
    private String ci = "client_id";
    private String cs = "client_secret";
    private String au = "audience";
    private String gt = "grant_type";
    private String school1 = "ZQ0ZbBhkvOv3f7rxEKPxq557nxygPeRn";
    private String school2 = "Id3A2TLE8mk_dcIbCj15M5oMvk5yA4Qn_8tCVGsNGj3fxvN1Q_6LKe3C0o2QBAZO";
    private String school3 = "https://realiseme-school-uat.eu.auth0.com/api/v2/";
    private String school4 = "client_credentials";
    private String admid = "538e52d0-a7c0-4e89-9b48-80f0d0ec958d";
    private String bookingLongId;
    private String bookingShortID;
    private String current_date;
    private String date;
    private String month;
    private String year;
    private boolean creation_status = false;
    ;
    private boolean SchoolSide = false;
    private boolean TeacherSide = false;
    //    public WebDriverWait wait = new WebDriverWait(getDriver(), 10);


    public void waitUntilElementPresent(String arg, int time) {
        wait = new WebDriverWait(getDriver(), time);
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(arg)));
        } catch (Exception e) {
        }

    }

    public void waitUntilElementVisible(String arg, int time) {
        wait = new WebDriverWait(getDriver(), time);
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(arg)));
        } catch (Exception e) {
        }

    }

    public void waitUntilElementIsNotVisible(String arg, int time) {
        wait = new WebDriverWait(getDriver(), time);
        try {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(arg)));
        } catch (Exception e) {
        }

    }

    public void waitUntilElementIsClickable(String arg, int time) {
        wait = new WebDriverWait(getDriver(), time);
        try {
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(arg)));
        } catch (Exception e) {
        }

    }


    public void clickOnTheButton(String arg0) {
        if (isElementPresent("//a[contains(.,'" + arg0 + "')]")) {
            getDriver().findElement(By.xpath("//a[contains(.,'" + arg0 + "')]")).click();
            return;
        }
        if (isElementPresent("//button[contains(.,'" + arg0 + "')]")) {
//            getDriver().findElement(By.xpath("//button[contains(.,'" + arg0 + "')]")).click();
            if (getDriver().getCurrentUrl().contains("school/job/live/")) {
                getDriver().findElement(By.xpath("(//button[contains(.,'" + arg0 + "')])[1]")).click();
                return;
            } else

                try {
                    getDriver().findElement(By.xpath("(//button[contains(.,'" + arg0 + "')])[1]")).click();
                } catch (Exception e) {
                }
            try {
                getDriver().findElement(By.xpath("(//button[contains(.,'" + arg0 + "')])[2]")).click();
            } catch (Exception e) {
            }
            try {
                getDriver().findElement(By.xpath("(//button[contains(.,'" + arg0 + "')])[3]")).click();
            } catch (Exception e) {
            }
            return;

        }
        if (isElementPresent("//span[contains(.,'" + arg0 + "')]")) {
            getDriver().findElement(By.xpath("(//span[contains(.,'" + arg0 + "')])[1]")).click();
            return;
        }
        if (isElementPresent("//p[contains(.,'" + arg0 + "')]")) {
            getDriver().findElement(By.xpath("//p[contains(.,'" + arg0 + "')]")).click();
            return;
        } else {
            System.out.println(arg0 + " Button isn't found");
        }
//        try {
//            WebElement xpath = getDriver().findElement(By.xpath("//a[contains(.,'" + arg0 + "')]"));
//            xpath.click();
//        } catch (Exception e) {
//        }
//        try {
//            WebElement xpath = getDriver().findElement(By.xpath("//button[contains(.,'" + arg0 + "')]"));
//            xpath.click();
//        } catch (Exception e) {
//        }
//        try {
//            WebElement xpath = getDriver().findElement(By.xpath("(//button[contains(.,'" + arg0 + "')])[1]"));
//            xpath.click();
//        } catch (Exception e) {
//        }
//        try {
//            WebElement xpath = getDriver().findElement(By.xpath("(//button[contains(.,'" + arg0 + "')])[2]"));
//            xpath.click();
//        } catch (Exception e) {
//        }
//        try {
//            WebElement xpath = getDriver().findElement(By.xpath("//span[contains(.,'" + arg0 + "')]"));
//            xpath.click();
//        } catch (Exception e) {
//        }
//        try {
//            WebElement xpath = getDriver().findElement(By.xpath("//p[contains(.,'" + arg0 + "')]"));
//            xpath.click();
//        } catch (Exception e) {
//        }
    }

    public void clickOnTheTab(String arg0) {
        waitABit(4000);
        if (getDriver().getCurrentUrl().contains("job") || getDriver().getCurrentUrl().contains("booking")) {
            waitUntilElementVisible("//div[@class='tabs__div' and contains (.,'" + arg0 + "')]", 60);
            getDriver().findElement(By.xpath("//div[@class='tabs__div' and contains (.,'" + arg0 + "')]")).click();
            waitABit(1000);
        }
        if (getDriver().getCurrentUrl().contains("auth0")) {
            waitUntilElementVisible("(//a[contains(.,'" + arg0 + "')])[1]", 60);
            WebElement xpath = getDriver().findElement(By.xpath("(//a[contains(.,'" + arg0 + "')])[1]"));
            xpath.click();
        } else {
            try {
                waitUntilElementVisible("(//a[contains(.,'" + arg0 + "')])[1]", 20);
                WebElement xpath = getDriver().findElement(By.xpath("(//a[contains(.,'" + arg0 + "')])[1]"));
                xpath.click();
                waitUntilElementVisible("//p[contains(.,'Please')])[3]", 20);
            } catch (Exception e) {
            }
            try {
                waitUntilElementVisible("(//a[contains(.,'" + arg0 + "')])[2]", 20);
                WebElement xpath = getDriver().findElement(By.xpath("(//a[contains(.,'" + arg0 + "')])[2]"));
                xpath.click();
                waitUntilElementVisible("//p[contains(.,'Please')])[3]", 20);
            } catch (Exception e) {
            }

        }
    }

    public boolean theFieldIsHighlightedRed(String arg0) {
        if (getDriver().findElement(By.xpath("//input[@name='" + arg0 + "']")).isDisplayed()) {
            WebElement xpath = getDriver().findElement(By.xpath("//input[@name='" + arg0 + "']"));
            return xpath.getCssValue("border-bottom-color").equals("rgba(255, 0, 0, 1)");
        } else {
            WebElement xpath1 = getDriver().findElement(By.xpath("//textarea[@name=" + arg0 + "']"));
            return xpath1.getCssValue("border-bottom-color").equals("rgba(255, 0, 0, 1)");
        }
    }

    public ArrayList<String> chooseCheckbox(String arg0) {
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "false");
        if (isElementPresent("//p[contains(.,'" + arg0 + "')]/../../..//div[@class='input-group--selection-controls__ripple']")) {
            WebElement xpath = getDriver().findElement(By.xpath("//p[contains(.,'" + arg0 + "')]/../../..//div[@class='input-group--selection-controls__ripple']"));
            xpath.click();
            try {
                getDriver().findElement(By.xpath("//p[contains(.,'" + arg0 + "')]/..//div[@class='input-group--selection-controls__ripple']")).click();
            }catch (Exception e ){}

            System.out.println("5");
            results.set(0, "true");
            return results;

        }
        if (isElementPresent("//p[contains(.,'" + arg0 + "')]/..//div[@class='input-group--selection-controls__ripple']")) {
            WebElement xpath = getDriver().findElement(By.xpath("//p[contains(.,'" + arg0 + "')]/..//div[@class='input-group--selection-controls__ripple']"));
            xpath.click();
            System.out.println("8");
            results.set(0, "true");
            return results;

        }
        if (isElementPresent("//label[contains(.,'" + arg0 + "')]")) {
            WebElement xpath = getDriver().findElement(By.xpath("//label[contains(.,'" + arg0 + "')]"));
            xpath.click();
            System.out.println("1");
            results.set(0, "true");
            return results;
        }

        if (isElementPresent("//span[contains(.,'" + arg0 + "')]//../..//div[@role='checkbox']")) {
            WebElement xpath = getDriver().findElement(By.xpath("//span[contains(.,'" + arg0 + "')]//../..//div[@role='checkbox']"));
            xpath.click();
            System.out.println("2");
            results.set(0, "true");
            return results;
        }

        if (isElementPresent("(//div[@class='" + arg0 + "']//div[@role='checkbox']//div)[2]")) {
            WebElement xpath = getDriver().findElement(By.xpath("(//div[@class='" + arg0 + "']//div[@role='checkbox']//div)[2]"));
            xpath.click();
            System.out.println("3");
            results.set(0, "true");
            return results;
        }
        if (isElementPresent("//label[contains(.,'" + arg0 + "')]/..//div[@class='input-group--selection-controls__ripple']")) {
            WebElement xpath = getDriver().findElement(By.xpath("//label[contains(.,'" + arg0 + "')]/..//div[@class='input-group--selection-controls__ripple']"));
            xpath.click();
            System.out.println("4");
            results.set(0, "true");
            return results;

        }
        if (isElementPresent("//p[contains(.,'" + arg0 + "')]//../../..//div[@role='checkbox']")) {
            WebElement xpath = getDriver().findElement(By.xpath("//p[contains(.,'" + arg0 + "')]//../../..//div[@role='checkbox']"));
            xpath.click();
            System.out.println("6");
            results.set(0, "true");
            return results;

        }
        if (isElementPresent("//span[contains(.,'" + arg0 + "')]")) {
            WebElement xpath = getDriver().findElement(By.xpath("//span[contains(.,'" + arg0 + "')]"));
            xpath.click();
            System.out.println("7");
            results.set(0, "true");
            return results;

        }

        return results;
    }

    public void closePopup() {
        $(ILocators.CLose_popup).click();
    }

    public ArrayList<String> getNamesOfTeachers() {
        String counter = getDriver().findElement(By.xpath("//a[contains(.,'INVITES')]")).getText().substring(9, 10);
        int max = Integer.parseInt(counter);

        for (int i = 1; i < max + 1; i++) {
            waitUntilElementVisible("((//div[@class='table-info']//p[@class='name'])[2])[" + i + "]", 40);
            names.add(getDriver().findElement(By.xpath("((//div[@class='table-info']//p[@class='name'])[2])[" + i + "]")).getText());
        }
        return names;

    }

    public ArrayList<String> getStatusOfTeachers() {
        status_of_teacher = new ArrayList<>();
        for (int i = 1; i < 4; i++) {
            status_of_teacher.add(getDriver().findElement(By.xpath("(//div[@class='table-status']//span)[" + i + "]")).getText());
        }
        return status_of_teacher;

    }

    public ArrayList<String> appropriateTeachersAreDisplayedInTheInvitesList() {
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");
        waitUntilElementVisible("//div[@class='table-cell table-cell_id' and contains(.,'" + Serenity.getCurrentSession().getMetaData().get("BookingId1") + "')]/../..//div[@class='table-row__block']//p", 60);
        if (!names.get(0).equals(getDriver().findElement(By.xpath("//div[@class='table-cell table-cell_id' and contains(.,'" + Serenity.getCurrentSession().getMetaData().get("BookingId1") + "')]/../..//div[@class='table-row__block']//p")).getText())) {
            results.set(0, "false");
            results.add("Expected: " + names.get(0) + " ; But found: " + getDriver().findElement(By.xpath("//div[@class='table-cell table-cell_id' and contains(.,'" + Serenity.getCurrentSession().getMetaData().get("BookingId1") + "')]/../..//div[@class='table-row__block']//p")).getText());
        }
        return results;
    }

    public int getBookingCounter() {
        int max2 = 0;
        try {
            String counter = getDriver().findElement(By.xpath("//a[@href='/agency/booking/invite'][contains(.,'invites')]")).getText().substring(9, 11);
            return max2 = Integer.parseInt(counter);
        } catch (Exception e) {
        }
        try {
            String counter = getDriver().findElement(By.xpath("//a[@href='/agency/booking/invite'][contains(.,'invites')]")).getText().substring(9, 10);
            return max2 = Integer.parseInt(counter);
        } catch (Exception e) {
        }
        try {
            String counter = getDriver().findElement(By.xpath("//a[@href='/school/booking/invite'][contains(.,'invites')]")).getText().substring(9, 11);
            return max2 = Integer.parseInt(counter);
        } catch (Exception e) {
        }
        try {
            String counter = getDriver().findElement(By.xpath("//a[@href='/school/booking/invite'][contains(.,'invites')]")).getText().substring(9, 10);
            return max2 = Integer.parseInt(counter);
        } catch (Exception e) {
        }
        try {
            String counter = getDriver().findElement(By.xpath("//a[@href='/teacher_supply/booking/invite'][contains(.,'invites')]")).getText().substring(9, 11);
            return max2 = Integer.parseInt(counter);
        } catch (Exception e) {
        }
        try {
            String counter = getDriver().findElement(By.xpath("//a[@href='/teacher_supply/booking/invite'][contains(.,'invites')]")).getText().substring(9, 10);
            return max2 = Integer.parseInt(counter);
        } catch (Exception e) {
        }

        return max2;
    }

    public void findInviteWithJobTitle(String arg0) {
//        waitABit(5000);
//        wait  = new WebDriverWait(getDriver(), 15);
        int i = 0;
        counter = 0;
        for (int y = 1; y < getBookingCounter() + 1; y++) {
            getDriver().findElement(By.xpath("(//p[contains(.,'+')])[" + y + "]")).click();
            if ((getDriver().findElement(By.xpath("//div[@class='table-body-wrapper show']//span[contains(.,'accept')]")).getAttribute("class").equals("tooltip tooltip--top green-background")) ||
                    (getDriver().findElement(By.xpath("//div[@class='table-body-wrapper show']//span[contains(.,'accept')]")).getAttribute("class").equals("tooltip green-background tooltip--top"))) {
                y++;
                getDriver().findElement(By.xpath("(//p[contains(.,'-')])[" + y + "]")).click();
                y--;
                continue;
            }
            if (getDriver().findElement(By.xpath("((//div[@class='content-wrapper'])[" + y + "]//p)[4]")).getText().substring(11).equals(arg0)) {
//                    &  (!getDriver().findElement(By.xpath("(//span[contains(.,'accept')])["+ counter +"]")).getAttribute("class").equals("tooltip green-background tooltip--top"))) {
//                counter =y+i;
//                waitABit(500);
                break;
            } else {
                y++;
                getDriver().findElement(By.xpath("(//p[contains(.,'-')])[" + y + "]")).click();
                y--;
            }
//            counter =y+i;
////            waitABit(1000);
//            if ((!isElementPresent("(//span[contains(.,'accept')])["+ counter +"]") &
//                    (isElementPresent("//span[contains(text(),'Next')]")) )){
//                getDriver().findElement(By.xpath("//span[contains(text(),'Next')]")).click();
//                y = 0;
//                counter =0;
//                continue;
//            }
//
//            if ( (getDriver().findElement(By.xpath("(//span[contains(.,'accept')])["+ counter +"]")).getAttribute("class").equals("tooltip tooltip--top green-background"))||
//                    (getDriver().findElement(By.xpath("(//span[contains(.,'accept')])["+ counter +"]")).getAttribute("class").equals("tooltip green-background tooltip--top"))) {
//                i++;
//                continue;
//            }else {
//                getDriver().findElement(By.xpath("(//p[contains(.,'+')])[" + y + "]")).click();
//                            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("((//div[@class='content-wrapper'])["+y+"]//p)[4]")));
//            }
//            if (getDriver().findElement(By.xpath("((//div[@class='content-wrapper'])["+y+"]//p)[4]")).getText().substring(11).equals(arg0) ){
////                    &  (!getDriver().findElement(By.xpath("(//span[contains(.,'accept')])["+ counter +"]")).getAttribute("class").equals("tooltip green-background tooltip--top"))) {
////                counter =y+i;
//                waitABit(500);
//                break;
//            }
//            else {
//                y++;
//                getDriver().findElement(By.xpath("(//p[contains(.,'-')])[" + y + "]")).click();
//                y--;
//            }
//            if ((y == 10) & (getBookingCounter() > 10) &
//                    (!isElementPresent("((//div[@class='content-wrapper'])["+y+"]//p)[4]")) &
//                    (isElementPresent("//span[contains(text(),'Next')]")) ||
//                    (counter >19) & (isElementPresent("//span[contains(text(),'Next')]"))) {
//                getDriver().findElement(By.xpath("//span[contains(text(),'Next')]")).click();
//                y = 1;
//                counter =0;
//            }
        }
    }

    public boolean isElementPresent(String selector) {
        boolean returnVal = true;
        try {
            getDriver().findElement(By.xpath(selector));
        } catch (NoSuchElementException e) {
            returnVal = false;
        } finally {
        }
        return returnVal;
    }

    public void enterLoginOfNewUser(String arg0) {
        random = (int) (Math.random() * 400 + 111);
        Serenity.getCurrentSession().addMetaData("user type", arg0);
//        if (arg0.contains("admin")){
//            email_of_new_user = arg0 + random + "@yopmail.com";
//        }else {
        email_of_new_user = arg0 + random + "@sharklasers.com";
//        }
        Serenity.getCurrentSession().addMetaData("emailOfNewUser", email_of_new_user);
        $(ILocators.Email_field).sendKeys(email_of_new_user);
    }

    public void refreshThePage() {
        getDriver().navigate().refresh();
    }

    public void enterLoginOfNewCreatedUser(String arg0) {

        if (Serenity.getCurrentSession().getMetaData().get("emailOfNewUser").contains("school")|| arg0.equals("school")) {
            Serenity.getCurrentSession().addMetaData("emailOfNewSchoolUser", Serenity.getCurrentSession().getMetaData().get("emailOfNewUser"));
            getDriver().findElement(By.xpath("//input[@type='email']")).sendKeys(Serenity.getCurrentSession().getMetaData().get("emailOfNewSchoolUser"));
        }
        if (Serenity.getCurrentSession().getMetaData().get("emailOfNewUser").contains("teacher")|| arg0.equals("teacher")) {
            Serenity.getCurrentSession().addMetaData("emailOfNewTeacherUser", Serenity.getCurrentSession().getMetaData().get("emailOfNewUser"));
            getDriver().findElement(By.xpath("//input[@type='email']")).sendKeys(Serenity.getCurrentSession().getMetaData().get("emailOfNewTeacherUser"));
        }
        if (Serenity.getCurrentSession().getMetaData().get("emailOfNewUser").contains("agency")|| arg0.equals("agency")) {
            Serenity.getCurrentSession().addMetaData("emailOfNewAgencyUser", Serenity.getCurrentSession().getMetaData().get("emailOfNewUser"));
            getDriver().findElement(By.xpath("//input[@type='email']")).sendKeys(Serenity.getCurrentSession().getMetaData().get("emailOfNewAgencyUser"));
        }
//        if (Serenity.getCurrentSession().getMetaData().get("emailOfNewUser").contains("admin")|| arg0.equals("admin")) {
//            Serenity.getCurrentSession().addMetaData("emailOfNewAdminUser", Serenity.getCurrentSession().getMetaData().get("emailOfNewUser"));
//            getDriver().findElement(By.xpath("//input[@type='email']")).sendKeys(Serenity.getCurrentSession().getMetaData().get("emailOfNewAdminUser"));
//        }
        System.out.println(Serenity.getCurrentSession().getMetaData().get("emailOfNewUser"));
    }

    public void openInTheNewTab(String arg0) {
        parentHandle = getDriver().getWindowHandle();
        ((JavascriptExecutor) getDriver()).executeScript("window.open('about:blank','_blank');");
        String subWindowHandler = null;
        Set<String> handles = getDriver().getWindowHandles();
        Iterator<String> iterator = handles.iterator();
        while (iterator.hasNext()) {
            subWindowHandler = iterator.next();
        }
        getDriver().switchTo().window(subWindowHandler);
        getDriver().get(arg0);
    }

    public void enterEmailOfNewUser() {
        getDriver().findElement(By.xpath("//span[@title='Click to Edit']")).click();
        getDriver().findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(email_of_new_user);
        getDriver().findElement(By.xpath("//button[contains(.,'Set')]")).click();
        waitABit(30000);

        waitUntilElementVisible("//td[contains(.,'Please')]", 60);
        getDriver().findElement(By.xpath("//td[contains(.,'Please')]")).click();
    }

    public void backToTheFirstTab() {
        getDriver().switchTo().window(parentHandle);
    }


    @Test
    public void getAccessTokenAuth0() throws IOException, ParseException {
//        JSONObject ReqBody = (JSONObject) parser.parse(new FileReader("src/test/resources/Files/ReqBody_school.json"));
        String url = "https://realiseme-school-uat.eu.auth0.com/oauth/token";
        urlObject = new URL(url);
//        String body = ReqBody.toJSONString();
        String body = "{\n \"" + ci + "\":\"" + school1 + "\",\n" +
                "            \"" + cs + "\":\"" + school2 + "\",\n" +
                "            \"" + au + "\":\"" + school3 + "\",\n" +
                "            \"" + gt + "\":\"" + school4 + "\"\n" +
                "    }";
        HttpURLConnection connection = (HttpURLConnection) urlObject.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("content-type", "application/json");
        connection.setDoOutput(true);
        try (OutputStream os = connection.getOutputStream()) {
            byte[] input = body.getBytes("utf-8");
            os.write(input, 0, input.length);
        }
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(connection.getInputStream(), "utf-8"))) {
            StringBuilder response = new StringBuilder();
            String responseLine = null;
            while ((responseLine = br.readLine()) != null) {
                response.append(responseLine.trim());
            }
            JSONObject jsonObject = (JSONObject) parser.parse(response.toString());
            token = jsonObject.get("access_token").toString();
            System.out.println(token);
        }
    }

    //        @Test
    public String deleteAccount(String arg0) throws IOException, ParseException {
        getAccessTokenAuth0();
//        String body = "{\"query\":\"mutation {\\n  adminRemove" + arg0 + "(admin_id: \\\"" + admid + "\\\", email: \\\"" + email_of_new_user + "\\\")}\",\"variables\":null}";
        String body = "{\"query\":\"mutation {\\n  adminRemove" + arg0 + "(admin_id: \\\"" + admid + "\\\", email: \\\"newuatteacher374@sharklasers.com\\\")}\",\"variables\":null}";
        String url = "https://8nn63ifaff.execute-api.us-east-1.amazonaws.com/uat/graphql";
        urlObject = new URL(url);
        HttpsURLConnection connection = (HttpsURLConnection) urlObject.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("content-type", "application/json");
        connection.setRequestProperty("authorization", token);
        connection.setDoOutput(true);
        try (OutputStream os = connection.getOutputStream()) {
            byte[] input = body.getBytes("utf-8");
            os.write(input, 0, input.length);
        }
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(connection.getInputStream(), "utf-8"))) {
            StringBuilder response = new StringBuilder();
            String encoding = connection.getContentEncoding();
            String responseLine = null;
            encoding = encoding == null ? "UTF-8" : encoding;
            String respbody = IOUtils.toString(connection.getInputStream(), encoding);
            while ((responseLine = br.readLine()) != null) {
                response.append(responseLine.trim());
            }
            JSONObject jsonObject = (JSONObject) parser.parse(respbody);
            JSONObject jsonObject2 = (JSONObject) parser.parse(jsonObject.get("data").toString());
            delete_request_result = jsonObject2.get("adminRemove" + arg0 + "").toString();
            System.out.println(jsonObject2 + " = " + email_of_new_user);
            return delete_request_result;
        }
    }


    public void clickOnTheSignUpButton() {
        waitUntilElementVisible(ILocators.sign_up, 60);
        getDriver().findElement(By.xpath(ILocators.sign_up)).click();
    }

    public ArrayList<String> theProfilingQuestionsPageContainsNecessaryElements(List<String> list, String arg0) {
        ArrayList<String> labels = new ArrayList<>();
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");
        if (!getDriver().findElement(By.xpath("//div[@class='components-name']")).isDisplayed()) {
            results.set(0, "false");
            results.add("Profiling Questions page isn't opened");
        } else {
            if (arg0.equals("School")) {
                labels.add(getDriver().findElement(By.xpath("//div[@class='components-name']")).getText());
                labels.add(getDriver().findElement(By.xpath("//p[contains(.,'1. Is your school driven more by?')]")).getText());
                labels.add(getDriver().findElement(By.xpath("//p[contains(.,'2. How would you describe your school’s environment?')]")).getText());
                labels.add(getDriver().findElement(By.xpath("//p[contains(.,'3. Is your school run on a tight methodical basis or a more adaptable, flexible one?')]")).getText());
                labels.add(getDriver().findElement(By.xpath("//p[contains(.,'4. Is your school strict on discipline or more lenient and individual-based?')]")).getText());
                labels.add(getDriver().findElement(By.xpath("//p[contains(.,'5. Does your school participate in collaboration with other schools or work independently?')]")).getText());
            }
            if (arg0.equals("Teacher")) {
                labels.add(getDriver().findElement(By.xpath("//div[@class='components-name']")).getText());
                labels.add(getDriver().findElement(By.xpath("//p[contains(.,'1. How would you describe what drives you?')]")).getText());
                labels.add(getDriver().findElement(By.xpath("//p[contains(.,'2. What do you look for in a school’s environment?')]")).getText());
                labels.add(getDriver().findElement(By.xpath("//p[contains(.,'3. Do you work in a structured, methodical way or are you more flexible and adaptable?')]")).getText());
                labels.add(getDriver().findElement(By.xpath("//p[contains(.,'4. How would you describe your behaviour management style?')]")).getText());
                labels.add(getDriver().findElement(By.xpath("//p[contains(.,'5. Do you enjoy working in a collaborative environment or prefer working independently?')]")).getText());
            }
            for (int i = 0; i < list.size(); i++) {
                if (!list.get(i).equals(labels.get(i))) {
                    results.set(0, "false");
                    results.add("Expected: " + list.get(i) + "; but found: " + labels.get(i) + "\n");
                }
            }
        }
        return results;
    }

    public void uploadFile(String arg0) {
        waitUntilElementVisible("//textarea[@type='text']", 10);
        WebElement uploadElement = getDriver().findElement(By.xpath("(//input[@class='input-file'])[1]"));
        uploadElement.sendKeys("/Users/anton/IdeaProjects/R/src/test/resources/Files/" + arg0);

        try {
            uploadElement = getDriver().findElement(By.xpath("(//input[@class='input-file'])[2]"));
            uploadElement.sendKeys("/Users/anton/IdeaProjects/R/src/test/resources/Files/" + arg0);
        } catch (Exception e) {
        }
        try {
            uploadElement = getDriver().findElement(By.xpath("(//input[@class='input-file'])[3]"));
            uploadElement.sendKeys("/Users/anton/IdeaProjects/R/src/test/resources/Files/" + arg0);
        } catch (Exception e) {
        }
    }

    public void getBookingID() {
        int i = 1;
        for (i = 1; i < 11; i++) {
            if (!getDriver().findElement(By.xpath("(//div[@class='school-table-row']//div[@class='table-cell table-cell_id'])[" + i + "]/../..//div[@class='table-cell table-cell_status']")).getText().equals("attention required")) {
                break;
            } else if (i == 10 && getDriver().findElement(By.xpath("(//div[@class='school-table-row']//div[@class='table-cell table-cell_id'])[" + i + "]/../..//div[@class='table-cell table-cell_status']")).getText().equals("attention required")) {
                getDriver().findElement(By.xpath("//span[contains(text(),'Next')]")).click();
                i = 0;
            }
        }
        String bookingId1 = getDriver().findElement(By.xpath("(//div[@class='school-table-row']//div[@class='table-cell table-cell_id'])[" + i + "]")).getText();
        i++;
        String bookingId2 = getDriver().findElement(By.xpath("(//div[@class='school-table-row']//div[@class='table-cell table-cell_id'])[" + i + "]")).getText();
        i++;
        String bookingId3 = getDriver().findElement(By.xpath("(//div[@class='school-table-row']//div[@class='table-cell table-cell_id'])[" + i + "]")).getText();
        System.out.println("BookingId1 = " + bookingId1);
        System.out.println("BookingId2 = " + bookingId2);
        System.out.println("BookingId3 = " + bookingId3);
        Serenity.getCurrentSession().addMetaData("BookingId1", bookingId1);
        Serenity.getCurrentSession().addMetaData("BookingId2", bookingId2);
        Serenity.getCurrentSession().addMetaData("BookingId3", bookingId3);
        creation_status = true;
        Serenity.getCurrentSession().addMetaData("creation_status", "true");
        System.out.println("creation_status = " + Serenity.getCurrentSession().getMetaData().get("creation_status"));

       /* try {
            BufferedWriter writer = Files.newBufferedWriter(Paths.get("src/test/resources/Files/BookingID.json"));
            JSONObject bookingIDObject = new JSONObject();
            bookingIDObject.put("BookingId1", bookingId1);
            bookingIDObject.put("BookingId2", bookingId2);
            bookingIDObject.put("BookingId3", bookingId3);
            Jsoner.serialize(bookingIDObject, writer);
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        */
    }

    public ArrayList<String> getBookingIDFromJson() throws IOException, ParseException {
//        JSONObject jsonObject = (JSONObject) parser.parse(new FileReader("src/test/resources/Files/BookingID.json"));
//        bookingID1 = jsonObject.get("BookingId1").toString();
//        bookingID2 = jsonObject.get("BookingId2").toString();
//        bookingID3 = jsonObject.get("BookingId3").toString();
        bookingID1 = Serenity.getCurrentSession().getMetaData().get("BookingId1");
        bookingID2 = Serenity.getCurrentSession().getMetaData().get("BookingId2");
        bookingID3 = Serenity.getCurrentSession().getMetaData().get("BookingId3");
        ArrayList<String> bookingsIDList = new ArrayList<>();
        bookingsIDList.add(bookingID1);
        bookingsIDList.add(bookingID2);
        bookingsIDList.add(bookingID3);
        return bookingsIDList;
    }

    public void clickOnTheButtonOfTheAppropriateBooking(String arg0) throws IOException, ParseException {
        System.out.println(Serenity.getCurrentSession().getMetaData().get("BookingId1"));
        System.out.println(Serenity.getCurrentSession().getMetaData().get("BookingId2"));
        System.out.println(Serenity.getCurrentSession().getMetaData().get("BookingId3"));
        System.out.println("bookingShortID = " + Serenity.getCurrentSession().getMetaData().get("bookingShortID"));
        System.out.println("bookingShortIDforTimesheets = " + Serenity.getCurrentSession().getMetaData().get("bookingShortIDforTimesheets"));
        System.out.println(getDriver().getCurrentUrl());
        if (getDriver().getCurrentUrl().contains("school")) {
            SchoolSide = true;
            System.out.println("SchoolSide = " + SchoolSide);
            if (isElementPresent("//span[contains(.,'" + Serenity.getCurrentSession().getMetaData().get("bookingShortIDforTimesheets") + "')]")) {
                getDriver().findElement(By.xpath("//span[contains(.,'" + Serenity.getCurrentSession().getMetaData().get("bookingShortIDforTimesheets") + "')]/..//div[@class='role' and contains(.,'" + arg0 + "')]")).click();
                System.out.println("Clicked");
            } else if (isElementPresent("//span[contains(text(),'Next')]")) {
                getDriver().findElement(By.xpath("//span[contains(text(),'Next')]")).click();
            }
        } else for (int i = 1; i < 11 + 1; i++) {
            getDriver().findElement(By.xpath("(//button[@class='open' and contains(.,'+')])[" + i + "]")).click();
            if (getDriver().findElement(By.xpath("(//p[@class='hidden-content__block-description'])[1]")).getText().equals(Serenity.getCurrentSession().getMetaData().get("BookingId1")) ||
                    getDriver().findElement(By.xpath("(//p[@class='hidden-content__block-description'])[1]")).getText().equals(Serenity.getCurrentSession().getMetaData().get("BookingId2")) ||
                    getDriver().findElement(By.xpath("(//p[@class='hidden-content__block-description'])[1]")).getText().equals(Serenity.getCurrentSession().getMetaData().get("BookingId3")) ||
                    getDriver().findElement(By.xpath("(//p[@class='hidden-content__block-description'])[1]")).getText().equals(Serenity.getCurrentSession().getMetaData().get("bookingShortID"))) {
                if (arg0.equals("timesheet")) {
                    Serenity.getCurrentSession().addMetaData("bookingShortIDforTimesheets", getDriver().findElement(By.xpath("(//p[@class='hidden-content__block-description'])[1]")).getText());
                    getDriver().findElement(By.xpath("//p[@class='hidden-content__block-description']/../../../../../..//a[@class='timesheet__link' and contains(.,'timesheet')]")).click();
                    break;
                } else {
                    if (arg0.equals("accept")) {
                        getDriver().findElement(By.xpath("//p[@class='hidden-content__block-description']/../../../../../..//button[contains(.,'" + arg0 + "')]")).click();
                        Serenity.getCurrentSession().addMetaData("Accepted_Declined_Booking", getDriver().findElement(By.xpath("(//p[@class='hidden-content__block-description'])[1]")).getText());
                        System.out.println("Accepted booking = " + Serenity.getCurrentSession().getMetaData().get("Accepted_Declined_Booking"));
                        i = 10;
                        break;
                    }
                    if (arg0.equals("decline")) {
                        System.out.println(getDriver().findElement(By.xpath("//p[@class='hidden-content__block-description']/../../../../../..//button[contains(.,'accept')]")).getCssValue("background-color"));
                        if (getDriver().findElement(By.xpath("//p[@class='hidden-content__block-description']/../../../../../..//button[contains(.,'accept')]")).getCssValue("background-color").equals("#00b86c")) {
                            getDriver().findElement(By.xpath("//button[@class='open' and contains(.,'-')]")).click();
                            if ((i == 10) & isElementPresent("//span[contains(text(),'Next')]")) {
                                getDriver().findElement(By.xpath("//span[contains(text(),'Next')]")).click();
                                i = 0;
                            } else return;
                        } else {
                            System.out.println("Decline booking = " + getDriver().findElement(By.xpath("(//p[@class='hidden-content__block-description'])[1]")).getText());
                            getDriver().findElement(By.xpath("//p[@class='hidden-content__block-description']/../../../../../..//button[contains(.,'" + arg0 + "')]")).click();
                            i = 10;
                            break;
                        }
                    }
                }
            } else {
                getDriver().findElement(By.xpath("//button[@class='open' and contains(.,'-')]")).click();
                if ((i == 10) & isElementPresent("//span[contains(text(),'Next')]")) {
                    getDriver().findElement(By.xpath("//span[contains(text(),'Next')]")).click();
                    i = 0;
                }
            }
        }
    }


    //    @Test
    public void createBookingUsingRequestAPI(List<String> list) throws IOException, ParseException {
        getAccessTokenAuth0();
//        String body = "{\"operationName\":\"createBooking\",\"variables\":{\"input\":{\"school_id\":\"4a82e641-74d0-4d25-8d58-634e1dccad07\",\"bookingName\":\"asdsd\",\"bookingDescription\":\"asdasd\",\"other_age_group\":\"\",\"dates\":[{\"date\":\"2020-08-31T08:30:00+03:00\",\"fullDay\":true,\"start_time\":\"2020-08-31T08:30:00+03:00\",\"end_time\":\"2020-08-31T16:00:00+03:00\"}],\"ageGroupIds\":null,\"schoolDocumentsIds\":null,\"applyUsersIds\":[{\"user_id\":\"aa8e7955-b3a3-428c-8354-1d3ceceaac5b\",\"user_type\":\"TEACHER\"}],\"teachersTypeIdsSchema\":[{\"teacher_type_id\":\"5d714ae1-4fb4-4b89-a927-47c4396c418e\"}],\"creator_id\":\"94b348d1-32f4-44a8-b7d1-8a35b55ef6bc\",\"anonymisation\":false,\"documents\":null,\"subjectIds\":[]}},\"query\":\"mutation createBooking($input: CreateBookingPayload!) {\\n  createBooking(input: $input) {\\n    id\\n    short_id\\n    name\\n    description\\n    __typename\\n  }\\n}\\n\"}";
        String body = "{\"operationName\":\"createBooking\",\"variables\":{\"input\":{" +
                list.get(0) + "," +
                list.get(1) + "," +
                list.get(2) + "," +
                list.get(3) + "," +
                list.get(4) + "," +
                list.get(5) + "," +
                list.get(6) + "," +
                list.get(7) + "," +
                list.get(8) + "," +
                list.get(9) + "," +
                list.get(10) + "," +
                list.get(11) + "," +
                list.get(12) + "}}," +
                "\"query\":\"mutation createBooking($input: CreateBookingPayload!) {\\n  createBooking(input: $input) {\\n    id\\n    short_id\\n    name\\n    description\\n    __typename\\n  }\\n}\\n\"}";
//        System.out.println(body);
        String url = "https://29cwhlvcb3.execute-api.us-east-1.amazonaws.com/uat/graphql";
        urlObject = new URL(url);
        HttpsURLConnection connection = (HttpsURLConnection) urlObject.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("content-type", "application/json");
        connection.setRequestProperty("authorization", token);
        connection.setDoOutput(true);
        try (OutputStream os = connection.getOutputStream()) {
            byte[] input = body.getBytes("utf-8");
            os.write(input, 0, input.length);
        }
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(connection.getInputStream(), "utf-8"))) {
            StringBuilder response = new StringBuilder();
            String encoding = connection.getContentEncoding();
            String responseLine = null;
            encoding = encoding == null ? "UTF-8" : encoding;
            String respbody = IOUtils.toString(connection.getInputStream(), encoding);
            while ((responseLine = br.readLine()) != null) {
                response.append(responseLine.trim());
            }
            JSONObject jsonObject = (JSONObject) parser.parse(respbody);
            System.out.println(jsonObject);
            JSONObject jsonObject2 = (JSONObject) parser.parse(jsonObject.get("data").toString());
            JSONObject jsonObject3 = (JSONObject) parser.parse(jsonObject2.get("createBooking").toString());
            bookingLongId = jsonObject3.get("id").toString();
            bookingShortID = jsonObject3.get("short_id").toString();
            Serenity.getCurrentSession().addMetaData("bookingLongId", bookingLongId);
            Serenity.getCurrentSession().addMetaData("bookingShortID", bookingShortID);
            Serenity.getCurrentSession().addMetaData("bookingShortIDforTimesheets", bookingShortID);
            System.out.println("bookingLongId = " + bookingLongId);
            System.out.println("bookingShortID = " + bookingShortID);
        }
    }


    public void acceptBookingAsClearedTeacherUsingRequestAPI(List<String> list) throws
            IOException, ParseException {
        getAccessTokenAuth0();
        String body = "{\"operationName\":\"acceptingBookingTeacher\",\"variables\":\n" +
                "            {\"payload\":{" +
                list.get(0) + "," + "\"bookingId\":\"" +
                Serenity.getCurrentSession().getMetaData().get("bookingLongId") + "\"," +
                list.get(1) + "}}," +
                " \"query\":\"mutation acceptingBookingTeacher($payload: BookingPayload!) {\\n  userAcceptedBooking(input: $payload)\\n}\\n\"}";
        String url = "https://29cwhlvcb3.execute-api.us-east-1.amazonaws.com/uat/graphql";
        urlObject = new URL(url);
        HttpsURLConnection connection = (HttpsURLConnection) urlObject.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("content-type", "application/json");
        connection.setRequestProperty("authorization", token);
        connection.setDoOutput(true);
        try (OutputStream os = connection.getOutputStream()) {
            byte[] input = body.getBytes("utf-8");
            os.write(input, 0, input.length);
        }
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(connection.getInputStream(), "utf-8"))) {
            StringBuilder response = new StringBuilder();
            String encoding = connection.getContentEncoding();
            String responseLine = null;
            encoding = encoding == null ? "UTF-8" : encoding;
            String respbody = IOUtils.toString(connection.getInputStream(), encoding);
            while ((responseLine = br.readLine()) != null) {
                response.append(responseLine.trim());
            }
            JSONObject jsonObject = (JSONObject) parser.parse(respbody);
            System.out.println(jsonObject.toString());
        }
    }

    public void approveBookingAsSchoolUsingRequestAPI(List<String> list) throws IOException, ParseException {
        getAccessTokenAuth0();
        String body = "{\"operationName\":\"schoolAcceptTeacher\",\"variables\":{" +
                list.get(0) + "," + "\"bookingId\":\"" +
                Serenity.getCurrentSession().getMetaData().get("bookingLongId") + "\"," +
                list.get(1) + "},\n" +
                "\"query\":\"mutation schoolAcceptTeacher($userId: String!, $bookingId: String!, $schoolId: String!){schoolAcceptTeacher(userId: $userId, bookingId: $bookingId, schoolId: $schoolId)}\"}";
        String url = "https://29cwhlvcb3.execute-api.us-east-1.amazonaws.com/uat/graphql";
        urlObject = new URL(url);
        HttpsURLConnection connection = (HttpsURLConnection) urlObject.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("content-type", "application/json");
        connection.setRequestProperty("authorization", token);
        connection.setDoOutput(true);
        try (OutputStream os = connection.getOutputStream()) {
            byte[] input = body.getBytes("utf-8");
            os.write(input, 0, input.length);
        }
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(connection.getInputStream(), "utf-8"))) {
            StringBuilder response = new StringBuilder();
            String encoding = connection.getContentEncoding();
            String responseLine = null;
            encoding = encoding == null ? "UTF-8" : encoding;
            String respbody = IOUtils.toString(connection.getInputStream(), encoding);
            while ((responseLine = br.readLine()) != null) {
                response.append(responseLine.trim());
            }
            JSONObject jsonObject = (JSONObject) parser.parse(respbody);
            System.out.println(body);
            System.out.println(jsonObject.toString());
        }
    }


    public void changeBookingStatusToCompleted(List<String> list) throws IOException, ParseException {
        getAccessTokenAuth0();
        String body = "{\"query\": \"mutation { adminCompleteBooking(" + list.get(0) + ", booking_id: \\\"" + Serenity.getCurrentSession().getMetaData().get("bookingLongId") + "\\\")}\", \"variables\":null}";
        String url = "https://29cwhlvcb3.execute-api.us-east-1.amazonaws.com/uat/graphql";
        urlObject = new URL(url);
//        System.out.println(body);
        HttpsURLConnection connection = (HttpsURLConnection) urlObject.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("content-type", "application/json");
        connection.setRequestProperty("authorization", token);
        connection.setDoOutput(true);
        try (OutputStream os = connection.getOutputStream()) {
            byte[] input = body.getBytes("utf-8");
            os.write(input, 0, input.length);
        }
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(connection.getInputStream(), "utf-8"))) {
            StringBuilder response = new StringBuilder();
            String encoding = connection.getContentEncoding();
            String responseLine = null;
            encoding = encoding == null ? "UTF-8" : encoding;
            String respbody = IOUtils.toString(connection.getInputStream(), encoding);
            while ((responseLine = br.readLine()) != null) {
                response.append(responseLine.trim());
            }
            JSONObject jsonObject = (JSONObject) parser.parse(respbody);
            System.out.println(jsonObject.toString());
        }
    }

    public void enterEmailOfAppropriateTeacher(String arg0) {
        getDriver().findElement(By.xpath("//span[@title='Click to Edit']")).click();
        getDriver().findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(arg0);
        getDriver().findElement(By.xpath("//button[contains(.,'Set')]")).click();
        waitABit(30000);

    }

    public void chooseAppropriateEmailMessage(String arg0) {
        wait = new WebDriverWait(getDriver(), 100);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[contains(.,'" + arg0 + "')]")));
        getDriver().findElement(By.xpath("//td[contains(.,'" + arg0 + "')]")).click();
        String message = getDriver().findElement(By.xpath("(//tbody)[6]")).getText().substring(53).trim().trim().trim();
//        System.out.println(message);
        Serenity.getCurrentSession().addMetaData("Emailmessage",message);
        waitABit(2000);

    }


    public void removeAllUserBookingsUsingRequestAPI(List<String> list) throws IOException, ParseException {
        getAccessTokenAuth0();
        String body = "{\"query\": \"mutation { adminRemoveUserBookings(" + list.get(0) + "," + list.get(1) + "){id,short_id,name,description}}\", \"variables\":null}";
        String url = "https://29cwhlvcb3.execute-api.us-east-1.amazonaws.com/uat/graphql";
        urlObject = new URL(url);
        System.out.println(body);
        HttpsURLConnection connection = (HttpsURLConnection) urlObject.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("content-type", "application/json");
        connection.setRequestProperty("authorization", token);
        connection.setDoOutput(true);
        try (OutputStream os = connection.getOutputStream()) {
            byte[] input = body.getBytes("utf-8");
            os.write(input, 0, input.length);
        }
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(connection.getInputStream(), "utf-8"))) {
            StringBuilder response = new StringBuilder();
            String encoding = connection.getContentEncoding();
            String responseLine = null;
            encoding = encoding == null ? "UTF-8" : encoding;
            String respbody = IOUtils.toString(connection.getInputStream(), encoding);
            while ((responseLine = br.readLine()) != null) {
                response.append(responseLine.trim());
            }
            JSONObject jsonObject = (JSONObject) parser.parse(respbody);
            System.out.println(jsonObject.toString());
        }

    }

    public void chooseRadiobutton(String arg0) {
        if (isElementPresent("//span[contains(.,'" + arg0 + "')]/..//div[@role='radio']")) {
            getDriver().findElement(By.xpath("//span[contains(.,'" + arg0 + "')]/..//div[@role='radio']")).click();
        }
        if (isElementPresent("//div[contains(.,'" + arg0 + "') and @class='radio-button']")){
            getDriver().findElement(By.xpath("//div[contains(.,'" + arg0 + "') and @class='radio-button']")).click();
        }
        if (isElementPresent("//label[contains(.,'"+arg0+"')]")){
            getDriver().findElement(By.xpath("//label[contains(.,'"+arg0+"')]")).click();
        }
//        if (isElementPresent("//label[contains(.,'"+arg0+"')]/..//.//i[@class='icon icon--selection-control material-icons icon--radio']")){
//            getDriver().findElement(By.xpath("//label[contains(.,'"+arg0+"')]/..//.//i[@class='icon icon--selection-control material-icons icon--radio']")).click();
//        }


    }


    public String getDate() {
        date = java.time.LocalDate.now().toString().substring(8, 10);
        month = java.time.LocalDate.now().toString().substring(5, 7);
        year = java.time.LocalDate.now().toString().substring(0, 4);
        current_date = date + ", " + year;
        System.out.println(current_date);
        return current_date;
    }

    public void enterTextToTheTextField(String arg0) {
        waitUntilElementVisible("//textarea[@type='text']", 60);
        getDriver().findElement(By.xpath("//textarea[@type='text']")).sendKeys(arg0);
        Serenity.getCurrentSession().addMetaData("covering message", arg0);
    }

    public ArrayList<String> theMessageLinkOfFirstApplicantHasRightEmailAddress(String arg0) {
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");
        if (!getDriver().findElement(By.xpath("(//div[@class='table-body']//a)[1]")).isDisplayed()) {
            results.set(0, "false");
            results.add("Message link isn't displayed");
        } else {
            if ((!arg0.equals(getDriver().findElement(By.xpath("(//div[@class='table-body']//a)[1]")).getAttribute("href").substring(7)))) {
                results.set(0, "false");
                results.add("Expected: " + arg0 + "; but found: " + getDriver().findElement(By.xpath("(//div[@class='table-body']//p[@class='received'])[1]")).getAttribute("href").substring(7) + "\n");
            }
        }
        return results;

    }

    public void createLogicMelonJobThroughAPI(List<String> list) throws IOException, ParseException {
        random = (int) (Math.random() * 1000 + 111);
        getDate();
        String body = "{\"query\":\"mutation job($input: MelonJobPayload!) {\\n  postMelonJob(input: $input) {\\n    status\\n    message\\n    error {\\n      message\\n    }\\n  }\\n}\",\n" +
                "\"variables\":{\n" +
                "\t\"input\":{\n" +
                list.get(0) + ",\n" +
                "\"job_details\":{\n" +
                "\"name\":\"Job melon " + random + "\",\n" +
                "\"description\":\"logic-melon " + random + "\",\n" +
                "\"closing_date\":\"" + year + "/" + month + "/" + date + "\",\n" +
                "\"salary\":\"" + random + "\",\n" +
                "\"anonymisation\":false,\n" +
                "\"video_prescreening\":false,\n" +
                "\"video_interview\":false},\n" +
                "\n" +
                "\"skills\":[],\n" +
                "\"application_form\":[],\n" +
                "\"additional_documents\":[],\n" +
                "\"contractTypes\":[\n" +
                "{\"contract_type_id\":\"7f12270c-5f6a-423d-ad30-d2036dae5824\"},\n" +
                "{\"contract_type_id\":\"69288980-0bc6-4546-a664-9df911478731\"}],\n" +
                "\"contractTerms\":[\n" +
                "{\"contract_term_id\":\"934b04cc-febf-4c63-90fa-7ba771398056\"},\n" +
                "{\"contract_term_id\":\"7425f578-7d18-4975-966b-132f531710bf\"}]}\n" +
                "},\n" +
                "\"operationName\":\"job\"\n" +
                "}";
        Serenity.getCurrentSession().addMetaData("job name", "Job melon " + random);
        Serenity.getCurrentSession().addMetaData("job description", "logic-melon " + random);
        Serenity.getCurrentSession().addMetaData("Salary", String.valueOf(random));
        String url = "https://mor1qbbju2.execute-api.us-east-1.amazonaws.com/uat/graphql";//uat
//            String url = "https://m0k6bdan78.execute-api.us-east-1.amazonaws.com/dev/graphql";//dev
        urlObject = new URL(url);
        HttpsURLConnection connection = (HttpsURLConnection) urlObject.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("content-type", "application/json");
        connection.setRequestProperty("x-api-key", "JaiK7RbyVK6urN2WREaBeO4nhMNloH32fp6ecarg");//uat
//            connection.setRequestProperty("x-api-key", "XdCiMyMZ2VaBZOeFUYhgw6CjFkDwlyLkiB4QuI42");//dev
        connection.setDoOutput(true);
        try (OutputStream os = connection.getOutputStream()) {
            byte[] input = body.getBytes("utf-8");
            os.write(input, 0, input.length);
        }
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(connection.getInputStream(), "utf-8"))) {
            StringBuilder response = new StringBuilder();
            String encoding = connection.getContentEncoding();
            String responseLine = null;
            encoding = encoding == null ? "UTF-8" : encoding;
            String respbody = IOUtils.toString(connection.getInputStream(), encoding);
            while ((responseLine = br.readLine()) != null) {
                response.append(responseLine.trim());
            }
            JSONObject jsonObject = (JSONObject) parser.parse(respbody);
            System.out.println(jsonObject.toString());
        }
    }

    public void checkBookingCreationStatus(List<String> list2) throws IOException, ParseException {
        System.out.println("creation_status = " + Serenity.getCurrentSession().getMetaData().get("creation_status"));
        if (!Serenity.getCurrentSession().getMetaData().get("creation_status").equals("true")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("\"school_id\":\"ef1e8d35-5619-4a40-a76e-cd6b4eab07d6\"");
            list.add(list2.get(0));
            list.add("\"bookingDescription\":\"Booking Description text\"");
            list.add("\"other_age_group\":\"\"");
            list.add(list2.get(1));
            list.add("\"ageGroupIds\":[{\"age_group_id\":\"19abfc90-f45b-476b-920f-b05e6e3124a0\"}] ");
            list.add("\"schoolDocumentsIds\":{\"school_document_id\":\"9c78412f-fe27-4fcc-b527-405e903810e2\"}                                               ");
            list.add(list2.get(2));
            list.add(list2.get(3));
            list.add("\"creator_id\":\"f161024f-7d3a-4738-a804-8d9bfeeb9453\"                                                 ");
            list.add("\"anonymisation\":false                                           ");
            list.add("\"documents\":null            ");
            list.add("\"subjectIds\":[{\"subject_id\":\"e0eb4195-27e9-4a20-8a6a-c994d008cc61\"}]");
            createBookingUsingRequestAPI(list);
            Serenity.getCurrentSession().addMetaData("BookingId1", Serenity.getCurrentSession().getMetaData().get("bookingShortID"));
            System.out.println(Serenity.getCurrentSession().getMetaData().get("bookingShortID"));
            createBookingUsingRequestAPI(list);
            Serenity.getCurrentSession().addMetaData("BookingId2", Serenity.getCurrentSession().getMetaData().get("bookingShortID"));
            System.out.println(Serenity.getCurrentSession().getMetaData().get("bookingShortID"));
            createBookingUsingRequestAPI(list);
            Serenity.getCurrentSession().addMetaData("BookingId3", Serenity.getCurrentSession().getMetaData().get("bookingShortID"));
            System.out.println(Serenity.getCurrentSession().getMetaData().get("bookingShortID"));
        }
    }

    public ArrayList<String> theButtonOfTheAppropriateBookingIsnTClickable(String arg0) throws IOException, ParseException {
        clickOnTheButtonOfTheAppropriateBooking(arg0);
        waitABit(5000);
        ArrayList<String> results = new ArrayList<>();
        String atribute = getDriver().findElement(By.xpath("//p[@class='hidden-content__block-description']/../../../../../..//button[contains(.,'" + arg0 + "')]")).getAttribute("disabled");
        System.out.println("disabled attribute = " + atribute);
        results.add(0, "true");
        if (!getDriver().findElement(By.xpath("//p[@class='hidden-content__block-description']/../../../../../..//button[contains(.,'" + arg0 + "')]")).getAttribute("disabled").equals("true")) {
//            System.out.println(getDriver().findElement(By.xpath("//p[@class='hidden-content__block-description']/../../../../../..//button[contains(.,'" + arg0 + "')]")).getCssValue("disabled").equals("disabled"));
            results.set(0, "false");
            results.add("Button is clickable");
        }
        return results;
    }

    public void clickOnTheLink(String arg0) {
        getDriver().findElement(By.xpath("//a[contains(.,'" + arg0 + "')]")).click();
    }

    public void clickOnTheButtonAtTheSection(String arg0, String arg1) {
        waitUntilElementVisible("//div[@class='component-header' and contains(.,'" + arg1 + "')]//span[contains(.,'" + arg0 + "')]", 40);
        getDriver().findElement(By.xpath("//div[@class='component-header' and contains(.,'" + arg1 + "')]//span[contains(.,'" + arg0 + "')]")).click();
    }

    public void enterPostcodeToTheField(String arg0, String arg1) {
        getDriver().findElement(By.xpath("//input[@placeholder='" + arg1 + "']")).click();
        for (int i = 0; i < 20; i++) {
            getDriver().findElement(By.xpath("//input[@placeholder='" + arg1 + "']")).sendKeys(Keys.BACK_SPACE);
        }
        getDriver().findElement(By.xpath("//input[@placeholder='" + arg1 + "']")).sendKeys(Keys.DELETE);
        getDriver().findElement(By.xpath("//input[@placeholder='" + arg1 + "']")).sendKeys(arg0);
    }

    public void chooseRandomAddressFromTheDropdownInTheRange(String arg0) {
        int max = Integer.parseInt(arg0);
        int min = 1;
        int range = max - min + 1;
        random = (int) (Math.random() * range) + min;
        waitUntilElementVisible("(//div[@class='list']//a[@class='list__tile list__tile--link'])[" + random + "]", 30);
        getDriver().findElement(By.xpath("(//div[@class='list']//a[@class='list__tile list__tile--link'])[" + random + "]")).click();

    }

    public ArrayList<String> enterTheToTheField(String arg0, String arg1) {
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "false");
        if (isElementPresent("//input[@placeholder='" + arg1 + "']")) {
            getDriver().findElement(By.xpath("//input[@placeholder='" + arg1 + "']")).sendKeys(arg0);
            results.set(0, "true");
            return results;
        }
        if (isElementPresent("//textarea[@placeholder='" + arg1 + "']")) {
            getDriver().findElement(By.xpath("//textarea[@placeholder='" + arg1 + "']")).sendKeys(arg0);
            results.set(0, "true");
            return results;
        }
        if (isElementPresent("//p[contains(.,'" + arg1 + "')]/..//input")) {
            getDriver().findElement(By.xpath("//p[contains(.,'" + arg1 + "')]/..//input")).sendKeys(arg0);
            results.set(0, "true");
            return results;
        }
        if (isElementPresent("//p[contains(.,'" + arg1 + "')]/../../..//input")) {
            getDriver().findElement(By.xpath("//p[contains(.,'" + arg1 + "')]/../../..//input")).sendKeys(arg0);
            results.set(0, "true");
            return results;
        }

        return results;
    }

    public ArrayList<String> theAllEnteredDataToTheAccountSectionAreSaved(List<String> list, String arg0) {
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");
        if (getDriver().getCurrentUrl().contains("school")) {
            SchoolSide = true;
            System.out.println("SchoolSide = " + SchoolSide);
            waitUntilElementVisible("//div[@class='MyInfoSchoolAccount-school' and contains(.,'" + list.get(0) + "')]", 60);
            if (!getDriver().findElement(By.xpath("//div[@class='MyInfoSchoolAccount-school' and contains(.,'" + list.get(0) + "')]")).isDisplayed()) {
//            !getDriver().findElement(By.xpath("//p[contains(.,'Address')]/..//div")).getText().equals(list.get(2))) {
                results.set(0, "false");
                results.add("School Account page isn't saved");
//                results.add("Expected: "+list.get(2)+"; But found: "+getDriver().findElement(By.xpath("//p[contains(.,'Address')]/..//div")).getText());
            } else {
                for (int i = 1; i < list.size(); i++) {
                    if (!isElementPresent("//p[contains(.,'" + list.get(i) + "')]") &&
                            !isElementPresent("//a[contains(.,'" + list.get(i) + "')]") &&
                            !isElementPresent("//span[contains(.,'" + list.get(i) + "')]")) {
                        results.set(0, "false");
                        results.add("Expected: " + list.get(i) + "; but not displayed");
                    }
                }
            }

        }
        if (getDriver().getCurrentUrl().contains("teacher")) {
            TeacherSide = true;
            System.out.println("Teacher = " + TeacherSide);
            waitUntilElementVisible("//div[@class='MyInfoAccount-name']", 60);

            if (arg0.equals("Contact Details")) {
                waitUntilElementVisible("//div[@class='component-header' and contains(.,'" + arg0 + "')]", 60);
                if (!getDriver().findElement(By.xpath("//div[@class='component-header' and contains(.,'" + arg0 + "')]")).isDisplayed()) {
                    results.set(0, "false");
                    results.add("Teacher Account page isn't saved");
                } else {
                    for (int i = 1; i < list.size(); i++) {
                        if (!isElementPresent("//p[contains(.,'" + list.get(i) + "')]") &&
                                !isElementPresent("//a[contains(.,'" + list.get(i) + "')]") &&
                                !isElementPresent("//span[contains(.,'" + list.get(i) + "')]")) {
                            results.set(0, "false");
                            results.add("Expected: " + list.get(i) + "; but not displayed");
                            break;
                        }
                    }
                }
            }
            if (arg0.equals("Teacher Details")) {
                waitUntilElementVisible("//div[@class='component-header' and contains(.,'" + arg0 + "')]", 60);
                if (!getDriver().findElement(By.xpath("//div[@class='component-header' and contains(.,'" + arg0 + "')]")).isDisplayed()) {
                    results.set(0, "false");
                    results.add("Teacher Details page isn't saved");
                } else {
                    for (int i = 0; i < list.size(); i++) {
                        if (!isElementPresent("//p[contains(.,'" + list.get(i) + "')]") &&
                                !isElementPresent("//a[contains(.,'" + list.get(i) + "')]") &&
                                !isElementPresent("//span[contains(.,'" + list.get(i) + "')]")) {
                            results.set(0, "false");
                            results.add("Expected: " + list.get(i) + "; but not displayed");
                            break;
                        }
                    }
                }
            } else {
//                if (!getDriver().findElement(By.xpath("//div[@class='MyInfoAccount-name' and contains(.,'" + list.get(0) + "')]")).isDisplayed()) {
////            !getDriver().findElement(By.xpath("//p[contains(.,'Address')]/..//div")).getText().equals(list.get(2))) {
//                    results.set(0, "false");
//                    results.add("Teacher Account page isn't saved");
////                results.add("Expected: "+list.get(2)+"; But found: "+getDriver().findElement(By.xpath("//p[contains(.,'Address')]/..//div")).getText());
//                } else {
                    for (int i = 1; i < list.size(); i++) {
                        if (!isElementPresent("//p[contains(.,'" + list.get(i) + "')]") &&
                                !isElementPresent("//a[contains(.,'" + list.get(i) + "')]") &&
                                !isElementPresent("//span[contains(.,'" + list.get(i) + "')]")) {
                            results.set(0, "false");
                            results.add("Expected: " + list.get(i) + "; but not displayed");
                            break;
                        }
                    }
                }

            }
//        }
        return results;
    }

    public ArrayList<String> theTextIsDisplayedAtTheSection(String arg0, String arg1) {
        waitUntilElementVisible("//div[@class='MyInfoDocuments-descr']", 60);
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");
        if (!getDriver().findElement(By.xpath("//div[@class='MyInfoDocuments-descr']")).getText().equals(arg0)) {
            results.set(0, "false");
            results.add("Expected: " + arg0 + "; but found: " + getDriver().findElement(By.xpath("//div[@class='MyInfoDocuments-descr']")).getText());
        }
        return results;
    }

    public ArrayList<String> uploadedFileIsSaved(String arg0) {
        waitUntilElementVisible("//p[@class='MyInfoDocuments-file']", 60);
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");
        if (!getDriver().findElement(By.xpath("//p[@class='MyInfoDocuments-file']")).getText().equals(arg0)) {
            results.set(0, "false");
            results.add("Expected: " + arg0 + "; but found: " + getDriver().findElement(By.xpath("//p[@class='MyInfoDocuments-file']")).getText());
        }
        return results;
    }

    public void clickOnTheProfilingQuestion(String arg0) {
        getDriver().findElement(By.xpath("(//div[@class='menu'])[" + arg0 + "]/..//i")).click();
        ProfilingQuestion_dropdown_counter = 6 - Integer.parseInt(arg0);
    }

    public ArrayList<String> dropdownContainsTheNextItems(List<String> list) throws InterruptedException {
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");
        JavascriptExecutor je = (JavascriptExecutor) getDriver();
        int number_of_item = 1;
        if (getDriver().getCurrentUrl().contains("profiling-questions")) {
            for (int i = 0; i < list.size(); i++) {
                waitUntilElementVisible("((//div[@class='list'])[" + ProfilingQuestion_dropdown_counter + "]//div[@class='list__tile__title'])[" + number_of_item + "]", 30);
                if (!list.get(i).equals(getDriver().findElement(By.xpath("((//div[@class='list'])[" + ProfilingQuestion_dropdown_counter + "]//div[@class='list__tile__title'])[" + number_of_item + "]")).getText().trim())) {
                    results.set(0, "false");
                    results.add("Expected: " + list.get(i) + "; but found: " + getDriver().findElement(By.xpath("((//div[@class='list'])[" + ProfilingQuestion_dropdown_counter + "]//div[@class='list__tile__title'])[" + number_of_item + "]")).getText().trim() + "\n");
                    System.out.println("((//div[@class='list'])[" + ProfilingQuestion_dropdown_counter + "]//div[@class='list__tile__title'])[" + number_of_item + "]");
                    break;
                }
                number_of_item++;
            }
        } else
            for (int i = 0; i < list.size(); i++) {
                waitUntilElementVisible("//div[@class='menu__content menu__content--select menuable__content__active']//div[@class='list']", 30);
                if (!isElementPresent("(//div[@class='menu__content menu__content--select menuable__content__active']//div[@class='list__tile__title'])[" + number_of_item + "]")) {
                    number_of_item--;
                    WebElement item = getDriver().findElement(By.xpath("(//div[@class='menu__content menu__content--select menuable__content__active']//div[@class='list__tile__title'])[" + number_of_item + "]"));
                    System.out.println("Unable to view item : " + "\n" + item);
                    number_of_item++;
                    do {
                        je.executeScript("arguments[0].scrollIntoView(true);", item);
                    } while (!isElementPresent("(//div[@class='menu__content menu__content--select menuable__content__active']//div[@class='list__tile__title'])[" + number_of_item + "]"));
                }
                if (!list.get(i).equals(getDriver().findElement(By.xpath("(//div[@class='menu__content menu__content--select menuable__content__active']//div[@class='list__tile__title'])[" + number_of_item + "]")).getText().trim())) {
                    results.set(0, "false");
                    results.add("Expected: " + list.get(i) + "; but found: " + getDriver().findElement(By.xpath("(//div[@class='menu__content menu__content--select menuable__content__active']div[@class='list__tile__title'])[" + number_of_item + "]")).getText().trim() + "\n");
                    break;
                }
                number_of_item++;
            }

        return results;
    }

    public ArrayList<String> chooseTheItemInTheDropdown(String arg0) {
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "false");
        if (getDriver().getCurrentUrl().contains("profiling-questions")) {
            getDriver().findElement(By.xpath("((//div[@class='list'])[" + ProfilingQuestion_dropdown_counter + "]//div[@class='list__tile__title'])[" + arg0 + "]")).click();
            results.set(0, "true");
            return results;
        }
        if (getDriver().getCurrentUrl().contains("supply-details")) {
            if (isElementPresent("(//div[@class='list__tile__title' and contains(.,'" + arg0 + "')]/../..//div[@role='checkbox'])")) {
                if (getDriver().findElement(By.xpath("(//div[@class='list__tile__title' and contains(.,'" + arg0 + "')]/../..//div[@role='checkbox'])[3]")).isDisplayed()) {
                    getDriver().findElement(By.xpath("(//div[@class='list__tile__title' and contains(.,'" + arg0 + "')]/../..//div[@role='checkbox'])[3]")).click();
                    results.set(0, "true");
                    return results;
                }
                if (getDriver().findElement(By.xpath("(//div[@class='list__tile__title' and contains(.,'" + arg0 + "')]/../..//div[@role='checkbox'])[2]")).isDisplayed()) {
                    getDriver().findElement(By.xpath("(//div[@class='list__tile__title' and contains(.,'" + arg0 + "')]/../..//div[@role='checkbox'])[2]")).click();
                    results.set(0, "true");
                    return results;
                }
                if (getDriver().findElement(By.xpath("(//div[@class='list__tile__title' and contains(.,'" + arg0 + "')]/../..//div[@role='checkbox'])[1]")).isDisplayed()) {
                    getDriver().findElement(By.xpath("(//div[@class='list__tile__title' and contains(.,'" + arg0 + "')]/../..//div[@role='checkbox'])[1]")).click();
                    results.set(0, "true");
                    return results;
                }
            }
            if (getDriver().findElement(By.xpath("//div[@class='list__tile__title' and contains(.,'" + arg0 + "')]/../../..")).isDisplayed()) {
                getDriver().findElement(By.xpath("//div[@class='list__tile__title' and contains(.,'" + arg0 + "')]/../..")).click();
                results.set(0, "true");
                return results;
            }
//            if (getDriver().findElement(By.xpath("//a[@class='list__tile list__tile--link']//div[@class='list__tile__content']//div[contains(.,'"+arg0+"')]")).isDisplayed()) {
                getDriver().findElement(By.xpath("//div[@class='menu__content menu__content--select menuable__content__active']//div[3]//a[1]")).click();
                results.set(0, "true");
                return results;
//            }
        }else
        if (getDriver().findElement(By.xpath("//a[@class='list__tile list__tile--link']//div[@class='list__tile__content']//div[contains(.,'"+arg0+"')]")).isDisplayed()) {
            getDriver().findElement(By.xpath("//a[@class='list__tile list__tile--link']//div[@class='list__tile__content']//div[contains(.,'" + arg0 + "')]")).click();
            results.set(0, "true");
            return results;
        }
        return results;
    }

    public void enterEmailOfNewSchoolUser() {
//        if(!Serenity.getCurrentSession().getMetaData().get("emailOfNewSchoolUser").isEmpty()) {
        getDriver().findElement(By.xpath("//input[@type='email']")).sendKeys(Serenity.getCurrentSession().getMetaData().get("emailOfNewSchoolUser"));
//        }else getDriver().findElement(By.xpath("//input[@type='email']")).sendKeys(Serenity.getCurrentSession().getMetaData().get("emailOfNewUser"));
    }

    public ArrayList<String> clickOnTheDropdown(String arg1, String arg0) {
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "false");
        if (arg1.isEmpty()) {
            arg1 = "1";
        }
        if (isElementPresent("//p[contains(.,'" + arg0 + "')]/..//div[@class='menu']/..//i")) {
            getDriver().findElement(By.xpath("//p[contains(.,'" + arg0 + "')]/..//div[@class='menu']/..//i")).click();
            results.set(0, "true");
            return results;
        }
        if (isElementPresent("(//span[contains(.,'" + arg0 + "')])[" + arg1 + "]")) {
            getDriver().findElement(By.xpath("(//span[contains(.,'" + arg0 + "')])[" + arg1 + "]")).click();
            results.set(0, "true");
            return results;
        }
        if (isElementPresent("//p[contains(.,'" + arg0 + "')]/..//span//div[@role='combobox']")) {
            getDriver().findElement(By.xpath("//p[contains(.,'" + arg0 + "')]/..//span//div[@role='combobox']")).click();
            results.set(0, "true");
            return results;
        }
        return results;

    }

    public void clickOnTheInputField(String arg0) {
//        if(isElementPresent("//input[@placeholder='"+arg0+"']")) {
        waitUntilElementVisible("//input[@placeholder='" + arg0 + "']",60);
        if (isElementPresent("//input[@placeholder='" + arg0 + "']")) {
            getDriver().findElement(By.xpath("//input[@placeholder='" + arg0 + "']")).click();
        } else{
            getDriver().findElement(By.xpath("//p[contains(.,'" + arg0 + "')]")).click();
        getDriver().findElement(By.xpath("//p[contains(.,'" + arg0 + "')]/../../..//input")).click();
        }
    }

    public ArrayList<String> warningMessagesAreAppeared(List<String> list) {
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");
//        waitFor(String.valueOf($(ILocators.warning_contactTerm).isVisible()));
        if (getDriver().getCurrentUrl().contains("teacher_other/profile")) {
            for (int i = 0; i < list.size(); i++) {
                if ((isElementPresent("//input[@placeholder='" + list.get(i) + "' and @aria-required='true']")
                        && !getDriver().findElement(By.xpath("//input[@placeholder='" + list.get(i) + "' and @aria-required='true']")).getAttribute("aria-invalid").equals("true")) &&
                        !isElementPresent("//p[contains(.,'" + list.get(i) + "')]/../../..//span[@class='text-error' and contains(.,'This is required')]")) {
                    results.set(0, "false");
                    results.add("Expected: 'aria-invalid'= true ; but found: 'aria-invalid'= " + getDriver().findElement(By.xpath("//input[@placeholder='" + list.get(i) + "' and @aria-required='true']")).getAttribute("aria-invalid") + "\n");
                }
            }
        }
        return results;
    }

    public void chooseYear(String arg0) {
        getDriver().findElement(By.xpath("//ul[@class='date-picker-years']//li[contains(.,'" + arg0 + "')]")).click();
    }

    public void chooseMonth(String arg0) {
        getDriver().findElement(By.xpath("//div[@class='date-picker-table date-picker-table--month']//div[contains(.,'" + arg0 + "')]")).click();
    }

    public void chooseDate(String arg0) {
        getDriver().findElement(By.xpath("//table//div[contains(.,'" + arg0 + "')]")).click();
    }


    public void getUserID(String arg0) throws IOException, ParseException {
        if (arg0.equals("school")){
            getAccessTokenAuth0();
            String body = "{\"operationName\":\"elasticSearch\"," +
                    "\"variables\":{\"elasticQuery\":" +
                    "{\"sort\":[{\"createdDate\":{\"order\":\"desc\"}}]," +
                    "\"from\":0,\"size\":10}}," +
                    "\"query\":\"query elasticSearch($elasticQuery: JSON!) {\\n  elastic(es: $elasticQuery) " +
                    "{\\n    json\\n    __typename\\n  }\\n}\\n\"}";
            String url = "https://xla29952p5.execute-api.us-east-1.amazonaws.com/uat/graphql";
            urlObject = new URL(url);
            HttpsURLConnection connection = (HttpsURLConnection) urlObject.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("content-type", "application/json");
            connection.setRequestProperty("authorization", token);
            connection.setDoOutput(true);
            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = body.getBytes("utf-8");
                os.write(input, 0, input.length);
            }
            try (BufferedReader br = new BufferedReader(
                    new InputStreamReader(connection.getInputStream(), "utf-8"))) {
                StringBuilder response = new StringBuilder();
                String encoding = connection.getContentEncoding();
                String responseLine = null;
                encoding = encoding == null ? "UTF-8" : encoding;
                String respbody = IOUtils.toString(connection.getInputStream(), encoding);
                while ((responseLine = br.readLine()) != null) {
                    response.append(responseLine.trim());
                }
                JSONObject jsonObject = (JSONObject) parser.parse(respbody);
                JSONObject jsonObject2 = (JSONObject) parser.parse(jsonObject.get("data").toString());
                JSONObject jsonObject3 = (JSONObject) parser.parse(jsonObject2.get("elastic").toString());
                JSONObject jsonObject4 = (JSONObject) parser.parse(jsonObject3.get("json").toString());
                JSONObject jsonObject5 = (JSONObject) parser.parse(jsonObject4.get("hits").toString());
                JSONArray resultsObject = (JSONArray) parser.parse(jsonObject5.get("hits").toString());
                for (int i= 0; i<10;i++) {
                    JSONObject jsonObject6 = (JSONObject) parser.parse(resultsObject.get(i).toString());
                    JSONObject jsonObject7 = (JSONObject) parser.parse(jsonObject6.get("_source").toString());
                    JSONObject jsonObject8 = (JSONObject) parser.parse(jsonObject7.toString());
                    String school_email = jsonObject8.get("email").toString();
                    System.out.println(school_email);
                    if (school_email.equals( Serenity.getCurrentSession().getMetaData().get("emailOfNewSchoolUser") )){
                        System.out.println("school_email = " + school_email);
                        String school_id = jsonObject8.get("id").toString();
                        Serenity.getCurrentSession().addMetaData("NewSchoolID", school_id);
                        System.out.println("ID of new school user = " + Serenity.getCurrentSession().getMetaData().get("NewSchoolID"));
                        break;
                    }
                }
            }
        }else {
            getDriver().get("http://admin.uat.realiseme.com.s3-website-us-east-1.amazonaws.com/#/teachers/list");
            getDriver().findElement(By.xpath("//input[@name='email']")).sendKeys("satintest1+admin@gmail.com");
            getDriver().findElement(By.xpath("//input[@name='password']")).sendKeys("Test123!");
            getDriver().findElement(By.xpath("//button[@name='submit']")).click();
            waitUntilElementVisible("//p[contains(.,'" + Serenity.getCurrentSession().getMetaData().get("emailOfNewUser") + "')]/..//p[@class='name']", 50);
            if (!isElementPresent("//p[contains(.,'" + Serenity.getCurrentSession().getMetaData().get("emailOfNewUser") + "')]/..//p[@class='name']"))
                do {
                    waitUntilElementVisible("//p[contains(.,'" + Serenity.getCurrentSession().getMetaData().get("emailOfNewUser") + "')]/..//p[@class='name']", 50);
                    refreshThePage();
                } while (isElementPresent("//p[contains(.,'" + Serenity.getCurrentSession().getMetaData().get("emailOfNewUser") + "')]/..//p[@class='name']"));
            getDriver().findElement(By.xpath("//p[contains(.,'" + Serenity.getCurrentSession().getMetaData().get("emailOfNewUser") + "')]/..//p[@class='name']")).click();
            waitUntilElementVisible("//div[@class='id-wrapper']", 60);
            Serenity.getCurrentSession().addMetaData("NewUserID", getDriver().findElement(By.xpath("//div[@class='id-wrapper']")).getText().substring(4));
            System.out.println("ID of new user = " + Serenity.getCurrentSession().getMetaData().get("NewUserID"));
        }

    }


    public void fillProfileSectionAsAdminUsingRequestAPI(List<String> list) throws IOException, ParseException {
        getUserID("");
        getAccessTokenAuth0();
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");
        String body = "{\"operationName\":\"adminUpdateTeacherContactDetails\"," +
                "\"variables\":{\"admin_id\":\"538e52d0-a7c0-4e89-9b48-80f0d0ec958d\"," +
                "\"input\":{\"lat\":null,\"long\":null," +
                "\"post_code\":\"Postcode\"," +
                "\"house\":\"address line 1\"," +
                "\"street\":\"address line 2\"," +
                "\"city\":\"City\"," +
                "\"county\":\"County\"," +
                "\"country\":\"Great Britain\"," +
                "\"user_id\":\"" + Serenity.getCurrentSession().getMetaData().get("NewUserID") + "\"," +
                "\"phone_number\":\"0635094915\"," +
                "\"distance_willing_to_travel\":null}}," +
                "\"query\":\"mutation adminUpdateTeacherContactDetails($admin_id: String!, $input: ContactDetailsEditAdminPayload!) {\\n  adminUpdateTeacherContactDetails(admin_id: $admin_id, input: $input) {\\n    status\\n    error {\\n      message\\n      __typename\\n    }\\n    __typename\\n  }\\n}\\n\"}";


        String url = "https://fkyv0b9fh1.execute-api.us-east-1.amazonaws.com/uat/graphql";
        urlObject = new URL(url);
        HttpsURLConnection connection = (HttpsURLConnection) urlObject.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("content-type", "application/json");
        connection.setRequestProperty("authorization", token);
        connection.setDoOutput(true);
        try (OutputStream os = connection.getOutputStream()) {
            byte[] input = body.getBytes("utf-8");
            os.write(input, 0, input.length);
        }
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(connection.getInputStream(), "utf-8"))) {
            StringBuilder response = new StringBuilder();
            String encoding = connection.getContentEncoding();
            String responseLine = null;
            encoding = encoding == null ? "UTF-8" : encoding;
            String respbody = IOUtils.toString(connection.getInputStream(), encoding);
            while ((responseLine = br.readLine()) != null) {
                response.append(responseLine.trim());
            }
            JSONObject jsonObject = (JSONObject) parser.parse(respbody);
//            JSONObject jsonObject2 = (JSONObject) parser.parse(jsonObject.get("data").toString());
//            delete_request_result = jsonObject2.get("adminRemove" + list.get(0) + "").toString();
            System.out.println(jsonObject + " = " + email_of_new_user);
        }

    }


    public void theAllEnteredDataToTheSectionAreSaved(String arg0, List<String> list) {

    }

    public ArrayList<String> getUsersEmailsAtTheFirstTabs(String arg0, String arg1) {
        getDriver().get("http://admin.uat.realiseme.com.s3-website-us-east-1.amazonaws.com/#/teachers/list");
        getDriver().findElement(By.xpath("//input[@name='email']")).sendKeys("satintest1+admin@gmail.com");
        getDriver().findElement(By.xpath("//input[@name='password']")).sendKeys("Test123!");
        getDriver().findElement(By.xpath("//button[@name='submit']")).click();
        waitUntilElementVisible("//a[@class='panel-block' and contains(.,'" + arg1 + "')]", 60);
        if (!arg1.equals("Teachers")) {
            getDriver().findElement(By.xpath("//a[@class='panel-block' and contains(.,'" + arg1 + "')]")).click();
        }
        users_emails = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            users_emails.add(getDriver().findElement(By.xpath("(//div[@class='table-body-row']//p[@class='email'])[" + i + "]")).getText());
            if (i == 10 && !arg0.equals(getDriver().findElement(By.xpath("//li[@class='Pagination-item active-page']")).getText())) {
                getDriver().findElement(By.xpath("//span[contains(.,'Next')]")).click();
                i = 0;
            }
        }
        return users_emails;
    }

    public void deleteAccounts(String arg0) throws IOException, ParseException {
        getAccessTokenAuth0();
        for (int i = 0; i < users_emails.size(); i++) {
            String body = "{\"query\":\"mutation {\\n  adminRemove" + arg0 + "(admin_id: \\\"" + admid + "\\\", email: \\\"" + users_emails.get(i) + "\\\")}\",\"variables\":null}";
            System.out.println(body);
            String url = "https://8nn63ifaff.execute-api.us-east-1.amazonaws.com/uat/graphql";
            urlObject = new URL(url);
            HttpsURLConnection connection = (HttpsURLConnection) urlObject.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("content-type", "application/json");
            connection.setRequestProperty("authorization", token);
            connection.setDoOutput(true);
            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = body.getBytes("utf-8");
                os.write(input, 0, input.length);
            }
            try (BufferedReader br = new BufferedReader(
                    new InputStreamReader(connection.getInputStream(), "utf-8"))) {
                StringBuilder response = new StringBuilder();
                String encoding = connection.getContentEncoding();
                String responseLine = null;
                encoding = encoding == null ? "UTF-8" : encoding;
                String respbody = IOUtils.toString(connection.getInputStream(), encoding);
                while ((responseLine = br.readLine()) != null) {
                    response.append(responseLine.trim());
                }
                JSONObject jsonObject = (JSONObject) parser.parse(respbody);
                JSONObject jsonObject2 = (JSONObject) parser.parse(jsonObject.get("data").toString());
                delete_request_result = jsonObject2.toString();
                System.out.println(jsonObject2 + " = " + users_emails.get(i));

            }
        }
    }



    public ArrayList<String> theAllNecessaryTextAtTheAccountSectionAreDisplayed(List<String> list, String arg0) {
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");

        if (getDriver().getCurrentUrl().contains("teacher_supply/details")) {
            TeacherSide = true;
            System.out.println("Teacher = " + TeacherSide);
            waitUntilElementVisible("//span[@class='TeacherAccountDetail-description' and contains(.,'" + list.get(0) + "')]'", 60);
            if (!getDriver().findElement(By.xpath("//span[@class='TeacherAccountDetail-description' and contains(.,'" + list.get(0) + "')]")).isDisplayed()) {
                results.set(0, "false");
                results.add(list.get(0) + " isn't found");
            } else {
                for (int i = 1; i < list.size(); i++) {
                    if (!isElementPresent("//p[contains(.,'" + list.get(i) + "')]") &&
                            !isElementPresent("//a[contains(.,'" + list.get(i) + "')]") &&
                            !isElementPresent("//span[contains(.,'" + list.get(i) + "')]")) {
                        results.set(0, "false");
                        results.add("Expected: " + list.get(i) + "; but not displayed");
                        break;
                    }
                }
            }

        }
        if (getDriver().getCurrentUrl().contains("teacher_supply/supply-details")) {
            TeacherSide = true;
            System.out.println("Teacher = " + TeacherSide);
            waitUntilElementVisible("//span[@class='TeacherSupplyDetails-description' and contains(.,'" + list.get(0) + "')]'", 60);
            if (!isElementPresent("//span[@class='TeacherSupplyDetails-description' and contains(.,'" + list.get(0) + "')]") &&
            !getDriver().findElement(By.xpath("//div[@class='TeacherSupplyDocuments-description' and contains(.,'"+list.get(1)+"')]")).isDisplayed()) {
                results.set(0, "false");
                results.add(list.get(0) + " isn't found");
            } else {
                for (int i = 1; i < list.size(); i++) {
                    if (!isElementPresent("//p[contains(.,'" + list.get(i) + "')]") &&
                            !isElementPresent("//a[contains(.,'" + list.get(i) + "')]") &&
                            !isElementPresent("//span[contains(.,'" + list.get(i) + "')]")) {
                        results.set(0, "false");
                        results.add("Expected: " + list.get(i) + "; but not displayed");
                        break;
                    }
                }
            }

        }
        return results;
    }





    public void uploadFileToTheField(String arg0, String arg1) {
        WebElement uploadElement = getDriver().findElement(By.xpath("//span[contains(.,'"+arg1+"')]/..//input"));
        uploadElement.sendKeys("/Users/Anton/IdeaProjects/R/src/test/resources/Files/" + arg0);
    }

    public ArrayList<String> getPasswordFromMail() {
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "false");
        if (!Serenity.getCurrentSession().getMetaData().get("Emailmessage").equals("")) {
            String[] getPasswordText = Serenity.getCurrentSession().getMetaData().get("Emailmessage").split("Password:");
            String[] getPassword = getPasswordText[1].split(".\n" +
                    "RealiseMe Team");
            for (String password : getPassword) {
                System.out.println("Password: " + password.trim());
                Serenity.getCurrentSession().addMetaData("AddAdminPassword", password.trim());
            }
            results.set(0,"true");

        }
        return results;
    }

    public ArrayList<String> setSchoolSStatusToAsAdminUsingRequestAPI(String arg0) throws IOException, ParseException {
        getUserID("school");
        getAccessTokenAuth0();
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");
        String body = "{\"operationName\":\"updateSchoolStatus\"," +
                "\"variables\":" +
                "{\"adminId\":\"538e52d0-a7c0-4e89-9b48-80f0d0ec958d\"," +
                "\"schoolId\":\""+Serenity.getCurrentSession().getMetaData().get("NewSchoolID")+"\"," +
                "\"statusName\":\""+arg0+"\"}," +
                "\"query\":\"mutation updateSchoolStatus($adminId: String!, $schoolId: String!, $statusName: String!) {\\n  updateSchoolStatus(adminId: $adminId, schoolId: $schoolId, statusName: $statusName)\\n}\\n\"}";

        String url = "https://xla29952p5.execute-api.us-east-1.amazonaws.com/uat/graphql";
        urlObject = new URL(url);
        HttpsURLConnection connection = (HttpsURLConnection) urlObject.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("content-type", "application/json");
        connection.setRequestProperty("authorization", token);
        connection.setDoOutput(true);
        try (OutputStream os = connection.getOutputStream()) {
            byte[] input = body.getBytes("utf-8");
            os.write(input, 0, input.length);
        }
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(connection.getInputStream(), "utf-8"))) {
            StringBuilder response = new StringBuilder();
            String encoding = connection.getContentEncoding();
            String responseLine = null;
            encoding = encoding == null ? "UTF-8" : encoding;
            String respbody = IOUtils.toString(connection.getInputStream(), encoding);
            while ((responseLine = br.readLine()) != null) {
                response.append(responseLine.trim());
            }
            JSONObject jsonObject = (JSONObject) parser.parse(respbody);
            JSONObject jsonObject2 = (JSONObject) parser.parse(jsonObject.get("data").toString());
            JSONObject jsonObject3 = (JSONObject) parser.parse(jsonObject2.get("updateSchoolStatus").toString());
            String school_status = jsonObject3.get("accountStatus").toString();
            System.out.println("school_status = "+school_status);
            if (!school_status.equals("active")){
                results.set(0, "false");
                results.add("response: " + jsonObject.toString());
            }
        }

        return results;

    }

    public void enterEmailOfNewAdmin() {
        getDriver().findElement(By.xpath("//span[@title='Click to Edit']")).click();
        getDriver().findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(Serenity.getCurrentSession().getMetaData().get("emailOfNewUser"));
        getDriver().findElement(By.xpath("//button[contains(.,'Set')]")).click();
        waitABit(30000);
    }

    public void enterPasswordOfNewCreatedAdmin() {
        $(ILocators.Password_field).type(Serenity.getCurrentSession().getMetaData().get("AddAdminPassword"));

    }

    public void clickOnTheButtonAtTheSectionWith(String arg0, String arg1) {
      waitUntilElementVisible("//p[contains(.,'Name')]/..//p[contains(.,'"+arg1+"')]",20);
      Serenity.getCurrentSession().addMetaData("NameOfDeletedAdmin",arg1);
      getDriver().findElement(By.xpath("//p[contains(.,'Name')]/..//p[contains(.,'"+arg1+"')]/../../../../..//span[contains(.,'"+arg0+"')]")).click();
    }

    public ArrayList<String> appropriateAdminIsDeleted() {
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "false");
        waitUntilElementIsNotVisible("//p[contains(.,'Name')]/..//p[contains(.,'"+Serenity.getCurrentSession().getMetaData().get("NameOfDeletedAdmin")+"')]",20);
        if (!isElementPresent("//p[contains(.,'Name')]/..//p[contains(.,'"+Serenity.getCurrentSession().getMetaData().get("NameOfDeletedAdmin")+"')]")){
            results.set(0,"true");
        }
        return results;
    }

    /**
     * Switches to browser's tab by number
     *
     * @param numberOfTab the integer value that is a number of tab
     * @author Aleksandr Antonenko
     */
    public void switchToTab(int numberOfTab) {
        ArrayList<String> tabs = new ArrayList<String>(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs.get(numberOfTab - 1));
    }

    /**
     * Focuses on element by xpath and presses enter
     *
     * @param xpath the string that is a path to the element
     * @author Aleksandr Antonenko
     */
    public void focusOnElementAndPressEnter(String xpath) {
        getElementByXpath(xpath).sendKeys(Keys.ENTER);
    }

    /**
     * Accepts alert message.
     *
     * @author Aleksandr Antonenko
     */
    public void proceedWarningPopup() {
        getDriver().switchTo().alert().accept();
    }

    /**
     * Opens a new tab of browser
     *
     * @author Aleksandr Antonenko
     */
    public void openNewTab() {
        ((JavascriptExecutor) getDriver()).executeScript("window.open()");
        switchToTab(2);
    }

    /**
     * Gets url of opened page
     * Returns string that is a url
     *
     * @author Aleksandr Antonenko
     */
    public String getPageUrl() {
        return getDriver().getCurrentUrl();
    }

    /**
     * Reloads a page
     *
     * @author Aleksandr Antonenko
     */
    public void reloadPage() {
        getDriver().navigate().refresh();
    }

    /**
     * Clicks on browser's back button
     *
     * @author Aleksandr Antonenko
     */
    public void clickOnBrowserSBackButton() {
        getDriver().navigate().back();
    }

    /**
     * Stops going for provided seconds
     *
     * @param sec the integer value that is a number of seconds
     * @author Aleksandr Antonenko
     */
    public void waitSec(int sec) {
        waitABit(sec * 1000);
    }


    /**
     * Scrolls up the page to the top using JS Executor
     *
     * @author Aleksandr Antonenko
     */
    public void scrollUpThePageToTheTop() {
        ((JavascriptExecutor) getDriver()).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
    }

    /**
     * Stops going for provided milliseconds
     *
     * @param msec the integer value that is a number of milliseconds
     * @author Aleksandr Antonenko
     */
    public void waitMSec(int msec) {
        waitABit(msec);
    }

    /**
     * Opens page by url
     *
     * @param url the url of the page to open
     * @author Aleksandr Antonenko
     */
    public void goToURL(String url) {
        getDriver().get(url);
    }

    /**
     * Clears browser's cookies
     *
     * @author Vladyslav Butko
     */
    public void clearCookies() {
        getDriver().manage().deleteAllCookies();
    }

    /**
     * Uploads file
     *
     * @author Vladyslav Butko
     */
    public void uploadsFile(String xpath, String fileName) {
        getElementByXpath(xpath).sendKeys(System.getProperty("user.dir") + "/src/test/resources/files/" + fileName);
    }

    /**
     * @param xpath
     *
     * @author Vladyslav Butko
     */
    public void moveToElement(String xpath) {
        Actions actions = new Actions(getDriver());
        actions.moveToElement($(xpath)).build().perform();
    }

    /**
     * Checks if simple checkbox is selected.
     * true - if checkbox is selected,
     * false - if checkbox is not selected.
     *
     * @param xpath the string that is a path to the element
     * @author Aleksandr Antonenko
     */
    public boolean simpleCheckboxIsSelected(String xpath) {
        return getElementByXpath(xpath).isSelected();
    }

    /**
     * Clicks on element by xpath.
     * XPath is used to navigate through elements and attributes in an XML document.
     *
     * @param xpath the string that is a path to the element
     * @author Aleksandr Antonenko
     */
    public void clickOnElementByXpath(String xpath) {
        boolean staleElement = true;
        while (staleElement) {
            try {
                scrollToElementByXpathUsingJsExecutor(xpath);
                $(xpath).click();
                staleElement = false;
            } catch (StaleElementReferenceException ignored) {
            }
        }
    }

    /**
     * Switch to iFrame.
     * iFrame is used to navigate through elements and attributes in an XML document.
     *
     * @param iFrame the string that is a path to the element
     * @author Vladyslav Butko
     */
    public void switchToIFrame(String iFrame) {
        getDriver().switchTo().frame(iFrame);

    }

    /**
     * Exit from iFrame.
     * iFrame is used to navigate through elements and attributes in an XML document.
     *
     * @author Vladyslav Butko
     */
    public void exitFromIFrame() {
        getDriver().switchTo().defaultContent();

    }

    /**
     * Clicks on element by xpath using JavascriptExecutor library.
     * XPath is used to navigate through elements and attributes in an XML document.
     *
     * @param xpath the string that is a path to the element
     * @author Aleksandr Antonenko
     */
    public void clickOnElementByXpathUsingJsExecutor(String xpath) {
        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        executor.executeScript("arguments[0].click();", $(xpath));
    }

    /**
     * Scrolls to an element by xpath using JavascriptExecutor library.
     * XPath is used to navigate through elements and attributes in an XML document.
     *
     * @param xpath the url of the page to open
     * @author Aleksandr Antonenko
     */
    public void scrollToElementByXpathUsingJsExecutor(String xpath) {
        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        executor.executeScript("arguments[0].scrollIntoView(true);", $(xpath));
    }

    /**
     * Clicks on element (WebElementFacade type).
     *
     * @param element the WebElementFacade that is an element to click
     * @author Aleksandr Antonenko
     */
    public void clickOnWebElement(WebElementFacade element) {
        element.click();
    }

    /**
     * Clicks on element by id.
     * ID is a unique identifier of element
     *
     * @param id the string that is an identifier of the element
     * @author Aleksandr Antonenko
     */
    public void clickOnElementById(String id) {
        find(By.id(id)).click();
    }

    /**
     * Waits default time for invisibility of element and returns boolean value:
     * true - if element is not visible on the page,
     * false - if element is visible on the page.
     *
     * @param xpath the string that is a path to the element
     * @author Aleksandr Antonenko
     */
    public boolean elementByXpathIsInvisible(String xpath) {
        try {
            waitFor(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpath)));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Waits provided time (in seconds) for invisibility of element and returns boolean value:
     * true - if element is not visible on the page,
     * false - if element stays to be visible on the page
     *
     * @param sec   integer value that describes seconds for waiting
     * @param xpath the string that is a path to the element
     * @author Aleksandr Antonenko
     */
    public boolean elementByXpathIsInvisible(int sec, String xpath) {
        try {
            withTimeoutOf(sec, ChronoUnit.SECONDS)
                    .waitFor(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpath)));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Waits provided time (in milliseconds) for invisibility of element and returns boolean value:
     * true - if element is not visible on the page,
     * false - if element stays to be visible on the page
     *
     * @param milliseconds integer value that describes seconds for waiting
     * @param xpath        the string that is a path to the element
     * @author Aleksandr Antonenko
     */
    public boolean elementByXpathIsInvisibleWaitMilliseconds(int milliseconds, String xpath) {
        try {
            withTimeoutOf(milliseconds, ChronoUnit.MILLIS)
                    .waitFor(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpath)));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Waits default time for invisibility of element and returns boolean value:
     * true - if element is not visible on the page,
     * false - if element is visible on the page.
     *
     * @param id the string that is an identifier of the element
     * @author Aleksandr Antonenko
     */
    public boolean elementByIdIsInvisible(String id) {
        try {
            waitFor(ExpectedConditions.invisibilityOfElementLocated(By.id(id)));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Waits provided time (in seconds) for invisibility of element and returns boolean value:
     * true - if element is not visible on the page,
     * false - if element stays to be visible on the page
     *
     * @param sec integer value that describes seconds for waiting
     * @param id  the string that is an identifier of the element
     * @author Aleksandr Antonenko
     */
    public boolean elementByIdIsInvisible(int sec, String id) {
        try {
            withTimeoutOf(sec, ChronoUnit.SECONDS)
                    .waitFor(ExpectedConditions.invisibilityOfElementLocated(By.id(id)));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Waits provided time (in milliseconds) for invisibility of element and returns boolean value:
     * true - if element is not visible on the page,
     * false - if element stays to be visible on the page
     *
     * @param milliseconds integer value that describes seconds for waiting
     * @param id           the string that is an identifier of the element
     * @author Aleksandr Antonenko
     */
    public boolean elementByIdIsInvisibleWaitMilliseconds(int milliseconds, String id) {
        try {
            withTimeoutOf(milliseconds, ChronoUnit.MILLIS)
                    .waitFor(ExpectedConditions.invisibilityOfElementLocated(By.id(id)));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Waits default time for visibility of element and returns boolean value:
     * true - if element is visible on the page,
     * false - if element is not visible on the page.
     *
     * @param xpath the string that is a path to the element
     * @author Aleksandr Antonenko
     */
    public boolean elementByXpathIsVisible(String xpath) {
        try {
            waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Waits provided time (in seconds) for visibility of element and returns boolean value:
     * true - if element is visible on the page,
     * false - if element stays to be invisible on the page
     *
     * @param sec   integer value that describes seconds for waiting
     * @param xpath the string that is a path to the element
     * @author Aleksandr Antonenko
     */
    public boolean elementByXpathIsVisible(int sec, String xpath) {
        try {
            withTimeoutOf(sec, ChronoUnit.SECONDS)
                    .waitFor(ExpectedConditions.visibilityOfAllElementsLocatedBy
                            (By.xpath(xpath)));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Waits provided time (in milliseconds) for visibility of element and returns boolean value:
     * true - if element is visible on the page,
     * false - if element stays to be invisible on the page
     *
     * @param milliseconds integer value that describes seconds for waiting
     * @param xpath        the string that is a path to the element
     * @author Aleksandr Antonenko
     */
    public boolean elementByXpathIsVisibleWaitMilliseconds(int milliseconds, String xpath) {
        try {
            withTimeoutOf(milliseconds, ChronoUnit.MILLIS)
                    .waitFor(ExpectedConditions.visibilityOfAllElementsLocatedBy
                            (By.xpath(xpath)));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Waits default time for visibility of element and returns boolean value:
     * true - if element is visible on the page,
     * false - if element is not visible on the page.
     *
     * @param id the string that is an identifier of the element
     * @author Aleksandr Antonenko
     */
    public boolean elementByIdIsVisible(String id) {
        try {
            waitFor(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id(id)));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Waits provided time (in seconds) for visibility of element and returns boolean value:
     * true - if element is visible on the page,
     * false - if element stays to be invisible on the page
     *
     * @param sec integer value that describes seconds for waiting
     * @param id  the string that is an identifier of the element
     * @author Aleksandr Antonenko
     */
    public boolean elementByIdIsVisible(int sec, String id) {
        try {
            withTimeoutOf(sec, ChronoUnit.SECONDS)
                    .waitFor(ExpectedConditions.visibilityOfAllElementsLocatedBy
                            (By.id(id)));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Waits provided time (in milliseconds) for visibility of element and returns boolean value:
     * true - if element is visible on the page,
     * false - if element stays to be invisible on the page
     *
     * @param milliseconds integer value that describes seconds for waiting
     * @param id           the string that is an identifier of the element
     * @author Aleksandr Antonenko
     */
    public boolean elementByIdIsVisibleWaitMilliseconds(int milliseconds, String id) {
        try {
            withTimeoutOf(milliseconds, ChronoUnit.MILLIS)
                    .waitFor(ExpectedConditions.visibilityOfAllElementsLocatedBy
                            (By.id(id)));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Returns a web element by id.
     * ID is a unique identifier of element
     *
     * @param id the string that is an identifier of the element
     * @author Aleksandr Antonenko
     */
    public WebElementFacade getElementById(String id) {
        return find(By.id(id));
    }

    /**
     * Returns a web element by xpath.
     *
     * @param xpath the string that is a path to the element
     * @author Aleksandr Antonenko
     */
    public WebElementFacade getElementByXpath(String xpath) {
        return find(By.xpath(xpath));
    }

    /**
     * Returns a text from a web element by id.
     *
     * @param id the string that is an identifier of the element
     * @author Aleksandr Antonenko
     */
    public String getTextFromElementById(String id) {
        return find(By.id(id)).getText();
    }

    /**
     * Returns a text from a web element by xpath.
     *
     * @param xpath the string that is a path to the element
     * @author Aleksandr Antonenko
     */
    public String getTextFromElementByXpath(String xpath) {
        return find(By.xpath(xpath)).getText();
    }

    /**
     * Returns a text from a web element.
     *
     * @param element the WebElementFacade obj that is a web element
     * @author Aleksandr Antonenko
     */
    public String getTextFromElement(WebElementFacade element) {
        return element.getText();
    }

    /**
     * Returns an argument from "value" attribute of web element by xpath.
     *
     * @param xpath the string that is a path to the element
     * @author Aleksandr Antonenko
     */
    public String getValueFromElementByXpath(String xpath) {
        return $(xpath).getAttribute("value");
    }

    /**
     * Returns an argument from "value" attribute of web element by id.
     *
     * @param id the string that is an identifier of the element
     * @author Aleksandr Antonenko
     */
    public String getValueFromElementById(String id) {
        return find(By.id(id)).getAttribute("value");
    }

    /**
     * Removes value from input web element by id
     *
     * @param id the string that is an identifier of the element
     * @author Aleksandr Antonenko
     */
    public void clearInputFieldById(String id) {
        find(By.id(id)).clear();
    }

    /**
     * Removes value from input web element by xpath
     *
     * @param xpath the string that is an identifier of the element
     * @author Aleksandr Antonenko
     */
    public void clearInputFieldByXpath(String xpath) {
        find(By.xpath(xpath)).clear();
    }

    /**
     * Waits for visibility of an input field web element by id
     * and types a text into this field
     *
     * @param id   the string that is an identifier of the element
     * @param text the string that is a text to type
     * @author Aleksandr Antonenko
     */
    public void typeTextIntoInputFieldById(String id, String text) {
        waitFor(ExpectedConditions.visibilityOf(find(By.id(id)))).typeInto(find(By.id(id)), text);
    }

    /**
     * Waits for visibility of an input field web element by xpath
     * and types a text into this field
     *
     * @param xpath the string that is a path to the element
     * @param text  the string that is a text to type
     * @author Aleksandr Antonenko
     */
    public void typeTextIntoInputFieldByXpath(String xpath, String text) {
        waitFor(ExpectedConditions.visibilityOf(find(By.xpath(xpath)))).typeInto(find(By.xpath(xpath)), text);
    }

    /**
     * Returns an argument from provided attribute of web element by xpath.
     *
     * @param xpath     the string that is a path to the element
     * @param attribute the string that is a name of the attribute to get
     * @author Aleksandr Antonenko
     */
    public String getAttributeFromElementByXpath(String xpath, String attribute) {
        return $(xpath).getAttribute(attribute);
    }

    /**
     * Returns an argument from provided attribute of web element by id.
     *
     * @param id        the string that is an identifier of the element
     * @param attribute the string that is a name of the attribute to get
     * @author Aleksandr Antonenko
     */
    public String getAttributeFromElementById(String id, String attribute) {
        return find(By.id(id)).getAttribute(attribute);
    }

    /**
     * Builds a new xpath with additional condition for an element:
     * the condition says that element should not have '@disabled' attribute.
     * Checks if element is visible by such xpath on a page and returns boolean value.
     *
     * @param xpath the string that is a path to the element
     * @author Aleksandr Antonenko
     */
    public boolean elementIsEnabledByAttribute(String xpath) {
        String newXpath = xpath + "[not(@disabled)]";
        return elementByXpathIsVisible(newXpath);
    }

    /**
     * Builds a new xpath with additional condition for an element:
     * the condition says that element should have '@disabled' attribute.
     * Checks if element is visible by such xpath on a page and returns boolean value.
     *
     * @param xpath the string that is a path to the element
     * @author Aleksandr Antonenko
     */
    public boolean elementIsDisabledByAttribute(String xpath) {
        String newXpath = xpath + "[@disabled]";
        return elementByXpathIsVisible(newXpath);
    }

    /**
     * Builds a new xpath with additional condition for an element:
     * the condition says that element should have 'class' attribute that contains 'active' text within the argument.
     * Checks if element is visible by such xpath on a page and returns boolean value.
     *
     * @param xpath the string that is a path to the element
     * @author Aleksandr Antonenko
     */
    public boolean elementIsActiveByClass(String xpath) {
        String newXpath = xpath + "[contains(@class,'active')][not(contains(@class,'inactive'))]";
        return elementByXpathIsVisible(newXpath);
    }

    /**
     * Builds a new xpath with additional condition for an element:
     * the condition says that element should have 'class' attribute that contains 'checked' text within the argument.
     * Checks if element is visible by such xpath on a page and returns boolean value.
     *
     * @param xpath the string that is a path to the element
     * @author Aleksandr Antonenko
     */
    public boolean elementIsCheckedByClass(String xpath) {
        String newXpath = xpath + "[contains(@class,'checked')]";
        return elementByXpathIsVisible(newXpath);
    }

    /**
     * Builds a new xpath with additional condition for an element:
     * the condition says that element should have 'class' attribute that contains 'active' text within the argument.
     * Checks if element is invisible by such xpath on a page and returns boolean value.
     *
     * @param xpath the string that is a path to the element
     * @author Aleksandr Antonenko
     */
    public boolean elementIsNotActiveByClass(String xpath) {
        String newXpath = xpath + "[not(contains(@class,'active')) or contains(@class, 'inactive')]";
        return elementByXpathIsVisible(newXpath);
    }

    /**
     * Builds a new xpath with additional condition for an element:
     * the condition says that element should not have 'class' attribute that contains 'checked' text within the argument.
     * Checks if element is visible by such xpath on a page and returns boolean value.
     *
     * @param xpath the string that is a path to the element
     * @author Aleksandr Antonenko
     */
    public boolean elementIsNotCheckedByClass(String xpath) {
        String newXpath = xpath + "[contains(@class,'checked')]";
        return elementByXpathIsInvisible(newXpath);
    }

    /**
     * Finds list of web elements by xpath
     * Creates a new list and puts only visible elements into the list
     * Returns new list of visible only elements
     *
     * @param xpath the string that is a path to the list of elements
     * @author Aleksandr Antonenko
     */
    public List<WebElementFacade> getListWithVisibleElements(String xpath) {
        List<WebElementFacade> list = findAll(xpath);
        List<WebElementFacade> newList = new ArrayList<>();
        for (WebElementFacade element : list) {
            if (element.isVisible())
                newList.add(element);
        }
        return newList;
    }
}


