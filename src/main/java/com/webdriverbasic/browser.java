package com.webdriverbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browser {
    public static void main(String[] args){
        WebDriver driver ;
        System.setProperty("webdriver.chrome.driver","./src/main/resources/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
       // driver.get("https://www.google.com");
        driver.close();
    }
}
