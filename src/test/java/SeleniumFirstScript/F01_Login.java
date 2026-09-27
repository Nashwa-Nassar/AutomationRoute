package SeleniumFirstScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class F01_Login {

    @BeforeMethod
    void setUp(){

    }

    @Test
    void validLogin(){
        //1. open browser and url
        //chromedriver, get
        String HEROKUAPP_URL = "https://the-internet.herokuapp.com/login";
//        ChromeDriver driver3 = new ChromeDriver();
//        FirefoxDriver driver1 = new FirefoxDriver();
//        EdgeDriver driver2 = new EdgeDriver();
        WebDriver driver = new ChromeDriver(); // open browser
        driver.get(HEROKUAPP_URL); // open website url


    }

    @Test
    void inValidLogin(){

    }

    @AfterMethod
    void close(){

    }
}
