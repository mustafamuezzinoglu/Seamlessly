package net.seamlessly.pages;

import net.seamlessly.utility.Driver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void navigateToModule(String moduleName) {



    }


}
