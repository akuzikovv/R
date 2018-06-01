package RealiseMe.com.pages.School;

import RealiseMe.com.ILocators;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class SchoolJobsPage extends PageObject {

    public void clickOnTheButtonInTheHeader(String arg0) {
        if ($(ILocators.jobs).getText().equals(arg0)){
            $(ILocators.jobs).click();
        }
    }

    public ArrayList<String> jobsPageContainsAllNecessaryElements(List<String> list) {
        ArrayList<String> labels = new ArrayList<>();
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");
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
            results.add("Some Elements are absent or wrong" + "\n");
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
            labels.add($(ILocators.live).getText().trim().substring(0,4));
            labels.add($(ILocators.archived).getText().trim().substring(0,8));
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
        }
        return results;

    }

    public void clickOnTheDraftTab() {
        $(ILocators.draft).click();
    }

    public ArrayList<String> draftTabIsOpenedWithAllNecessaryElements(List<String> list) {
        ArrayList<String> labels = new ArrayList<>();
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");
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
            labels.add($(ILocators.live).getText().trim().substring(0,4));
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
        }
        return results;
    }

    public void clickOnThePostNewJobButton(String arg0) {
        if ($(ILocators.POST_A_NEW_JOB).getText().equals(arg0)){
            $(ILocators.POST_A_NEW_JOB).click();
        }
    }

    public ArrayList<String> postJobPageContainsAllNecessaryElements(String arg0, List<String> list) {
        ArrayList<String> labels = new ArrayList<>();
        ArrayList<String> results = new ArrayList<>();
        results.add(0, "true");
        if (!$(ILocators.Post_a_Job).getText().equals(arg0)||
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
            labels.add($(ILocators.live).getText().trim().substring(0,4));
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
        }
        return results;
    }
}
