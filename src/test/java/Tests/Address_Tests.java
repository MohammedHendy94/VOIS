package Tests;

import VOIS.Pages.AddressPage;
import io.cucumber.java.en.And;

public class Address_Tests {

    AddressPage adrespag;
    @And("click proceed to checkout in address step")
    public void clickProceedToCheckoutInAddressStep() {
        adrespag.ProceedToChecoutFromAddress();
      //  adrespag = new AddressPage();
    }
}
