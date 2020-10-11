package foodcoTests;

import org.testng.annotations.Test;
import pageObjects.*;
import setUp.SetUps;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HomePageTests extends SetUps {
        //Initialization of page objects
        LoginPage loginPage;
        DashboardPage dashboardPage;
        BathBedPage bathBedPage;
        HouseholdPage householdPage;

        @Test
        public void testHome(){
        //assert pop up window
        assertEquals(homePage.getPopupHeading(),"PLEASE SELECT A DELIVERY AREA","Pop up heading incorrect");

        //assert lagos
        assertTrue(homePage.getLagosText());
        System.out.println("Location and Lagos assertion passed");

        //click on lagos
        homePage.selectLagos();}

        @Test
        public void testLogin(){
        //login into dashboard
        loginPage= homePage.clickMyaccount();
        loginPage.enterUsername("folu@mailinator.com");
        loginPage.enterPassword("firstadmin@123");
        dashboardPage= loginPage.clickLoginBtn();}

        @Test
            public void testCatNSubcat(){
        //select category-household
        householdPage= dashboardPage.clickHousehold();

        //select subcategory- Bath and Bed
        bathBedPage= householdPage.clickbathBed();}

        @Test
        public void testItems(){
        //Assert 3 items in the subcategory
        assertEquals(bathBedPage.getItem1(),"Heart Tea Towel 50x70cm Bleige", "Item not found");
        System.out.println("Item 'Heart Tea Towel 50x70cm Black' is present");

        assertEquals(bathBedPage.getItem2(),"Lifestyle_Emma Barclay Bath Sheet Cornfl","Item not found");
        System.out.println("Item 'Lifestyle_Emma Barclay Bath Sheet Cornfl' is present");

        assertEquals(bathBedPage.getItem3(),"Kitchen Towels 2pk 18″”X28″” No.069619","Item not found");
        System.out.println("Item 'Kitchen Towels 2pk 18″”X28″” No.069619' is present");

        System.out.println("Item assertions passed");}

    @Test
            public void testLogout(){
        //click on logout
        bathBedPage.clickLogout();

        //confirm logout
        dashboardPage.confirmLogout();

        //go back to home page and print out "Account logged out. Page URL is https://foodco.ng/"
        loginPage.clickHome();

    }
    

}
