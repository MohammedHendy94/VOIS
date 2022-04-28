package Tests;

import VOIS.Pages.PaymentPage;
import io.cucumber.java.en.And;

public class Payment_tests {

    PaymentPage paypage;
   // String orderDetails = paypage.GetOrderDetails();

    @And("choose to pay by bank wire option from the payment page")
    public void chooseToPayByBankWireOptionFromThePaymentPage() {
          paypage.ChoosePaymentMethod();
          paypage = new PaymentPage();
    }

    @And("click confirm my order from order summary page")
    public void clickConfirmMyOrderFromOrderSummaryPage() {
        paypage.ConfirmingOrder();
        paypage = new PaymentPage();
    }
/*
    @And("Go to My Orders Screen")
    public void goToMyOrdersScreen() {

        String orderDetails = paypage.GetOrderDetails();
       System.out.println(orderDetails);
       paypage.GoToMyOrders();
       paypage = new PaymentPage();
    }
    */

}
