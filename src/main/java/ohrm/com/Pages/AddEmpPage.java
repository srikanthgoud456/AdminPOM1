package ohrm.com.Pages;

import ohrm.com.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * Created by User on 09/09/2017.
 */
public class AddEmpPage extends BasePage {

    @FindBy(id = "firstName")
    WebElement firstName;
    @FindBy(id = "middleName")
    WebElement middleName;
    @FindBy(id = "lastName")
    WebElement lastName;
    @FindBy(css = "select[name='location]")
    WebElement locationField;
    @FindBy(xpath = "//div[@id='location_inputfileddiv']/div/ul/li/span")
    List<WebElement> locations;
    @FindBy(id = "addPhotographBtn")
    WebElement addPhotographButton;
    @FindBy(xpath = "//div[@class='schema-form-section col s12 m12 l6']/sf-decorator[4]/div/label")
    WebElement loginDetailsChk;
    @FindBy(id = "username")
    WebElement userName;
    @FindBy(id = "password")
    WebElement password;
    @FindBy(id = "confirmPassword")
    WebElement confirmPassword;
    @FindBy(xpath = "//input[@class='select-dropdown']")
    WebElement statusInput;
    @FindBy(id = "status")
    WebElement status;
    @FindBy(id = "systemUserSaveBtn")
    WebElement saveButton;
    @FindBy(xpath = "//a[@class='modal-action modal-close waves-effect waves-green btn']")
    WebElement cancelButton;

    @FindBy(css = "#addEmployeeModal")
    WebElement addEmpModal;

    public AddEmpPage () {
        PageFactory.initElements(driver,this);
    }
    public void createEmployee(String firstName, String middleName, String lastName, String location) {
        this.firstName.sendKeys(firstName);
        this.middleName.sendKeys(middleName);
        this.lastName.sendKeys(lastName);
        this.locations.get(1).click(); // use the input and select the value
        this.saveButton.click();
    }

    public void createEmployeeWithUserDetails(String fname, String mname, String lname, String user_location,String uid, String pwd) {
        firstName.sendKeys(fname);
        middleName.sendKeys(mname);
        lastName.sendKeys(lname);
//        locations.get(1).click(); // use the input and select the value
        Utils.selectFromList(locationField,user_location);
        saveButton.click();
        loginDetailsChk.click();
        userName.sendKeys(uid+Math.random());
        password.sendKeys(pwd);
        confirmPassword.sendKeys(pwd);
    }

    public void save() {
        saveButton.click();
    }

    public void cancel() {
        this.cancelButton.click();
    }

    public void addPhotograph() {
        this.addPhotographButton.click();
    }
    public boolean isUserOnTheAddEmpPage() {
//        Utils.wait(2000);
        Utils.waitForElementVisible(addEmpModal,10);
        return driver.findElement(By.id("addEmployeeModal")).isDisplayed();
    }

}
