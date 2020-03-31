package RealiseMe.com.pages.School;

import RealiseMe.com.pages.CommonActions.CommonActions;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class SchoolAccountPage  extends PageObject {
    CommonActions commonActions;
    public String clid = "ZQ0ZbBhkvOv3f7rxEKPxq557nxygPeRn";

    public ArrayList<String> schoolAccountPageContainsNecessaryElements(List<String> list) {
        ArrayList<String> labels = new ArrayList<>();
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");
        commonActions.waitUntilElementVisible("//p[contains(.,'Tell us more about your school…')]",60);
        if (!getDriver().findElement(By.xpath("//p[contains(.,'Tell us more about your school…')]")).isDisplayed() ) {
            results.set(0, "false");
            results.add("Account page isn't opened");
        } else {
            labels.add(getDriver().findElement(By.xpath("//p[contains(.,'Tell us more about your school…')]")).getText());
            labels.add(getDriver().findElement(By.xpath("//p[contains(.,'Anonymisation')]")).getText());
            labels.add(getDriver().findElement(By.xpath("//p[contains(.,'Address')]")).getText());
            labels.add(getDriver().findElement(By.xpath("//p[contains(.,'Please enter your school address')]")).getText());
            labels.add(getDriver().findElement(By.xpath("//p[contains(.,'Website')]")).getText());
            labels.add(getDriver().findElement(By.xpath("//p[contains(.,'Enter a link to your school website')]")).getText());
            labels.add(getDriver().findElement(By.xpath("//p[contains(.,'Age group(s)')]")).getText());
            labels.add(getDriver().findElement(By.xpath("//p[contains(.,'What age groups does your school teach?')]")).getText());
            labels.add(getDriver().findElement(By.xpath("//p[contains(.,'School type')]")).getText());
            labels.add(getDriver().findElement(By.xpath("//p[contains(.,'What type of school are you?')]")).getText());
            labels.add(getDriver().findElement(By.xpath("//p[contains(.,'Landline')]")).getText());
            labels.add(getDriver().findElement(By.xpath("//p[contains(.,'Please enter your landline')]")).getText());
            labels.add(getDriver().findElement(By.xpath("//p[contains(.,'Out of hours mobile')]")).getText());
            labels.add(getDriver().findElement(By.xpath("//p[contains(.,'Please enter your out of hours mobile number')]")).getText());
            labels.add(getDriver().findElement(By.xpath("//p[contains(.,'Gender pay gap')]")).getText());
            labels.add(getDriver().findElement(By.xpath("//p[contains(.,'Policies')]")).getText());
            labels.add(getDriver().findElement(By.xpath("//p[contains(.,'Please read and confirm our T&Cs')]")).getText());
            labels.add(getDriver().findElement(By.xpath("//p[contains(.,'Add social account')]")).getText());
            labels.add(getDriver().findElement(By.xpath("//div[@class='MyInfoDocuments-descr']")).getText());
            for (int i = 0; i < list.size(); i++) {
                if (!list.get(i).equals(labels.get(i))) {
                    results.set(0, "false");
                    results.add("Expected: " + list.get(i) + "; but found: " + labels.get(i) + "\n");
                }
            }
        }
        return results;
    }

    public ArrayList<String> adminDetailsPageIsOpened(List<String> list) {
        ArrayList<String> labels = new ArrayList<>();
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");
        if (!getDriver().findElement(By.xpath("//p[contains(.,'Main Admin Details')]")).isDisplayed() ) {
            results.set(0, "false");
            results.add("Admin Details page isn't opened");
        } else {
            labels.add(getDriver().findElement(By.xpath("//p[contains(.,'Main Admin Details')]")).getText());
            labels.add(getDriver().findElement(By.xpath("//p[contains(.,'Name')]")).getText());
            labels.add(getDriver().findElement(By.xpath("//p[contains(.,'Email')]")).getText());
            labels.add(getDriver().findElement(By.xpath("//p[contains(.,'Mobile')]")).getText());
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
