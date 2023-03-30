package net.seamlessly.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.seamlessly.pages.BasePage;
import net.seamlessly.pages.SearchPage;
import net.seamlessly.utility.BrowserUtility;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class SearchStepDefs extends BasePage {

    SearchPage searchPage = new SearchPage();

    @When("user clicks the search button")
    public void user_clicks_the_search_button() {
        BrowserUtility.sleep(3);
        searchPage.searchButton.click();

    }

    @When("user types a file name")
    public void user_types_a_file_name() {
        BrowserUtility.sleep(2);
        searchPage.searchBox.sendKeys("Syftzr");
    }

    @Then("user can see details of the file on side page")
    public void user_can_see_details_of_the_file_on_side_page() {
        Assert.assertTrue(searchPage.sidePage.isDisplayed());
    }

    @And("user presses the enter key")
    public void userPressesTheEnterKey() {
        searchPage.searchBox.sendKeys(Keys.ENTER);
    }
}
