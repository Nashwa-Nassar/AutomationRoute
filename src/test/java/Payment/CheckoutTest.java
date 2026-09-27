package Payment;

import org.testng.annotations.*;

public class CheckoutTest {



    @BeforeClass
    void setUpClass(){
        System.out.println("BeforeClass CheckoutTest");
    }

    @BeforeMethod
    void setUpMethod(){
        System.out.println("BeforeMethod CheckoutTest");
    }



    @AfterClass
    void closeClass(){
        System.out.println("AfterClass CheckoutTest");
        System.out.println("================================");
    }

    @AfterMethod
    void closeMethod(){
        System.out.println("AfterMethod CheckoutTest");
    }

    @Test
    void TC_C(){
        System.out.println("TC_C CheckoutTest");
    }

    @Test
    void TC_D(){
        System.out.println("TC_D CheckoutTest");
    }
}
