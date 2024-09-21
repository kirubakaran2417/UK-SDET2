package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Amazon {

    private WebDriver driver;
    @BeforeClass
    public void testBrowser() {
        driver=BrowserConfiguration.getCHromebrowser();
    }

    @Test(priority = 1)
    public void goToAmazon(){
        driver.get("https://amazon.co.uk/");
    }

    @Test(priority = 2)
    public void mouseHoversignin(){
        driver.findElement(By.id("sp-cc-accept")).click();
        WebElement signIn=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        Actions actions = new Actions(driver);
        actions.moveToElement(signIn).build().perform();
    }

    @Test(priority = 3)
    public void clickYourRecommendations(){
        driver.findElement(By.linkText("Your Recommendations")).click();
    }

    @Test(priority = 4)
    public void printToppicksforyou(){
        WebElement topPicks= driver.findElement(By.xpath("//div[@class='_cDEzb_card-title_1EuRU']//h2"));
        System.out.println(topPicks.getText());
    }

   @Test(priority = 5)
   public void takeAllproductsNames() throws InterruptedException {
        Thread.sleep(2000);
       List<WebElement> products=driver.findElements(By.xpath("//div[contains(@class,'p13n-sc-truncated')]"));
       int count=products.size();
       System.out.println("Total products are: "+count);
       for (int i=0;i<5;i++){
           System.out.println(products.get(i).getText());
       }
   }

   @Test(priority = 6)
   public void takeScreenShot() throws IOException {
       TakesScreenshot screenshot=(TakesScreenshot)driver;
       File src=screenshot.getScreenshotAs(OutputType.FILE);
       File dest=new File("amazon.jpg");
       FileUtils.copyFile(src,dest);
   }


}
