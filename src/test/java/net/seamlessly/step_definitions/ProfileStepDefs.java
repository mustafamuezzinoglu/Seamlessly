package net.seamlessly.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.seamlessly.pages.BasePage;
import net.seamlessly.pages.ProfilePage;
import net.seamlessly.utility.BrowserUtility;
import net.seamlessly.utility.Driver;
import org.junit.Assert;

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

        Assert.assertTrue(profilePage.display_name.isDisplayed());
        Assert.assertTrue(profilePage.display_email.isDisplayed());
        Assert.assertTrue(profilePage.phone_number.isDisplayed());
    }

    @Then("user should see change profile button in the profile page")
    public void userShouldSeeChangeProfileButtonInTheProfilePage() {
        Assert.assertTrue(profilePage.profile_text_input.isDisplayed());

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
        BrowserUtility.sleep(10);
        profilePage.password_input_popup.sendKeys("Employee123");

    }

    @Then("user should see changed {string}  in the profile page")
    public void userShouldSeeChangedInTheProfilePage(String arg0) {
        profilePage.profile_image_button.click();
        profilePage.display_name.isDisplayed();
        profilePage.profile_image_button.isDisplayed();
    }
}








