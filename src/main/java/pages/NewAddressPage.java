package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewAddressPage {
    private WebDriver driver;

    public NewAddressPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addressForm(String alias, String address, String city, String zipCode, String country, String phone) {
        WebElement aliasForm = driver.findElement(By.name("alias"));
        WebElement addressForm = driver.findElement(By.name("address1"));
        WebElement cityForm = driver.findElement(By.name("city"));



        aliasForm.click();
        aliasForm.clear();
        aliasForm.sendKeys(alias);
        addressForm.click();
        addressForm.clear();
        addressForm.sendKeys(address);
        cityForm.click();
        cityForm.clear();
        cityForm.sendKeys(city);

    }

}
