package Tests;
//sample project
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;
public class MyTestClass {
    ChromeDriver driver;

    @BeforeTest
    public void setUp(){
        System.out.println("Test case starting now...");
    }
    @Test
    public void print() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println("welcome to selenium");
        driver.get("https://www.flipkart.com");
        Thread.sleep(3000);
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}

