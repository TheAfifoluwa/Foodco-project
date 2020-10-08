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
        //assert lagos
        assertTrue(homePage.getLagosText());
        System.out.println("Location and Lagos assertion passed");
        //click on lagos
        homePage.selectLagos();
        //login into dashboard
        LoginPage loginPage= homePage.clickMyaccount();
        loginPage.enterUsername("folu@mailinator.com");
        loginPage.enterPassword("firstadmin@123");
        DashboardPage dashboardPage= loginPage.clickLoginBtn();
        //select category-household
        HouseholdPage householdPage= dashboardPage.clickHousehold();
        //select subcategory- Bath and Bed
        BathBedPage bathBedPage= householdPage.clickbathBed();
        //Assert 3 items in the subcategory
        assertTrue(bathBedPage.getItem1());
        assertTrue(bathBedPage.getItem2());
        assertTrue(bathBedPage.getItem3());
        System.out.println("Item assertion passed");
        //click on logout
        bathBedPage.clickLogout();
        //confirm logout
        dashboardPage.confirmLogout();
        //go back to home page and print out "Account logged out. Page URL is https://foodco.ng/"
        loginPage.clickHome();

    }
    

}
