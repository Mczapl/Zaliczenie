package pages;

import org.openqa.selenium.*;

public class HeaderPage {
    public WebDriver driver;

    public HeaderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void logo() {
        WebElement logo = driver.findElement(By.cssSelector("img.logo.img-responsive"));
        logo.click();
    }
}