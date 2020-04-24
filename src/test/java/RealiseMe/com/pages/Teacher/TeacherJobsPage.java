package RealiseMe.com.pages.Teacher;

import RealiseMe.com.pages.CommonActions.CommonActions;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.util.Iterator;
import java.util.Set;

public class TeacherJobsPage extends PageObject {
    private String parentHandle;
    CommonActions commonActions;


    public void enterToThePostcodeField(String arg0) {
        getDriver().findElement(By.xpath("//input[@placeholder='post code']")).sendKeys(arg0);
    }

    public void chooseDistance(String arg0) {
        getDriver().findElement(By.xpath("//select")).click();
        getDriver().findElement(By.xpath("//option[@value='"+arg0+"']")).click();
    }


    public void clickOnTheButtonAtTheJobPreviewPage(String arg0) {
        commonActions.waitUntilElementVisible("(//button[contains(.,'SAVE')])[1]",60);
        getDriver().findElement(By.xpath("(//button[contains(.,'SAVE')])[1]")).click();
        waitABit(1000);

    }

    public void clickOnTheAppropriateJobTitleAtTheTab(String arg0) {
        commonActions.waitUntilElementVisible("//a[contains(.,'"+ Serenity.getCurrentSession().getMetaData().get("job name")+"')]",60);
       parentHandle = getDriver().getWindowHandle();
        getDriver().findElement(By.xpath("//a[contains(.,'"+ Serenity.getCurrentSession().getMetaData().get("job name")+"')]")).click();
        ((JavascriptExecutor) getDriver()).executeScript("window.open('about:blank','_blank');");
        String subWindowHandler = null;
        Set<String> handles = getDriver().getWindowHandles();
        Iterator<String> iterator = handles.iterator();
        while (iterator.hasNext()) {
            subWindowHandler = iterator.next();
        }
        getDriver().switchTo().window(subWindowHandler);

    }
}
