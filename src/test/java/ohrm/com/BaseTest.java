package ohrm.com;

import ohrm.com.Pages.BasePage;
import org.junit.AfterClass;
import org.junit.BeforeClass;

/**
 * Created by User on 24/10/2016.
 */
public class BaseTest extends BasePage {
    @BeforeClass
    public static void startUp() {
       startBrowser();
    }

    @AfterClass
    public static void tearDown() {
        //to close the browser
        closeBrowser();
    }


}
