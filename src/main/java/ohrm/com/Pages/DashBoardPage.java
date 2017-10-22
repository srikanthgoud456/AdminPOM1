package ohrm.com.Pages;

import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

/**
 * Created by User on 09/09/2017.
 */
public class DashBoardPage extends BasePage {

    public void navigateToEmployeeListpage() {
        // navigate to employee list page
        driver.findElement(By.id("menu_pim_viewPimModule")).click();
//        driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
    }
    public void navigateToAddEmpPage() {
        this.navigateToEmployeeListpage();
        // navigate to add employee page
        driver.findElement(By.id("menu_pim_addEmployee")).click();
    }

    public void navigateToAddSkillsPage() {
        this.navigateToSystemUsersListPage();
        // navigate to add skills page
        driver.findElement(By.id("menu_admin_Qualifications")).click();
        driver.findElement(By.linkText("Skills")).click();
        driver.findElement(By.id("btnAdd")).click();
    }

    public void navigateToSystemUsersListPage() {
        switchToIframe();
        // navigate to SystemUsers list page
        driver.findElement(By.id("menu_admin_viewAdminModule")).click();
    }

    public String getWelcomeMessage() {
        switchToIframe();
        return driver.findElement(By.id("welcome")).getText();
    }

    public boolean isUserOnDashBoardPage() {
        switchToIframe();
        return driver.findElement(By.id("menu-content")).isDisplayed();
    }
    public void logout() {
        // logout
        driver.findElement(By.id("welcome")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Logout")).click();
    }
}
