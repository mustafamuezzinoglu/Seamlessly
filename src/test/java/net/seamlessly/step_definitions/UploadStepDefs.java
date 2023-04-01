package net.seamlessly.step_definitions;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.seamlessly.pages.BasePage;
import net.seamlessly.pages.UploadPage;
import net.seamlessly.utility.BrowserUtility;
import net.seamlessly.utility.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class UploadStepDefs extends BasePage {

    UploadPage uploadPage = new UploadPage();

    @When("user clicks the + button")
    public void user_clicks_the_button() {
        uploadPage.uploadButton.click();
    }

    @When("user clicks the uploadFile link")
    public void user_clicks_the_upload_file_link() {
        String filePath = "C:\\Users\\Asus\\OneDrive\\Masaüstü\\CYDEO\\a INTERVIEW\\selenium notlarim.txt";
        BrowserUtility.clickWithJS(uploadPage.uploadFile);
    }


}
