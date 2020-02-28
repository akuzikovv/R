package RealiseMe.com.pages.Teacher;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class TeacherJobsPage extends PageObject {


    public void enterToThePostcodeField(String arg0) {
        getDriver().findElement(By.xpath("//input[@placeholder='post code']")).sendKeys(arg0);
    }

    public void chooseDistance(String arg0) {
        getDriver().findElement(By.xpath("//select")).click();
        getDriver().findElement(By.xpath("//option[@value='"+arg0+"']")).click();
    }
}
