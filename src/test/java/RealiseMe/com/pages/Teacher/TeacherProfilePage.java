package RealiseMe.com.pages.Teacher;

import RealiseMe.com.pages.CommonActions.CommonActions;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class TeacherProfilePage extends PageObject {
    CommonActions commonActions;


    public ArrayList<String> teacherAccountPageContainsNecessaryElements(List<String> list) {
        ArrayList<String> labels = new ArrayList<>();
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");
        commonActions.wait = new WebDriverWait(getDriver(),20);
        commonActions.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='components-name' and contains(text(),'Account')])[1]")));
        if (!commonActions.isElementPresent("(//div[@class='components-name' and contains(text(),'Account')])[1]")){
//                !getDriver().findElement(By.xpath("(//div[@class='components-name' and contains(text(),'Account')])[1]")).isDisplayed() ) {
            results.set(0, "false");
            results.add("Account page isn't opened");
        } else {
            commonActions.wait = new WebDriverWait(getDriver(),20);
           commonActions.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='components-name' and contains(text(),'Account')])[1]")));
            labels.add(getDriver().findElement(By.xpath("(//div[@class='components-name' and contains(text(),'Account')])[1]")).getText());
            commonActions.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='MyInfoAccount-name' and contains(text(),'Enter your name')]")));
            labels.add(getDriver().findElement(By.xpath("//div[@class='MyInfoAccount-name' and contains(text(),'Enter your name')]")).getText());
            labels.add(getDriver().findElement(By.xpath("//p[contains(.,'Tell us your job title')]")).getText());
            labels.add(getDriver().findElement(By.xpath("//p[contains(.,'Tell us more about you…')]")).getText());
            labels.add(getDriver().findElement(By.xpath("(//div[@class='components-name' and contains(text(),'Contact Details')])[1]")).getText());
            labels.add(getDriver().findElement(By.xpath("//p[contains(.,'Email')]")).getText());
            labels.add(getDriver().findElement(By.xpath("//p[contains(.,'Address')]")).getText());
            labels.add(getDriver().findElement(By.xpath("//p[contains(.,'Mobile')]")).getText());
            labels.add(getDriver().findElement(By.xpath("//p[contains(.,'Distance willing to travel')]")).getText());
            labels.add(getDriver().findElement(By.xpath("//p[contains(.,'Time zone')]")).getText());
            labels.add(getDriver().findElement(By.xpath("(//div[@class='components-name' and contains(text(),'Social Accounts')])")).getText());
            labels.add(getDriver().findElement(By.xpath("//p[contains(.,'Add social account')]")).getText());
            labels.add(getDriver().findElement(By.xpath("//div[@class='components-name' and contains(.,'CV & Additional Documents')]")).getText());
            labels.add(getDriver().findElement(By.xpath("//div[@class='MyInfoDocuments-descr' and  contains(.,'Attach your CV and qualifications here')]")).getText());
            for (int i = 0; i < list.size(); i++) {
                if (!list.get(i).equals(labels.get(i))) {
                    results.set(0, "false");
                    results.add("Expected: " + list.get(i) + "; but found: " + labels.get(i) + "\n");
                }
            }
        }
        return results;
    }



}

