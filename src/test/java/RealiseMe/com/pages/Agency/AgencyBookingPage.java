package RealiseMe.com.pages.Agency;

import RealiseMe.com.ILocators;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

import java.util.List;

public class AgencyBookingPage extends PageObject {


    public void fillRequiredFields(List<String> list) {
        $(ILocators.Supply_staff_name).type(list.get(0));
        $(ILocators.Gross_Daily_Charge).type(list.get(1));
        $(ILocators.Subject).type(list.get(2));
    }

    public void choosePolicyCheckbox() {
        getDriver().findElement(By.xpath("(//div[@class='input-group--selection-controls__ripple'])[2]")).click();
    }
}
