package Auth;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class A {
    @BeforeMethod
    void setUp(){
        System.out.println("BeforeMethod");
    }

    @AfterMethod
    void cleanUp(){

    }

    @Test
    void TC_A(){
        System.out.println("TC_A LoginTest");
    }

    @Test
    void TC_B(){
        System.out.println("TC_B LoginTest");
    }
}
