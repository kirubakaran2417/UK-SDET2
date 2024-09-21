package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datadriven {
    //Data provider-used to pass data to the test method
    @DataProvider(name="testdata")
    public String[] testdata(){
        String[] data = new String[4];
        data[0]="Track And Trail";
        data[1]="Chennai Cyclists";
        data[2]="Bums On The Saddle";
        data[3]="Cyclop";
        return data;
    }
    @Test(dataProvider = "testdata")
    public void test1(String searchtext){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/search?q=decathlon");
        WebElement searchBox=driver.findElement(By.id("APjFqb"));
        searchBox.clear();
        searchBox.sendKeys(searchtext);
        WebElement searchButton=driver.findElement(By.cssSelector("button[type='submit']"));
        searchButton.click();

        WebElement elementText=driver.findElement(By.xpath("(//span[@class='VuuXrf'])[1]"));
        System.out.println(elementText.getText());
    }

}
