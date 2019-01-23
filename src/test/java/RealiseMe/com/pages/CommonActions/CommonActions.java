package RealiseMe.com.pages.CommonActions;

import RealiseMe.com.ILocators;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CommonActions extends PageObject {

    public void clickOnTheButton(String arg0) {
        WebElement xpath = getDriver().findElement(By.xpath("//a[contains(.,'" + arg0 + "')]"));
        xpath.click();
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
}
