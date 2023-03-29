package net.seamlessly.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FilesPage extends BasePage{


	@FindBy(className = "actions-selected")
	public WebElement moreIcon;

	@FindBy(xpath = "//span[text()='Remove from favorites']")
	public WebElement removeFromFavoritesBtn;

	@FindBy(linkText = "Favorites")
	public WebElement faavoritesTab;


}
