package VOIS.S_pages;

import VOIS.Base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Home_Page extends Base {

    WebElement RegisterBtn =  driver.findElement(By.xpath("//a[@class='ico-register']"));


    public void ClickondRegister(){
        RegisterBtn.click();
    }



}
