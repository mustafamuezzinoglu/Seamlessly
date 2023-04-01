package net.seamlessly.step_definitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.seamlessly.pages.FolderViewPage;
import net.seamlessly.utility.BrowserUtility;
import net.seamlessly.utility.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FolderViewStepDefs {
FolderViewPage folderViewPage=new FolderViewPage();

    @When("user click the Name button")
    public void user_click_the_name_button() {
        BrowserUtility.sleep(2);
        folderViewPage.NamesFolder.click();

    }

    @When("Verify user can see the folder in alphabetic older based on their names")
    public void verify_user_can_see_the_folder_in_alphabetic_older_based_on_their_names() {

        List<WebElement> files = Driver.getDriver().findElements(By.xpath("(//tbody[@id='fileList'])[1]//tr"));
        List<String> namesActual = new ArrayList<>();


        for (WebElement each : files) {

            namesActual.add(each.getAttribute("data-file"));

        }

        String expectedOrderByAscending="sort-indicator icon-triangle-n";
        String expectedOrderByDescending="sort-indicator icon-triangle-s";
        String actualOrder=folderViewPage.sortIndicatorIcon.getAttribute("class");



        if (actualOrder.equals(expectedOrderByAscending)){

            String[] names = namesActual.toArray(new String[0]);
            Arrays.sort(names);
            List<String> sortedNames = Arrays.asList(names);

            Assert.assertEquals(sortedNames,namesActual);


        } else if (actualOrder.equals(expectedOrderByDescending)) {

            String[] names = namesActual.toArray(new String[0]);
            Arrays.sort(names);
            List<String> sortedNames = Arrays.asList(names);

            Collections.reverse(sortedNames);
            String[] descend = sortedNames.toArray(new String[0]);

            List<String> descendNames = Arrays.asList(descend);

            Assert.assertEquals(descendNames,namesActual);



        }}

    @Then("verify after clicking the name if it is on ascending order or descending order")
    public void verify_after_clicking_the_name_if_it_is_on_ascending_order_or_descending_order() {


        String expectedOrderByAscending = "sort-indicator icon-triangle-n";
        String expectedOrderByDescending = "sort-indicator icon-triangle-s";
        String actualOrder = folderViewPage.sortIndicatorIcon.getAttribute("class");
        System.out.println("actualOrderByAscending = " + actualOrder);
        System.out.println("expectedOrderByAscending = " + expectedOrderByAscending);
        if (actualOrder.equals(expectedOrderByAscending)) {
            Assert.assertEquals(expectedOrderByAscending, actualOrder);
        } else if (actualOrder.equals(expectedOrderByDescending)) {

            Assert.assertEquals(expectedOrderByDescending, actualOrder);

        }


    }}


