package Packjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MyNewClass {
    WebDriver driver;
    //sample project
@Test
    public void print(){
        System.out.println("Hi");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.flipkart.com");
    }

    @AfterTest
    public void tearDown() throws InterruptedException {
    Thread.sleep(3000);
    driver.quit();
    }
}
