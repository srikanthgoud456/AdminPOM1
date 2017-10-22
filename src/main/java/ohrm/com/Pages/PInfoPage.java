package ohrm.com.Pages;

import org.openqa.selenium.By;

/**
 * Created by User on 09/09/2017.
 */
public class PInfoPage extends BasePage {

    public String getProfileName() {
       return driver.findElement(By.cssSelector("#profile-pic")).getText();
    }

    public boolean isUserOnPIPage() {
        return driver.findElement(By.id("employee-details")).isDisplayed();
    }
}
