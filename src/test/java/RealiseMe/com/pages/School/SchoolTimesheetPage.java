package RealiseMe.com.pages.School;

import RealiseMe.com.pages.CommonActions.CommonActions;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class SchoolTimesheetPage extends PageObject {
    private float total_rate,submitted_days_full_days,submitted_days_half_days;
    private String teacher_rate;
    private float teacher_rate_for_school;
    CommonActions commonActions;

    public ArrayList<String> totalRateForSchoolIsRightCalculated() {
        teacher_rate = Serenity.getCurrentSession().getMetaData().get("Teacher_rate");
        commonActions.wait =  new WebDriverWait(getDriver(),100);
        commonActions.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='item-body']//p)[3]")));
        waitABit(2000);
        total_rate = Float.parseFloat(getDriver().findElement(By.xpath("(//div[@class='item-body']//p)[3]")).getText().substring(1));
        submitted_days_full_days = Integer.parseInt(getDriver().findElement(By.xpath("//p[contains(.,'Total worked days')]/..//p[@class='block-status']")).getText().substring(0,1));
        submitted_days_half_days = Float.parseFloat(getDriver().findElement(By.xpath("//p[contains(.,'Total worked days')]/..//p[@class='block-status']")).getText().substring(2,3));
        if (submitted_days_half_days==5){
            submitted_days_half_days = (float) (1*0.67);
        }
        float expected_total_rate0 = (float) ((submitted_days_full_days+submitted_days_half_days)*(Integer.parseInt(teacher_rate)*1.175 +17.5))*100;
        int result = (int)Math.round(expected_total_rate0);
        float expected_total_rate = (float) result/100;
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");
        if (!getDriver().findElement(By.xpath("(//span[contains(.,'£')])[2]")).isDisplayed() ) {
            results.set(0, "false");
            results.add("Total Rate for school isn't displayed");
        } else {
            if ((total_rate!=expected_total_rate )) {
                results.set(0, "false");
                results.add("Expected total rate for school: " + expected_total_rate + "; but found: " + total_rate + "\n");
            }
        }
        return results;
    }

    public ArrayList<String> teacherRateForSchoolIsRightCalculated() {
        teacher_rate = Serenity.getCurrentSession().getMetaData().get("Teacher_rate");
        float expected_total_rate = (float) (Integer.parseInt(teacher_rate)* 1.175 +17.5);
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");
        commonActions.waitUntilElementVisible("//p[contains(.,'" + Serenity.getCurrentSession().getMetaData().get("bookingShortID") + "')]/..//p[@class='rate']",60);
        if (!commonActions.isElementPresent("//p[contains(.,'" + Serenity.getCurrentSession().getMetaData().get("bookingShortID") + "')]/..//p[@class='rate']") ) {
            results.set(0, "false");
            results.add("teacher rate for school isn't displayed");
        } else {
            teacher_rate_for_school = Float.parseFloat(getDriver().findElement(By.xpath("//p[contains(.,'" + Serenity.getCurrentSession().getMetaData().get("bookingShortID") + "')]/..//p[@class='rate']")).getText().substring(1));
            if ((teacher_rate_for_school!=expected_total_rate )) {
                results.set(0, "false");
                results.add("Expected teacher rate for school : " + expected_total_rate + "; but found: " + teacher_rate_for_school + "\n");
            }
        }
        return results;
    }
}
