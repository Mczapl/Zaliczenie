package pages;

import org.openqa.selenium.*;

public class Checkout {
    public WebDriver driver;

    public Checkout(WebDriver driver) {
        this.driver = driver;
    }

    public void buy() {
        WebElement proceedToCheckout = driver.findElement(By.cssSelector("a.btn.btn-primary"));
        proceedToCheckout.click();
        WebElement addresAccept = driver.findElement(By.cssSelector("button.btn.btn-primary.continue.float-xs-right"));
        addresAccept.click();
        WebElement shippingAccept = driver.findElement(By.name("confirmDeliveryOption"));
        shippingAccept.click();
    }

    public void order() throws InterruptedException {
        WebElement payByCheck = driver.findElement(By.id("payment-option-1"));
        WebElement checkBox = driver.findElement(By.id("conditions_to_approve[terms-and-conditions]"));
        WebElement orderButton = driver.findElement(By.cssSelector("button.btn.btn-primary.center-block"));

        payByCheck.click();
        checkBox.click();
        Thread.sleep(100);
        orderButton.click();
    }
}