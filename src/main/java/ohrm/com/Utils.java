package ohrm.com;

import ohrm.com.Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Created by User on 24/10/2016.
 */
public class Utils extends BasePage {
//    static int TimeOut =40;
    public static void wait(int seconds) {
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }

    //Method to check whether the given text is present at given location
    public static boolean isTextPresentAt(By element, String text) {
        return driver.findElement(element).getText().contains(text);
    }
    //Method to check whether the given element is present in the page
    public static boolean isElementPresent(By element) {
        return driver.findElement(element).isDisplayed();
    }

    //method to select an item from the drop down menu
    public static void selectFromList(WebElement element, String text) {
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }



    //Generate Random number
    public static int generateRandomNumber() {
        Random r = new Random();
        int randomNumber = r.nextInt();
        return randomNumber;
    }

    public static void waitForElementVisible(WebElement element, int time) {
        WebDriverWait wait = new WebDriverWait(driver,time);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
