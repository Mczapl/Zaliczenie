package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    public WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectItem(){
        WebElement sweater = driver.findElement(By.xpath("//*[text()='Hummingbird printed sweater']"));
        sweater.click();
    }

}
