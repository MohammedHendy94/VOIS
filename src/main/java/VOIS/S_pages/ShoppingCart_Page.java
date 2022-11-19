package VOIS.S_pages;

import VOIS.Base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ShoppingCart_Page extends Base {

    //Defining Web elemnts of the page

    WebElement AgreetoTermsChkbox = driver.findElement(By.id("termsofservice"));
    WebElement CheckOutBtn = driver.findElement(By.id("checkout"));

    //Defining methods for handling actions on web elements

    public void Agreetoterms(){
        AgreetoTermsChkbox.click();
    }
    public void ClickCheckout(){
        CheckOutBtn.click();
    }

}
