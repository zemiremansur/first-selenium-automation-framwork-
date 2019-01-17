package com.cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RetrievePassword {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver",
                "/Users/yimuran/Selenium_dependencies/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().fullscreen();

        driver.get("https://the-internet.herokuapp.com/forgot_password");



         WebElement inputEmail = driver.findElement(By.tagName("input"));


         inputEmail.sendKeys( "zamiramansur@gmail.com");


         WebElement  button  = driver.findElement(By.tagName("button"));

         button.click();










    }
}
