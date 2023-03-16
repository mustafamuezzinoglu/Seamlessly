package net.seamlessly.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.seamlessly.pages.LoginPage;
import net.seamlessly.utility.ConfigurationReader;
import net.seamlessly.utility.Driver;
import org.junit.Assert;

public class Login_step_definitions {
    LoginPage loginPage = new LoginPage();
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("URL"));
    }
    @When("user can write valid username")
    public void user_can_write_valid_username() {
        loginPage.userName.sendKeys(ConfigurationReader.getProperty("username"));
    }
    @When("user can write valid password")
    public void user_can_write_valid_password() {
        loginPage.inputPassword.sendKeys(ConfigurationReader.getProperty("password"));
    }
    @When("user can click login button")
    public void user_can_click_login_button() {
        loginPage.loginButton.click();
    }
    @Then("user can see dashboard")
    public void user_can_see_dashboard() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Dashboard"));
    }




}
