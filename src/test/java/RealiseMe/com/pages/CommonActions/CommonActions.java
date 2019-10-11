package RealiseMe.com.pages.CommonActions;

import RealiseMe.com.ILocators;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;

public class CommonActions extends PageObject {
    private ArrayList<String> status_of_teacher;
    private ArrayList<String> names = new ArrayList<>();
    private int counter;
    private int b;

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
        if ($(ILocators.Jobs).getText().equals("Jobs")) {
            WebElement xpath = getDriver().findElement(By.xpath("//a[@href='/school/job/" + arg0 + "']"));
            xpath.click();
        } else {
            WebElement xpath = getDriver().findElement(By.xpath("//a[@href='/school/booking/" + arg0 + "']"));
            xpath.click();
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
        String counter = getDriver().findElement(By.xpath("//a[@href='/school/booking/invite'][contains(.,'invites')]")).getText().substring(9,11);
        int max2 = Integer.parseInt(counter);
        if (max2<11){
            for (int i = 0; i < 10; i++) {
                for (int y = 1; y < 11; y++) {
                    if (names.get(i).equals(getDriver().findElement(By.xpath("(//p[@class='name'])[" + y + "]")).getText())) {
                        results.set(0, "true");
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

        return max2;
    }

    public void findInviteWithJobTitle(String arg0) {
        waitABit(5000);
        int i = 0;
        counter=0;
            for (int y = 1; y < getBookingCounter()+1; y++) {
                counter=y+i;
                getDriver().findElement(By.xpath("(//p[contains(.,'+')])[" + y + "]")).click();
                waitABit(1000);
                if ((getDriver().findElement(By.xpath("((//div[@class='content-wrapper'])["+y+"]//p)[4]")).getText().substring(11).equals(arg0)) &
                        (getDriver().findElement(By.xpath("(//span[contains(.,'accept')])["+counter+"]")).getAttribute("class").equals("tooltip green-background tooltip--top"))) {
                    i++;
                    waitABit(1000);
                }
                if (getDriver().findElement(By.xpath("((//div[@class='content-wrapper'])["+y+"]//p)[4]")).getText().substring(11).equals(arg0) &
                        (!getDriver().findElement(By.xpath("(//span[contains(.,'accept')])["+counter+"]")).getAttribute("class").equals("tooltip green-background tooltip--top"))) {
                    counter=y+i;
                    waitABit(1000);
                    break;
                } else {
                    y++;
                    getDriver().findElement(By.xpath("(//p[contains(.,'-')])[" + y + "]")).click();
                    y--;
                }
                if ((y == 10) & (getBookingCounter() > 10) & (!getDriver().findElement(By.xpath("//p[contains(.,'" + arg0 + "')]")).isDisplayed())) {
                    getDriver().findElement(By.xpath("//span[contains(text(),'Next')]")).click();
                    y = 1;
                }
            }
        }

    public void clickOnTheButtonOfTheAppropriateBooking(String arg0) {
           getDriver().findElement(By.xpath("(//span[contains(.,'"+arg0+"')])["+counter+"]")).click();
    }

    public void uploadFile(String arg0) {
        WebElement uploadElement = getDriver().findElement(By.xpath("//input[@class='input-file']"));
        uploadElement.sendKeys("/home/akuzikov/IdeaProjects/RealiseMecom/src/test/resources/Files/"+arg0);
    }
}
