package net.seamlessly.pages;

import net.seamlessly.utility.BrowserUtility;
import net.seamlessly.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

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

    @FindBy(xpath = "/html/body/div[3]/div/ul/li[2]/ul/li/a/span")
    public List<WebElement> boardTitles;

    @FindBy(xpath = "//input[@placeholder='List name']")
    public WebElement listNamePlaceholder;

    @FindBy(xpath = "//div[@id= 'stack-add']")
    public WebElement addListButton;
    //button[contains(.,'Add list')])[1]
    @FindBy(xpath = "//span[@title='Office']")
    public WebElement currentBoard;

    @FindBy(xpath = "(//button[contains(.,'Add card')])[1]")
    public WebElement addCardButton1;

    @FindBy(xpath = "(//button[contains(.,'Add card')])[3]")
    public WebElement addCardButton2;

    @FindBy(xpath = "//input[@placeholder='Card name']")
    public WebElement cardNamePlaceholder;

    @FindBy(xpath = "/html/body/div[3]/main/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div[2]/div/div[2]/div/div/div/div/button/span")
    public WebElement toggleButton;

    @FindBy(xpath = "/html/body/div[3]/main/div/div[2]/div/div[1]/div/div[2]/div/div/div[1]/div[2]/div/div[2]/div/div/div/div/button/span")
    public WebElement toggleButton2;

    @FindBy(css = "div[class='avatardiv popovermenu-wrapper has-tooltip'] img")
    public WebElement avatarImage;

    @FindBy(xpath = "//input[@placeholder='Select a board']")
    public WebElement selectBoardDropdown;

    @FindBy(xpath = "//input[@placeholder='Select a list']")
    public WebElement selectListDropdown;

    @FindBy(xpath = "//button[contains(.,'Move card')]")
    public WebElement moveCardButton;

    // Methods

    public void openNavigateConsole() {
        navigateButton.click();
    }

    public void clickOnAddBoard() {
        addBoardButton.click();
    }

    public void confirmBoardAdd() {
        confirmBoardNameButton.click();
    }

    //==========================================================

    public boolean isBoardNameDisplayedOnAllBoard(String boardName) {
        return Driver.getDriver().findElement(By.xpath("//span[@title='" + boardName + "']")).isDisplayed();

    }

    public boolean isBoardNameDisplayed2(String boardName) {
        return Driver.getDriver().findElement(By.xpath("//h2[normalize-space()='" + boardName + "']")).isDisplayed();

    }

    public boolean isListNameDisplayed(String listName) {
        return Driver.getDriver().findElement(By.xpath("//h3[normalize-space()='"+listName+"']")).isDisplayed();

    }

    public boolean isCardNameDisplayed(String cardName) {
        return Driver.getDriver().findElement(By.xpath("//span[normalize-space()='"+cardName+"']")).isDisplayed();

    }

    public boolean isAvatarImageVisible() {
        return avatarImage.isDisplayed();
    }

    //==========================================================

        public void selectAction(String actionName) {
        Actions action = new Actions(Driver.getDriver());
        WebElement element =
                Driver.getDriver().findElement(By.xpath("//span[@class='action-button__text'][contains(.,'" + actionName + "')]"));

        BrowserUtility.sleep(3);
        action.click(element).perform();



    }

    public void selectABoardFromDropDownMenu(String board) {

        selectBoardDropdown.click();

        WebElement selectedBoard = Driver.getDriver().findElement(By.xpath("//span[@class='name-parts__first'][contains(" +
                ".,'" + board + "')]"));

        selectedBoard.click();


    }

    public void selectAListFromDropDownMenu(String list) {

        selectListDropdown.click();
        WebElement selectedList = Driver.getDriver().findElement(By.xpath("//span[@class='name-parts__first" +
                "'][contains(" +
                ".,'" + list + "')]"));

        selectedList.click();


    }

    public void selectABoard(String boardName) {
        WebElement selectABoardName = Driver.getDriver().findElement(By.xpath("//span[@title='" + boardName + "']"));
        selectABoardName.click();
    }

    public WebElement selectACardName(String card) {
        WebElement element =
                Driver.getDriver().findElement(By.xpath("//span[normalize-space()='" + card + "']"));

        System.out.println("selected card = " + card);

        return element;
    }

    public WebElement selectAListName(String list) {
        WebElement element =
                Driver.getDriver().findElement(By.xpath("//h3[normalize-space()='"+list+"']"));

        System.out.println("selected list = " + list);


        return element;
    }


}
