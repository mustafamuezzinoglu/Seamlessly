package net.seamlessly.pages;

import net.seamlessly.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UploadPage extends BasePage {

    public WebElement  uploadedFileOrFolder(String fileName){
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

    @FindBy(xpath = "//a[@data-action='MoveCopy']")
    public WebElement moveOrCopyButton;

    public WebElement targetFolder(String createdFolder) {
        return Driver.getDriver().findElement(By.xpath("//tr[@data-entryname='"+createdFolder+"']"));
    }

    public WebElement targetFolder2(String createdFolder) {
        return Driver.getDriver().findElement(By.xpath("//tr[@data-file='"+createdFolder+"']"));
    }

    public void  copyOrMoveAction (String action){
        Driver.getDriver().findElement(By.xpath("//button[.='"+action+" to muezzinoglu']")).click();
    }

    public void clickThreeDotsButton(String fileName){
        Driver.getDriver().findElement(By.xpath("(//tr[@data-file='"+fileName+".txt"+"']//a)[3]")).click();
    }

    public void logoutMethod(){
        userAvatar.click();
        logout.click();
    }

//    @FindBy(xpath="//*[@id='app-navigation-vue']/ul/li[3]/div/div/div/div/button")
//    public WebElement chooseFolder;
}
