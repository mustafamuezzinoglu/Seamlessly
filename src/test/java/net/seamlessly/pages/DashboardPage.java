package net.seamlessly.pages;

import net.seamlessly.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends BasePage{

    @FindBy(id = "expand")
    public WebElement userAvatar;

    @FindBy(xpath = "//*[@data-id='logout']")
    public WebElement logOut;




}
