package VOIS.Pages;

import VOIS.Base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MyAccountPage extends Base {

    WebElement BlousesSubCategory = driver.findElement(By.xpath("//a[@title='Blouses']"));

    public void OpeningtheBlousuesPageResults()
    {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click();", BlousesSubCategory);
        //BlousesSubCategory.click();
    }
}
