package pages;

import org.openqa.selenium.*;

public class YourAccountPage {
    public WebDriver driver;

    public YourAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addressTile() {
        WebElement addressesButton = driver.findElement(By.xpath("//a[contains(text(),'Addresses')]"));
        addressesButton.click();
    }
}
