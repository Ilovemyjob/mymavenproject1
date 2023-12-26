package com.techproed;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstMavenClass {
    public static void main(String[] args) {
        //Step  1:Create WebDriverManager
        WebDriverManager.chromedriver().setup();


        //Step 2: Create ChromeDriver
        WebDriver driver = new ChromeDriver();
        //Step 3: Go to webpage

        driver.get("https://www.google.com/");
        //Search for a rondom name
        //And check how many results are there?


        Faker faker = new Faker();

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(faker.name().fullName() + Keys.ENTER);

    }
}
