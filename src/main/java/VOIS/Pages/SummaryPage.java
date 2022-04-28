package VOIS.Pages;

import VOIS.Base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class SummaryPage extends Base {

     WebElement ProceedfromSummary = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));

public  void ProceedToChecoutFromSummary(){
    JavascriptExecutor jse = (JavascriptExecutor) driver;
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    jse.executeScript("arguments[0].click();", ProceedfromSummary);
}

}
