package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YourAddressesPage {
    private WebDriver driver;

    public YourAddressesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addAddress(){
        WebElement newAddress = driver.findElement(By.xpath("//section[@id='content']/div[3]/a/span"));
        newAddress.click();
    }
}
