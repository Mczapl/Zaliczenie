package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
    private WebDriver driver;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }
    public void signIn() {
        WebElement signIn = driver.findElement(By.xpath("//div[@id='_desktop_user_info']/div/a"));
        signIn.click();
    }
}
