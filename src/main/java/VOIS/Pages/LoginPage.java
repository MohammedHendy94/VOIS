package VOIS.Pages;

import VOIS.Base.Base;
import dev.failsafe.internal.util.Assert;
import org.apache.commons.lang3.ObjectUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class LoginPage extends Base {

// Finding web Page elements
    WebElement Create_Acc_Email = driver.findElement(By.id("email_create"));
    WebElement Create_submit_btn = driver.findElement(By.id("SubmitCreate"));
    WebElement Signin_email = driver.findElement(By.id("email"));
    WebElement Signin_password = driver.findElement(By.id("passwd"));
    WebElement Signin_btn = driver.findElement(By.id("SubmitLogin"));
    WebElement Autentication_alert =  driver.findElement(By.xpath("//div[@class='alert alert-danger'][1]"));



// Defining methods for test steps handeling
    public  void Filling_Create_Account_Email (String CreatEmail)
    {
        Create_Acc_Email.sendKeys(CreatEmail);
    }
    public void clicking_CreatAccount (){
        Create_submit_btn.submit();
    }
    public  void Filling_signin_info (String signinemail , String signinPassword)
    {
       Signin_email.sendKeys(signinemail);
       Signin_password.sendKeys(signinPassword);
    }
    public void click_sign_in_button (){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Signin_btn.click();
    }

    public void check_The_Authentication_alert(){
      Assert.isTrue(Autentication_alert.isDisplayed(), "Not displayed" );
      System.out.println("ok displayed");
    }





}
