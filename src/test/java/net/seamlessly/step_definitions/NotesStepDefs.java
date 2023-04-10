package net.seamlessly.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.seamlessly.pages.NotesPage;
import net.seamlessly.utility.BrowserUtility;
import net.seamlessly.utility.ConfigurationReader;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class NotesStepDefs {
    NotesPage notesPage = new NotesPage();

    @When("user click the plus sign")
    public void user_click_the_plus_sign() {
        notesPage.new_note_button.click();
    }
    @When("user write notes to note area")
    public void user_write_notes_to_note_area() {
        BrowserUtility.sleep(2);
        notesPage.note_area.sendKeys("Hello World"+Keys.ENTER);
        notesPage.note_area.sendKeys("How are you?"+Keys.ENTER);
        BrowserUtility.sleep(5);
    }
    @Then("user should see the new note title at the left console")
    public void user_should_see_the_new_note_title_at_the_left_console() {
        String expectedNoteTitle = "Hello World";
        String actualNoteTitle = notesPage.actual_note_title.getAttribute("title");
        Assert.assertEquals(expectedNoteTitle,actualNoteTitle);

    }


}
