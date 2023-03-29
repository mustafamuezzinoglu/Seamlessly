package net.seamlessly.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalendarPage extends BasePage{

    @FindBy(xpath = "(//div[@class='action-item'])[1]")
    public WebElement dropdownMenu;

    @FindBy(xpath = "(//span[@class='material-design-icon view-day-icon'])[2]")
    public WebElement dayButton;

    @FindBy(xpath = "//span[@class='material-design-icon view-week-icon']")
    public WebElement weekButton;

    @FindBy(xpath = "//span[@class='material-design-icon view-module-icon']")
    public WebElement monthButton;

}
