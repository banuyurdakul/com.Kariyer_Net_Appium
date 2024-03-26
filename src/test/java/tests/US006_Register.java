package tests;

import org.testng.annotations.Test;

import utils.ReusableMethods;

public class US006_Register extends TestMain{

    @Test
    public void tc01(){

        loginPage.getRegisterOption().click();
        ReusableMethods.wait(2);
        softAssert.assertTrue(loginPage.getRegisterSaveButton().isDisplayed());
        softAssert.assertAll();

    }
}
