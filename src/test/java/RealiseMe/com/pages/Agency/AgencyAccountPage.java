package RealiseMe.com.pages.Agency;

import RealiseMe.com.pages.CommonActions.CommonActions;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class AgencyAccountPage extends PageObject {
    CommonActions commonActions;

    public ArrayList<String> agencyAccountPageContainsNecessaryElements(List<String> list) {
        ArrayList<String> labels = new ArrayList<>();
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");
        commonActions.waitUntilElementVisible("(//div[@class='components-name' and contains(text(),'Agency details')])[1]",60);
        if (!commonActions.isElementPresent("(//div[@class='components-name' and contains(text(),'Agency details')])[1]")){
//                !getDriver().findElement(By.xpath("(//div[@class='components-name' and contains(text(),'Account')])[1]")).isDisplayed() ) {
            results.set(0, "false");
            results.add("Account page isn't opened");
        } else {
            commonActions.waitUntilElementVisible("(//div[@class='components-name' and contains(text(),'Agency details')])[1]",60);
            labels.add(getDriver().findElement(By.xpath("(//div[@class='components-name' and contains(text(),'Agency details')])[1]")).getText());
            commonActions.waitUntilElementVisible("//span[contains(.,'Enter your agency name')]",60);
            labels.add(getDriver().findElement(By.xpath("//span[contains(.,'Enter your agency name')]")).getText());
            labels.add(getDriver().findElement(By.xpath("//p[contains(.,'Tell us more about your agency')]")).getText());
            labels.add(getDriver().findElement(By.xpath("//p[contains(.,'Contact name')]")).getText());
            labels.add(getDriver().findElement(By.xpath("//p[contains(.,'Enter name')]")).getText());
            labels.add(getDriver().findElement(By.xpath("//p[contains(.,'Email')]")).getText());
            labels.add(getDriver().findElement(By.xpath("//p[contains(.,'Address')]")).getText());
            labels.add(getDriver().findElement(By.xpath("//p[contains(.,'Enter your agency address')]")).getText());
            labels.add(getDriver().findElement(By.xpath("//p[contains(.,'Website')]")).getText());
            labels.add(getDriver().findElement(By.xpath("//p[contains(.,'Enter you agency website')]")).getText());
            labels.add(getDriver().findElement(By.xpath("//p[contains(.,'Age group(s)')]")).getText());
            labels.add(getDriver().findElement(By.xpath("//p[contains(.,'Select age group(s) covered')]")).getText());
            labels.add(getDriver().findElement(By.xpath("//p[contains(.,'Landline')]")).getText());
            labels.add(getDriver().findElement(By.xpath("//p[contains(.,'Enter your landline')]")).getText());
            labels.add(getDriver().findElement(By.xpath("//p[contains(.,'Mobile')]")).getText());
            labels.add(getDriver().findElement(By.xpath("//p[contains(.,'Enter contact mobile number')]")).getText());
            labels.add(getDriver().findElement(By.xpath("//p[contains(.,'Areas covered')]")).getText());
            labels.add(getDriver().findElement(By.xpath("//div[@class='AgencyInfoAccount-descp' and contains(.,'Enter areas covered')]")).getText());
            labels.add(getDriver().findElement(By.xpath("(//p[contains(.,'SLA')])[1]")).getText());
            labels.add(getDriver().findElement(By.xpath("//p[contains(.,'Please confirm Service Level Agreement (SLA)')]")).getText());
            labels.add(getDriver().findElement(By.xpath("(//p[contains(.,'T&Cs')])[1]")).getText());
            labels.add(getDriver().findElement(By.xpath("//p[contains(.,'Please confirm our T&Cs')]")).getText());
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
