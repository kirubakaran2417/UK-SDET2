package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MouseActions {

    private WebDriver driver;
    @BeforeClass
    public void testBrowser() {
        driver=BrowserConfiguration.getCHromebrowser();
    }

    @Test(priority = 1)
    public void gotojqueryUI(){
        driver.get("https://jqueryui.com/");
    }

    @Test(priority = 2)
    public void clickondroppable(){
        driver.findElement(By.linkText("Droppable")).click();
    }
    @Test(priority = 3)
    public void mouseactions(){
        //handling frames
        WebElement frame = driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(frame);
        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));
        //Actions class is used to perform mouse actions
        Actions actions = new Actions(driver);
        actions.moveToElement(draggable)
                .clickAndHold(draggable)
                .moveToElement(droppable)
                .release(droppable).build().perform();
    }
}
