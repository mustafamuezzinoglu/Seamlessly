package net.seamlessly.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.seamlessly.pages.DeckPage;
import net.seamlessly.utility.BrowserUtility;
import net.seamlessly.utility.Driver;
import org.junit.Assert;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class DeckStepDefs {

    DeckPage deck = new DeckPage();
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

//    @And("user enters a <Board Title>")
//    public void userEntersABoardTitle() {
//
//    }

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
        Assert.assertTrue(deck.isBoardNameDisplayedOnAllBoard(boardTitle));
        System.out.println(boardTitle + " is displayed");
    }


    //Second and Third Scenario

    @When("user is on board page")
    public void userIsOnBoardPage() {
        deck.openNavigateConsole();
        BrowserUtility.sleep(3);
        System.out.println("deck.getBoardNames() = " + deck.getBoardNames());
    }

    @And("user selects a {string} from the All boards")
    public void userSelectsAFromTheAllBoards(String boardName) {
        deck.selectABoard(boardName);
        BrowserUtility.sleep(3);
    }

    //    @And("user selects any board from the All boards")
//    public void userSelectsAnyBoardFromTheAllBoards() {
//        deck.selectABoard(boardName);
//        BrowserUtility.sleep(3);
//
//    }
    @And("user click on Add List button")
    public void userClickOnAddListButton() {
        BrowserUtility.waitForClickable(deck.addListButton, 5);
        deck.addListButton.click();

    }

//    @And("user enters a {string} for the selected Board Title")
//    public void userEntersAForTheSelectedBoardTitle(String listTitle) {
//        deck.listNamePlaceholder.sendKeys(listTitle);
//        deck.confirmListNameButton.click();
//    }

    @And("user adds a new {string} for the selected Board Title")
    public void userAddsANewForTheSelectedBoardTitle(String listTitle) {
        BrowserUtility.waitForVisibility(deck.listNamePlaceholder, 5);
        deck.listNamePlaceholder.sendKeys(listTitle + Keys.ENTER);


    }

//    @Then("user should see the created list name for")
//    public void userShouldSeeTheCreatedListNameFor() {
//        String nameofList = deck.listName.getText();
//        BrowserUtility.sleep(3);
//        Assert.assertTrue(deck.isListNameDisplayed(nameofList));
//
//        System.out.println("nameofList = " + nameofList);
//        System.out.println("deck.getListNames() = " + deck.getListNames());
//
//
//    }

    @Then("user should see the created {string} for")
    public void userShouldSeeTheCreatedFor(String listTitle) {
        Assert.assertTrue(deck.isListNameDisplayed(listTitle));
    }


    //4th Scenario

    @When("user is on current board")
    public void user_is_on_current_board() {
        deck.openNavigateConsole();
        deck.getBoardNames();

        for (WebElement boardTitle : deck.boardTitles) {
            String boardName = boardTitle.getAttribute("title");
            if (boardName.equalsIgnoreCase("Office")) {
                deck.currentBoard.click();
            }
        }
        String str = deck.currentBoard.getText();
        System.out.println("str = " + str);
        System.out.println("deck.getBoardNames() = " + deck.getBoardNames());

    }

    @When("user clicks on an add card button")
    public void user_clicks_on_an_add_card_button() {
        deck.addCardButton2.click();
    }

    @When("user passes a {string} name")
    public void user_passes_a_name(String cardName) {
        deck.cardNamePlaceholder.sendKeys(cardName + Keys.ENTER);
    }

    @Then("user verifies that {string} appears on the related list")
    public void userVerifiesThatAppearsOnTheRelatedList(String newCard) {
        Assert.assertTrue(deck.isCardNameDisplayed(newCard));
        System.out.println(newCard);

    }


    //5th Scenario
    @And("user clicks on three dot image of a card")
    public void userClicksOnThreeDotImageOfACard() {

        deck.toggleButton.click();
        BrowserUtility.sleep(3);
        System.out.println("deck.getCardNames() = " + deck.getCardNames());
    }

    @And("user clicks on {string} from dropdown menu")
    public void userClicksOnFromDropdownMenu(String actionName) {

        deck.selectAction(actionName);

    }

    @Then("user verifies Avatar icon")
    public void userVerifiesAvatarIcon() {
        Assert.assertTrue(deck.isAvatarImageVisible());
    }

    @And("user selects {string} board from select a board dropdown menu")
    public void userSelectsBoardFromSelectABoardDropdownMenu(String boardName) {
        deck.selectABoardFromDropDownMenu(boardName);
        BrowserUtility.sleep(3);
    }

    @And("selects {string} from select list dropdown menu")
    public void selectsFromSelectListDropdownMenu(String listName) {
        deck.selectAList(listName);
        BrowserUtility.sleep(3);

    }

    @And("user clicks on Move card button")
    public void userClicksOnMoveCardButton() {
        deck.moveCardButton.click();
        BrowserUtility.sleep(3);
    }

    @Then("user verifies that the {string} appears on the related {string} and {string}")
    public void userVerifiesThatTheAppearsOnTheRelatedAnd(String card, String list, String board) {

        deck.selectABoard(board);
        Assert.assertTrue(deck.isCardNameDisplayed(card));
        Assert.assertTrue(deck.isListNameDisplayed(list));
//        Assert.assertTrue(deck.isBoardNameDisplayed(board));

        System.out.println(card + "is moved to " + list + "under " + board);

    }



}
