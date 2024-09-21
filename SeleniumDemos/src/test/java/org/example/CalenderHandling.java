package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class CalenderHandling {

    @Test
    public void test1() {
        //to disable the notifications in chrome browser
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        //it is used to open the browser
        WebDriver driver = new ChromeDriver(options);
        //it is used to maximize the window
        driver.manage().window().maximize();
        //it is used to open the url
        driver.get("https://www.easemytrip.com/");
        //click on the departure date using id
        driver.findElement(By.id("ddate")).click();
        while(true){
            WebElement month = driver.findElement
                    (By.xpath("(//div[@class='month2'])[1]"));
            String monthText = month.getText();//SEP 2024
            String monthName = monthText.split(" ")[0];
            if(monthName.equals("NOV")){
                break;
            }else{
                driver.findElement(By.id("img2Nex")).click();
            }
        }
    }
}
