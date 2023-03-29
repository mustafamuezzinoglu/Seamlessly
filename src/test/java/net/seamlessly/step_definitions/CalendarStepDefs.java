package net.seamlessly.step_definitions;


import io.cucumber.java.bs.A;
import io.cucumber.java.ca.Cal;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.seamlessly.pages.BasePage;
import net.seamlessly.pages.CalendarPage;
import net.seamlessly.pages.LoginPage;
import net.seamlessly.utility.BrowserUtility;
import net.seamlessly.utility.Driver;
import org.junit.Assert;

import java.util.concurrent.Callable;

public class CalendarStepDefs {

    CalendarPage calendarPage = new CalendarPage();


    @When("User click on the calendar view dropdown menu")
    public void user_click_on_the_calendar_view_dropdown_menu() {
        calendarPage.dropdownMenu.click();
        BrowserUtility.sleep(3);
    }

    @When("User click on {string} option")
    public void user_click_on_option(String time) {
        if (time.equalsIgnoreCase("day")) {
            calendarPage.dayButton.click();
        } else if (time.equalsIgnoreCase("week")) {
            calendarPage.weekButton.click();
        } else if (time.equalsIgnoreCase("month")) {
            calendarPage.monthButton.click();
        }
    }

    @Then("User should see daily calendar view")
    public void user_should_see_daily_calendar_view() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("timeGridDay"));
        BrowserUtility.sleep(2);

    }

    @Then("User should see weekly calendar view")
    public void user_should_see_weekly_calendar_view() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("timeGridWeek"));
        BrowserUtility.sleep(2);

    }

    @Then("User should see monthly calendar view")
    public void user_should_see_monthly_calendar_view() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("dayGridMonth"));
        BrowserUtility.sleep(2);
    }
}
