package com.cybertek;

import com.sun.javadoc.SourcePosition;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.awt.geom.AreaOp;

import javax.sound.midi.Soundbank;

public class FirstSeleniumEver {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "/Users/yimuran/Selenium_dependencies/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");

        String actualTitle = driver.getTitle();


        System.out.println("actualTitle = " + actualTitle);

        String expectedTitle = "Google";

        // Verifying
        if (expectedTitle.equals(actualTitle)){
            System.out.println("PASS");

        }else {
            System.out.println("FAIL");
            System.out.println("Expected: " + expectedTitle);
            System.out.println("Actual :" + actualTitle);
        }




    }
}
