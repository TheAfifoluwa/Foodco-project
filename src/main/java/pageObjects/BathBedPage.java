package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BathBedPage {
    private WebDriver driver;

    public BathBedPage(WebDriver driver) {
        this.driver = driver;
    }
    private By item1 = By.xpath("//*[@id=\"content\"]/div[3]/ul/li[5]/div/div[1]/a/div");

    public boolean getItem1() {
        return driver.findElement(item1).isDisplayed();
    }

    private By item2 = By.xpath("//*[@id=\"content\"]/div[3]/ul/li[2]/div/div[1]/a/div");

    public boolean getItem2() {
        return driver.findElement(item2).isDisplayed();
    }

    private By item3 = By.xpath("//*[@id=\"content\"]/div[3]/ul/li[4]/div/div[1]/a/div");

    public boolean getItem3() {
        return driver.findElement(item3).isDisplayed();
    }

    private By logout = By.xpath("//*[@id=\"nav-menu-item-6558\"]/a");

    public DashboardPage clickLogout() {
        driver.findElement(logout).click();
        return new DashboardPage(driver);
    }
}
