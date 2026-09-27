package Auth;

import org.testng.annotations.*;

public class RegisterTest {



    @BeforeClass
    void setUpClass(){
        System.out.println("BeforeClass RegisterTest");
    }

    @BeforeMethod
    void setUpMethod(){
        System.out.println("BeforeMethod RegisterTest");
    }



    @AfterClass
    void closeClass(){
        System.out.println("AfterClass RegisterTest");
        System.out.println("=============================");
    }

    @AfterMethod
    void closeMethod(){
        System.out.println("AfterMethod RegisterTest");
    }

    @Test
    void TC_C(){
        System.out.println("TC_C RegisterTest");
    }

    @Test
    void TC_D(){
        System.out.println("TC_D RegisterTest");
    }
}
