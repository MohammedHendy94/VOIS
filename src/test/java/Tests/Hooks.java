package Tests;

import VOIS.Base.Base;
import org.junit.After;
import org.junit.Before;

public class Hooks extends Base {
    @Before
    public void run_before_tests(){

    }
    // To Be Executed after each test
    @After
    public void run_after_tests(){
        driver.quit();
    }
}
