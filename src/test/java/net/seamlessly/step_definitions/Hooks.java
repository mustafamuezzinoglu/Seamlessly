package net.seamlessly.step_definitions;

import net.seamlessly.utility.BrowserUtility;
import net.seamlessly.utility.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {


//    @Before(value = "@validCridentials", order = 2)
//    public void beforeValidCridentials() {
//        LoginPage loginPage = new LoginPage();
//        loginPage.userName.sendKeys("Employee170");
//        loginPage.inputPassword.sendKeys("Employee123");
//    }

    @After
    public void after(Scenario scenario) {
        if (scenario.isFailed()) {
            BrowserUtility.sleep(2);
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
            BrowserUtility.sleep(2);
        }
    }
    @After
    public void closeBrowser() {
        Driver.closeDriver();
    }
}
