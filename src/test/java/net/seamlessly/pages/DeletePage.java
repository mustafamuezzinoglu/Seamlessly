package net.seamlessly.pages;

import net.seamlessly.utility.BrowserUtility;
import net.seamlessly.utility.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Collections;

public class DeletePage extends BasePage {


    @FindBy(xpath = "//span[text()='Add to favorites']")
    public WebElement addToFavoritesBtn;

    @FindBy(linkText = "Favorites")
    public WebElement favoritesTabBtn;


    public void clickMoreBtn(String fileName) {
        Driver.getDriver().findElement(By.xpath("(//tr[@data-file='" + fileName + "']//a)[3]")).click();
    }

    public WebElement isVisible(String fileName) {
        return Driver.getDriver().findElement(By.xpath("(//span[text()='" + fileName + "'])[3]"));
    }

public void prepareTheWebPage(String string1,String string2){
    Deleted_Files_Tab.click();
    emptyTrash();
    navigateToModule("Files");
    CreateNewTextFile(string1);
    CreateNewTextFile(string2);
    DeleteTextFile(string1);
    DeleteTextFile(string2);
}
    public void CreateNewTextFile(String Filename) {


        WebElement AddFile = Driver.getDriver().findElement(By.xpath("//*[@id=\"controls\"]/div[2]/a"));
        BrowserUtility.waitForVisibility(AddFile, 10);
        AddFile.click();

        WebElement AddNewTextFile = Driver.getDriver().findElement(By.xpath("//*[@id=\"controls\"]/div[2]/div[2]/ul/li[3]/a/span[2]"));
        BrowserUtility.waitForVisibility(AddNewTextFile, 10);
        AddNewTextFile.click();

        WebElement NewTextFileTextBox = Driver.getDriver().findElement(By.xpath("//*[@id=\"view11-input-file\"]"));
        BrowserUtility.waitForVisibility(NewTextFileTextBox, 10);
        NewTextFileTextBox.sendKeys(Filename);


        WebElement CreateNewTextFile = Driver.getDriver().findElement(By.xpath("//*[@id=\"controls\"]/div[2]/div[2]/ul/li[3]/a/form/input[2]"));
        BrowserUtility.waitForVisibility(CreateNewTextFile, 10);
        CreateNewTextFile.click();

        WebElement CloseTextFileEditBox = Driver.getDriver().findElement(By.xpath("//*[@id=\"viewer\"]/div[1]/div[2]/button/span[1]"));
        BrowserUtility.waitForVisibility(CloseTextFileEditBox, 10);
        CloseTextFileEditBox.click();
    }

    public void DeleteTextFile(String Filename) {

        Actions actions = new Actions(Driver.getDriver());
        BrowserUtility.sleep(2);
        WebElement DeleteFile = Driver.getDriver().findElement(By.xpath("//span[.='" + Filename + "']"));
        BrowserUtility.waitForVisibility(DeleteFile, 10);
        actions.moveToElement(DeleteFile);
        actions.contextClick(DeleteFile).build().perform();
        WebElement DeleteWithRightClick = Driver.getDriver().findElement(By.xpath("//*[@id=\"rightClickMenu\"]/ul/li[7]/a"));
        BrowserUtility.waitForVisibility(DeleteWithRightClick, 10);
        DeleteWithRightClick.click();
    }

    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[2]/a")
    public WebElement All_Files;

    @FindBy(xpath = "//*[@id=\"controls\"]/div[2]/a")
    public WebElement AddFile;

    @FindBy(xpath = "//*[@id=\"controls\"]/div[2]/div[2]/ul/li[3]/a/span[2]")
    public WebElement AddNewTextFile;

    @FindBy(xpath = "//*[@id=\"view11-input-file\"]")
    public WebElement NewTextFileTextBox;

    @FindBy(xpath = "//*[@id=\"controls\"]/div[2]/div[2]/ul/li[3]/a/form/input[2]")
    public WebElement CreateNewTextFile;

    @FindBy(xpath = "//*[@id=\"viewer\"]/div[1]/div[2]/button/span[1]")
    public WebElement CloseTextFileEditBox;

    @FindBy(xpath = "//*[@id=\"rightClickMenu\"]/ul/li[7]/a")
    public WebElement DeleteWithRightClick;
    @FindBy(xpath = "//*[@id=\"app-navigation\"]/ul/li[6]/a")
    public WebElement Deleted_Files_Tab;

    @FindBy(xpath = "(//table[@id='filestable']/following::table)[10]/thead[1]/tr[1]/th[2]/div[1]/a[1]/span[1]")
    public WebElement SortbyName;

    @FindBy(xpath = "//*[.=\"Deleted\"]//span[@class=\"sort-indicator icon-triangle-s\"]")
    public WebElement SortbyDateAsc;

    @FindBy(xpath = "//*[.=\"Deleted\"]//span[@class=\"sort-indicator icon-triangle-n\"]")
    public WebElement SortbyDateDes;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div[12]/table/tbody/tr[1]")
    public WebElement FirstElementOfTheDeletedItem;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div[12]/table/tbody/tr[1]")
    public WebElement FirstElementOnTheDeletedItemTable;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div[12]/table/tbody/tr[2]")
    public WebElement SecondElementOnTheDeletedItemTable;

    @FindBy(xpath = "(//table[@id='filestable']/following::table)[10]/tbody[1]/tr[1]/td[1]/label[1]")
    public WebElement SelectFirstElementOnTheDeletedItemTable;


    @FindBy(xpath = "(//a[@class='menu-option option-item-restore']//span)[2]")
    public WebElement RestoreFirstElementOnTheDeletedItemTable;

    @FindBy(xpath = "((//span[@class='nametext extra-data'])[2]")
    public WebElement SelectSecondElementOnTheDeletedItemTable;

    @FindBy(xpath = "(//a[@class='menu-option option-item-restore']//span)[2]")
    public WebElement RestoreSecondElementOnTheDeletedItemTable;
    @FindBy(xpath = "///div[@id='app-content-trashbin']/table[1]/tbody[1]/tr[1]/td[2]/a[1]/span[2]/a[2]/span[1]")
    public WebElement ClickThreeDotsFirstElementDeletedItemTable;

    @FindBy(xpath = "//div[@id='app-content-trashbin']/table[1]/tbody[1]/tr[2]/td[2]/a[1]/span[2]/a[2]/span[1]")
    public WebElement ClickThreeDotsSecondElementDeletedItemTable;

    @FindBy(xpath = "//*[@id=\"fileList\"]/tr[1]/td[2]/div/ul/li[1]/a")
    public WebElement DeleteFirstElementDeletedItemTable;

    @FindBy(xpath = "//*[@id=\"fileList\"]/tr[2]/td[2]/div/ul/li[1]/a")
    public WebElement DeleteSecondElementDeletedItemTable;


    @FindBy(xpath = "//label[@for='select_all_trash']")
    public WebElement SelectTrash;

    @FindBy(xpath = "(//a[@class='actions-selected']//span)[3]")
    public WebElement SelectTrashAction;

    @FindBy(xpath = "//span[text()='Delete permanently']")
    public WebElement SelectDeleteAction;

    public void emptyTrash() {
        BrowserUtility.waitForVisibility(SelectTrash, 10);
        BrowserUtility.clickWithJS(SelectTrash);
        BrowserUtility.waitForVisibility(SelectTrashAction, 10);
        BrowserUtility.clickWithJS(SelectTrashAction);
        BrowserUtility.waitForVisibility(SelectDeleteAction, 10);
        BrowserUtility.clickWithJS(SelectDeleteAction);
    }

    public void userSelectsAFileOnTheDeletedItemsTable(String string) {
        String fileName = string + ".md";
        String firstElement = FirstElementOnTheDeletedItemTable.getAttribute("data-path");
        if (fileName.equals(firstElement)) {
            BrowserUtility.waitForVisibility(ClickThreeDotsFirstElementDeletedItemTable, 10);
            BrowserUtility.clickWithJS(ClickThreeDotsFirstElementDeletedItemTable);
      //      ClickThreeDotsFirstElementDeletedItemTable.click();
        } else {
            BrowserUtility.waitForVisibility(ClickThreeDotsSecondElementDeletedItemTable, 10);
            BrowserUtility.clickWithJS(ClickThreeDotsSecondElementDeletedItemTable);
  //          ClickThreeDotsSecondElementDeletedItemTable.click();
        }

    }

    public ArrayList<String> viewDeletedAlpha(String string1, String string2){
        ArrayList<String> arrlist = new ArrayList<String>();
        arrlist.add(string1);
        arrlist.add(string2);
        Collections.sort(arrlist);
        BrowserUtility.sleep(2);
        Assert.assertEquals("No Match", arrlist.get(0) + ".md", FirstElementOnTheDeletedItemTable.getAttribute("data-path"));
        BrowserUtility.waitForVisibility(SortbyName, 10);
        BrowserUtility.clickWithJS(SortbyName);
        return arrlist;
    }

    public boolean userDeletesTheSelectedFile(String string) {
        boolean delete = false;

        String fileName = string + ".md";
        String firstElement = FirstElementOnTheDeletedItemTable.getAttribute("data-path");

        if (fileName.equals(firstElement)) {
            DeleteFirstElementDeletedItemTable.click();
            delete = true;
        } else {
            DeleteSecondElementDeletedItemTable.click();
            delete = true;
        }
        return delete;
    }

    public void userRestoresTheSelectedFile(String string) {
        Actions action = new Actions(Driver.getDriver());
        String fileName = string + ".md";
        String firstElement = FirstElementOnTheDeletedItemTable.getAttribute("data-path");
        if (fileName.equals(firstElement)) {
            SelectFirstElementOnTheDeletedItemTable.click();
            action.contextClick(FirstElementOnTheDeletedItemTable).build().perform();
            RestoreFirstElementOnTheDeletedItemTable.click();
        } else {
            SelectSecondElementOnTheDeletedItemTable.click();
            action.contextClick(SecondElementOnTheDeletedItemTable).build().perform();
            RestoreSecondElementOnTheDeletedItemTable.click();
        }
    }

    public boolean TheSelectedFileIsRestored(String string) {
        boolean check = false;
        navigateToModule("Files");
        BrowserUtility.sleep(2);
        try {
            WebElement checkFile = Driver.getDriver().findElement(By.xpath("//span[.='" + string + "']"));
            BrowserUtility.waitForVisibility(checkFile, 10);

            if (checkFile.isDisplayed()) {
                check = true;
            } else {
                check = false;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            return check;

        }

    }

    public void cleanup(String string) {
        Actions actions = new Actions(Driver.getDriver());
        BrowserUtility.sleep(2);
        WebElement Residue = Driver.getDriver().findElement(By.xpath("(//span[text()='" + string + "'])[2]"));
        BrowserUtility.waitForVisibility(Residue, 10);
        actions.moveToElement(Residue);
        actions.contextClick(Residue).build().perform();
        WebElement DeleteWithRightClick = Driver.getDriver().findElement(By.xpath("//a[@class='menu-option option-delete']"));
        BrowserUtility.waitForVisibility(DeleteWithRightClick, 10);
        DeleteWithRightClick.click();


    }
}



