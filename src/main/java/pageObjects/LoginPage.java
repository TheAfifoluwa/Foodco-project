package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver= driver;
    }
//locate username element
    private By username= By.xpath("//*[@id=\"username\"]");
    public void enterUsername(String uName){
        driver.findElement(username).sendKeys(uName);
    }
    private By password= By.xpath("//*[@id=\"password\"]");
    public void enterPassword(String pass){
        driver.findElement(password).sendKeys(pass);
    }
    public DashboardPage clickLoginBtn(){
        driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[4]/button")).click();
        //return dashboard page
        return new DashboardPage(driver);
    }
    //go back to home page
    public HomePage clickHome(){
        driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div/div[2]/ul/li[1]/a")).click();
        System.out.println("Account logged out, page URL is https://foodco.ng");
        return new HomePage(driver);
    }
}
