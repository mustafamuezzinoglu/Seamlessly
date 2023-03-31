package net.seamlessly.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import net.seamlessly.pages.TasksPage;
import net.seamlessly.utility.BrowserUtility;
import static org.junit.Assert.*;
import org.openqa.selenium.Keys;

public class TasksStepDefs {
    TasksPage tasksPage = new TasksPage();

    @When("user navigates to {string} module")
    public void user_navigates_to_module(String moduleName) {
        BrowserUtility.sleep(4);
        tasksPage.navigateToModule(moduleName);
        BrowserUtility.sleep(4);
    }


    @When("user clicks Add List…")
    public void userClicksAddList() {
        tasksPage.addList.click();
    }

    @And("user writes the list name {string} and presses ENTER key")
    public void userWritesTheListNameAndPressesENTERKey(String listName) {
        tasksPage.newListInput.sendKeys(listName + Keys.ENTER);
        BrowserUtility.sleep(3);
    }

    @And("verify that user sees this name inside the list name list")
    public void verifyThatUserSeesThisNameInsideTheListNameList() {
        assertEquals(tasksPage.TestList.getText(), "Test List");
        BrowserUtility.sleep(3);
        tasksPage.deleteTestList();
    }


    @And("user writes the list name {string}")
    public void userWritesTheListName(String listName) {
        tasksPage.newListInput.sendKeys(listName);
    }

    @And("user clicks Save button")
    public void userClicksSaveButton() {
        BrowserUtility.sleep(1);
        tasksPage.saveButton.click();
    }
}
