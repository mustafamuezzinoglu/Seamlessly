package net.seamlessly.step_definitions;

import io.cucumber.java.en.When;
import net.seamlessly.pages.NotesPage;
import net.seamlessly.utility.BrowserUtility;
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
        notesPage.note_area.sendKeys("Hello World \n gerçi çok ta hello denecek bir yanı yok ta"+ Keys.ENTER);
        BrowserUtility.sleep(5);
    }


}
