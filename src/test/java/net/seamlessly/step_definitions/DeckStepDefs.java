package net.seamlessly.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.seamlessly.pages.DeckPage;
import net.seamlessly.utility.BrowserUtility;
import org.junit.Assert;

public class DeckStepDefs {

    DeckPage deck = new DeckPage();

    @When("user opens the navigation")
    public void userOpensTheNavigation() {
        deck.openNavigateConsole();
        BrowserUtility.sleep(3);

    }

    @And("user clicks on Add board button")
    public void userClicksOnAddBoardButton() {
        deck.clickOnAddBoard();
        BrowserUtility.sleep(3);

    }

    @And("user enters {string} as the board name")
    public void userEntersAsTheBoardName(String boardName) {
        deck.enterBoardName(boardName);
    }

    @And("user clicks on the Right Arrow button or push Enter")
    public void userClicksOnTheRightArrowButtonOrPushEnter() {
        deck.confirmBoardAdd();
        BrowserUtility.sleep(3);

    }

    @Then("user should see a new board with the name {string} under All Boards Menu")
    public void userShouldSeeANewBoardWithTheNameUnderAllBoardsMenu(String expectedboardName) {

        Assert.assertEquals(expectedboardName, deck.boardTitle.getText());

    }
}
