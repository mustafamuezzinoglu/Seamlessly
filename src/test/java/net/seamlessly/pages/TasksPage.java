package net.seamlessly.pages;

import net.seamlessly.utility.BrowserUtility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TasksPage extends BasePage{

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






}
