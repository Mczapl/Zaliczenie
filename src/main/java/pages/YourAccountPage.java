package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YourAccountPage {
    private WebDriver driver;

    public YourAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addressTile(){
        WebElement addressesButton = driver.findElement(By.xpath("//a[contains(text(),'Addresses')]"));
        addressesButton.click();
    }
}
