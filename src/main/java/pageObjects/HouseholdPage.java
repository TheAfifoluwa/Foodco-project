package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HouseholdPage {
    private WebDriver driver;
    public HouseholdPage(WebDriver driver) {
        this.driver=driver;
    }
    //click on bath and bed sub-category
    private By bathBed= By.xpath("//*[@id=\"content\"]/div[3]/ul/li[1]/a/span/span[1]");
    public BathBedPage clickbathBed(){
        driver.findElement(bathBed).click();
        return new BathBedPage(driver);
    }
}
