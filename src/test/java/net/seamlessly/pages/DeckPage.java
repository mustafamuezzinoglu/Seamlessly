package net.seamlessly.pages;

import net.seamlessly.utility.BrowserUtility;
import net.seamlessly.utility.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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

    @FindBy(xpath = "//h3[contains(@class, 'stack__title')]")
    public WebElement listName;

    @FindBy(xpath = "//h3[@class='stack__title has-tooltip']")
    public List<WebElement> listTitles;

    @FindBy(xpath = "//input[@class='icon-confirm has-tooltip']")
    public WebElement confirmListNameButton;

    @FindBy(xpath = "(//button[contains(.,'Add list')])[1]")
    public WebElement addListButton;

    @FindBy(xpath = "//span[@title='Office']")
    public WebElement currentBoard;

    @FindBy(xpath = "(//button[contains(.,'Add card')])[1]")
    public WebElement addCardButton;

    @FindBy(xpath = "(//button[contains(.,'Add card')])[3]")
    public WebElement addCardButton2;

    @FindBy(xpath = "//input[@placeholder='Card name']")
    public WebElement cardNamePlaceholder;

    @FindBy(xpath = "/html/body/div[3]/main/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div[2]/div/div[2]/div/div/div/div/button/span")
    public WebElement toggleButton;

    @FindBy(css = "div[class='avatardiv popovermenu-wrapper has-tooltip'] img")
    public WebElement avatarImage;

    @FindBy(xpath = "/html/body/div[3]/main/div/div[2]/div/div/div/div[2]/div/div/div[1]/div[1]")
    public List<WebElement> cardNames;

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

    public boolean isBoardVisible(String boardName) {
        return Driver.getDriver().findElement(By.xpath("//span[@title='" + boardName + "']")).isDisplayed();

    }
    public boolean isBoardNameDisplayed(String boardName) {
        return Driver.getDriver().findElement(By.xpath("//h2[contains(.,'"+boardName+"')]")).isDisplayed();

    }

    public List<String> getBoardNames() {
        // Retrieve the list of board elements

        List<String> boardNames = new ArrayList<>();
        for (WebElement boardTitle : boardTitles) {
            // Get the board name from the title attribute
            String boardName = boardTitle.getAttribute("title");
            boardNames.add(boardName);
        }
        return boardNames;

    }

    public List<String> getListNames() {
        // Retrieve the list of board elements

        List<String> listNames = new ArrayList<>();
        for (WebElement listTitle : listTitles) {
            // Get the board name from the title attribute
            String listName = listTitle.getText();
            listNames.add(listName);
        }
        return listNames;
    }

    public void selectBoard(String boardTitle) {

        Random rand = new Random();
        int randomIndex = rand.nextInt(boardTitles.size());

        boardTitles.get(randomIndex).click();

    }

    public boolean isListNameDisplayed(String listName) {
        return Driver.getDriver().findElement(By.xpath("//h3[contains(.,'" + listName + "')]")).isDisplayed();

    }

    public boolean isCardNameDisplayed(String cardName) {
        String dynamicXPath = "//h3[contains(.,'" + cardName + "')]";
        WebElement searchResult = Driver.getDriver().findElement(By.xpath(dynamicXPath));
        return searchResult.isDisplayed();
    }

    public void selectAction(String actionName) {
        WebElement action = Driver.getDriver().findElement(By.xpath("//span[@class='action-button__text'][contains(.,'" + actionName + "')]"));
        BrowserUtility.sleep(3);
        action.click();

    }

    public boolean isAvatarImageVisible() {
        return avatarImage.isDisplayed();
    }

    public List<String> getCardNames() {

        List<String> elementNames = new ArrayList<>();
        List<WebElement> elements = Driver.getDriver().findElements(By.xpath("/html[1]/body[1]/div[3]/main[1]/div[1]/div[2]/div[1]/div/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/h3[1]/span[1]"));

        for (WebElement element : elements) {
            elementNames.add(element.getAttribute("value"));
        }
        return elementNames;

    }

    public void selectABoard(String board) {

        selectBoardDropdown.click();

        WebElement selectedBoard = Driver.getDriver().findElement(By.xpath("//span[@class='name-parts__first'][contains(" +
                ".,'" + board + "')]"));

        selectedBoard.click();


    }

    public void selectAList(String list) {

        selectListDropdown.click();
        WebElement selectedList = Driver.getDriver().findElement(By.xpath("//span[@class='name-parts__first" +
                "'][contains(" +
                ".,'" + list + "')]"));

        selectedList.click();


    }

    public void selectAABoard(String boardName){
        WebElement selectABoardName = Driver.getDriver().findElement(By.xpath("//span[@title='"+boardName+"']"));
        selectABoardName.click();
    }


}
