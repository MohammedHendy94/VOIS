package VOIS.Pages;

import VOIS.Base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class PaymentPage extends Base {



    public static void ChoosePaymentMethod(){
        WebElement PaymentmethodBtn = driver.findElement(By.xpath("//a[@class='bankwire']"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        jse.executeScript("arguments[0].click();", PaymentmethodBtn);
    }
    public static void ConfirmingOrder(){
        WebElement ConfirmOrderBtn = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        jse.executeScript("arguments[0].click();", ConfirmOrderBtn);
    }
/*
    public static String GetOrderDetails(){
        WebElement OrderdetailsBox = driver.findElement(By.xpath("//div[@class='box']"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String boxtext = OrderdetailsBox.getText();
        return boxtext;
    }
    public static void GoToMyOrders(){
        WebElement BacktoOrdersBtn = driver.findElement(By.xpath("//a[@title='Back to orders']"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        jse.executeScript("arguments[0].click();", BacktoOrdersBtn);
    }
*/
}
