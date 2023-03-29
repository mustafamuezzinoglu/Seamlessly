package net.seamlessly.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NotesPage extends BasePage{


    @FindBy(id = "notes_new_note")
    public WebElement new_note_button;

    @FindBy(xpath="//*[@id='note-container']/div/div[2]/div[2]/div/div[1]/div[5]/div[1]/div/div/div/div[5]")
    public WebElement note_area;
    ////*[@id="note-container"]/div/div[2]/div[2]/div/div[1]/div[5]/div[1]/div/div/div/div[5]



}
