package Tests;

import VOIS.Base.Base;
import VOIS.Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class Login_Tests extends Base {

LoginPage lgnpage;

    @Given("user is in the login page")
    public void user_is_in_the_login_page() {
        launch_browser();

    }

    @When("user enter email as {string} to create account")
    public void user_enter_email_to_create_account(String createEmail) {
        lgnpage = new LoginPage();
        lgnpage.Filling_Create_Account_Email(createEmail);
    }

    @When("click create new account")
    public void click_create_new_account() {
        lgnpage = new LoginPage();
        lgnpage.clicking_CreatAccount();
    }

    @Then("app navigate user to the Registration screen")
    public void app_navigate_user_to_the_registration_screen() {
        Assert.assertTrue(driver.findElement(By.id("customer_firstname")).isDisplayed());
    }

    @When("user enter email as {string} and password as {string}")
    public void userEnterEmailAsAndPasswordAs(String email, String pass) {
        lgnpage = new LoginPage();
        lgnpage.Filling_signin_info(email,pass);
    }

    @And("click login")
    public void clickLogin() {
        lgnpage = new LoginPage();
        lgnpage.click_sign_in_button();
    }

    @Then("AUTHENTICATION Alert should be displayed")
    public void appShouldValidateTheEnteredCredentials() {
        lgnpage = new LoginPage();
        lgnpage.check_The_Authentication_alert();
    }

    @Then("app navigate user to MyAccount page")
    public void appNavigateUserToTheMainPage() {
        Assert.assertTrue(driver.findElement(By.xpath("//a[@class='logout']")).isDisplayed());
    }

    @Then("app keep user in the login page")
    public void appKeepUserInTheLoginPage() {
        Assert.assertTrue(driver.findElement(By.id("SubmitLogin")).isDisplayed());
    }
}
