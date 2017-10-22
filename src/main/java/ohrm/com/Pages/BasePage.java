package ohrm.com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by User on 24/10/2016.
 */
public class BasePage {

    //Instantiate the WebDriver object
    public static WebDriver driver;

    public static String baseURL = "https://qamasterssri-trials63.orangehrmlive.com";
    public static String adminUsername = "admin", adminPassword = "RRofxm4R";

    public static void startBrowser() {
        //provide the driver profile for chrome browser
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("-incognito");
        driver = new ChromeDriver(options);



        //provide the driver profile for firefox browser
//        System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
//        driver = new FirefoxDriver();

        driver.get(baseURL);
    }

    public static void closeBrowser() {
        driver.close();
    }

    public void switchToIframe() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.switchTo().frame("noncoreIframe");
    }

}
