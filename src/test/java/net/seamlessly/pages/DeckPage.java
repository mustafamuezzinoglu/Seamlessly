package net.seamlessly.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeckPage extends BasePage {

    //Web Elements
    @FindBy(xpath = "/html/body/div[3]/div/button/span[1]")
    public WebElement navigateButton;

    @FindBy(xpath = "//span[@title='Add board']")
    public WebElement addBoardButton;

    @FindBy(xpath = "//input[@placeholder='Board name']")
    public WebElement boardNamePlaceholder;

    @FindBy(xpath = "//input[@class='icon-confirm']")
    public WebElement confirmBoardNameButton;


    // Methods

    public void openNavigateConsole() {
    navigateButton.click();
    }

    public void clickOnAddBoard(){
        addBoardButton.click();
    }

    public void enterBoardName(String boardName){
        boardNamePlaceholder.sendKeys(boardName);
    }
}
