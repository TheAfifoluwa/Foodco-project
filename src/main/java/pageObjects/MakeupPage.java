package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertTrue;

public class MakeupPage {
    private WebDriver driver;
    public MakeupPage(WebDriver driver) {
        this.driver=driver;
    }
    private By item1 = By.xpath("//*[@id=\"content\"]/div[3]/ul/li[2]/div/div[2]/a/h3");
    public void getItem1(){
         assertTrue(driver.findElement(item1).isDisplayed());
    }
    private By item2 = By.xpath("//*[@id=\"content\"]/div[3]/ul/li[1]/div/div[2]/a/h3");
    public void getItem2(){
        assertTrue(driver.findElement(item2).isDisplayed());
    }
    private By item3 = By.xpath("//*[@id=\"content\"]/div[3]/ul/li[3]/div/div[2]/a/h3");
    public void getItem3(){
        assertTrue(driver.findElement(item3).isDisplayed());
    }
    private By logout= By.xpath("//*[@id=\"nav-menu-item-6558\"]/a");
    public DashboardPage clickLogout(){
        driver.findElement(logout).click();
        return new DashboardPage(driver);
    }
}
