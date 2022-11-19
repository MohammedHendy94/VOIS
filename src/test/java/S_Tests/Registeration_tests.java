package S_Tests;

import VOIS.Base.Base;
import VOIS.S_pages.Home_Page;
import VOIS.S_pages.Registeration_page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Registeration_tests extends Base {

   Home_Page hom;
   Registeration_page Regs;
    @Given("user is in the home page")
    public void user_is_in_the_home_page() {
      launch_browser();
    }
    @When("user click register")
    public void user_click_register() {
     hom = new Home_Page();
    hom.ClickondRegister();
    }
    @When("user choose his Gender as {string}")
    public void user_choose_his_gender_as(String gender) {
        Regs = new Registeration_page();
        Regs.chooseGender(gender);
    }
    @When("fill firstName as {string} and lastLame as {string}")
    public void fill_first_name_as_and_last_lame_as(String fname, String lname) {
        Regs = new Registeration_page();
        Regs.Filling_Fname_Lname(fname, lname);
    }
    @When("select the birthDay as {string} and birthMonth as {string} and birthYear as {string}")
    public void select_the_birth_day_as_and_birth_month_as_and_birth_year_as(String day, String month, String year) {
        Regs = new Registeration_page();
        Regs.SelectingBirthday(day, month, year);
    }
    @When("fill email address as {string}")
    public void fill_email_address_as(String email) {
        Regs = new Registeration_page();
        Regs.SettingEmailAddress(email);
    }
    @When("fill the companyName as {string}")
    public void fill_the_company_name_as(String cname) {
        Regs = new Registeration_page();
        Regs.SettingCompanyName(cname);
    }
    @When("fill the password as {string} and the confirmPassword as {string}")
    public void fill_the_password_as_and_the_confirm_password_as(String password, String cpassword) {
        Regs = new Registeration_page();
        Regs.Setting_Pssword(password, cpassword);
    }
    @When("click on the Register button")
    public void click_on_the_register_button() {
        Regs = new Registeration_page();
        Regs.Submitting_Registeration();
    }
    @When("user should be logged-in successfully")
    public void user_should_be_logged_in_successfully() {
        Regs.loggedingAssert();
    }
    @When("user search for product as {string} and click search")
    public void user_search_for_product_as (String prodname) {
       Regs.SearchingForProduct(prodname);
    }
}
