package VOIS.Pages;

import VOIS.Base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Signup_Page extends Base {

    WebElement MR_Title  = driver.findElement(By.id("id_gender1"));
    WebElement MRs_Title  = driver.findElement(By.id("id_gender1"));
    WebElement FirstName = driver.findElement(By.id("customer_firstname"));
    WebElement LastName = driver.findElement(By.id("customer_lastname"));
    WebElement Password = driver.findElement(By.id("passwd"));
    WebElement BirthDay = driver.findElement(By.id("days"));
    WebElement BirthMonth = driver.findElement(By.id("months"));
    WebElement BirthYear = driver.findElement(By.id("years"));
    WebElement Address = driver.findElement(By.id("address1"));
    WebElement City = driver.findElement(By.id("city"));
    WebElement State = driver.findElement(By.id("id_state"));
    WebElement PostalCode = driver.findElement(By.id("postcode"));
    WebElement Country = driver.findElement(By.id("id_country"));
    WebElement MobileNumber = driver.findElement(By.id("phone_mobile"));
    WebElement SubmitAccountBtn = driver.findElement(By.id("submitAccount"));

    public void chooseTitle (String title){
        switch (title){
            case "Male":
                MR_Title.click();
                break;
            case "Female":
                MRs_Title.click();
        }
    }
    public  void Filling_NameandPassword(String firstname , String lastname ,String password){
        FirstName.sendKeys(firstname);
        LastName.sendKeys(lastname);
        Password.sendKeys(password);
    }
    public void SelectingBirthday(String day , String month , String year){
        Select selectDay = new Select(BirthDay);
        selectDay.selectByValue(day);
        Select selectMonth = new Select(BirthMonth);
        selectMonth.selectByValue(month);
        Select selectYear = new Select(BirthYear);
        selectYear.selectByValue(year);

    }
    public void SettingAddressInfo(String address, String city, String postalcode){
        Address.sendKeys(address);
        City.sendKeys(city);
        PostalCode.sendKeys(postalcode);
    }
    public void SelectingStateandCountry(String state, String country ){
        Select selectState = new Select(State);
        selectState.selectByValue( state);
        Select selectCountry = new Select(Country);
        selectCountry.selectByValue(country);
    }
    public void SettingMobileNumber(String mobile){
      MobileNumber.sendKeys(mobile);
    }
    public void ClickSubmit(){
       SubmitAccountBtn.submit();
    }


}
