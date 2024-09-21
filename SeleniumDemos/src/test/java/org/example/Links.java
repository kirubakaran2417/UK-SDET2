package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class Links {

    private WebDriver driver;
    @BeforeClass
    public void testBrowser() {

        driver=BrowserConfiguration.getCHromebrowser();
    }

    @Test
    public void test1() {
       driver.get("https://www.mycontactform.com");
       driver.findElement(By.linkText("Sample Forms")).click();
        List<WebElement> links = driver.findElements(By.xpath("//div[@id='left_col_wrapper']//ul/li/a"));
        System.out.println(links.size());
      for(int i=1;i<links.size();i++){
          List<WebElement> links1 = driver.findElements(By.xpath("//div[@id='left_col_wrapper']//ul["+i+"]/li/a"));
          for (int j=1;j<links1.size();j++){
              driver.findElement(By.xpath("//div[@id='left_col_wrapper']//ul["+i+"]/li["+j+"]/a")).click();
          }
      }
    }
}
