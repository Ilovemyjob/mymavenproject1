package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CheckBox {

//    Create a class : CheckBox_RadioButton 
//Create main method and complete the following task. 
//Go to https://the-internet.herokuapp.com/checkboxes 
//Locate the elements of checkboxes 
//Then click on checkbox1 if box is not selected
//Then click on checkbox2 if box is not selected

    WebDriver driver;

    @Before
    public void setUp(){   // precondition
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    driver.get("https://the-internet.herokuapp.com/checkboxes");
    }

    @Test
    public void checkboxTest1(){

        WebElement checkbox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        WebElement checkbox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));

        if(!checkbox1.isSelected())
            checkbox1.click();

        if(!checkbox2.isSelected())
            checkbox2.click();
    }

    public void checkboxTest2(){

        WebElement checkbox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));


    }

}
