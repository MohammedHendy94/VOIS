package VOIS.Pages;

import VOIS.Base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class LoginOrderPage extends Base {

    public static void FillingEmailPasswrod(String email, String Pass){
        WebElement Txt_email = driver.findElement(By.id("email"));
        WebElement Txt_Pass = driver.findElement(By.id("passwd"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Txt_email.sendKeys(email);
        Txt_Pass.sendKeys(Pass);
    }
    public static void click_sign_in_button (){
        WebElement Btn_signin = driver.findElement(By.id("SubmitLogin"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Btn_signin.click();
    }

}
