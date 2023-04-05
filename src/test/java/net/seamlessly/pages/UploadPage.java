package net.seamlessly.pages;

import net.seamlessly.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UploadPage extends BasePage {

    public WebElement uploadedFile(String fileName){
        return Driver.getDriver().findElement(By.xpath("//span[text()='"+fileName+"']"));
    }

    @FindBy(xpath = "//a[@class='button new']")
    public WebElement plusButton;

    @FindBy(xpath = "//span[text()='Upload file']")
//    @FindBy(xpath = "//label[@class='menuitem']")
    public WebElement uploadFileLink;

    @FindBy(xpath = "//input[@id='file_upload_start']")
    public WebElement uploadFile;

    @FindBy(xpath = "//span[text()='New folder']")
    public WebElement newFolder;

    @FindBy(id = "view11-input-folder")
    public WebElement newFolderNameInputBox;

    @FindBy(xpath = "//a[@data-action='Move or copy']")
    public WebElement moveOrCopyButton;

    @FindBy(xpath = "//tr[@data-entryname='muezzinoglu']")
    public WebElement targetFolder;


//    @FindBy(xpath="//*[@id='app-navigation-vue']/ul/li[3]/div/div/div/div/button")
//    public WebElement bttnn;
}
