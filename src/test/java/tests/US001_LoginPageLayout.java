package tests;

import org.testng.annotations.Test;
import utils.ConfigReader;
import utils.Driver;

public class US001_LoginPageLayout extends TestMain {


    @Test
    public void tc01(){

        softAssert.assertTrue(loginPage.getLoginButton().isDisplayed(),"login button");
        softAssert.assertTrue(loginPage.getPasswordTextBox().isDisplayed(),"password");
        softAssert.assertTrue(loginPage.getUsernameTextBox().isDisplayed(),"username");
        softAssert.assertTrue(loginPage.getGoogleLoginButton().isDisplayed(),"google login");
        softAssert.assertTrue(loginPage.getFacebookLoginButton().isDisplayed(),"facebook login");
        softAssert.assertTrue(loginPage.getForgotPasswordButton().isDisplayed(),"forgot password");
        softAssert.assertTrue(loginPage.getRegisterOption().isDisplayed(),"register");
        softAssert.assertTrue(loginPage.getNonLoginContinueButton().isDisplayed(),"non log in");
        softAssert.assertTrue(loginPage.getEmployerLink().isDisplayed(), "employer link");
        softAssert.assertTrue(loginPage.getPasswordVisibilityButton().isDisplayed(),"password visibility");
        softAssert.assertAll();

    }

    @Test(dependsOnMethods = "tc01")
    public void tc02(){

        softAssert.assertTrue(loginPage.getLoginButton()             .isEnabled(),"login button");
        softAssert.assertTrue(loginPage.getPasswordTextBox()         .isEnabled(),"password");
        softAssert.assertTrue(loginPage.getUsernameTextBox()         .isEnabled(),"username");
        softAssert.assertTrue(loginPage.getGoogleLoginButton()       .isEnabled(),"google login");
        softAssert.assertTrue(loginPage.getFacebookLoginButton()     .isEnabled(),"facebook login");
        softAssert.assertTrue(loginPage.getForgotPasswordButton()    .isEnabled(),"forgot password");
        softAssert.assertTrue(loginPage.getRegisterOption()          .isEnabled(),"register");
        softAssert.assertTrue(loginPage.getNonLoginContinueButton()  .isEnabled(),"non log in");
        softAssert.assertTrue(loginPage.getEmployerLink()            .isEnabled(), "employer link");
        softAssert.assertTrue(loginPage.getPasswordVisibilityButton().isEnabled(),"password visibility");
        softAssert.assertAll();


    }

    @Test
    public void tc03(){

        loginPage.getUsernameTextBox().clear();
        loginPage.getHeaderPageRefresh().clear();
        softAssert.assertFalse(loginPage.getLoginButton().isEnabled());
        softAssert.assertAll();
    }

    @Test
    public void tc04(){
        loginPage.getUsernameTextBox().sendKeys(ConfigReader.getProperty("validUsername"));
        loginPage.getHeaderPageRefresh().clear();
        softAssert.assertFalse(loginPage.getLoginButton().isEnabled());
        softAssert.assertAll();

    }

    @Test
    public void tc05(){
        loginPage.getUsernameTextBox().clear();
        loginPage.getHeaderPageRefresh().sendKeys(ConfigReader.getProperty("validPassword"));
        softAssert.assertFalse(loginPage.getLoginButton().isEnabled());
        softAssert.assertAll();

    }

    @Test
    public void tc06(){
        loginPage.getUsernameTextBox().click();
        softAssert.assertTrue(Driver.getAndroidDriver().isKeyboardShown());
        softAssert.assertAll();
    }

    @Test
    public void tc07(){
        loginPage.getPasswordTextBox().click();
        softAssert.assertTrue(Driver.getAndroidDriver().isKeyboardShown());
        softAssert.assertAll();
    }
}
