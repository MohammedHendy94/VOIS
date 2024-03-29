package VOIS.S_pages;

import VOIS.Base.Base;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Registeration_page extends Base {


    //Defining web elements
    WebElement GenderMale_Rbtn = driver.findElement(By.id("gender-male"));
    WebElement GenderFemale_Rbtn = driver.findElement(By.id("gender-female"));
    WebElement FirstNameTxt = driver.findElement(By.id("FirstName"));
    WebElement LastNameTxt = driver.findElement(By.id("LastName"));
    WebElement DayofBirth = driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
    WebElement MonthofBirth = driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
    WebElement YearofBirth = driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
    WebElement EmailTxt = driver.findElement(By.id("Email"));
    WebElement CompanyNameTxt = driver.findElement(By.id("Company"));
    WebElement PasswordTxt = driver.findElement(By.id("Password"));
    WebElement CPAsswordTxt = driver.findElement(By.id("ConfirmPassword"));
    WebElement RegisterBtn = driver.findElement(By.id("register-button"));



    //Defining the methods that handels actions on web elements

    public void chooseGender (String gender){
        switch (gender){
            case "Male":
                GenderMale_Rbtn.click();
                break;
            case "Female":
                GenderFemale_Rbtn.click();
        }
    }
    public  void Filling_Fname_Lname(String firstname , String lastname){
        FirstNameTxt.sendKeys(firstname);
        LastNameTxt.sendKeys(lastname);
    }
    public void SelectingBirthday(String day , String month , String year){
        Select selectDay = new Select(DayofBirth);
        selectDay.selectByValue(day);
        Select selectMonth = new Select(MonthofBirth);
        selectMonth.selectByValue(month);
        Select selectYear = new Select(YearofBirth);
        selectYear.selectByValue(year);

    }
    public void SettingEmailAddress(String email){
        EmailTxt.sendKeys(email);
    }

    public void SettingCompanyName(String name){
        CompanyNameTxt.sendKeys(name);
    }

    public  void Setting_Pssword(String password , String cpassword){
        PasswordTxt.sendKeys(password);
        CPAsswordTxt.sendKeys(cpassword);}

    public void Submitting_Registeration(){
        RegisterBtn.submit();
    }

    public static void loggedingAssert(){
        WebElement logoutBtn = driver.findElement(By.xpath("//a[@class='ico-logout']"));
        Assert.isTrue(logoutBtn.isDisplayed(),"user couldn't register");
    }
    public static void SearchingForProduct(String prodname){
        WebElement SearchTxt = driver.findElement(By.id("small-searchterms"));
        SearchTxt.sendKeys(prodname);
        WebElement SearchBtn = driver.findElement(By.xpath("//button[@class='button-1 search-box-button']"));
        SearchBtn.click();
    }



}
