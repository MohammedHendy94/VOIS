package VOIS.Pages;

import VOIS.Base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class ShippingPage extends Base {

    public static void CheckAgreeForterms() {
        WebElement TermsOfServiceCheckbox = driver.findElement(By.id("cgv"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        jse.executeScript("arguments[0].click();", TermsOfServiceCheckbox);
    }

    public static void ProceedToChecoutFromShipping() {
        WebElement ProceedfromShipping = driver.findElement(By.xpath("//button[@name='processCarrier']"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        jse.executeScript("arguments[0].click();", ProceedfromShipping);


    }
}
