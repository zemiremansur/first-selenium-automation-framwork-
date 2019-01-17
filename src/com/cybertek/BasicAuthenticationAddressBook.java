package com.cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BasicAuthenticationAddressBook {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver",
                "/Users/yimuran/Selenium_dependencies/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();



        driver.manage().window().fullscreen();     // how to maximize the page   (toluh ikran yuzida kositix buyriki)


         // go to open crome and web page
        driver.get("http://a.testaddressbook.com/sign_in");

        // finding element from page
       WebElement inputEmail = driver.findElement(By.id("session_email"));

        // enter the user name
       inputEmail.sendKeys( "kexesobepu@zsero.com");


       WebElement inputPassword = driver.findElement(By.id("session_password"));

       //enter password
       inputPassword.sendKeys("password");

      //  inputEmail.clear();        will clear email


      WebElement  signButton = driver.findElement(By.name("commit"));


       System.out.println(driver.getTitle());



       signButton.click();   // click on the button


        System.out.println(driver.getTitle());


        WebElement username =  driver.findElement(By.className("navbar-text"));



        String actualUsername = username.getText();

        System.out.println(actualUsername);



          // Verify username is displayed on page

        if ("kexesobepu@zsero.com".equals(actualUsername)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("EXPECTED : kexesobepu@zsero.com");
            System.out.println("actualUsername = " + actualUsername);
        }


         // Verify title

        if(!driver.getTitle().contains("sign In")){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println(driver.getTitle());
        }


        // go to home page








    }


}
