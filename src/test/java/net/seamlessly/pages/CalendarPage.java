package net.seamlessly.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalendarPage {


    @FindBy(xpath = "//span[@class='action-button__icon icon-view-day']")
    public WebElement dayButton;
}
