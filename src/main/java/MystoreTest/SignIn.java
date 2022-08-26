package MystoreTest;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

import java.util.concurrent.TimeUnit;

public class SignIn {
    WebDriver driver;

    @Given("User is on {string} Page")
    public void userIsOnPage(String webpage) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(webpage);
    }

    @When("User click on SignIn button")
    public void userClickOnSignInButton() {
        LandingPage onLandingPage = new LandingPage(driver);
        onLandingPage.signIn();
    }

    @And("user enters {string} and {string}")
    public void userEntersAnd(String login, String pass) {
        LogInPage onLogInPage = new LogInPage(driver);
        onLogInPage.LogIn(login, pass);
        onLogInPage.LogInSubmit();
    }

    @Then("User see a Addresses tile and click it")
    public void userClickOnAddressesTile() {
        YourAccountPage onYourAccountPage = new YourAccountPage(driver);
        onYourAccountPage.addressTile();
    }

    @And("User click on Create button")
    public void userClickOnCreateButton() {
        YourAddressesPage onYourAddressesPage = new YourAddressesPage(driver);
        onYourAddressesPage.addAddress();
    }

    @When("User fill up the form with {string}, {string}, {string}, {string}, {string} and {string}")
    public void userFillUpTheFormWithAnd(String alias, String address, String city, String zip_code, String country, String phone) {
        NewAddressPage onNewAddressPage = new NewAddressPage(driver);
        onNewAddressPage.addressForm(alias, address, city, zip_code, country, phone);

    }

    @And("User Check if form was filled with legit data {string}, {string}, {string}, {string}, {string} and {string}")
    public void userCheckIfFormWasFilledWithLegitDataAnd(String alias, String address, String city, String zip_code, String country, String phone) {
    AddressesPage onAddressesPage = new AddressesPage(driver);
    onAddressesPage.checkForm(alias, address, city, zip_code, phone);
    }

    @Then("User delete the address and check if successfully deleted")
    public void userDeleteTheAddressAndCheckIfSuccessfullyDeleted() {
        AddressesPage onAddressPage = new AddressesPage(driver);
        onAddressPage.delete();
        driver.quit();
    }
}
