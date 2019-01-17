package com.cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWait {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "/Users/yimuran/Selenium_dependencies/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        // this line makes the findElement method wait for some time when it cannot find an element
        // findElement method will keep trying to locate the element during the given duration
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("http://www.cheapfansedge.info");

        driver.findElement(By.tagName("inpsdfsdfut")).sendKeys("asdfasdfd");

        // HARD CODED WAIT

        //    Thread.sleep(5000);

        driver.get("https://google.com");










    }
}
