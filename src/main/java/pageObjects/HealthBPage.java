package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HealthBPage {
    private WebDriver driver;
    public HealthBPage(WebDriver driver) {
        this.driver=driver;
    }
    //click on make up sub-category
    private By makeup= By.xpath("//*[@id=\"content\"]/div[3]/ul/li[3]/a/span/span[1]");
    public MakeupPage clickMakeUp(){
        driver.findElement(makeup).click();
        return new MakeupPage(driver);
    }
}
