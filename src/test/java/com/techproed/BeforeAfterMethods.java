package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BeforeAfterMethods {
//    Create a class: BeforeAfterMethods 
//    Then create 3 different test methods using the following names 

    WebDriver driver;  //to prevent red line from the method we creare driver in class like instance

   @Before
   public void setUp(){
       WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
       driver.get("https://www.google.com");

       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

   }



    @Test
    public void titleTest(){

        String expectedTitle="Google";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println("Actual =" + actualTitle);
            System.out.println("Expected =" + expectedTitle);

        }
    }
    @Test
    public void imageTest() {


        WebElement imageElement = driver.findElement(By.xpath("//img[@alt='Google']"));

        if (imageElement.isDisplayed()) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
        @Test
        public void linkTest() {


            WebElement linkElement = driver.findElement(By.linkText("Gmail"));
            if (linkElement.isDisplayed()) {
                System.out.println("Pass");
            } else {
                System.out.println("Fail");

            }
        }
            @After
            public void tearDown() {
                driver.close();
            }



//    titleTest =>Verify if google title = “Google”
//    imageTest => Verify if google image displays or not
//    gmailLinkTest => Verify if the Gmail link is displayed or not
//    Close the browser after each test



}
