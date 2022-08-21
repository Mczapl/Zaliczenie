package pages;

import org.openqa.selenium.*;

public class LandingPage {
    public WebDriver driver;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void signIn() {
        WebElement signIn = driver.findElement(By.xpath("//div[@id='_desktop_user_info']/div/a"));
        signIn.click();
    }
}
