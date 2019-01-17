package com.cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prectice {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "/Users/yimuran/Selenium_dependencies/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();

        driver.get("http://www.facebook.com");

        WebElement inputEmail = driver.findElement(By.id())










    }

}
