package VOIS.S_pages;

import VOIS.Base.Base;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CheckOut_Page extends Base {


    //Defining Web elemnts of the page

    WebElement CountryDdl = driver.findElement(By.id("BillingNewAddress_CountryId"));
    WebElement CityTxt = driver.findElement(By.id("BillingNewAddress_City"));
    WebElement Addrress1Txt = driver.findElement(By.id("BillingNewAddress_Address1"));
    WebElement ZipcodeTxt = driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
    WebElement phoneNumberTxt = driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
    WebElement Continue1Btn = driver.findElement(By.xpath("(//button[@name='save'])[1]"));
  //  WebElement GroundOptionRbtn = driver.findElement(By.id("shippingoption_0"));
  //  WebElement NextDayAirOptionRbtn = driver.findElement(By.id("shippingoption_1"));
  //  WebElement SecondDayAirOptionRbtn = driver.findElement(By.id("shippingoption_2"));
  //  WebElement Continue2Btn = driver.findElement(By.xpath("//button[@class='button-1 shipping-method-next-step-button']"));


    //Defining the methods that handels actions on web elements

    public void FillingBillingAddress(String country, String city, String address1, String zipcode, String phone){
        Select selectCountry = new Select(CountryDdl);
        selectCountry.selectByValue(country);
        CityTxt.sendKeys(city);
        Addrress1Txt.sendKeys(address1);
        ZipcodeTxt.sendKeys(zipcode);
        phoneNumberTxt.sendKeys(phone);
        Continue1Btn.click();
    }

    public static void SelectingShippingMethod(String shipmethod){
        WebElement GroundOptionRbtn = driver.findElement(By.id("shippingoption_0"));
        WebElement NextDayAirOptionRbtn = driver.findElement(By.id("shippingoption_1"));
        WebElement SecondDayAirOptionRbtn = driver.findElement(By.id("shippingoption_2"));
        WebElement Continue2Btn = driver.findElement(By.xpath("//button[@class='button-1 shipping-method-next-step-button']"));
        switch (shipmethod){
            case "Ground ($0.00)":
                GroundOptionRbtn.click();
                break;
            case "Next Day Air ($0.00)":
                NextDayAirOptionRbtn.click();
            case "2nd Day Air___Shipping.FixedByWeightByTotal":
                SecondDayAirOptionRbtn.click();
        }
        Continue2Btn.click();
    }
    public static void SelectingpaymentMethod(){
        WebElement Continue3Btn = driver.findElement(By.xpath("//button[@class='button-1 payment-method-next-step-button']"));
        Continue3Btn.click();
        WebElement Continue4Btn = driver.findElement(By.xpath("//button[@class='button-1 payment-info-next-step-button']"));
        Continue4Btn.click();
    }
    public static void ConfirmingOrder() {
        WebElement Continue5Btn = driver.findElement(By.xpath("//button[@class='button-1 confirm-order-next-step-button']"));
        Continue5Btn.click();
    }
    public static void CompletingOrder(){
        WebElement OrderNumberLble = driver.findElement(By.xpath("//div[@class='order-number']"));
        Assert.isTrue(OrderNumberLble.isDisplayed(),"Order wasn't placed successfully");
    }


}
