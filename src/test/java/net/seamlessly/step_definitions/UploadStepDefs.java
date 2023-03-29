package net.seamlessly.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.seamlessly.pages.BasePage;
import net.seamlessly.pages.UploadPage;

public class UploadStepDefs extends BasePage {

    UploadPage uploadPage = new UploadPage();



    @When("user clicks the + button")
    public void user_clicks_the_button() {
        uploadPage.uploadButton.click();
    }

    @When("user clicks the uploadFile link")
    public void user_clicks_the_upload_file_link() {
        uploadPage.uploadFileLink.click();
    }


}
