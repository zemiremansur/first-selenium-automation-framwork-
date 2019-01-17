package com.cybertek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyURLTest {



    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "/Users/yimuran/Selenium_dependencies/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        String expectedUrl = "https://www.google.com/";

        String actualUrl = driver.getCurrentUrl();

        if (expectedUrl.equals(actualUrl)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("ActualUrl : " + actualUrl);
            System.out.println("expectedUrl : " + expectedUrl);
        }




    }
}
