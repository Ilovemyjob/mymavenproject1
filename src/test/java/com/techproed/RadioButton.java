package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RadioButton {
//    Create a class : RadioButton 
//    Create main method and complete the following task. 
//    Go to https://www.facebook.com/ 
//    Locate the elements of radio buttons 
//    Then click on the radio buttons for your gender if they are not selected 
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
    }

    @Test
    public void radioButton(){


        WebElement selectBox = driver.findElement(By.xpath("//a[@id='u_0_2']"));
        selectBox.click();

        WebElement maleButton = driver.findElement(By.xpath("(//label[@class='_58mt'])[2]"));
        maleButton.click();






    }



}
