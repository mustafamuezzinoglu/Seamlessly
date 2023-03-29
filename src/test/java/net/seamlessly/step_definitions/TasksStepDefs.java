package net.seamlessly.step_definitions;

import io.cucumber.java.en.When;
import net.seamlessly.pages.TasksPage;

public class TasksStepDefs {
    TasksPage tasksPage = new TasksPage();

    @When("user navigates to {string} module")
    public void user_navigates_to_module(String moduleName) {
        tasksPage.navigateToModule(moduleName);
    }


}
