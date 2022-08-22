package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class ItemPage {
    public WebDriver driver;

    public ItemPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addToCart() throws InterruptedException {
        WebElement size = driver.findElement(By.id("group_1"));
        WebElement qty = driver.findElement(By.id("quantity_wanted"));
        //WebElement addTo = driver.findElement(By.xpath("//form[@id='add-to-cart-or-refresh']/div[2]/div/div[2]/button"));
        Select sel = new Select(size);
        sel.selectByValue("2");
         for (int i=0; i < 4; i ++) {
        qty.click();;
         }
        */qty.click();
        qty.sendKeys(Keys.CONTROL, "a");
        Thread.sleep(100);
        qty.sendKeys(Keys.DELETE);
        qty.sendKeys("5");
        qty.sendKeys(Keys.ENTER);/*
        WebElement proceed = driver.findElement(By.cssSelector("a.btn.btn-primary"));
        proceed.click();
    }
}
