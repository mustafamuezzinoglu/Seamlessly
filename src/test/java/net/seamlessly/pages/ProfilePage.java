package net.seamlessly.pages;

import io.cucumber.java.en.When;
import net.seamlessly.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends BasePage{

    @FindBy(xpath="/html/body/header/div[2]/div[4]/div/div/img")
    public WebElement profile_image_button;
    @FindBy(xpath="/html/body/header/div[2]/div[4]/nav/ul/li[1]/div/a[1]/div[2]")
    public WebElement view_profile_button;
    @FindBy(xpath="/html/body/div[3]/div/div[1]/div/h2/a")
    public WebElement edit_profile_button;

    @FindBy (xpath="/html/body/div[3]/div[2]/div[2]/div[2]/div[1]/section/h3/label")
    public WebElement display_name;

    @FindBy (xpath="/html/body/div[3]/div[2]/div[2]/div[2]/div[2]/section/h3/label")
    public WebElement display_email;

    @FindBy (xpath="/html/body/div[3]/div[2]/div[2]/div[2]/div[3]/form/h3/label")
    public WebElement phone_number;

    @FindBy (xpath="//*[@id=\"displayname\"]")
    public WebElement profile_text_input;

    @FindBy (xpath="//*[@id=\"oc-dialog-3-content-input\"]")
    public WebElement password_input_popup;

    @FindBy (xpath="/html/body/header/div[2]/div[4]/nav/ul/li[1]/div/a[1]/div[1]/div[1]")
    public WebElement new_profile_name;

    @FindBy (xpath="/html/body/div[3]/div[2]/div[2]/div[2]/div[3]/form/h3/a/span")
    public WebElement new_security_level;
    @FindBy (xpath="/html/body/div[3]/div[2]/div[2]/div[2]/div[3]/form/h3/a/div/ul/li[1]/a/p")
    public WebElement select_private;

    @FindBy (xpath="//*[@id='localeinput']")
    public WebElement local_time_change;

    @FindBy (xpath="//*[(@value='agq')]")
    public WebElement select_location1;

    @FindBy (xpath="//*[(@value='mgh_MZ')]")
    public WebElement select_location2;

    @FindBy (xpath="//*[(@id='localeexample-time')]")

    public WebElement time_1;

    @FindBy (xpath="//*[(@id='localeexample-time')]")

    public WebElement time_2;






}
