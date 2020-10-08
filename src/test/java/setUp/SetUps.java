package setUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageObjects.*;

public class SetUps {
    //create webdriver object
    private WebDriver driver;

    //create page objects
    protected HomePage homePage;
    protected LoginPage loginPage;
    protected DashboardPage dashboardPage;
    protected HouseholdPage householdPage;
    protected BathBedPage bathBedPage;
    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        //Instantiate webdriver object
        driver= new ChromeDriver();
        //maximize browser
        driver.manage().window().maximize();
        //launch foodco application
        driver.get("https://foodco.ng/");
        //instantiate Home page
        homePage= new HomePage(driver);

    }
    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }

}
