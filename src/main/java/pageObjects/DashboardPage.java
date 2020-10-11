package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertEquals;

public class DashboardPage {
    private WebDriver driver;
    public DashboardPage(WebDriver driver) {
        this.driver=driver;
    }

    //click on health and beauty category
    public HouseholdPage clickHousehold(){
        driver.findElement(By.xpath("//*[@id=\"nav-menu-item-3339\"]/a")).click();
        return new HouseholdPage(driver);
    }

    //confirm logout
    public LoginPage confirmLogout(){
        driver.findElement(By.xpath("//*[@id=\"content\"]/article/div/div/div[1]/a")).click();
        return new LoginPage(driver);
    }
}
