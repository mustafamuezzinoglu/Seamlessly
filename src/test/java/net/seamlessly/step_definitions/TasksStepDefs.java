package net.seamlessly.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
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

    @And("user writes the task name {string} and presses ENTER key")
    public void userWritesTheTaskNameAndPressesENTERKey(String taskName) {
        tasksPage.addTaskInput.sendKeys(taskName + Keys.ENTER);
    }

    @Then("verify that user sees {string} in the task list")
    public void verifyThatUserSeesInTheTaskList(String taskName) {
        assertEquals(taskName, tasksPage.newTaskName.getText());
    }

    @When("user clicks Test for Task list")
    public void userClicksTestForTaskList() {
        tasksPage.testForTask.click();
    }

    @And("user clicks new task checkbox button")
    public void userClicksNewTaskCheckboxButton() {
        tasksPage.taskCheckbox.click();
    }

    @Then("verify that user sees {string} sentence with number of tasks")
    public void verifyThatUserSeesSentenceWithNumberOfTasks(String completed) {
        assertTrue(tasksPage.completedTaskSentence.getText().contains(completed));
    }

    @And("user sees completed task number near Completed on the left")
    public void userSeesCompletedTaskNumberNearCompletedOnTheLeft() {
        assertTrue(tasksPage.completedCountOnLeft.isDisplayed());
    }

    @When("user clicks Completed menu on the left")
    public void userClicksCompletedMenuOnTheLeft() {
        tasksPage.completedMenu.click();
    }

    @Then("user sees completed task name with line-through type {string}")
    public void userSeesCompletedTaskNameWithLineThroughType(String closedSentence) {
        assertEquals(closedSentence, tasksPage.completedTaskClosed.getAttribute("class"));
    }

    @And("user clicks star icon for fifth AC")
    public void userClicksStarIconForFifthAC() {
        tasksPage.ac5StarIcon.click();
    }

    @Then("user sees star icon as red color {string}")
    public void userSeesStarIconAsRedColor(String red) {
        assertEquals(red, tasksPage.redStarColor.getCssValue("fill"));
    }

    @And("user sees important task count near the Important")
    public void userSeesImportantTaskCountNearTheImportant() {
        assertTrue(tasksPage.importantCount.isDisplayed());
    }

    @When("user clicks Important menu")
    public void userClicksImportantMenu() {
        tasksPage.important.click();
    }

    @Then("user sees important task {string}")
    public void userSeesImportantTask(String taskName) {
        assertEquals(taskName, tasksPage.newTaskInImportant.getText());
    }



}
