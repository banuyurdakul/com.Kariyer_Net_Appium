package tests;

import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import utils.ReusableMethods;

public class US009_ForgotPassword extends TestMain{

    @Test
    public void tc01(){
        loginPage.getForgotPasswordButton().click();
        ReusableMethods.wait(1);
        softAssert.assertEquals(fpPage.getHeaderText().getText(), expForgotPasswordPageHeaderText);
        softAssert.assertAll();
    }


}
