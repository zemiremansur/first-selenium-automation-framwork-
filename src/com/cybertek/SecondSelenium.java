package com.cybertek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SecondSelenium {


    public static void main(String[] args) {


        System.setProperty("webdriver.gecko.driver", "/Users/yimuran/Selenium_dependencies/drivers/geckodriver");

        WebDriver driver = new FirefoxDriver();


        driver.get("https://etsy.com");

        driver.navigate().to("https://amazon.com");

        driver.navigate().back();

        driver.navigate().forward();

        driver.navigate().refresh();


    }
}
