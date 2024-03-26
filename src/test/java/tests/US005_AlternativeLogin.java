package tests;

import org.testng.annotations.Test;

import utils.ReusableMethods;

public class US005_AlternativeLogin extends TestMain{

    @Test
    public void tc01(){

        loginPage.getFacebookLoginButton().click();
        ReusableMethods.wait(3);
        softAssert.assertTrue(loginPage.getFacebookLogo().isDisplayed());
        softAssert.assertAll();

    }

    @Test
    public void tc02(){
        loginPage.getGoogleLoginButton().click();
        ReusableMethods.wait(3);
        softAssert.assertTrue(loginPage.getGoogleLogo().isDisplayed());
        softAssert.assertAll();

    }


}
