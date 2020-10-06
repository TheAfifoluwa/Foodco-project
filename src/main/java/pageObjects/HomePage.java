package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertEquals;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver=driver;
    }
    private By popupHeading = By.xpath("/html/body/div[6]/div[2]/h3");
    public String getPopupHeading(){
      return driver.findElement(popupHeading).getText();
    }
    //select lagos as delivery area
    private By lagos=By.xpath("/html/body/div[6]/div[2]/div[1]/form/label[2]");
    public void selectLagos(){
        driver.findElement(lagos).click();
    }
    //get login page
    private By myAccount=By.xpath("//*[@id=\"nav-menu-item-20267\"]/a");
       public LoginPage clickMyaccount(){
           driver.findElement(myAccount).click();
           return new LoginPage(driver);
       }
}
