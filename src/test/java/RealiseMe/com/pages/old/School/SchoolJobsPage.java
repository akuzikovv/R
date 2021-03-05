package RealiseMe.com.pages.old.School;

import RealiseMe.com.xpath_locators.old.ILocators;
import RealiseMe.com.pages.old.CommonActions.CommonActions;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SchoolJobsPage extends PageObject {
    CommonActions commonActions;
    public String parentHandle;

    public ArrayList<String> jobsPageContainsAllNecessaryElements(List<String> list) {
        ArrayList<String> labels = new ArrayList<>();
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");
        waitABit(2000);
        if ($(ILocators.live_qty).getText().equals("(0)")) {
            if (!$(ILocators.live).isPresent() ||
                    !$(ILocators.archived).isPresent() ||
                    !$(ILocators.draft).isPresent() ||
                    !$(ILocators.JOB_TITLE).isPresent() ||
                    !$(ILocators.JOB_STATUS).isPresent()) {
                results.set(0, "false");
                results.add("Some Elements are absent or wrong1" + "\n");
            } else {
                labels.add($(ILocators.Jobs).getText().trim());
                labels.add($(ILocators.live).getText().trim().substring(0, 4));
                labels.add($(ILocators.archived).getText().trim().substring(0, 8));
                labels.add($(ILocators.draft).getText().trim().substring(0, 5));
                labels.add($(ILocators.JOB_TITLE).getText().trim());
                labels.add($(ILocators.JOB_STATUS).getText().trim());
                labels.add("view applicants");
                labels.add("move to archive");
                for (int i = 0; i < list.size(); i++) {
                    if (!list.get(i).equals(labels.get(i))) {
                        results.set(0, "false");
                        results.add("Expected: " + list.get(i) + "; but found: " + labels.get(i) + "\n");
                    }
                }
            }
        } else {
            if (!$(ILocators.Jobs).isPresent() ||
                    !$(ILocators.live).isPresent() ||
                    !$(ILocators.archived).isPresent() ||
                    !$(ILocators.draft).isPresent() ||
                    !$(ILocators.JOB_TITLE).isPresent() ||
                    !$(ILocators.JOB_STATUS).isPresent() ||
                    !$(ILocators.view_applicants1).isPresent() ||
                    !$(ILocators.move_to_archive).isPresent() ||
                    !$(ILocators.Posted_on).getText().contains("Posted on")
                    ) {
                results.set(0, "false");
                results.add("Some Elements are absent or wrong2" + "\n");
            } else {
                labels.add($(ILocators.Jobs).getText().trim());
                labels.add($(ILocators.live).getText().trim().substring(0, 4));
                labels.add($(ILocators.archived).getText().trim().substring(0, 8));
                labels.add($(ILocators.draft).getText().trim().substring(0, 5));
                labels.add($(ILocators.JOB_TITLE).getText().trim());
                labels.add($(ILocators.JOB_STATUS).getText().trim());
                labels.add($(ILocators.view_applicants1).getText().trim());
                labels.add($(ILocators.move_to_archive).getText().trim());
                for (int i = 0; i < list.size(); i++) {
                    if (!list.get(i).equals(labels.get(i))) {
                        results.set(0, "false");
                        results.add("Expected: " + list.get(i) + "; but found: " + labels.get(i) + "\n");
                    }
                }
            }
        }
        return results;
    }

    public void clickOnTheArchivedTab() {
        $(ILocators.archived).click();
    }

    public ArrayList<String> archivedTabIsOpenedWithAllNecessaryElements(List<String> list) {
        ArrayList<String> labels = new ArrayList<>();
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");
//        if($(ILocators.archived_qty).getText().equals("(0)")){
        try {
            if (!$(ILocators.Jobs).isPresent() ||
                    !$(ILocators.live).isPresent() ||
                    !$(ILocators.archived).isPresent() ||
                    !$(ILocators.draft).isPresent() ||
                    !$(ILocators.JOB_TITLE).isPresent() ||
                    !$(ILocators.view_applicants1).isPresent() ||
                    !$(ILocators.repost).isPresent() ||
                    !$(ILocators.Archived_on).getText().contains("Archived on")
                    ) {
                results.set(0, "false");
                results.add("Some Elements are absent or wrong" + "\n");
            } else {
                labels.add($(ILocators.Jobs).getText().trim());
                labels.add($(ILocators.live).getText().trim().substring(0, 4));
                labels.add($(ILocators.archived).getText().trim().substring(0, 8));
                labels.add($(ILocators.draft).getText().trim().substring(0, 5));
                labels.add($(ILocators.JOB_TITLE).getText().trim());
                labels.add($(ILocators.view_applicants1).getText().trim());
                labels.add($(ILocators.repost).getText().trim());
                for (int i = 0; i < list.size(); i++) {
                    if (!list.get(i).equals(labels.get(i))) {
                        results.set(0, "false");
                        results.add("Expected: " + list.get(i) + "; but found: " + labels.get(i) + "\n");
                    }
                }
            }
        } catch (Exception e) {
        }
        try {
            if (!$(ILocators.Jobs).isPresent() ||
                    !$(ILocators.live).isPresent() ||
                    !$(ILocators.archived).isPresent() ||
                    !$(ILocators.draft).isPresent() ||
                    !$(ILocators.JOB_TITLE).isPresent()
                    ) {
                results.set(0, "false");
                results.add("Some Elements are absent or wrong" + "\n");
            } else {
                labels.add($(ILocators.Jobs).getText().trim());
                labels.add($(ILocators.live).getText().trim().substring(0, 4));
                labels.add($(ILocators.archived).getText().trim().substring(0, 8));
                labels.add($(ILocators.draft).getText().trim().substring(0, 5));
                labels.add($(ILocators.JOB_TITLE).getText().trim());
                labels.add("view applicants");
                labels.add("repost");
                for (int i = 0; i < list.size(); i++) {
                    if (!list.get(i).equals(labels.get(i))) {
                        results.set(0, "false");
                        results.add("Expected: " + list.get(i) + "; but found: " + labels.get(i) + "\n");
                    }
                }
            }
        } catch (Exception e) {
        }
//        else{

        return results;

    }


    public ArrayList<String> draftTabIsOpenedWithAllNecessaryElements(List<String> list) {
        ArrayList<String> labels = new ArrayList<>();
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");
        if ($(ILocators.draft_qty).getText().equals("(0)")) {
            try {
                if (!$(ILocators.Jobs).isPresent() ||
                        !$(ILocators.live).isPresent() ||
                        !$(ILocators.archived).isPresent() ||
                        !$(ILocators.draft).isPresent() ||
                        !$(ILocators.JOB_TITLE).isPresent() ||
                        !$(ILocators.CREATED).isPresent()
                        ) {
                    results.set(0, "false");
                    results.add("Some Elements are absent or wrong" + "\n");
                } else {
                    labels.add($(ILocators.Jobs).getText().trim());
                    labels.add($(ILocators.live).getText().trim().substring(0, 4));
                    labels.add($(ILocators.archived).getText().trim().substring(0, 8));
                    labels.add($(ILocators.draft).getText().trim().substring(0, 5));
                    labels.add($(ILocators.JOB_TITLE).getText().trim());
                    labels.add($(ILocators.CREATED).getText().trim());
//                labels.add("edit and post");
                    for (int i = 0; i < list.size(); i++) {
                        if (!list.get(i).equals(labels.get(i))) {
                            results.set(0, "false");
                            results.add("Expected: " + list.get(i) + "; but found: " + labels.get(i) + "\n");
                        }
                    }
                }
            } catch (Exception e) {}
        } else {
            try {
                if (!$(ILocators.Jobs).isPresent() ||
                        !$(ILocators.live).isPresent() ||
                        !$(ILocators.archived).isPresent() ||
                        !$(ILocators.draft).isPresent() ||
                        !$(ILocators.JOB_TITLE).isPresent() ||
                        !$(ILocators.CREATED).isPresent() ||
                        !$(ILocators.edit_and_post).isPresent() ||
                        !$(ILocators.Last_saved_on).isPresent()
                        ) {
                    results.set(0, "false");
                    results.add("Some Elements are absent or wrong" + "\n");
                } else {
                    labels.add($(ILocators.Jobs).getText().trim());
                    labels.add($(ILocators.live).getText().trim().substring(0, 4));
                    labels.add($(ILocators.archived).getText().trim().substring(0, 8));
                    labels.add($(ILocators.draft).getText().trim().substring(0, 5));
                    labels.add($(ILocators.JOB_TITLE).getText().trim());
                    labels.add($(ILocators.CREATED).getText().trim());
                    labels.add($(ILocators.edit_and_post).getText().trim());
                    for (int i = 0; i < list.size(); i++) {
                        if (!list.get(i).equals(labels.get(i))) {
                            results.set(0, "false");
                            results.add("Expected: " + list.get(i) + "; but found: " + labels.get(i) + "\n");
                        }
                    }
                }
            } catch (Exception e) {
            }
        }

        return results;
    }


    public ArrayList<String> postJobPageContainsAllNecessaryElements(List<String> list) {
        ArrayList<String> labels = new ArrayList<>();
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");
        if (!$(ILocators.Post_a_Job).isPresent() ||
                !$(ILocators.draftDropdown).isPresent() ||
                !$(ILocators.choose_from_draft).isPresent()
                ) {
            results.set(0, "false");
            results.add("Some Elements are absent or wrong" + "\n");
        } else {
            labels.add($(ILocators.Post_a_Job).getText().trim());
            labels.add($(ILocators.choose_from_draft).getText().trim());
            labels.add($(ILocators.job_details).getText().trim());
            labels.add($(ILocators.jobName).getText().trim());
//            labels.add($(ILocators.example_name_text).getText().trim());
            labels.add($(ILocators.jobDescription).getText().trim());
            labels.add($(ILocators.upload_text).getText().trim());

            labels.add($(ILocators.note_upload_text).getText().trim());
            labels.add($(ILocators.salary_text).getText().trim());
            labels.add($(ILocators.Contract_term).getText().trim());
            labels.add($(ILocators.Flexi_Job_share).getText().trim());
            labels.add($(ILocators.Permanent).getText().trim());
            labels.add($(ILocators.Contract_type).getText().trim());
            labels.add($(ILocators.Part_time).getText().trim());

            labels.add($(ILocators.Full_time).getText().trim());
            labels.add($(ILocators.Closing_date).getText().trim());
//            labels.add($(ILocators.date_format).getText().trim());
            labels.add($(ILocators.Enter_skills_needed).getText().trim());
            labels.add($(ILocators.Additional_Details).getText().trim());
            labels.add($(ILocators.Video_prescreening_questions).getText().trim());
            labels.add($(ILocators.I_want_to_request).getText().trim());

            labels.add($(ILocators.Video_interview).getText().trim());
            labels.add($(ILocators.interview_checkbox_text).getText().trim());
            labels.add($(ILocators.Please_contact_us).getText().trim());
            labels.add($(ILocators.Anonymisation).getText().trim());
            labels.add($(ILocators.anonimisation_text).getText().trim());
            labels.add($(ILocators.Boost_your_job_s_visibility_by_enhancing_your_advert).getText().trim());
            labels.add($(ILocators.SASAD).getText().trim());

            labels.add($(ILocators.SAAID).getText().trim());
            labels.add($(ILocators.SA).getText().trim());
//            labels.add($(ILocators.Invite_a_coworker).getText().trim());
//            labels.add($(ILocators.add_coworkers_as_an_admin).getText().trim());
            labels.add($(ILocators.post_job_button).getText().trim());
            labels.add($(ILocators.save_draft_button).getText().trim());
            for (int i = 0; i < list.size(); i++) {
                if (!list.get(i).equals(labels.get(i))) {
                    results.set(0, "false");
                    results.add("Expected: " + list.get(i) + "; but found: " + labels.get(i) + "\n");
                }
            }
        }
        return results;
    }

    public void clickOnThePostJobButton() {
        $(ILocators.post_job_button).click();
        waitABit(8000);
    }

    public ArrayList<String> warningMessagesAreAppeared(List<String> list) {
        ArrayList<String> labels = new ArrayList<>();
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");
//        waitFor(String.valueOf($(ILocators.warning_contactTerm).isVisible()));
        labels.add($(ILocators.warning_name).getText().trim());
        labels.add($(ILocators.warning_description).getText());
        labels.add($(ILocators.warning_salary).getText());
        labels.add($(ILocators.warning_contactTerm).getText());
        labels.add($(ILocators.warning_contactType).getText());
        labels.add($(ILocators.warning_closingDate).getText());
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).equals(labels.get(i))) {
                results.set(0, "false");
                results.add("Expected: " + list.get(i) + "; but found: " + labels.get(i) + "\n");
            }
        }
        return results;
    }

    public void fillAllNecessaryFields(List<String> list) {
        int random = (int) (Math.random() * 800 + 111);
        getDriver().findElement(By.xpath("//input[@name='jobname']")).sendKeys(list.get(0)+random);
        Serenity.getCurrentSession().addMetaData("job name",list.get(0)+random);
        System.out.println( Serenity.getCurrentSession().getMetaData().get("job name"));
        getDriver().findElement(By.xpath("//textarea[@name='jobdescription']")).sendKeys(list.get(1));
        Serenity.getCurrentSession().addMetaData("job description",list.get(1));
        getDriver().findElement(By.xpath("//input[@name='jobsalary']")).sendKeys(list.get(2));
        Serenity.getCurrentSession().addMetaData("Salary",list.get(2));
    }

    public void enterTheClosingDate(String arg0) {
        Serenity.getCurrentSession().addMetaData("Closed date",arg0.substring(3,5));
//        try {
//            getDriver().findElement(By.xpath("//input[@placeholder='MM/DD/YYYY']")).sendKeys(arg0);
//        }catch (Exception e){}
//        try {
            getDriver().findElement(By.xpath("//input[@placeholder='DD/MM/YYYY']")).sendKeys(arg0);
//        }catch (Exception e){}

    }

    public ArrayList<String> currentPostedDateIsDisplayed() {
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");
        if (!getDriver().findElement(By.xpath("//p[@class='posted']")).isDisplayed() ) {
            results.set(0, "false");
            results.add("Submission date isn't displayed");
        } else {
            if ((!commonActions.getDate().equals(getDriver().findElement(By.xpath("//p[@class='posted']")).getText().substring(13 )))) {
                results.set(0, "false");
                results.add("Expected: " + commonActions.getDate() + "; but found: " + getDriver().findElement(By.xpath("//p[@class='posted']")).getText().substring(12) + "\n");
            }
        }
        return results;
    }

    public void chooseSkills(List<String> list) {
        getDriver().findElement(By.xpath("//label[contains(.,'Type to add a new skill')]/..")).click();
//        for (int i = 0;i<list.size();i++) {
//            getDriver().findElement(By.xpath("(//div[@class='input-group__selections'])[2]")).sendKeys(list.get(i)+Keys.ENTER);
//        }
        //скролл из существующего списка
        waitABit(2000);
        JavascriptExecutor je = (JavascriptExecutor) getDriver();
        je.executeScript("arguments[0].scrollIntoView();",getDriver().findElement(By.xpath("//div[@class='list']//div")));
        for (int i = 0;i<list.size();i++){
            if (!commonActions.isElementPresent("//a//div[contains(.,'"+list.get(i)+"')]") || !getDriver().findElement(By.xpath("//a//div[contains(.,'"+list.get(i)+"')]")).isDisplayed()){
                 do {je.executeScript("arguments[0].scrollIntoView(true);",getDriver().findElement(By.xpath("//a//div[contains(.,'"+list.get(i)+"')]")));
                 } while (!commonActions.isElementPresent("//a//div[contains(.,'"+list.get(i)+"')]"));
//                je.executeScript("javascript:window.scrollBy(250,350)",getDriver().findElement(By.xpath("//div[@class='list']//div[@class='list__tile__content' and contains(.,'"+list.get(i)+"')]")));
            }
            getDriver().findElement(By.xpath("//a//div[contains(.,'"+list.get(i)+"')]")).click();
            Serenity.getCurrentSession().addMetaData("skill",list.get(i));
        }
    }

    public ArrayList<String> chosenSkillsAreDisplayed() {
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");
        if (!getDriver().findElement(By.xpath("//p[contains(.,'"+Serenity.getCurrentSession().getMetaData().get("skill")+"')]")).isDisplayed() ) {
            results.set(0, "false");
            results.add("Skill isn't displayed");
        } else {
            if ((!Serenity.getCurrentSession().getMetaData().get("skill").equals(getDriver().findElement(By.xpath("//p[contains(.,'"+Serenity.getCurrentSession().getMetaData().get("skill")+"')]")).getText()))) {
                results.set(0, "false");
                results.add("Expected: " + Serenity.getCurrentSession().getMetaData().get("skill") + "; but found: " + getDriver().findElement(By.xpath("//p[contains(.,'"+Serenity.getCurrentSession().getMetaData().get("skill")+"')]")).getText().trim() + "\n");
            }
        }
        return results;
    }


    public void clickOnTheButtonAtTheAppropriateJobTitle(String arg0) {
        if ((!commonActions.isElementPresent("//span[contains(.,'"+Serenity.getCurrentSession().getMetaData().get("job name")+"')]//../../..//span[contains(.,'"+arg0+"')]")) &
                commonActions.isElementPresent("//span[contains(text(),'Next')]")) {
            getDriver().findElement(By.xpath("//span[contains(text(),'Next')]")).click();
            clickOnTheButtonAtTheAppropriateJobTitle(arg0);
        }
        if (commonActions.isElementPresent("//span[contains(.,'"+Serenity.getCurrentSession().getMetaData().get("job name")+"')]//../../..//span[contains(.,'"+arg0+"')]")) {
                getDriver().findElement(By.xpath("//span[contains(.,'"+Serenity.getCurrentSession().getMetaData().get("job name")+"')]//../../..//span[contains(.,'"+arg0+"')]")).click();
        }
    }

    public ArrayList<String> theCurrentReceivedDateIsDisplayed() {
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");
        String date;
        if (!getDriver().findElement(By.xpath("(//span[@class='received__header'])[1]")).isDisplayed() ) {
            results.set(0, "false");
            results.add("Received date isn't displayed");
        } else {
            if (commonActions.getDate().substring(0,1).equals("0")){
                date = commonActions.getDate().substring(1,2);
            }
            else date = commonActions.getDate().substring(0,2);
            if ((!date.equals(getDriver().findElement(By.xpath("(//span[@class='received__header'])[1]")).getText().substring(0,1)))&
                    (!date.equals(getDriver().findElement(By.xpath("(//span[@class='received__header'])[1]")).getText().substring(0,2)))) {
                results.set(0, "false");
                results.add("Expected: " + date + "; but found: " + getDriver().findElement(By.xpath("(//span[@class='received__header'])[1]")).getText().substring(0,1) + "\n");
            }
        }
        return results;
    }

    public void openProfileDetailsPopupOfTheFirstApplicant() {
        commonActions.waitUntilElementVisible("(//button[@class='applicant'])[1]",60);
        getDriver().findElement(By.xpath("(//button[@class='applicant'])[1]")).click();
    }

    public void clickOnTheLinkAtTheVideoPrescreeningQuestionsField() {
        parentHandle = getDriver().getWindowHandle();
        getDriver().findElement(By.xpath("//div[@class='hidden-content__wrap']//span[contains(.,'Video Prescreening Questions')]/..//p//a")).click();
        ((JavascriptExecutor) getDriver()).executeScript("window.open('about:blank','_blank');");
        String subWindowHandler = null;
        Set<String> handles = getDriver().getWindowHandles();
        Iterator<String> iterator = handles.iterator();
        while (iterator.hasNext()) {
            subWindowHandler = iterator.next();
        }
        getDriver().switchTo().window(subWindowHandler);
        waitABit(5000);
//        getDriver().switchTo().window(parentHandle);
    }

    public void addToTheJobNameField(String arg0) {
        commonActions.waitUntilElementVisible("//input[@name='jobname']",60);
        getDriver().findElement(By.xpath("//input[@name='jobname']")).click();
        getDriver().findElement(By.xpath("//input[@name='jobname']")).sendKeys(" "+arg0);
        Serenity.getCurrentSession().addMetaData("edited job title",  Serenity.getCurrentSession().getMetaData().get("job name")+" "+arg0);

    }

    public void jobTitleIsRightDisplayed() {

    }

    public ArrayList<String> chosenClosedDateIsDisplayed() {
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");
//        getDriver().findElement(By.xpath("//p[@class='apply-by' and contains(.,'"+Serenity.getCurrentSession().getMetaData().get("Closed date")+"')]")).isDisplayed());

        if (!commonActions.isElementPresent("//p[@class='apply-by' and contains(.,'"+Serenity.getCurrentSession().getMetaData().get("Closed date")+"')]") &
                !getDriver().findElement(By.xpath("//p[@class='apply-by' and contains(.,'Dec')]")).isDisplayed() ) {
            results.set(0, "false");
            results.add("Skill isn't displayed");
        } else {
            if ((!"Dec".equals(getDriver().findElement(By.xpath("//p[@class='apply-by']")).getText().substring(20,24)))) {
                results.set(0, "false");
                results.add("Expected: " + "Dec" + "; but found: " + getDriver().findElement(By.xpath("//p[@class='apply-by']")).getText().substring(20,24) + "\n");
            }
        }
        return results;
    }
}
