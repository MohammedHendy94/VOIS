package Tests;

import VOIS.Pages.OrderConfirmationPage;
import io.cucumber.java.en.And;

public class OrderConfirmationPage_Tests {

    OrderConfirmationPage orderconfirm;

    @And("Get the order details.")
    public void getTheOrderDetails() {
        String orderDetails = orderconfirm.GetOrderDetails();
        System.out.println(orderDetails);
        orderconfirm = new OrderConfirmationPage();
    }

    @And("Go to My Orders Screen")
    public void goToMyOrdersScreen() {
        orderconfirm.GoToMyOrders();
       orderconfirm = new OrderConfirmationPage();
}


}