package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SaucedemoTestCases {

    WebDriver driver;
    //Testing without userName and Valid Password
    @Test(priority = 1)
    public void test4() throws InterruptedException {
        driver=BrowserConfiguration.getCHromebrowser();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        //storing arguments in webelements
        WebElement username=driver.findElement(By.id("user-name"));
        WebElement pwd=driver.findElement(By.id("password"));
        WebElement loginbutton=driver.findElement(By.id("login-button"));
        username.clear();
        pwd.clear();
        pwd.sendKeys("secret_sauce");
        loginbutton.click();
        WebElement error=driver.findElement(By.cssSelector("div.error-message-container.error"));
        Assert.assertTrue(error.isDisplayed(),"Error message not displayed");
    }
}
