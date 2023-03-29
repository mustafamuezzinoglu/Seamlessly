package net.seamlessly.step_definitions;

import io.cucumber.java.en.*;
import net.seamlessly.pages.FilesPage;
import net.seamlessly.pages.LoginPage;
import net.seamlessly.utility.BrowserUtility;
import org.junit.Assert;

public class Delete_StepDefinitions {
    FilesPage FilesPage = new FilesPage();
    LoginPage LoginPage = new LoginPage();


    @And("user navigates to All_files page")
    public void userNavigatesToAll_filesPage() {
        BrowserUtility.waitForVisibility(FilesPage.All_Files, 10);
        FilesPage.All_Files.click();
    }

    @When("user creates and deletes {string} and {string} files")
    public void user_creates_and_deletes_and_files(String string1, String string2) {
/*
        Actions actions = new Actions(Driver.getDriver());


        BrowserUtility.waitForVisibility(FilesPage.AddFile, 10);
        FilesPage.AddFile.click();
        BrowserUtility.waitForVisibility(FilesPage.AddNewTextFile, 10);
        FilesPage.AddNewTextFile.click();
        FilesPage.NewTextFileTextBox.sendKeys(string1);
        FilesPage.CreateNewTextFile.click();
        BrowserUtility.waitForVisibility(FilesPage.CloseTextFileEditBox, 10);
        FilesPage.CloseTextFileEditBox.click();
        FilesPage.AddFile.click();
        BrowserUtility.waitForVisibility(FilesPage.AddNewTextFile, 10);
        FilesPage.AddNewTextFile.click();
        FilesPage.NewTextFileTextBox.sendKeys(string2);
        FilesPage.CreateNewTextFile.click();
        BrowserUtility.waitForVisibility(FilesPage.CloseTextFileEditBox, 10);
        FilesPage.CloseTextFileEditBox.click();
        BrowserUtility.waitForClickable(FilesPage.NewTextDelete2File, 10);
        actions.moveToElement(FilesPage.NewTextDelete1File);
        actions.contextClick(FilesPage.NewTextDelete1File).build().perform();
        //  actions.contextClick(FilesPage.NewTextDelete1File).build().perform();
        FilesPage.DeleteWithRightClick.click();
        BrowserUtility.waitForClickable(FilesPage.NewTextDelete2File, 10);
        actions.moveToElement(FilesPage.NewTextDelete2File);
        actions.contextClick(FilesPage.NewTextDelete2File).build().perform();
        FilesPage.DeleteWithRightClick.click();
*/

    }

    @When("user switches to Deleted_Files tab")
    public void user_switches_to_deleted_files_tab() {
        BrowserUtility.waitForClickable(FilesPage.Deleted_Files_Tab,10);
        FilesPage.Deleted_Files_Tab.click();

    }

    @When("user sorts deleted files by newest to oldest")
    public void user_sorts_deleted_files_by_newest_to_oldest() {
     //   if (!FilesPage.SortbyDateAsc.isDisplayed()) FilesPage.SortbyDateDes.click();
    }

    @Then("verify that user can see the last deleted {string} file in the first line of the deleted file list")
    public void verify_that_user_can_see_the_last_deleted_file_in_the_first_line_of_the_deleted_file_list(String string) {
        Assert.assertEquals("No match","New Text Delete 2.md",
                FilesPage.FirstElementOfTheDeletedItems.getAttribute("title"));

    }


}
