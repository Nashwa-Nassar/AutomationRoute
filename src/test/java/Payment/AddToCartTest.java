package Payment;

import org.testng.annotations.*;

public class AddToCartTest {


    @BeforeTest
    void setUpTest(){
        System.out.println("BeforeTest PaymentTest");
    }

    @BeforeClass
    void setUpClass(){
        System.out.println("BeforeClass AddToCartTest");
    }

    @BeforeMethod
    void setUpMethod(){
        System.out.println("BeforeMethod AddToCartTest");
    }



    @AfterTest
    void closeTest(){
        System.out.println("AfterTest PaymentTest");
    }

    @AfterClass
    void closeClass(){
        System.out.println("AfterClass AddToCartTest");
        System.out.println("================================");
    }

    @AfterMethod
    void closeMethod(){
        System.out.println("AfterMethod AddToCartTest");
    }

    @Test
    void TC_A(){
        System.out.println("TC_A AddToCartTest");
    }

    @Test
    void TC_B(){
        System.out.println("TC_B AddToCartTest");
    }
}
