package net.seamlessly.pages;

import net.seamlessly.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {

    @FindBy(className = "material-design-icon__svg")
    public WebElement searchButton;

    @FindBy(xpath = "/html/body/header/div[2]/div[2]/div/div[2]/div/form/input[1]")
    public WebElement searchBox;

    @FindBy(xpath = "/html/body/header/div[2]/div[2]/div/div[2]")
    public WebElement sidePage;

    @FindBy(className = "unified-search__result-content")
    public WebElement firstResultList;

    @FindBy (id = "contact-fullname")
    public WebElement fullName;
}
