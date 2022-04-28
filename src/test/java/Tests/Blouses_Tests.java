package Tests;

import VOIS.Pages.BlousesPage;
import VOIS.Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class Blouses_Tests {

    BlousesPage blusecat;

    @When("click on Add to cart")
    public void clickonAddtocart() {
        blusecat = new BlousesPage();
        blusecat.ClickAddToCart();
    }

    @And("click proceed to checkout")
    public void clickProceedToCheckoutFromThePopUpScreen() {
        blusecat = new BlousesPage();
        blusecat.ClickProceedToCheckout();

    }
}
