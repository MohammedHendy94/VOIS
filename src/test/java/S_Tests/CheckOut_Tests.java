package S_Tests;

import VOIS.S_pages.CheckOut_Page;
import VOIS.S_pages.ShoppingCart_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckOut_Tests {


    CheckOut_Page chekout;
    @When("fill the billing address country as {string} and city as {string} and address1 as {string} and zipcode as {string} and phone as {string}")
    public void fill_the_billing_address_country_as_and_city_as_and_address1_as_and_zipcode_as_and_phone_as(String country, String city, String address1, String zipcod, String phone) {
        chekout = new CheckOut_Page();
        chekout.FillingBillingAddress(country, city, address1, zipcod, phone);
    }

    @And("select the shipping method as {string} then continue")
    public void selectTheShippingMethodAsThenContinue(String shipmethod) {
       // chekout = new CheckOut_Page();
        chekout.SelectingShippingMethod(shipmethod);
    }

    @And("Select the paymentMethod and continue to the confirm order section")
    public void selectThePaymentMethodAndContinue() {
        chekout.SelectingpaymentMethod();
    }

    @And("Click confirm to on the order details")
    public void clicConfirmToOnTheOrderDetails() {
        chekout.ConfirmingOrder();
    }

    @Then("user should be navigated to the completed page with order number")
    public void userShouldBeNavigatedToTheCompletedPageWithOrderNumber() {
        chekout.CompletingOrder();
    }
}
