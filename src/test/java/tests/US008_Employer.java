package tests;

import org.testng.annotations.Test;
import utils.Driver;
import utils.ReusableMethods;

public class US008_Employer extends TestMain{

    @Test
    public void tc01(){

        ReusableMethods.scrollDown(5);
        loginPage.getEmployerLink().click();
        Driver.getAndroidDriver().getCurrentUrl();
        softAssert.assertEquals(Driver.getAndroidDriver().getCurrentUrl(),employerUrl);
        softAssert.assertAll();
    }



}
