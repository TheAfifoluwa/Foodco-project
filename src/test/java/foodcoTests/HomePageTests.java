package foodcoTests;

import org.testng.annotations.Test;
import pageObjects.*;
import setUp.SetUps;

public class HomePageTests extends SetUps {
    @Test (priority = 1)
    public void testHome(){
        //assert pop up window
        homePage.getPopupHeading();
        //click on lagos
        homePage.selectLagos();
        //login into dashboard
        LoginPage loginPage= homePage.clickMyaccount();
        loginPage.enterUsername("folu@mailinator.com");
        loginPage.enterPassword("firstadmin@123");
        DashboardPage dashboardPage= loginPage.clickLoginBtn();
        //select category- health and beauty
        HealthBPage healthBPage= dashboardPage.clickHbBtn();
        //select subcategory- Makeup
        MakeupPage makeupPage=healthBPage.clickMakeUp();
        //Assert 3 items in the subcategory
        makeupPage.getItem1();
        makeupPage.getItem2();
        makeupPage.getItem3();
        //click on logout
        makeupPage.clickLogout();
        //confirm logout
        dashboardPage.confirmLogout();
        //go back to home page and print out "Account logged out. Page URL is https://foodco.ng/"
        loginPage.clickHome();

    }
    

}
