package net.seamlessly.step_definitions;

import net.seamlessly.utility.BrowserUtility;
import net.seamlessly.utility.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hooks {


//    @Before(value = "@validCridentials", order = 2)
//    public void beforeValidCridentials() {
//        LoginPage loginPage = new LoginPage();
//        loginPage.userName.sendKeys("Employee170");
//        loginPage.inputPassword.sendKeys("Employee123");
//    }

//    @After
//    public void afterScenario(Scenario scenario) {
//        if (scenario.isFailed()) {
//            BrowserUtility.sleep(2);
//            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
//            scenario.attach(screenshot, "image/png", scenario.getName());
//            BrowserUtility.sleep(2);
//        }
//    }

    @After
    public void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("body")));
                byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", scenario.getName());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    @After
    public void closeBrowser() {
        Driver.closeDriver();
    }
}
