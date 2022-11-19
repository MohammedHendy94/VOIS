package S_Tests;

import VOIS.S_pages.SearchResults_Page;
import io.cucumber.java.en.When;

public class SearchResults_Tests {

    SearchResults_Page search;
    @When("Add the first product to the cart and open the shopping cart")
    public void add_the_first_product_to_the_cart_and_open_the_shopping_cart() {
        search = new SearchResults_Page();
       search.AddingProduct();
       search.GoToshoppingCart();
    }
}
