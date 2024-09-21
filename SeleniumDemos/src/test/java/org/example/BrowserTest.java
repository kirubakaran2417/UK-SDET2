package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BrowserTest {

    private WebDriver driver;
    @BeforeClass
    public void testBrowser() {
        BrowserConfiguration.getCHromebrowser();
    }
    @Test(description = "Open mycontactform Home Page",priority = 1)
    public void opening_mycontactform_page() {
        driver.get("https://www.mycontactform.com");

    }
    @Test(description = "open sampleforms page using linktext",priority = 2,enabled = false)
    public void click_sampleforms_link() {
           driver.findElement(By.linkText("Sample Forms")).click();
    }

    @Test(description = "handle text boxes in sample forms page",priority = 3)
    public void type_email() {
        driver.findElement(By.id("email")).sendKeys("a@a.com");
        driver.findElement(By.xpath("//input[@value='Fourth Option']")).click();
    }
    @Test(description = "mouse actions",priority = 4)
    public void mouse_actions() {
        driver.findElement(By.linkText("Sample Forms")).click();
    }

}
