package Tests;

import VOIS.Base.Base;
import VOIS.Pages.SummaryPage;
import io.cucumber.java.en.And;

public class Summary_Tests extends Base {

    SummaryPage summrypage;


    @And("click proceed to checkout in summary step")
    public void clickProceedToCheckoutInSummaryStep() {
        summrypage = new SummaryPage();
        summrypage.ProceedToChecoutFromSummary();

    }


}
