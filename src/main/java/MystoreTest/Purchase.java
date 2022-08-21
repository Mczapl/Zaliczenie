package MystoreTest;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Purchase {
    WebDriver driver;


    @Given("Given User is on {string} Page")
    public void givenUserIsOnPage(String webpage) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(webpage);
    }

    @And("User is LoggedIn with {string} and {string}")
    public void userIsLoggedInWithAnd(String login, String pass) {
        LogInPage onLogInPage = new LogInPage(driver);
        LandingPage onLandingPage = new LandingPage(driver);
        HeaderPage onHeaderPage = new HeaderPage(driver);
        onLandingPage.signIn();
        onLogInPage.LogIn(login, pass);
        onLogInPage.LogInSubmit();
        onHeaderPage.logo();
    }

    @Then("User click on Hummingbird Printed Sweater")
    public void userClickOnHummingbirdPrintedSweater() {
        HomePage onHomePage = new HomePage(driver);
        onHomePage.selectItem();
    }

    @And("User select the size M, quantity and add to cart")
    public void userSelectTheSizeMAndQuantityOf() throws InterruptedException {
        ItemPage onItemPage = new ItemPage(driver);
        onItemPage.addToCart();
    }

    @Then("User go to checkout and finalize the purchase")
    public void userGoToCheckoutAndFinalizeThePurchase() {
        Checkout onCheckout = new Checkout(driver);
        onCheckout.buy();
    }

    @And("User select Payment Method Pay by Check, click the checkbox and Order")
    public void userSelectPaymentMethodPayByCheckClickTheCheckboxAndOrder() {
        Checkout onCheckout = new Checkout(driver);
        onCheckout.order();

    }

    @Then("User take a screenshot of the page with confirmation")
    public void userTakeAScreenshotToOfThePageWithConfirmation() throws IOException {
        ScreenShot onScreenShot = new ScreenShot(driver);
        onScreenShot.saveWholePageScreenshot();
        driver.quit();
    }
}
