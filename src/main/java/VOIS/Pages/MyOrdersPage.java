package VOIS.Pages;
import VOIS.Base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class MyOrdersPage extends Base {

    WebElement LastAddedOrderREF = driver.findElement(By.xpath("//a[@class='color-myaccount']"));

    public String LastOrderRefrenceNum(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String lastorderre = LastAddedOrderREF.getText();
        return lastorderre;
    }



    }
