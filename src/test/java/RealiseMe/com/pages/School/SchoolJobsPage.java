package RealiseMe.com.pages.School;

import RealiseMe.com.ILocators;
import net.serenitybdd.core.pages.PageObject;

import java.util.ArrayList;
import java.util.List;

public class SchoolJobsPage extends PageObject {

    public void clickOnTheButtonInTheHeader(String arg0) {
//        waitFor($(ILocators.jobs).waitUntilEnabled());
        waitABit(5000);
        if ($(ILocators.jobs).getText().equals(arg0)){
            $(ILocators.jobs).click();
        }
    }

    public ArrayList<String> jobsPageContainsAllNecessaryElements(List<String> list) {
        ArrayList<String> labels = new ArrayList<>();
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");
        waitABit(2000);
        if($(ILocators.live_qty).getText().equals("(0)")){
            if (!$(ILocators.live).isPresent()||
                    !$(ILocators.archived).isPresent()||
                    !$(ILocators.draft).isPresent()||
                    !$(ILocators.JOB_TITLE).isPresent()||
                    !$(ILocators.JOB_STATUS).isPresent()){
                results.set(0, "false");
                results.add("Some Elements are absent or wrong1" + "\n");
            }
            else {
                labels.add($(ILocators.Jobs).getText().trim());
                labels.add($(ILocators.live).getText().trim().substring(0,4));
                labels.add($(ILocators.archived).getText().trim().substring(0,8));
                labels.add($(ILocators.draft).getText().trim().substring(0,5));
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
        }else{
        if (!$(ILocators.Jobs).isPresent()||
                !$(ILocators.live).isPresent()||
                !$(ILocators.archived).isPresent()||
                !$(ILocators.draft).isPresent()||
                !$(ILocators.JOB_TITLE).isPresent()||
                !$(ILocators.JOB_STATUS).isPresent()||
                !$(ILocators.view_applicants1).isPresent()||
                !$(ILocators.move_to_archive).isPresent()||
                !$(ILocators.Posted_on).getText().contains("Posted on")
                ) {
            results.set(0, "false");
            results.add("Some Elements are absent or wrong2" + "\n");
        } else {
            labels.add($(ILocators.Jobs).getText().trim());
            labels.add($(ILocators.live).getText().trim().substring(0,4));
            labels.add($(ILocators.archived).getText().trim().substring(0,8));
            labels.add($(ILocators.draft).getText().trim().substring(0,5));
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
            }}
        return results;
    }

    public void clickOnTheArchivedTab() {
        $(ILocators.archived).click();
    }

    public ArrayList<String> archivedTabIsOpenedWithAllNecessaryElements(List<String> list) {
        ArrayList<String> labels = new ArrayList<>();
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");
        if($(ILocators.archived_qty).getText().equals("(0)")){
            if (!$(ILocators.Jobs).isPresent()||
                    !$(ILocators.live).isPresent()||
                    !$(ILocators.archived).isPresent()||
                    !$(ILocators.draft).isPresent()||
                    !$(ILocators.JOB_TITLE).isPresent()
                    ) {
                results.set(0, "false");
                results.add("Some Elements are absent or wrong" + "\n");
            } else {
                labels.add($(ILocators.Jobs).getText().trim());
//                labels.add($(ILocators.live).getText().trim().substring(0, 4));
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
        }else{
        if (!$(ILocators.Jobs).isPresent()||
                !$(ILocators.live).isPresent()||
                !$(ILocators.archived).isPresent()||
                !$(ILocators.draft).isPresent()||
                !$(ILocators.JOB_TITLE).isPresent()||
                !$(ILocators.view_applicants1).isPresent()||
                !$(ILocators.repost).isPresent()||
                !$(ILocators.Archived_on).getText().contains("Archived on")
                ) {
            results.set(0, "false");
            results.add("Some Elements are absent or wrong" + "\n");
        } else {
            labels.add($(ILocators.Jobs).getText().trim());
//            labels.add($(ILocators.live).getText().trim().substring(0,4));
            labels.add($(ILocators.archived).getText().trim().substring(0, 8));
            labels.add($(ILocators.draft).getText().trim().substring(0,5));
            labels.add($(ILocators.JOB_TITLE).getText().trim());
            labels.add($(ILocators.view_applicants1).getText().trim());
            labels.add($(ILocators.repost).getText().trim());
            for (int i = 0; i < list.size(); i++) {
                if (!list.get(i).equals(labels.get(i))) {
                    results.set(0, "false");
                    results.add("Expected: " + list.get(i) + "; but found: " + labels.get(i) + "\n");
                }
            }
        }}
        return results;

    }

    public void clickOnTheDraftTab() {
        $(ILocators.draft).click();
    }

    public ArrayList<String> draftTabIsOpenedWithAllNecessaryElements(List<String> list) {
        ArrayList<String> labels = new ArrayList<>();
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");
        if($(ILocators.draft_qty).getText().equals("(0)")){
            if (!$(ILocators.Jobs).isPresent()||
                    !$(ILocators.live).isPresent()||
                    !$(ILocators.archived).isPresent()||
                    !$(ILocators.draft).isPresent()||
                    !$(ILocators.JOB_TITLE).isPresent()||
                    !$(ILocators.CREATED).isPresent()
                    ) {
                results.set(0, "false");
                results.add("Some Elements are absent or wrong" + "\n");
            } else {
                labels.add($(ILocators.Jobs).getText().trim());
//                labels.add($(ILocators.live).getText().trim().substring(0, 4));
                labels.add($(ILocators.archived).getText().trim().substring(0, 8));
                labels.add($(ILocators.draft).getText().trim().substring(0, 5));
                labels.add($(ILocators.JOB_TITLE).getText().trim());
                labels.add($(ILocators.CREATED).getText().trim());
                labels.add("edit and post");
                for (int i = 0; i < list.size(); i++) {
                    if (!list.get(i).equals(labels.get(i))) {
                        results.set(0, "false");
                        results.add("Expected: " + list.get(i) + "; but found: " + labels.get(i) + "\n");
                    }
                }
            }
        }else {
        if (!$(ILocators.Jobs).isPresent()||
                !$(ILocators.live).isPresent()||
                !$(ILocators.archived).isPresent()||
                !$(ILocators.draft).isPresent()||
                !$(ILocators.JOB_TITLE).isPresent()||
                !$(ILocators.CREATED).isPresent()||
                !$(ILocators.edit_and_post).isPresent()||
                !$(ILocators.Last_saved_on).getText().contains("Last saved on")
                ) {
            results.set(0, "false");
            results.add("Some Elements are absent or wrong" + "\n");
        } else {
            labels.add($(ILocators.Jobs).getText().trim());
//            labels.add($(ILocators.live).getText().trim().substring(0,4));
            labels.add($(ILocators.archived).getText().trim().substring(0,8));
            labels.add($(ILocators.draft).getText().trim().substring(0,5));
            labels.add($(ILocators.JOB_TITLE).getText().trim());
            labels.add($(ILocators.CREATED).getText().trim());
            labels.add($(ILocators.edit_and_post).getText().trim());
            for (int i = 0; i < list.size(); i++) {
                if (!list.get(i).equals(labels.get(i))) {
                    results.set(0, "false");
                    results.add("Expected: " + list.get(i) + "; but found: " + labels.get(i) + "\n");
                }
            }
        }}
        return results;
    }

    public void clickOnThePostNewJobButton(String arg0) {
        waitABit(1000);
        if ($(ILocators.POST_A_NEW_JOB).getText().equals(arg0)){
            $(ILocators.POST_A_NEW_JOB).click();
        }
    }

    public ArrayList<String> postJobPageContainsAllNecessaryElements( List<String> list) {
        ArrayList<String> labels = new ArrayList<>();
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");
        if (!$(ILocators.Post_a_Job).isPresent()||
                !$(ILocators.draftDropdown).isPresent()||
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
            labels.add($(ILocators.warning_description).getText().trim().substring(0,4));
            labels.add($(ILocators.warning_salary).getText().trim().substring(0,8));
            labels.add($(ILocators.warning_contactTerm).getText().trim().substring(0,5));
            labels.add($(ILocators.warning_contactType).getText().trim());
            labels.add($(ILocators.warning_closingDate).getText().trim());
            for (int i = 0; i < list.size(); i++) {
                if (!list.get(i).equals(labels.get(i))) {
                    results.set(0, "false");
                    results.add("Expected: " + list.get(i) + "; but found: " + labels.get(i) + "\n");
                }
            }
        return results;
    }
}
