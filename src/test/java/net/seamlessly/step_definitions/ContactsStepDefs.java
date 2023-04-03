package net.seamlessly.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.seamlessly.pages.ContactsPage;
import net.seamlessly.utility.BrowserUtility;
import org.openqa.selenium.WebElement;

public class ContactsStepDefs {

    ContactsPage contactsPage = new ContactsPage();

    @When("user clicks on {string} button")
    public void user_clicks_on_button(String NewContact) {
        contactsPage.newContactButton.click();
        BrowserUtility.sleep(3);

    }

    @And("user should see a form to enter contact information")
    public void user_should_see_a_form_to_enter_contact_information() {

    }
    @And("user fills in the required fields")
    public void user_fills_in_the_required_fields() {

    }
    @Then("a new contact should be created and added to the list of contacts")
    public void a_new_contact_should_be_created_and_added_to_the_list_of_contacts() {

    }




}
