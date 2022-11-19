package Tests;
//import VOIS.Pages.OrderConfirmationPage;
import VOIS.Pages.MyOrdersPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;


public class MyOrders_Tests  {

   // OrderConfirmationPage ordeconfirm;
    MyOrdersPage orders;
    @Then("Order should be added to the order history page")
    public void order_should_be_added_to_the_order_history_page() {
        orders = new MyOrdersPage();
       // ordeconfirm = new OrderConfirmationPage();
      //  String orderdetails = ordeconfirm.GetOrderDetails();
        String ordernumber =  orders.LastOrderRefrenceNum();
        System.out.println(ordernumber);
      //  Assert.assertTrue(orderdetails.contain;s(ordernumber));
    }


}
