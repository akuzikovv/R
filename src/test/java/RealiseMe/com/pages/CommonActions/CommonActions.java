package RealiseMe.com.pages.CommonActions;

import RealiseMe.com.ILocators;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import org.apache.commons.io.IOUtils;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

//import com.github.cliftonlabs.json_simple.Jsoner;

public class CommonActions extends PageObject {
    private ArrayList<String> status_of_teacher;
    private ArrayList<String> names = new ArrayList<>();
    private int counter, counterDecline;
    private int b;
    public WebDriverWait wait;
    public static int random;
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
    private boolean creation_status;
    private  boolean SchoolSide= false;
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

            try {
                getDriver().findElement(By.xpath("(//button[contains(.,'" + arg0 + "')])[1]")).click();
            }catch (Exception e){}
            try {
                getDriver().findElement(By.xpath("(//button[contains(.,'" + arg0 + "')])[2]")).click();
            }catch (Exception e){}
            try {
                getDriver().findElement(By.xpath("(//button[contains(.,'" + arg0 + "')])[3]")).click();
            }catch (Exception e){}
            return;

        }
        if (isElementPresent("//span[contains(.,'" + arg0 + "')]")) {
            getDriver().findElement(By.xpath("//span[contains(.,'" + arg0 + "')]")).click();
            return;
        }
        if (isElementPresent("//p[contains(.,'" + arg0 + "')]")) {
            getDriver().findElement(By.xpath("//p[contains(.,'" + arg0 + "')]")).click();
            return;
        } else {
            System.out.println(arg0 + " Button is found");
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
        try {
            if ($(ILocators.Jobs).getText().equals("Jobs")) {
                WebElement xpath = getDriver().findElement(By.xpath("//a[@href='/school/job/" + arg0 + "']"));
                xpath.click();
            } else {
                WebElement xpath = getDriver().findElement(By.xpath("//a[@href='/school/booking/" + arg0 + "']"));
                xpath.click();
            }
        } catch (Exception e) {
        }
        try {
            WebElement xpath = getDriver().findElement(By.xpath("(//a[contains(.,'" + arg0 + "')])[1]"));
            xpath.click();
            waitUntilElementVisible("//p[contains(.,'Please')])[3]", 60);
        } catch (Exception e) {
        }
        try {
            WebElement xpath = getDriver().findElement(By.xpath("(//a[contains(.,'" + arg0 + "')])[2]"));
            xpath.click();
            waitUntilElementVisible("//p[contains(.,'Please')])[3]", 60);
        } catch (Exception e) {
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

    public void chooseCheckbox(String arg0) {
        try {
            WebElement xpath = getDriver().findElement(By.xpath("//label[contains(.,'" + arg0 + "')]"));
            xpath.click();
        } catch (Exception e) {
        }
        try {
            WebElement xpath = getDriver().findElement(By.xpath("//span[contains(.,'" + arg0 + "')]//../..//div[@role='checkbox']"));
            xpath.click();
        } catch (Exception e) {
        }
    }

    public void closePopup() {
        $(ILocators.CLose_popup).click();
    }

    public ArrayList<String> getNamesOfTeachers() {
        String counter = getDriver().findElement(By.xpath("//a[contains(.,'INVITES')]")).getText().substring(9, 10);
        int max = Integer.parseInt(counter);

        for (int i = 1; i < max + 1; i++) {
            i++;
            names.add(getDriver().findElement(By.xpath("(//div[@class='table-info']//p[@class='name'])[" + i + "]")).getText());
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
//        int max2 = Integer.parseInt(getBookingCounter());
        if (getBookingCounter() < 11) {
            for (int i = 0; i < 10; i++) {
                for (int y = 1; y < 11; y++) {
                    if (names.get(i).equals(getDriver().findElement(By.xpath("(//p[@class='name'])[" + y + "]")).getText())) {
                        results.set(0, "true");
                        i = 9;
                        break;
                    } else {
                        results.set(0, "false");
                    }
                }
            }
        } else {
            for (int i = 0; i < 10; i++) {
                for (int y = 1; y < 11; y++) {
                    if (names.get(i).equals(getDriver().findElement(By.xpath("(//p[@class='name'])[" + y + "]")).getText())) {
                        results.set(0, "true");
                        i = 9;
                        break;
                    } else {
                        results.set(0, "false");
                    }
                    if ((y == 10) & (!names.get(i).equals(getDriver().findElement(By.xpath("(//p[@class='name'])[" + y + "]")).getText()))) {
                        getDriver().findElement(By.xpath("//span[contains(text(),'Next')]")).click();
                        y = 0;
                    }
                }
            }
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
        email_of_new_user = arg0 + random + "@sharklasers.com";
        $(ILocators.Email_field).sendKeys(email_of_new_user);
    }

    public void refreshThePage() {
        getDriver().navigate().refresh();
    }

    public void enterLoginOfNewCreatedUser() {
        getDriver().findElement(By.xpath("//input[@type='email']")).sendKeys(email_of_new_user);
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
        String body = "{\"query\":\"mutation {\\n  adminRemove" + arg0 + "(admin_id: \\\"" + admid + "\\\", email: \\\"" + email_of_new_user + "\\\")}\",\"variables\":null}";
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
        waitUntilElementVisible(ILocators.sign_up,60);
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
        waitUntilElementVisible("//textarea[@type='text']", 60);
            WebElement uploadElement = getDriver().findElement(By.xpath("(//input[@class='input-file'])[1]"));
            uploadElement.sendKeys("/Users/Anton/IdeaProjects/RealiseMe4/src/test/resources/Files/" + arg0);

        try {
             uploadElement = getDriver().findElement(By.xpath("(//input[@class='input-file'])[2]"));
            uploadElement.sendKeys("/Users/Anton/IdeaProjects/RealiseMe4/src/test/resources/Files/" + arg0);
        } catch (Exception e) {
        }
        try {
            uploadElement = getDriver().findElement(By.xpath("(//input[@class='input-file'])[3]"));
            uploadElement.sendKeys("/Users/Anton/IdeaProjects/RealiseMe4/src/test/resources/Files/" + arg0);
        } catch (Exception e) {
        }
    }

    public void getBookingID() {
        String bookingId1 = getDriver().findElement(By.xpath("(//div[@class='school-table-row']//div[@class='table-cell table-cell_id'])[1]")).getText();
        String bookingId2 = getDriver().findElement(By.xpath("(//div[@class='school-table-row']//div[@class='table-cell table-cell_id'])[2]")).getText();
        String bookingId3 = getDriver().findElement(By.xpath("(//div[@class='school-table-row']//div[@class='table-cell table-cell_id'])[3]")).getText();
        Serenity.getCurrentSession().addMetaData("BookingId1", bookingId1);
        Serenity.getCurrentSession().addMetaData("BookingId2", bookingId2);
        Serenity.getCurrentSession().addMetaData("BookingId3", bookingId3);
        creation_status = true;
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
        System.out.println(getBookingIDFromJson().get(0));
        System.out.println(getBookingIDFromJson().get(1));
        System.out.println(getBookingIDFromJson().get(2));
        System.out.println("bookingShortID = "+Serenity.getCurrentSession().getMetaData().get("bookingShortID"));
        System.out.println("bookingShortIDforTimesheets = "+Serenity.getCurrentSession().getMetaData().get("bookingShortIDforTimesheets"));
        System.out.println(getDriver().getCurrentUrl());
        if (getDriver().getCurrentUrl().contains("school")){
            SchoolSide=true;
            System.out.println("SchoolSide = "+SchoolSide);
            if (isElementPresent("//span[contains(.,'"+Serenity.getCurrentSession().getMetaData().get("bookingShortIDforTimesheets")+"')]")){
                getDriver().findElement(By.xpath("//span[contains(.,'"+Serenity.getCurrentSession().getMetaData().get("bookingShortIDforTimesheets")+"')]/..//div[@class='role' and contains(.,'"+arg0+"')]")).click();
                System.out.println("Clicked");
            }else
                if (isElementPresent("//span[contains(text(),'Next')]")) {
                    getDriver().findElement(By.xpath("//span[contains(text(),'Next')]")).click();
                }
        }
        else for (int i = 1; i < 11 + 1; i++) {
//            if (!SchoolSide) {
                getDriver().findElement(By.xpath("(//button[@class='open' and contains(.,'+')])[" + i + "]")).click();
//            }
            if (getDriver().findElement(By.xpath("(//p[@class='hidden-content__block-description'])[1]")).getText().equals(getBookingIDFromJson().get(0)) ||
                   getDriver().findElement(By.xpath("(//p[@class='hidden-content__block-description'])[1]")).getText().equals(getBookingIDFromJson().get(1)) ||
                    getDriver().findElement(By.xpath("(//p[@class='hidden-content__block-description'])[1]")).getText().equals(getBookingIDFromJson().get(2)) ||
                   getDriver().findElement(By.xpath("(//p[@class='hidden-content__block-description'])[1]")).getText().equals(Serenity.getCurrentSession().getMetaData().get("bookingShortID"))){
                if (arg0.equals("timesheet")) {
                    Serenity.getCurrentSession().addMetaData("bookingShortIDforTimesheets",getDriver().findElement(By.xpath("(//p[@class='hidden-content__block-description'])[1]")).getText());
                    getDriver().findElement(By.xpath("//p[@class='hidden-content__block-description']/../../../../../..//a[@class='timesheet__link' and contains(.,'timesheet')]")).click();
                    break;
                } else {
//                    if (SchoolSide){
//                            getDriver().findElement(By.xpath("//span[contains(.,'"+Serenity.getCurrentSession().getMetaData().get("acceptedTimesheetByTeacher")+"')]/..//div[@class='role' and contains(.,'"+arg0+"')]")).click();
//                    }
                    if (arg0.equals("accept")|| arg0.equals("decline")) {
                        getDriver().findElement(By.xpath("//p[@class='hidden-content__block-description']/../../../../../..//button[contains(.,'" + arg0 + "')]")).click();
                        break;
                    }
                }
            } else {
//                if (!SchoolSide) {
                    getDriver().findElement(By.xpath("//button[@class='open' and contains(.,'-')]")).click();
//                }
                if ((i == 10) & isElementPresent("//span[contains(text(),'Next')]")) {
                    getDriver().findElement(By.xpath("//span[contains(text(),'Next')]")).click();
                    i = 0;
                }

        }
        }


//        if ((!isElementPresent("//p[contains(.,'" + getBookingIDFromJson().get(0) + "')]/../../../../../..//button[contains(.,'" + arg0 + "')]")) &
//                (!isElementPresent("//p[contains(.,'" + getBookingIDFromJson().get(1) + "')]/../../../../../..//button[contains(.,'" + arg0 + "')]")) &
//                (!isElementPresent("//p[contains(.,'" + getBookingIDFromJson().get(2) + "')]/../../../../../..//button[contains(.,'" + arg0 + "')]")) &
//                (!isElementPresent("//p[contains(.,'" + Serenity.getCurrentSession().getMetaData().get("bookingShortID") + "')]/../../../../../..//button[contains(.,'" + arg0 + "')]")) &
//                isElementPresent("//span[contains(text(),'Next')]")) {
//            getDriver().findElement(By.xpath("//span[contains(text(),'Next')]")).click();
//            clickOnTheButtonOfTheAppropriateBooking(arg0);
//        }
////        if (isElementPresent("//p[contains(.,'" + getBookingIDFromJson().get(0) + "')]/../../../../../../..//span[contains(.,'" + arg0 + "')]")) {
////            try {
////                getDriver().findElement(By.xpath("(//p[contains(.,'" + getBookingIDFromJson().get(0) + "')]/../../../../../../..//span[contains(.,'" + arg0 + "')])[1]")).click();
////            } catch (Exception e) {
////            }
////            try {
////                getDriver().findElement(By.xpath("(//p[contains(.,'" + getBookingIDFromJson().get(0) + "')]/../../../../../../..//span[contains(.,'" + arg0 + "')])[2]")).click();
////            } catch (Exception e) {
////            }
////            return;
////        } else if (isElementPresent("//p[contains(.,'" + getBookingIDFromJson().get(1) + "')]/../../../../../../..//span[contains(.,'" + arg0 + "')]")) {
////            try {
////                getDriver().findElement(By.xpath("(//p[contains(.,'" + getBookingIDFromJson().get(1) + "')]/../../../../../../..//span[contains(.,'" + arg0 + "')])[1]")).click();
////            } catch (Exception e) {
////            }
////            try {
////                getDriver().findElement(By.xpath("(//p[contains(.,'" + getBookingIDFromJson().get(1) + "')]/../../../../../../..//span[contains(.,'" + arg0 + "')])[2]")).click();
////            } catch (Exception e) {
////            }
////            return;
////        } else if (isElementPresent("//p[contains(.,'" + getBookingIDFromJson().get(2) + "')]/../../../../../../..//span[contains(.,'" + arg0 + "')]")) {
////            try {
////                getDriver().findElement(By.xpath("(//p[contains(.,'" + getBookingIDFromJson().get(2) + "')]/../../../../../../..//span[contains(.,'" + arg0 + "')])[1]")).click();
////            } catch (Exception e) {
////            }
////            try {
////                getDriver().findElement(By.xpath("(//p[contains(.,'" + getBookingIDFromJson().get(2) + "')]/../../../../../../..//span[contains(.,'" + arg0 + "')])[2]")).click();
////            } catch (Exception e) {
////            }
////            return;
//        if (isElementPresent("//p[contains(.,'" + getBookingIDFromJson().get(0) + "')]/../../../../../..//button[contains(.,'" + arg0 + "')]")) {
//                getDriver().findElement(By.xpath("//p[contains(.,'" + getBookingIDFromJson().get(0) + "')]/../../../../../..//button[contains(.,'" + arg0 + "')]")).click();
//            return;
//        }
//        if (isElementPresent("//p[contains(.,'" + getBookingIDFromJson().get(1) + "')]/../../../../../..//button[contains(.,'" + arg0 + "')]")) {
//            getDriver().findElement(By.xpath("//p[contains(.,'" + getBookingIDFromJson().get(1) + "')]/../../../../../..//button[contains(.,'" + arg0 + "')]")).click();
//            return;
//        }
//        if (isElementPresent("//p[contains(.,'" + getBookingIDFromJson().get(2) + "')]/../../../../../..//button[contains(.,'" + arg0 + "')]")) {
//            getDriver().findElement(By.xpath("//p[contains(.,'" + getBookingIDFromJson().get(2) + "')]/../../../../../..//button[contains(.,'" + arg0 + "')]")).click();
//            return;
//        }
//        else if (isElementPresent("//p[contains(.,'" + Serenity.getCurrentSession().getMetaData().get("bookingShortID") + "')]/../../../../../..//button[contains(.,'" + arg0 + "')]")) {
//            getDriver().findElement(By.xpath("//p[contains(.,'" + Serenity.getCurrentSession().getMetaData().get("bookingShortID") + "')]/../../../../../..//button[contains(.,'" + arg0 + "')]")).click();
//            return;
//        }
////        else  if (isElementPresent("//p[contains(.,'" + Serenity.getCurrentSession().getMetaData().get("bookingShortID") + "')]/..//a")) {
////            getDriver().findElement(By.xpath("//p[contains(.,'" + Serenity.getCurrentSession().getMetaData().get("bookingShortID") + "')]/..//a")).click();
////            return;
////        }
        }


        //    @Test
        public void createBookingUsingRequestAPI (List < String > list) throws IOException, ParseException {
            getAccessTokenAuth0();
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

        public void acceptBookingAsClearedTeacherUsingRequestAPI (List < String > list) throws
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

        public void approveBookingAsSchoolUsingRequestAPI (List < String > list) throws IOException, ParseException {
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


        public void changeBookingStatusToCompleted (List < String > list) throws IOException, ParseException {
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

        public void enterEmailOfAppropriateTeacher (String arg0){
            getDriver().findElement(By.xpath("//span[@title='Click to Edit']")).click();
            getDriver().findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(arg0);
            getDriver().findElement(By.xpath("//button[contains(.,'Set')]")).click();
            waitABit(30000);

        }

        public void chooseAppropriateEmailMessage (String arg0){
            wait = new WebDriverWait(getDriver(), 100);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[contains(.,'" + arg0 + "')]")));
            getDriver().findElement(By.xpath("//td[contains(.,'" + arg0 + "')]")).click();
            String message = getDriver().findElement(By.xpath("(//tbody)[6]")).getText().substring(53).trim().trim().trim();
            System.out.println(message);
            waitABit(2000);

        }


        public void removeAllUserBookingsUsingRequestAPI (List < String > list) throws IOException, ParseException {
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

        public void chooseRadiobutton (String arg0){
            getDriver().findElement(By.xpath("//div[contains(.,'" + arg0 + "') and @class='radio-button']")).click();
        }


        public String getDate () {
            date = java.time.LocalDate.now().toString().substring(8, 10);
            month = java.time.LocalDate.now().toString().substring(5, 7);
            year = java.time.LocalDate.now().toString().substring(0, 4);
            current_date = date + ", " + year;
            System.out.println(current_date);
            return current_date;
        }

        public void enterTextToTheTextField (String arg0){
            waitUntilElementVisible("//textarea[@type='text']", 60);
            getDriver().findElement(By.xpath("//textarea[@type='text']")).sendKeys(arg0);
            Serenity.getCurrentSession().addMetaData("covering message", arg0);
        }

        public ArrayList<String> theMessageLinkOfFirstApplicantHasRightEmailAddress (String arg0){
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

        public void createLogicMelonJobThroughAPI (List < String > list) throws IOException, ParseException {
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

        public void checkBookingCreationStatus() throws IOException, ParseException {
            if (creation_status = false) {
                System.out.println("creation_status" + creation_status);
                ArrayList<String> list = new ArrayList<>();
                list.add("\"school_id\":\"9b3daa63-4ef8-43a4-8e7c-8b62ff6367f1\"");
                list.add("\"bookingName\":\"Booking for cleared teacher  20\"");
                list.add("\"bookingDescription\":\"Booking Description text\"");
                list.add("\"other_age_group\":\"\"");
                list.add("\"dates\":[{\"date\":\"2020-08-27T08:30:00+02:00\",\"fullDay\":true,\"start_time\":\"2020-08-27T08:30:00+02:00\",\"end_time\":\"2020-08-27T16:00:00+02:00\"},{\"date\":\"2020-08-28T08:30:00+02:00\",\"fullDay\":false,\"start_time\":\"2020-08-28T08:30:00+02:00\",\"end_time\":\"2020-08-28T13:00:00+02:00\"}]");
                list.add("\"ageGroupIds\":[{\"age_group_id\":\"19abfc90-f45b-476b-920f-b05e6e3124a0\"}] ");
                list.add("\"schoolDocumentsIds\":{\"school_document_id\":\"9c78412f-fe27-4fcc-b527-405e903810e2\"}                                               ");
                list.add("\"applyUsersIds\":[{\"user_id\":\"827fc573-d555-4cf8-9e6d-4d85e7d0e554\",\"user_type\":\"TEACHER\"}]                   ");
                list.add("\"teachersTypeIdsSchema\":[{\"teacher_type_id\":\"59153f42-83b1-4964-b3ad-5a50226c342a\"},{\"teacher_type_id\":\"5d714ae1-4fb4-4b89-a927-47c4396c418e\"}]");
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
    }
