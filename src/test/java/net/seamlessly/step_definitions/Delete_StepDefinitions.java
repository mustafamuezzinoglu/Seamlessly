package net.seamlessly.step_definitions;

import io.cucumber.java.en.*;
import net.seamlessly.pages.DeletePage;
import net.seamlessly.utility.BrowserUtility;
import net.seamlessly.utility.Driver;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.Collections;

public class Delete_StepDefinitions {
    DeletePage DeletePage = new DeletePage();

    @And("user navigates to All_files page")
    public void userNavigatesToAll_DeletePage() {
        DeletePage.navigateToModule("Files");

    }

    @When("user creates and deletes {string} and {string} files")
    public void user_creates_and_deletes_and_files(String string1, String string2) {
        DeletePage.prepareTheWebPage(string1,string2);
    }

    @When("user switches to Deleted_Files tab")
    public void user_switches_to_deleted_files_tab() {
        DeletePage.Deleted_Files_Tab.click();

    }

    @When("user sorts deleted files by newest to oldest")
    public void user_sorts_deleted_files_by_newest_to_oldest() {
        DeletePage.SortbyName.isDisplayed();
    }

    @Then("verify that user can see the last deleted {string} file in the first line of the deleted file list")
    public void verify_that_user_can_see_the_last_deleted_file_in_the_first_line_of_the_deleted_file_list(String string) {
        Assert.assertEquals(string + ".md", DeletePage.FirstElementOfTheDeletedItem.getAttribute("data-path"));
    }

    @Then("verify that user is able to order all the deleted files {string} and {string} by newest to oldest or visa versa")
    public void verifyThatUserIsAbleToOrderAllTheDeletedFilesAndByNewestToOldestOrVisaVersa(String string1, String string2) {
            DeletePage.SortbyDateAsc.click();
            Assert.assertEquals("No Match", string1 + ".md", DeletePage.FirstElementOnTheDeletedItemTable.getAttribute("data-path"));
            DeletePage.SortbyDateDes.click();
            Assert.assertEquals("No Match", string2 + ".md", DeletePage.FirstElementOnTheDeletedItemTable.getAttribute("data-path"));
        }

    @When("user sorts deleted files based on their names")
    public void user_sorts_deleted_files_based_on_their_names() {
        BrowserUtility.waitForVisibility(DeletePage.SortbyName, 10);
        BrowserUtility.clickWithJS(DeletePage.SortbyName);
    }

    @Then("verify that user is able to view all the deleted files {string} and {string} based on the names sorted alphabetically")
    public void verifyThatUserIsAbleToViewAllTheDeletedFilesAndBasedOnTheNamesSortedAlphabetically(String string1, String string2) {
        ArrayList<String> arrlist = DeletePage.viewDeletedAlpha(string1, string2);
        Assert.assertEquals("No Match", arrlist.get(1) + ".md", DeletePage.FirstElementOnTheDeletedItemTable.getAttribute("data-path"));
    }

    @And("User clicks to the three dots button next to the {string} file")
    public void userClicksToTheThreeDotsButtonNextToTheFile(String string) {
        DeletePage.userSelectsAFileOnTheDeletedItemsTable(string);
    }

    @Then("Verify that user is able to delete {string} file permanently")
    public void verifyThatUserIsAbleToDeleteFilePermanently(String string) {
        Assert.assertTrue(DeletePage.userDeletesTheSelectedFile(string));
    }

    @And("User can restore the {string} file")
    public void userCanRestoreTheFile(String string) {
        DeletePage.userRestoresTheSelectedFile(string);
    }
    @Then("Verify that user is able to restore the deleted {string} file and see it again under the All files tab")
    public void verifyThatUserIsAbleToRestoreTheDeletedFileAndSeeItAgainUnderTheAllFilesTab(String string) {
        Assert.assertTrue(DeletePage.TheSelectedFileIsRestored(string));
        DeletePage.cleanup(string);
    }



}

