package net.seamlessly.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.seamlessly.pages.FilesPage;
import org.junit.Assert;

public class FilesStepDefs {
	FilesPage filesPage=new FilesPage();


	@When("user clicks on {string} file three dots button")
	public void userClicksOnFileThreeDotsButton(String fileName) {

		filesPage.clickMoreBtn(fileName);
	}

	@And("user clicks on remove from favorites button")
	public void userClicksOnRemoveFromFavoritesButton() {
		filesPage.addToFavoritesBtn.click();
	}

	@And("user clicks on favorites tab button")
	public void userClicksOnFavoritesTabButton() {
		filesPage.favoritesTabBtn.click();
	}


	@Then("user see starred {string} file")
	public void userSeeStarredFile(String fileName) {
		Assert.assertTrue(filesPage.isVisible(fileName).isDisplayed());
	}
}
