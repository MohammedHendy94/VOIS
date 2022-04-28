package VOIS.Pages;

import VOIS.Base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class BlousesPage extends Base {

    WebElement AddToCartBtn = driver.findElement(By.xpath("//a[@title='Add to cart']"));
    WebElement ProceedToCheckoutBtn = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/a[1]/span[1]"));


    public void ClickAddToCart() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        jse.executeScript("arguments[0].click();", AddToCartBtn);
    }

    public void ClickProceedToCheckout(){
       JavascriptExecutor jse = (JavascriptExecutor) driver;
       jse.executeScript("arguments[0].click();", ProceedToCheckoutBtn);
    }

}
