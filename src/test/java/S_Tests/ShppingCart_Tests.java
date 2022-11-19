package S_Tests;

import VOIS.S_pages.ShoppingCart_Page;
import io.cucumber.java.en.When;

public class ShppingCart_Tests {

    ShoppingCart_Page shopcart;
    @When("agree to the terms of service and click checkout")
    public void agree_to_the_terms_of_service_and_click_checkout() {
      shopcart =new ShoppingCart_Page();
      shopcart.Agreetoterms();
      shopcart.ClickCheckout();

    }
}
