package net.seamlessly.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UploadPage extends BasePage {

    @FindBy(xpath = "//a[@class='button new']")
    public WebElement uploadButton;

    @FindBy(xpath = "//span[text()='Upload file']")
    public WebElement uploadFileLink;

    @FindBy(xpath = "//span[@class='svg icon icon-upload']")
    public WebElement uploadFile;



//    @FindBy(xpath="//*[@id='app-navigation-vue']/ul/li[3]/div/div/div/div/button")
//    public WebElement bttnn;
}
