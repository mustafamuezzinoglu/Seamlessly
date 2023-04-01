package net.seamlessly.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TasksPage extends BasePage {

    @FindBy(xpath = "//span[normalize-space(text())='Add List…']")
    public WebElement addList;

    @FindBy(id = "newListInput")
    public WebElement newListInput;

    @FindBy(xpath = "//input[@id='newListInput']/following-sibling::input[2]")
    public WebElement saveButton;

    @FindBy(xpath = "//span[normalize-space(text())='Test List']")
    public WebElement TestList;

    @FindBy(xpath = "//span[normalize-space(text())='Test List']/../..//button[@class='icon action-item__menutoggle action-item__menutoggle--default-icon']")
    private WebElement testListButton;

    @FindBy(xpath = "//span[.='Delete']/..")
    private WebElement testListDelete;

    public void deleteTestList() {
        testListButton.click();
        testListDelete.click();
    }

    @FindBy(xpath = "//input[@placeholder='Add a task to \"Test for Task\"…']")
    public WebElement addTaskInput;
    @FindBy(xpath = "//span[.='new task']")
    public WebElement newTaskName;

    @FindBy(xpath = "//span[normalize-space(text())='Test for Task']")
    public WebElement testForTask;

    @FindBy(xpath = "//label[contains(@for, 'checkbox-')]")
    public WebElement taskCheckbox;

    @FindBy(xpath = "//span[.='1 Completed Task']")
    public WebElement completedTaskSentence;

    @FindBy(css = "li#collection_completed>div>div>div.app-navigation-entry__counter")
    public WebElement completedCountOnLeft;
    @FindBy(css = "li#collection_completed")
    public WebElement completedMenu;
    @FindBy(xpath = "//li[@task-id='B1E3F29C-DA07-4A4E-8AB6-45BB527CACC7.ics' and @class='task-item task-item--closed']")
    public WebElement completedTaskClosed;

}
