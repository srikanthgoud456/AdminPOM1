package ohrm.com.Pages;

import org.openqa.selenium.By;

/**
 * Created by User on 09/09/2017.
 */
public class AddSkillsPage extends BasePage{
    public void addSkill(String skillname, String skillDescription) {
        // fill the add skill form
        driver.findElement(By.id("skill_name")).sendKeys(skillname);
        driver.findElement(By.id("skill_description")).sendKeys(skillDescription);

        // click the save button
        driver.findElement(By.id("btnSave")).click();
    }
}
