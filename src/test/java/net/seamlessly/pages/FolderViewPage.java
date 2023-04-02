package net.seamlessly.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FolderViewPage extends BasePage{

    @FindBy(xpath = "//*[@id=\"headerName-container\"]/a/span[1]")
    public WebElement NamesFolder;

    @FindBy(xpath = "//table[@id='filestable']")
    public WebElement TableName;

    @FindBy(xpath = "(//table[@id='filestable']/thead/tr/th[2]/div/a/span[2])[1]")
    public WebElement sortIndicatorIcon;

    @FindBy (css = "a[href='https://tesla.com']")
    public WebElement FileFeature;


}
