package com.webdriverbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class browser {
    public static WebDriver driver;
    public static void main(String[] args){

            chrome_launch();
            msedge_launcher();
            chrome_close();
    }

    public static void chrome_launch(){

        System.setProperty("webdriver.chrome.driver","./src/main/resources/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        // driver.get("https://www.google.com");
    }

    public static void msedge_launcher(){

        System.setProperty("webdriver.msedge.driver","./src/main/resources/Drivers/msedgedriver.exe");
        driver = new EdgeDriver();

    }
    public static void chrome_close(){

        driver.close();
    }
}
