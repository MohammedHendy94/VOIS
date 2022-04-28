package Tests;

import VOIS.Pages.ShippingPage;
import io.cucumber.java.en.And;

public class Shipping_Tests {

ShippingPage shipage;

    @And("checks the terms of service checkbox")
    public void checksTheTermsOfServiceCheckbox() {

        shipage.CheckAgreeForterms();
        shipage = new ShippingPage();
    }
    @And("Click proceed to checkout in shipping step")
    public void clickProceedToCheckoutInShippingStep() {

        shipage.ProceedToChecoutFromShipping();
        shipage = new ShippingPage();
    }
}
