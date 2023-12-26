package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;

public class Homework {

//1. Create a class SignInHomework
    WebDriver driver;
//2. Go to http://automationpractice.com/index.php
   @Before
    public void setUp(){
     WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
       driver.get("http://automationpractice.com/index.php");
   }
//            3. Click on sign in button
    @Test
    public void HW(){
        WebElement sighIn = driver.findElement(By.className("login"));
        sighIn.click();

        WebElement emailBox = driver.findElement(By.id("email_create"));
        emailBox.sendKeys("aac@gmail.com");

        WebElement createAccount = driver.findElement(By.id("SubmitCreatec"));
        createAccount.click();
    }

//4.Send your email and click on create an account button



//5.Verify the Text : CREATE AN ACCOUNT

//6. Verify the Text : YOUR PERSONAL INFORMATION
//7. Verify the Text : Title
//8. Select your title
//9. Enter your first name
//10. Enter your last name
//11. Enter your email
//12. Enter your password
//13. DO NOT ENTER DATE OF BIRTH-YOU DIDNT LEARN DROPDOWN YET
//14. Click on Sign up for our newsletter!
//            15. Enter your first name
//16. Enter your last lane
//17. Enter your company
//18. Enter your Address
//19. Enter your City
//20. DO NOT SELECT STATE-YOU DIDNT LEARN DROPDOWN YET
//21. Enter Postal Code
//22.DO NOT SELECT COUNTRY-
//            23. Enter additional information
//24. Enter home phone
//25. Enter mobile phone
//26. Enter reference name
//27. Click Register
//    THEN YOU SHOULD SEE SOME ERROR MESSAGE. TAKE A SCREENSHOT AND SHARE WITH ME
//====
//    Be careful about putting some wait.

//    @After
//    public void tearDown(){
//       driver.close();
//    }

}
