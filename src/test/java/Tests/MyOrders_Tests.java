package Tests;

import VOIS.Pages.MyOrdersPage;

import io.cucumber.java.en.Then;


public class MyOrders_Tests  {

    MyOrdersPage orders;
    @Then("Order should be added to the order history page")
    public void order_should_be_added_to_the_order_history_page() {
        orders = new MyOrdersPage();
        String ordernumber =  orders.LastOrderRefrenceNum();
        System.out.println(ordernumber);
        // Assert.assertTrue(orderdetails.contains(ordernumber));
    }


}
