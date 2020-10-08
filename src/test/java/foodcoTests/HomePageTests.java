package foodcoTests;

import org.testng.annotations.Test;
import pageObjects.*;
import setUp.SetUps;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HomePageTests extends SetUps {
    @Test
    public void testHome(){
        //assert pop up window
        assertEquals(homePage.getPopupHeading(),"PLEASE SELECT A DELIVERY AREA","Pop up heading incorrect");
        //asert lagos
        assertTrue(homePage.getLagosText());
        System.out.println("Location and Lagos assertion passed");
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
        assertTrue(makeupPage.getItem1());
        assertTrue(makeupPage.getItem2());
        assertTrue(makeupPage.getItem3());
        System.out.println("Item assertion passed");
        //click on logout
        makeupPage.clickLogout();
        //confirm logout
        dashboardPage.confirmLogout();
        //go back to home page and print out "Account logged out. Page URL is https://foodco.ng/"
        loginPage.clickHome();

    }
    

}
