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
        WebElement qty = driver.findElement(By.cssSelector("button.btn.btn-touchspin.js-touchspin.bootstrap-touchspin-up"));

        Select sel = new Select(size);
        sel.selectByValue("2");
        for (int i = 0; i < 5; i++) {
            qty.click();
            Thread.sleep(500);
        }

        WebElement addTo = driver.findElement(By.cssSelector("button.btn.btn-primary.add-to-cart"));
        addTo.click();

        WebElement proceed = driver.findElement(By.cssSelector("a.btn.btn-primary"));
        proceed.click();
    }
}
