package net.seamlessly.step_definitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.seamlessly.pages.DeckPage;
import net.seamlessly.utility.BrowserUtility;
import net.seamlessly.utility.Driver;
import org.junit.Assert;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;

public class DeckStepDefs {

    DeckPage deck = new DeckPage();
    Faker faker = new Faker();
    String boardName;

    @When("user opens the navigation menu")
    public void userOpensTheNavigationMenu() {
        deck.openNavigateConsole();
        BrowserUtility.sleep(3);

    }

    @And("user clicks on Add board button")
    public void userClicksOnAddBoardButton() {
        deck.clickOnAddBoard();
        BrowserUtility.sleep(3);

    }

    @And("user enters a <Board Title>")
    public void userEntersABoardTitle() {

    }

    @And("user enters a {string}")
    public void userEntersA(String boardTitle) {
        deck.boardNamePlaceholder.sendKeys(boardTitle);
        Driver.getDriver().manage().addCookie(new Cookie("boardTitle", boardTitle));

    }


    @And("user clicks on the Right Arrow button or push Enter")
    public void userClicksOnTheRightArrowButtonOrPushEnter() {
        deck.confirmBoardAdd();
        BrowserUtility.sleep(3);

    }

    @Then("user should see a new board with the given name under All Boards Menu")
    public void userShouldSeeANewBoardWithTheGivenNameUnderAllBoardsMenu() {
        String boardTitle = Driver.getDriver().manage().getCookieNamed("boardTitle").getValue();
        System.out.println("boardTitle = " + boardTitle);
        Assert.assertTrue(deck.isBoardVisible(boardTitle));

    }


    //Second Scenario

    @When("user is on board page")
    public void userIsOnBoardPage() {
        deck.openNavigateConsole();
        BrowserUtility.sleep(3);
        System.out.println("deck.getBoardNames() = " + deck.getBoardNames());
    }

    @And("user selects any board from the All boards")
    public void userSelectsAnyBoardFromTheAllBoards() {
        deck.selectBoard(boardName);
        BrowserUtility.sleep(3);

    }

    @And("user enters a {string} for the selected Board Title")
    public void userEntersAForTheSelectedBoardTitle(String listTitle) {
        deck.listNamePlaceholder.sendKeys(listTitle);
        deck.confirmListNameButton.click();
    }

    @And("user click on Add List button")
    public void userClickOnAddListButton() {
        BrowserUtility.waitForClickable(deck.addListButton, 5);
        deck.addListButton.click();

    }

    @And("user adds a new {string} for the selected Board Title")
    public void userAddsANewForTheSelectedBoardTitle(String listTitle) {
        BrowserUtility.waitForVisibility(deck.listNamePlaceholder, 5);
        deck.listNamePlaceholder.sendKeys(listTitle+ Keys.ENTER);


    }

    @Then("user should see the created list name for")
    public void userShouldSeeTheCreatedListNameFor() {
        String nameofList = deck.listName.getText();
        BrowserUtility.sleep(3);
        Assert.assertTrue(deck.isListNameVisible(nameofList));

        System.out.println("nameofList = " + nameofList);
        System.out.println("deck.getListNames() = " + deck.getListNames());


    }


}
