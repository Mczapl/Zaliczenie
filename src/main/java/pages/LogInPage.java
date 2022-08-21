package pages;

import org.openqa.selenium.*;

public class LogInPage {
    public WebDriver driver;

    public LogInPage(WebDriver driver) {
        this.driver = driver;
    }

    public void LogIn(String email, String password) {
        WebElement emailInput = driver.findElement(By.name("email"));
        WebElement passwordInput = driver.findElement(By.name("password"));

        emailInput.click();
        emailInput.clear();
        emailInput.sendKeys(email);

        passwordInput.click();
        passwordInput.clear();
        passwordInput.sendKeys(password);
    }

    public void LogInSubmit() {
        WebElement submitButton = driver.findElement(By.id("submit-login"));
        submitButton.click();
    }
}
