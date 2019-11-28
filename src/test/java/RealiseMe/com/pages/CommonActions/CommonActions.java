package RealiseMe.com.pages.CommonActions;

import RealiseMe.com.ILocators;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Iterator;
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


    public void clickOnTheButton(String arg0) {
        try {
            WebElement xpath = getDriver().findElement(By.xpath("//a[contains(.,'" + arg0 + "')]"));
            xpath.click();
        }catch (Exception e){ }
        try {
            WebElement xpath = getDriver().findElement(By.xpath("//button[contains(.,'" + arg0 + "')]"));
            xpath.click();
        }catch (Exception e){ }
        try {
            WebElement xpath = getDriver().findElement(By.xpath("//span[contains(.,'" + arg0 + "')]"));
            xpath.click();
        }catch (Exception e){ }
        try {
            WebElement xpath = getDriver().findElement(By.xpath("//p[contains(.,'" + arg0 + "')]"));
            xpath.click();
        }catch (Exception e){ }
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
        }catch (Exception e){}
        try {
            WebElement xpath = getDriver().findElement(By.xpath("//a[contains(.,'" + arg0 + "')]"));
            xpath.click();
        }catch (Exception e){}
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
        }catch (Exception e){ }
        try {
            WebElement xpath = getDriver().findElement(By.xpath("//span[contains(.,'" + arg0 + "')]"));
            xpath.click();
        }catch (Exception e){ }
    }

    public void closePopup() {
        $(ILocators.CLose_popup).click();
    }

    public ArrayList<String> getNamesOfTeachers() {
        String counter = getDriver().findElement(By.xpath("//a[contains(.,'INVITES')]")).getText().substring(9,10);
        int max = Integer.parseInt(counter);

        for (int i = 1; i < max+1; i++) {
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
        if (getBookingCounter()<11){
            for (int i = 0; i < 10; i++) {
                for (int y = 1; y < 11; y++) {
                    if (names.get(i).equals(getDriver().findElement(By.xpath("(//p[@class='name'])[" + y + "]")).getText())) {
                        results.set(0, "true");
                        i=9;
                        break;
                    } else {
                        results.set(0, "false");
                    }
        }}}else {
            for (int i = 0; i < 10; i++) {
                for (int y = 1; y < 11; y++) {
                    if (names.get(i).equals(getDriver().findElement(By.xpath("(//p[@class='name'])[" + y + "]")).getText())) {
                        results.set(0, "true");
                        i=9;
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
    
    public int getBookingCounter(){
        int max2 = 0;
        try {
           String counter = getDriver().findElement(By.xpath("//a[@href='/agency/booking/invite'][contains(.,'invites')]")).getText().substring(9,11);
         return   max2 = Integer.parseInt(counter);
        }catch (Exception e){}
        try {
         String counter = getDriver().findElement(By.xpath("//a[@href='/agency/booking/invite'][contains(.,'invites')]")).getText().substring(9,10);
       return   max2 = Integer.parseInt(counter);
        }catch (Exception e){}
        try {
            String counter = getDriver().findElement(By.xpath("//a[@href='/school/booking/invite'][contains(.,'invites')]")).getText().substring(9,11);
            return   max2 = Integer.parseInt(counter);
        }catch (Exception e){}
        try {
            String counter = getDriver().findElement(By.xpath("//a[@href='/school/booking/invite'][contains(.,'invites')]")).getText().substring(9,10);
            return   max2 = Integer.parseInt(counter);
        }catch (Exception e){}
        try {
            String counter = getDriver().findElement(By.xpath("//a[@href='/teacher_supply/booking/invite'][contains(.,'invites')]")).getText().substring(9,11);
            return   max2 = Integer.parseInt(counter);
        }catch (Exception e){}
        try {
            String counter = getDriver().findElement(By.xpath("//a[@href='/teacher_supply/booking/invite'][contains(.,'invites')]")).getText().substring(9,10);
            return   max2 = Integer.parseInt(counter);
        }catch (Exception e){}

        return max2;
    }

    public void findInviteWithJobTitle(String arg0) {
        waitABit(5000);
        wait  = new WebDriverWait(getDriver(), 15);
        int i = 0;
        counter =0;
        for (int y = 1; y < getBookingCounter()+1; y++) {
            getDriver().findElement(By.xpath("(//p[contains(.,'+')])[" + y + "]")).click();
            if ( (getDriver().findElement(By.xpath("//div[@class='table-body-wrapper show']//span[contains(.,'accept')]")).getAttribute("class").equals("tooltip tooltip--top green-background"))||
                    (getDriver().findElement(By.xpath("//div[@class='table-body-wrapper show']//span[contains(.,'accept')]")).getAttribute("class").equals("tooltip green-background tooltip--top"))) {
                y++;
                getDriver().findElement(By.xpath("(//p[contains(.,'-')])[" + y + "]")).click();
                y--;
                continue;
            }
            if (getDriver().findElement(By.xpath("((//div[@class='content-wrapper'])["+y+"]//p)[4]")).getText().substring(11).equals(arg0) ){
//                    &  (!getDriver().findElement(By.xpath("(//span[contains(.,'accept')])["+ counter +"]")).getAttribute("class").equals("tooltip green-background tooltip--top"))) {
//                counter =y+i;
//                waitABit(500);
                break;
            }
            else {
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

    public void clickOnTheButtonOfTheAppropriateBooking(String arg0) {
            getDriver().findElement(By.xpath("//div[@class='table-body-wrapper show']//span[contains(.,'"+arg0+"')]")).click();
    }

    public void uploadFile(String arg0) {
        WebElement uploadElement = getDriver().findElement(By.xpath("//input[@class='input-file']"));
        uploadElement.sendKeys("/home/akuzikov/IdeaProjects/RealiseMecom/src/test/resources/Files/"+arg0);
    }

    public boolean isElementPresent(String selector) {
        boolean returnVal = true;
        try{
            getDriver().findElement(By.xpath(selector));
        } catch (NoSuchElementException e){
            returnVal = false;
        } finally {
        }
        return returnVal;
    }

    public void enterLoginOfNewUser(String arg0) {
        random = (int) (Math.random() * 200 + 111);
        email_of_new_user = arg0+random+ "@sharklasers.com";
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
//        getDriver().switchTo().window(parentHandle);
//        waitABit(10000);
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
}
//html[@xmlns='http://www.w3.org/1999/xhtml']//body[@class='bodymail']//a[contains(.,'Confirm my account')]