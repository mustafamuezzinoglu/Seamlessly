package net.seamlessly.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StatusPage extends BasePage{

    @FindBy(id= "expand")
    public WebElement menu;

    @FindBy(xpath = "//div[@class='user-status-online-select']")
    public WebElement statusOptions;

    @FindBy(xpath = "//div[@class='user-status-online-select'][2]")
    public WebElement awayOption;

    @FindBy(xpath = "//div[@class='status-buttons']/button[@text='Set status message']")
    public WebElement setStatusButton;

    @FindBy(xpath = "//div[@class='predefined-statuses-list']/div[@class='predefined-status'][1]")
    public WebElement statusMessageOptions;

    @FindBy(xpath = "//input[@placeholder='What is your status?']")
    public WebElement messagePlace;



/*

 status options: //div[@class="user-status-online-select"]

option away : //div[@class="user-status-online-select"]/label[@for='user-status-online-status-away']
click set status message button: //div[@class='status-buttons']/button[@text='Set status message']

control the changing status://a[@class='user-status-menu-item__toggle']

default options set status: //input[@placeholder='What is your status?']

 */

}
