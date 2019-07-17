package RealiseMe.com.pages.CommonActions;

import RealiseMe.com.ILocators;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class CommonActions extends PageObject {
    public ArrayList<String> names,status_of_teacher;

    public void clickOnTheButton(String arg0) {
        try {
            WebElement xpath = getDriver().findElement(By.xpath("//a[contains(.,'" + arg0 + "')]"));
            xpath.click();
        }catch (Exception e){ }
        try {
            WebElement xpath = getDriver().findElement(By.xpath("//button[contains(.,'" + arg0 + "')]"));
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
        WebElement xpath = getDriver().findElement(By.xpath("//label[contains(.,'" + arg0 + "')]"));
        xpath.click();
    }

    public void closePopup() {
        $(ILocators.CLose_popup).click();
    }

    public void getNamesOfTeachers() {
        String counter = getDriver().findElement(By.xpath("//a[contains(.,'INVITES')]")).getText().substring(9,10);
        int max = Integer.parseInt(counter);
        names = new ArrayList<>();
        for (int i = 1; i < max; i++) {

            names.add(getDriver().findElement(By.xpath("(//div[@class='table-info']//p[@class='name'])[" + i + "]")).getText());

        }

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
        String counter = getDriver().findElement(By.xpath("//a[@href='/school/booking/invite'][contains(.,'invites')]")).getText().substring(9,10);
        int max2 = Integer.parseInt(counter);
        for (int i = 1; i < max2; i++) {
            for (int y = 1; y < 11; y++) {
                if (names.get(i).equals(getDriver().findElement(By.xpath("(//p[@class='name'])[" + y + "]")).getText())) {
                    results.set(0, "true");
                    break;
                } else {
                    results.set(0, "false");
                }
                if ((y == 10) & (!names.get(i).equals(getDriver().findElement(By.xpath("(//p[@class='name'])[" + y + "]")).getText()))) {
                    getDriver().findElement(By.xpath("//span[contains(text(),'Next')]")).click();
                    y = 1;
                }
            }
        }
        return results;
    }
}
