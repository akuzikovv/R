package RealiseMe.com.pages.Teacher;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

import java.util.ArrayList;

public class TeacherTimesheetsPage extends PageObject {
    private String teacher_rate;
    private float total_rate;
    private float submitted_days_full_days;
    private float submitted_days_half_days;
    private String short_bookingId;
    private String current_date;

    public ArrayList<String> appropriateBookingIdIsDisplayed() {
        waitABit(1000);
        short_bookingId = getDriver().findElement(By.xpath("//p[@class='id']")).getText().substring(12);
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");
        if (!getDriver().findElement(By.xpath("//p[@class='id']")).isDisplayed() ) {
            results.set(0, "false");
            results.add("Booking id isn't displayed");
        } else {
                if ((!short_bookingId.equals(Serenity.getCurrentSession().getMetaData().get("bookingShortID")))) {
                    results.set(0, "false");
                    results.add("Expected: " + Serenity.getCurrentSession().getMetaData().get("bookingShortID")+ "; but found: " + short_bookingId + "\n");
                }
            }
        return results;
    }

    public ArrayList<String> theRateIsDisplayedAtTheTimesheetPage(String arg0) {
         teacher_rate = getDriver().findElement(By.xpath("//p[@class='rate']")).getText().substring(7);
        Serenity.getCurrentSession().addMetaData("Teacher_rate",teacher_rate);
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");
        if (!getDriver().findElement(By.xpath("//p[@class='rate']")).isDisplayed() ) {
            results.set(0, "false");
            results.add("Rate isn't displayed");
        } else {
            if ((!teacher_rate.equals(arg0))) {
                results.set(0, "false");
                results.add("Expected: " + arg0+ "; but found: " + teacher_rate + "\n");
            }
        }
        return results;
    }

    public ArrayList<String> totalRateIsRightCalculated() {
         total_rate = Float.parseFloat(getDriver().findElement(By.xpath("(//p[@class='total'])[2]")).getText().substring(1));
         submitted_days_full_days = Integer.parseInt(getDriver().findElement(By.xpath("(//p[@class='days'])[2]")).getText().substring(0,1));
         submitted_days_half_days = Float.parseFloat(getDriver().findElement(By.xpath("(//p[@class='days'])[2]")).getText().substring(2,3));
         if (submitted_days_half_days==5){
             submitted_days_half_days = (float) (1*0.67);
         }
         float expected_total_rate = (submitted_days_full_days+submitted_days_half_days)*Integer.parseInt(teacher_rate);
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");
        if (!getDriver().findElement(By.xpath("//p[@class='total']")).isDisplayed() ) {
            results.set(0, "false");
            results.add("Total Rate isn't displayed");
        } else {
            if ((total_rate!=expected_total_rate )) {
                results.set(0, "false");
                results.add("Expected total rate: " + expected_total_rate + "; but found: " + total_rate + "\n");
            }
        }
        return results;
    }

    public void acceptTimesheet() {
        getDriver().findElement(By.xpath("//span[@class='timesheet-icon']")).click();
    }

    public String getDate(){
        String date = java.time.LocalDate.now().toString().substring(8,10);
        String month = java.time.LocalDate.now().toString().substring(5,7);
        String year = java.time.LocalDate.now().toString().substring(2,4);
         current_date = date +"/"+month+"/"+year;
        return current_date;
    }

    public ArrayList<String> currentSubmissionDateIsAppeared() {
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");
        if (!getDriver().findElement(By.xpath("//p[@class='submission-date']//span")).isDisplayed() ) {
            results.set(0, "false");
            results.add("Submission date isn't displayed");
        } else {
            if ((!getDate().equals(getDriver().findElement(By.xpath("//p[@class='submission-date']//span")).getText()))) {
                results.set(0, "false");
                results.add("Expected: " + getDate() + "; but found: " + getDriver().findElement(By.xpath("//p[@class='submission-date']//span")).getText() + "\n");
            }
        }
        return results;
    }
}
