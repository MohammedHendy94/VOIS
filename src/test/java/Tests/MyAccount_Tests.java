package Tests;

import VOIS.Pages.MyAccountPage;
import io.cucumber.java.en.And;

public class MyAccount_Tests {

    MyAccountPage myaccpage;

    @And("click on blouses products from women")
    public void clickonblousesproductsfromwomen() {
        myaccpage = new MyAccountPage();
        myaccpage.OpeningtheBlousuesPageResults();
    }
}
