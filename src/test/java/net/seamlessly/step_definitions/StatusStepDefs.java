package net.seamlessly.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.seamlessly.pages.StatusPage;
import net.seamlessly.utility.BrowserUtility;
import net.seamlessly.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

public class StatusStepDefs {

    StatusPage statusPage = new StatusPage();
    List<WebElement> optionList = Driver.getDriver().findElements(By.cssSelector("div.set-status-modal__online-status>div>label"));
    @When("user click the status module")
    public void user_click_the_status_module() {

        /*WebElement expand = Driver.getDriver().findElement(By.id("expand"));
        BrowserUtility.clickWithJS(expand);*/
        statusPage.userAvatar.click();
        statusPage.userStatus.click();

    }
    @When("user see the online status options")
    public void user_see_the_online_status() {

        System.out.println(optionList.size());

      for (WebElement option : optionList){
          BrowserUtility.sleep(2);
            System.out.println(option.getText().trim());
          BrowserUtility.sleep(2);
        }

    }

    @Then("user should see four status options")
    public void user_should_see_four_status_options() {
    //assertTrue(optionList.contains("Online"));
    }
    @When("user click the status option")
    public void user_click_the_status_option() {
    statusPage.awayOption.click();

    }
    @When("click the {string}")
    public void click_the(String string) {
        statusPage.setStatusButton.click();
        BrowserUtility.sleep(3);
    }

    @Then("user should see to changed the status")
    public void user_should_see_to_changed_the_status() {
        String actual = statusPage.userStatus.getText();
        String expected = "Away";
        assertEquals(actual, expected);
    }

    @When("user click any option")
    public void user_click_any_option() {
        statusPage.statusMessageOptions.click();
        statusPage.setStatusButton.click();
        BrowserUtility.sleep(4);
    }

    @Then("user should see a message in placeholder of status message")
    public void user_should_see_a_message_in_placeholder_of_status_message() {
        String actual = statusPage.userStatus.getText();
        String expected = "In a meeting";
        assertEquals(actual, expected);
    }

    @When("user writes the {string}")
    public void user_writes_the_as(String HelloWorld) {
    statusPage.messagePlace.sendKeys(HelloWorld+ Keys.ENTER);
    }
    @Then("user should see Hello World message")
    public void user_should_see_message(String string) {
        String actual = statusPage.userStatus.getText();
        String expected = "HelloWorld";
        assertEquals(actual, expected);
    }

}
