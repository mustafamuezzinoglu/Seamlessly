package net.seamlessly.pages;

import net.seamlessly.utility.ConfigurationReader;
import net.seamlessly.utility.Driver;
import org.junit.Test;

public class Testttt {

    @Test
    public void test() {
        Driver.getDriver().get(ConfigurationReader.getProperty("URL"));
        LoginPage loginPage = new LoginPage();
        loginPage.login("Employee170", "Employee123");
        BasePage basePage = new BasePage();
        basePage.navigateToModule("calendar");
    }
}
