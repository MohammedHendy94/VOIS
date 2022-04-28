package Tests;

import VOIS.Pages.LoginOrderPage;
import VOIS.Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class LoginOrder_Tests {

     LoginOrderPage orderlogin;
    @And("user enter email as {string} and password as {string} to signin")
    public void userEnterEmailAsAndPasswordAstolgin(String email, String pass) {
     orderlogin.FillingEmailPasswrod(email,pass);
     orderlogin= new LoginOrderPage();
    }
    @And("click login to signin")
    public void clickLogin() {
        orderlogin.click_sign_in_button();
        orderlogin = new LoginOrderPage();
    }

}
