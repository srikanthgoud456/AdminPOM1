package ohrm.com.Pages;

import ohrm.com.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by User on 09/09/2017.
 */
public class LoginPage extends BasePage {
    @FindBy (id = "txtUsername")
    public WebElement uNameField;

    @FindBy (id = "txtPassword")
    public WebElement pwdField;

    @FindBy (css = "#btnLogin")
    public WebElement loginButton;

    public LoginPage() {
        PageFactory.initElements(driver,this);
    }

    public void loginAs(String username,String password) {
        // Login as an Admin(enter username, enter password, click on login)
        uNameField.sendKeys(username);
        pwdField.sendKeys(password);
        loginButton.click();

    }

}
