package RealiseMe.com.pages.CommonActions;

import RealiseMe.com.ILocators;
import com.github.cliftonlabs.json_simple.Jsoner;
import net.serenitybdd.core.pages.PageObject;
import org.apache.commons.io.IOUtils;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.net.ssl.HttpsURLConnection;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

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
    //    public WebDriverWait wait = new WebDriverWait(getDriver(), 10);


    public void clickOnTheButton(String arg0) {
        try {
            WebElement xpath = getDriver().findElement(By.xpath("//a[contains(.,'" + arg0 + "')]"));
            xpath.click();
        } catch (Exception e) {
        }
        try {
            WebElement xpath = getDriver().findElement(By.xpath("//button[contains(.,'" + arg0 + "')]"));
            xpath.click();
        } catch (Exception e) {
        }
        try {
            WebElement xpath = getDriver().findElement(By.xpath("(//button[contains(.,'" + arg0 + "')])[1]"));
            xpath.click();
        } catch (Exception e) {
        }
        try {
            WebElement xpath = getDriver().findElement(By.xpath("(//button[contains(.,'" + arg0 + "')])[2]"));
            xpath.click();
        } catch (Exception e) {
        }
        try {
            WebElement xpath = getDriver().findElement(By.xpath("//span[contains(.,'" + arg0 + "')]"));
            xpath.click();
        } catch (Exception e) {
        }
        try {
            WebElement xpath = getDriver().findElement(By.xpath("//p[contains(.,'" + arg0 + "')]"));
            xpath.click();
        } catch (Exception e) {
        }
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
        } catch (Exception e) {
        }
        try {
            WebElement xpath = getDriver().findElement(By.xpath("(//a[contains(.,'" + arg0 + "')])[2]"));
            xpath.click();
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
            WebElement xpath = getDriver().findElement(By.xpath("//span[contains(.,'" + arg0 + "')]"));
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
        waitABit(5000);
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
//
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


    public void uploadFile(String arg0) {
        WebElement uploadElement = getDriver().findElement(By.xpath("//input[@class='input-file']"));
        uploadElement.sendKeys("/home/akuzikov/IdeaProjects/RealiseMecom/src/test/resources/Files/" + arg0);
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
//        getDriver().findElement(By.xpath("//a[@id='forget_button']")).click();
        getDriver().findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(email_of_new_user);
//        waitABit(2000);
        getDriver().findElement(By.xpath("//button[contains(.,'Set')]")).click();
        waitABit(20000);
        getDriver().findElement(By.xpath("//td[contains(.,'Please')]")).click();
    }

    public void backToTheFirstTab() {
        getDriver().switchTo().window(parentHandle);
    }

//        @Test
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
//            System.out.println(token);
        }
    }

//        @Test
    public String deleteAccount(String arg0) throws IOException, ParseException {
        getAccessTokenAuth0();
        String body = "{\"query\":\"mutation {\\n  adminRemove" + arg0 + "(admin_id: \\\""+admid+"\\\", email: \\\"" + email_of_new_user + "\\\")}\",\"variables\":null}";
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
        getDriver().findElement(By.xpath("(//span[contains(.,'sign up')])[2]")).click();
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

    public void getBookingID() {
        String bookingId1 = getDriver().findElement(By.xpath("(//div[@class='school-table-row']//div[@class='table-cell table-cell_id'])[1]")).getText();
        String bookingId2 = getDriver().findElement(By.xpath("(//div[@class='school-table-row']//div[@class='table-cell table-cell_id'])[2]")).getText();
        String bookingId3 = getDriver().findElement(By.xpath("(//div[@class='school-table-row']//div[@class='table-cell table-cell_id'])[3]")).getText();
        try {
            BufferedWriter writer = Files.newBufferedWriter(Paths.get("/home/akuzikov/IdeaProjects/RealiseMecom/src/test/resources/Files/BookingID.json"));
            JSONObject bookingIDObject = new JSONObject();
            bookingIDObject.put("BookingId1", bookingId1);
            bookingIDObject.put("BookingId2", bookingId2);
            bookingIDObject.put("BookingId3", bookingId3);
            Jsoner.serialize(bookingIDObject, writer);
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<String> getBookingIDFromJson() throws IOException, ParseException {
        JSONObject jsonObject = (JSONObject) parser.parse(new FileReader("/home/akuzikov/IdeaProjects/RealiseMecom/src/test/resources/Files/BookingID.json"));
        bookingID1 = jsonObject.get("BookingId1").toString();
        bookingID2 = jsonObject.get("BookingId2").toString();
        bookingID3 = jsonObject.get("BookingId3").toString();
        ArrayList<String> bookingsIDList = new ArrayList<>();
        bookingsIDList.add(bookingID1);
        bookingsIDList.add(bookingID2);
        bookingsIDList.add(bookingID3);
        return bookingsIDList;
    }

    public void clickOnTheButtonOfTheAppropriateBooking(String arg0) throws IOException, ParseException {
        if ((!isElementPresent("//p[contains(.,'" + getBookingIDFromJson().get(0) + "')]/../../../../../../..//span[contains(.,'" + arg0 + "')]")) &
                (!isElementPresent("//p[contains(.,'" + getBookingIDFromJson().get(1) + "')]/../../../../../../..//span[contains(.,'" + arg0 + "')]")) &
                (!isElementPresent("//p[contains(.,'" + getBookingIDFromJson().get(2) + "')]/../../../../../../..//span[contains(.,'" + arg0 + "')]"))) {
            getDriver().findElement(By.xpath("//span[contains(text(),'Next')]")).click();
//            clickOnTheButtonOfTheAppropriateBooking(arg0);
        }
        if (isElementPresent("//p[contains(.,'" + getBookingIDFromJson().get(0) + "')]/../../../../../../..//span[contains(.,'" + arg0 + "')]")) {
            try {
                getDriver().findElement(By.xpath("(//p[contains(.,'" + getBookingIDFromJson().get(0) + "')]/../../../../../../..//span[contains(.,'" + arg0 + "')])[1]")).click();
            } catch (Exception e) {
            }
            try {
                getDriver().findElement(By.xpath("(//p[contains(.,'" + getBookingIDFromJson().get(0) + "')]/../../../../../../..//span[contains(.,'" + arg0 + "')])[2]")).click();
            } catch (Exception e) {
            }
        } else if (isElementPresent("//p[contains(.,'" + getBookingIDFromJson().get(1) + "')]/../../../../../../..//span[contains(.,'" + arg0 + "')]")) {
            try {
                getDriver().findElement(By.xpath("(//p[contains(.,'" + getBookingIDFromJson().get(1) + "')]/../../../../../../..//span[contains(.,'" + arg0 + "')])[1]")).click();
            } catch (Exception e) {
            }
            try {
                getDriver().findElement(By.xpath("(//p[contains(.,'" + getBookingIDFromJson().get(1) + "')]/../../../../../../..//span[contains(.,'" + arg0 + "')])[2]")).click();
            } catch (Exception e) {
            }
        } else if (isElementPresent("//p[contains(.,'" + getBookingIDFromJson().get(2) + "')]/../../../../../../..//span[contains(.,'" + arg0 + "')]")) {
            try {
                getDriver().findElement(By.xpath("(//p[contains(.,'" + getBookingIDFromJson().get(2) + "')]/../../../../../../..//span[contains(.,'" + arg0 + "')])[1]")).click();
            } catch (Exception e) {
            }
            try {
                getDriver().findElement(By.xpath("(//p[contains(.,'" + getBookingIDFromJson().get(2) + "')]/../../../../../../..//span[contains(.,'" + arg0 + "')])[2]")).click();
            } catch (Exception e) {
            }
        }
    }


}