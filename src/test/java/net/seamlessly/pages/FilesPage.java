package net.seamlessly.pages;

import net.seamlessly.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FilesPage extends BasePage{

	@FindBy(xpath = "//span[text()='Add to favorites']")
	public WebElement addToFavoritesBtn;

	@FindBy(linkText = "Favorites")
	public WebElement favoritesTabBtn;


	public void clickMoreBtn(String fileName){
		 Driver.getDriver().findElement(By.xpath("(//tr[@data-file='"+fileName+"']//a)[3]")).click();
	}

	public WebElement isVisible(String fileName){
		return Driver.getDriver().findElement(By.xpath("(//span[text()='"+fileName+"'])[3]"));
	}




}
