package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderPage {
    public WebDriver driver;

    public HeaderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void logo(){
        WebElement logo = driver.findElement(By.cssSelector("img.logo.img-responsive"));
        logo.click();
    }
}
