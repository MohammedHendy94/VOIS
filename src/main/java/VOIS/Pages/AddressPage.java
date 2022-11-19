package VOIS.Pages;

import VOIS.Base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class AddressPage extends Base {

   static WebElement ProceedfromAddress = driver.findElement(By.xpath("//button[@name='processAddress']"));
    public static void ProceedToChecoutFromAddress(){
     //   WebElement ProceedfromAddress = driver.findElement(By.xpath("//button[@name='processAddress']"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        jse.executeScript("arguments[0].click();", ProceedfromAddress);
    }
}
