package net.seamlessly.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.seamlessly.pages.BasePage;
import net.seamlessly.pages.ProfilePage;
import net.seamlessly.utility.BrowserUtility;
import net.seamlessly.utility.Driver;
import org.junit.Assert;
import org.openqa.selenium.Alert;

import java.sql.Time;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ProfileStepDefs extends BasePage {
    ProfilePage profilePage = new ProfilePage();

    @When("user navigates the profile menu")
    public void user_navigates_the_profile_menu() {
        BrowserUtility.sleep(3);
        profilePage.profile_image_button.click();
        profilePage.view_profile_button.click();
        profilePage.edit_profile_button.click();
    }


    @And("user sees {string} in the profile page")
    public void userSeesInTheProfilePage(String arg0) {

        assertTrue(profilePage.display_name.isDisplayed());
        assertTrue(profilePage.display_email.isDisplayed());
        assertTrue(profilePage.phone_number.isDisplayed());
    }

    @Then("user should see change profile button in the profile page")
    public void userShouldSeeChangeProfileButtonInTheProfilePage() {
        assertTrue(profilePage.profile_text_input.isDisplayed());

    }

    @When("user opens the profile menu")
    public void userOpensTheProfileMenu() {
        BrowserUtility.sleep(3);
        profilePage.profile_image_button.click();
        profilePage.view_profile_button.click();
        profilePage.edit_profile_button.click();

    }


    @And("user changes {string} in the profile page")
    public void userChangesInTheProfilePage(String arg0) {

        profilePage.profile_text_input.clear();
        profilePage.profile_text_input.sendKeys(arg0);
       /* Alert alert = Driver.getDriver().switchTo().alert();
        alert.sendKeys("Employee123");
        alert.accept();
        BrowserUtility.sleep(10);*/


    }

    @Then("user should see changed {string}  in the profile page")
    public void userShouldSeeChangedInTheProfilePage(String arg0) {
        profilePage.profile_image_button.click();

        assertTrue(profilePage.new_profile_name.isDisplayed());
    }

    @When("user navigates the profile menu to phone number")
    public void userNavigatesTheProfileMenuToPhoneNumber() {
        BrowserUtility.sleep(3);
        profilePage.profile_image_button.click();
        profilePage.view_profile_button.click();
        profilePage.edit_profile_button.click();
    }

    @And("user changes phone number info as private in the profile page")
    public void userChangesPhoneNumberInfoAsPrivateInTheProfilePage() {
        profilePage.new_security_level.click();
        profilePage.select_private.click();

    }

    @Then("user should see changed info in the profile page")
    public void userShouldSeeChangedInfoInTheProfilePage() {
        assertTrue(profilePage.select_private.isDisplayed());
    }

    @When("user navigates the profile menu to local time menu")
    public void userNavigatesTheProfileMenuToLocalTimeMenu() {
        BrowserUtility.sleep(3);
        profilePage.profile_image_button.click();
        profilePage.view_profile_button.click();
        profilePage.edit_profile_button.click();
    }

    @And("user clicks the local dropdown menu and selects his {string}")
    public void userClicksTheLocalDropdownMenuAndSelectsHis(String arg0) {
        profilePage.local_time_change.click();
        profilePage.select_location1.click();
    }

    @Then("user should see his local time")
    public void userShouldSeeHisLocalTime() {
        assertTrue(profilePage.local_time_change.isDisplayed());
    }


}
