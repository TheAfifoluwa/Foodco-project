package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BathBedPage {
    private WebDriver driver;

    public BathBedPage(WebDriver driver) {
        this.driver = driver;
    }

    //locate first item
    private By item1 = By.xpath("//*[@id=\"content\"]/div[3]/ul/li[2]/div/div[2]/a/h3");

    //get name of first item
    public String getItem1() {
        return driver.findElement(item1).getText();
    }

    //locate second item
    private By item2 = By.xpath("//*[@id=\"content\"]/div[3]/ul/li[5]/div/div[2]/a/h3");

    //get name of second item
    public String getItem2() {
        return driver.findElement(item2).getText();
    }

    //locate third item
    private By item3 = By.xpath("//*[@id=\"content\"]/div[3]/ul/li[4]/div/div[2]/a/h3");

    //get name of third item
    public String getItem3() {
        return driver.findElement(item3).getText();
    }

    //click logout
    private By logout = By.xpath("//*[@id=\"nav-menu-item-6558\"]/a");
    public DashboardPage clickLogout() {
        driver.findElement(logout).click();
        //return dashboard page to confirm logout
        return new DashboardPage(driver);
    }
}
