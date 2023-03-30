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
import org.openqa.selenium.WebElement;

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

    @And("user enters a name as the board name")
    public void userEntersANameAsTheBoardName() {
        String boardName = faker.name().title();
        deck.boardNamePlaceholder.sendKeys(boardName);
        Driver.getDriver().manage().addCookie(new Cookie("boardName", boardName));
    }

    @And("user clicks on the Right Arrow button or push Enter")
    public void userClicksOnTheRightArrowButtonOrPushEnter() {
        deck.confirmBoardAdd();
        BrowserUtility.sleep(3);

    }

    @Then("user should see a new board with the given name under All Boards Menu")
    public void userShouldSeeANewBoardWithTheGivenNameUnderAllBoardsMenu() {
        String boardName = Driver.getDriver().manage().getCookieNamed("boardName").getValue();
        System.out.println("boardName = " + boardName);
        Assert.assertTrue(deck.isBoardVisible(boardName));


    }

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

    @And("user enters a list name for the selected board")
    public void userEntersAListNameForTheSelectedBoard() {
        String listName = faker.name().name();
        if (deck.noListMessage.isDisplayed()){
            deck.listNamePlaceholder.sendKeys(listName);
            deck.confirmListNameButton.click();
        }else{
            Driver.closeDriver();
        }


    }

    @Then("user should see the created list name for")
    public void userShouldSeeTheCreatedListNameFor() {
        String nameofList = deck.listName.getText();
        System.out.println("nameofList = " + nameofList);
        Assert.assertTrue(deck.isListNameVisible(nameofList));


    }


}
