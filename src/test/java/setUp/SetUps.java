package setUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageObjects.*;

public class SetUps {
    //create webdriver object
    private WebDriver driver;

    //create home page object
    protected HomePage homePage;

    @BeforeTest
    public void setUp(){
        //chrome browser
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        //Instantiate webdriver object
        driver= new ChromeDriver();

        //firefox browser
        //System.setProperty("webdriver.gecko.driver","resources/geckodriver.exe");
        //Instantiate webdriver object
        //driver= new FirefoxDriver();

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
