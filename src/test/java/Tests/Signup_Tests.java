package Tests;

import VOIS.Base.Base;
import VOIS.Pages.LoginPage;
import VOIS.Pages.Signup_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import java.time.Duration;

public class Signup_Tests extends Base {

    Signup_Page signup;


    @When("user choose his title as {string}")
    public void userChooseHisTitleAs(String gender) {
        signup = new Signup_Page();
        signup.chooseTitle(gender);
    }

    @And("fill firstname as {string} and lastname as {string} and password as {string}")
    public void fillFirstnameAsAndLastnameAsAndPasswordAs(String frstname, String lstname, String password) {
        signup = new Signup_Page();
        signup.Filling_NameandPassword(frstname,lstname,password);
    }

    @And("select the birthday as {string} and birthmonth as {string} and birthyear as {string}")
    public void selectTheBirthdayAsAndBirthmonthAsAndBirthyearAs(String day, String month, String year) {
        signup = new Signup_Page();
        signup.SelectingBirthday(day,month,year);
    }

    @And("fill the address as {string} and City as {string} and postalcode as {string}")
    public void fillTheAddressAsAndCityAsAndPostalcodeAs(String address, String city, String postcod) {
        signup = new Signup_Page();
        signup.SettingAddressInfo(address,city,postcod);
    }

    @And("select state as {string} and country as {string}")
    public void selectStateAsAndCountryAs(String statid, String countryid) {
        signup = new Signup_Page();
        signup.SelectingStateandCountry(statid,countryid);
    }

    @And("enter phone number as {string}")
    public void enterPhoneNumberAs(String mobilenumb) {
        signup = new Signup_Page();
        signup.SettingMobileNumber(mobilenumb);
    }

    @And("click on the signup button")
    public void click_On_The_Signup_Button() {
       signup = new Signup_Page();
       signup.ClickSubmit();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }


}
