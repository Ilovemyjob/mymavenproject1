package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class AssertionAnnotation {





//    Create a class: BeforeAfterMethods 
//    Then create 3 different test methods using the following names 

        WebDriver driver;  //to prevent red line from the method we creare driver in class like instance

        @Before
        public void setUp(){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get("https://www.google.com");
            driver.manage().window().maximize();
            driver.findElement(By.xpath("//button[@id='L2AGLb']")).click();
            driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

//            driver.findElement(By.xpath("(//div[@class='VfPpkd-RLmnJb'])[1]")).click();
//            driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
//
//            driver.findElement(By.xpath("(//div[@class='VfPpkd-RLmnJb'])[3]")).click();
//            driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
//
//            driver.findElement(By.xpath("(//div[@class='VfPpkd-RLmnJb'])[12]")).click();



            driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);


        }



        @Test
        public void titleTest(){

            String expectedTitle="Google";
            String actualTitle = driver.getTitle();
            Assert.assertEquals(expectedTitle,actualTitle); // instead of if use it and get info


        }
        @Test
        public void imageTest() {


            WebElement imageElement = driver.findElement(By.xpath("//img[@alt='Google']"));
            Assert.assertTrue(imageElement.isDisplayed()); // instead of if image statement

        }
        @Test
        public void linkTest() {


            WebElement linkElement = driver.findElement(By.linkText("Gmail"));
           Assert.assertTrue(linkElement.isDisplayed());   //i

            }

        //@After
        public void tearDown() {
            driver.close();
        }



//    titleTest =>Verify if google title = “Google”
//    imageTest => Verify if google image displays or not
//    gmailLinkTest => Verify if the Gmail link is displayed or not
//    Close the browser after each test



    }



