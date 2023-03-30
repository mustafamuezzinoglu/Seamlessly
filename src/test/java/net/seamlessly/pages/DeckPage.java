package net.seamlessly.pages;

import com.github.javafaker.Faker;
import net.seamlessly.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DeckPage extends BasePage {
    Faker faker = new Faker();


    //Web Elements
    @FindBy(xpath = "/html/body/div[3]/div/button/span[1]")
    public WebElement navigateButton;

    @FindBy(xpath = "//span[@title='Add board']")
    public WebElement addBoardButton;

    @FindBy(xpath = "//input[@placeholder='Board name']")
    public WebElement boardNamePlaceholder;

    @FindBy(xpath = "//input[@class='icon-confirm']")
    public WebElement confirmBoardNameButton;

    @FindBy(xpath = "//input[@placeholder='List name']")
    public WebElement listNamePlaceholder;

    @FindBy(xpath = "//h2[contains(.,'No lists available')]")
    public WebElement noListMessage;


    @FindBy(xpath = "/html/body/div[3]/div/ul/li[2]/ul/li/a/span")
    public List<WebElement> boardTitles;

    @FindBy(xpath = "//h3[contains(@class, 'stack__title')]")
    public WebElement listName;

    @FindBy(xpath = "//input[@class='icon-confirm has-tooltip']")
    public WebElement confirmListNameButton;


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

    public List<String> getBoardNames() {
        // Retrieve the list of board elements

        List<String> boardNames = new ArrayList<String>();
        for (WebElement boardTitle : boardTitles) {
            // Get the board name from the title attribute
            String boardName = boardTitle.getAttribute("title");
            boardNames.add(boardName);
        }
        return boardNames;
    }

    public void selectBoard(String boardName) {

        Random rand = new Random();
        int randomIndex = rand.nextInt(boardTitles.size());

        boardTitles.get(randomIndex).click();

    }

    public boolean isListNameVisible(String listName) {
        return Driver.getDriver().findElement(By.xpath("//h3[contains(.,'" + listName + "')]")).isDisplayed();

    }
}
