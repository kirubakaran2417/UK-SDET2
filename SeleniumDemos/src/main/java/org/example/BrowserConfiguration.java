package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserConfiguration {

    private static WebDriver driver;


    public static WebDriver getCHromebrowser(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }
}
