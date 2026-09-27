package Auth;

import jdk.swing.interop.SwingInterOpUtils;
import org.testng.annotations.*;

public class LoginTest {
    @BeforeSuite
    void setUpSuite(){
        System.out.println("BeforeSuite");
    }

    @BeforeTest
    void setUpTest(){
        System.out.println("BeforeTest AuthTest");
    }

    @BeforeClass
    void setUpClass(){
        System.out.println("BeforeClass LoginTest");
    }

    @BeforeMethod
    void setUpMethod(){
        System.out.println("BeforeMethod LoginTest");
    }

    @AfterSuite
    void closeSuite(){
        System.out.println("AfterSuite ");
    }

    @AfterTest
    void closeTest(){
        System.out.println("AfterTest AuthTest");
    }

    @AfterClass
    void closeClass(){
        System.out.println("AfterClass LoginTest");
        System.out.println("=============================");
    }

    @AfterMethod
    void closeMethod(){
        System.out.println("AfterMethod LoginTest");
    }

    @Test(priority = 1)
    void TC_A(){
        System.out.println("TC_A LoginTest");
    }

    @Test(priority = 0, invocationCount = 3, enabled = true, dependsOnMethods = {"TC_A"})
    void TC_B(){
        System.out.println("TC_B LoginTest");
    }
}
