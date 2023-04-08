package net.seamlessly.pages;

import net.seamlessly.utility.BrowserUtility;
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

    @FindBy(xpath = "//input[@id='file_upload_start']")
    public WebElement uploadFile;

    @FindBy(xpath = "//span[text()='New folder']")
    public WebElement newFolder;

    @FindBy(id = "view11-input-folder")
    public WebElement newFolderNameInputBox;

    @FindBy(xpath = "//a[@data-action='MoveCopy']")
    public WebElement moveOrCopyButton;

    @FindBy(xpath = "//a[@data-action='Delete']")
    public WebElement deleteAnyItem;

    @FindBy(xpath = "//span[@class='fileinfo']")
    public WebElement fileInfo;

    @FindBy(xpath = "//span[@class='dirinfo']")
    public WebElement dirInfo;

    public WebElement targetFolder(String createdFolder) {
        return Driver.getDriver().findElement(By.xpath("//tr[@data-entryname='"+createdFolder+"']"));
    }

    public WebElement targetFolder2(String createdFolder) {
        return Driver.getDriver().findElement(By.xpath("//tr[@data-file='"+createdFolder+"']"));
    }

    public void copyOrMoveAction (String action){
        Driver.getDriver().findElement(By.xpath("//button[.='"+action+" to muezzinoglu']")).click();
    }

    public void clickThreeDotsButton(String fileName, String extension){
        Driver.getDriver().findElement(By.xpath("(//tr[@data-file='"+fileName+extension+"']//a)[3]")).click();
    }

    public void deleteFileWithExtension(String fileName, String extension1) {
        clickThreeDotsButton(fileName, extension1);
        BrowserUtility.sleep(2);
        deleteAnyItem.click();
        BrowserUtility.sleep(2);
    }

    public void deleteFolder(String nameOfDeletedItem,String extension2) {
        clickThreeDotsButton(nameOfDeletedItem,extension2);
        BrowserUtility.sleep(2);
        deleteAnyItem.click();
        BrowserUtility.sleep(2);
    }

}
