package ohrm.com;

import ohrm.com.Pages.*;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by User on 24/10/2016.
 */
public class SmokeTestSuite extends BaseTest {

    //Test Data
    String firstname = "testfirst", middlename = "testmiddle",lastname = "testlast";

    String empUsername = "TestUsername"+Utils.generateRandomNumber();
    String empPassword = "Password1";
    String empStatus = "Enabled", empLocation = "Indian Development Center";
    String skillname = "TestSkillName"+Utils.generateRandomNumber();
    String skillDescription = "Software developer in test";

    // creating object for reusable funcitons classes
    LoginPage loginPage = new LoginPage();
    DashBoardPage dashBoardPage = new DashBoardPage();
    AddEmpPage addEmpPage = new AddEmpPage();
    PInfoPage pInfoPage = new PInfoPage();
    BasePage basePage = new BasePage();

    @Test
    public void verifyAdminCanAddEmp() {
        loginPage.loginAs(adminUsername, adminPassword);

        // verify Admin is logged in or not
        Assert.assertTrue(dashBoardPage.isUserOnDashBoardPage());
        dashBoardPage.navigateToAddEmpPage();
        // verify Admin is on add employee page
        Assert.assertTrue(addEmpPage.isUserOnTheAddEmpPage());
        addEmpPage.createEmployeeWithUserDetails(firstname, middlename,lastname, empLocation,empUsername, empPassword);
        // verify employee added successfully
        Utils.wait(10);
        Assert.assertTrue(pInfoPage.getProfileName().contains(firstname));
        // verify admin is in personal information page
        Assert.assertTrue(pInfoPage.isUserOnPIPage());
        dashBoardPage.logout();
    }
}