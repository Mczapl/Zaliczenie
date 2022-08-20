package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddressesPage {
    public WebDriver driver;

    public AddressesPage(WebDriver driver){
        this.driver = driver;
    }

    public void checkForm(String alias, String address, String city, String zip_code, String phone) {

        if(driver.getPageSource().contains(alias)){
            System.out.println(alias + " is Present");
        }else{
            System.out.println(alias + " is Absent");
        }

        if(driver.getPageSource().contains(address)){
            System.out.println(address + " is Present");
        }else{
            System.out.println(address + " is Absent");
        }

        if(driver.getPageSource().contains(city)){
            System.out.println(city + " is Present");
        }else{
            System.out.println(city + " is Absent");
        }

        if(driver.getPageSource().contains(zip_code)){
            System.out.println(zip_code + " is Present");
        }else{
            System.out.println(zip_code + " is Absent");
        }

        if(driver.getPageSource().contains(phone)){
            System.out.println(phone + " is Present");
        }else{
            System.out.println(phone + " is Absent");
        }
    }

    public void delete(){
        WebElement delete = driver.findElement(By.xpath("//*[text()='Delete']"));
        delete.click();
        if(driver.getPageSource().contains("Address successfully deleted!")){
            System.out.println("Address has been Deleted");
        }else{
            System.out.println("Address hasn't been Deleted");
        }
    }



}
