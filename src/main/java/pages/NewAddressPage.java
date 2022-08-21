package pages;

import org.openqa.selenium.*;

public class NewAddressPage {
    public WebDriver driver;

    public NewAddressPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addressForm(String alias, String address, String city, String zipCode, String country, String phone) {
        WebElement aliasForm = driver.findElement(By.name("alias"));
        WebElement addressForm = driver.findElement(By.name("address1"));
        WebElement cityForm = driver.findElement(By.name("city"));
        WebElement zipForm = driver.findElement(By.name("postcode"));
        WebElement phoneForm = driver.findElement(By.name("phone"));
        WebElement saveForm = driver.findElement(By.cssSelector("button.btn.btn-primary.float-xs-right"));
        WebElement countryForm = driver.findElement(By.xpath("//*[text()='United Kingdom']"));

        aliasForm.click();
        aliasForm.clear();
        aliasForm.sendKeys(alias);
        addressForm.click();
        addressForm.clear();
        addressForm.sendKeys(address);
        cityForm.click();
        cityForm.clear();
        cityForm.sendKeys(city);
        zipForm.click();
        zipForm.clear();
        zipForm.sendKeys(zipCode);
        phoneForm.click();
        phoneForm.clear();
        phoneForm.sendKeys(phone);
        if (countryForm.isDisplayed()) {
            countryForm.click();
        } else {
            System.out.println("Element not found");
        }
        saveForm.click();
    }
}
