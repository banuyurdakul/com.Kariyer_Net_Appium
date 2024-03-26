package tests;


import org.openqa.selenium.NotFoundException;
import org.testng.annotations.Test;

import utils.ConfigReader;

public class US003_NegativeLogin extends TestMain{




    @Test(priority = 0)
    public void tc01(){

        loginPage.getUsernameTextBox().sendKeys(ConfigReader.getProperty("invalidUsername"));
        loginPage.getPasswordTextBox().sendKeys(ConfigReader.getProperty("validPassword"));
        loginPage.getLoginButton().click();
        String err = null;
        try {
            err = loginPage.getTopErrorMessage().getText();
        } catch (NotFoundException e) {
            softAssert.assertTrue(false,"Error Message Not Visible");
        }

        softAssert.assertEquals(err,expErrMsg,"Incorrect Error Message");
        softAssert.assertAll();

    }

    @Test(priority = 1)
    public void tc02(){
        loginPage.getUsernameTextBox().sendKeys(ConfigReader.getProperty("validUsername"));
        loginPage.getPasswordTextBox().sendKeys(ConfigReader.getProperty("invalidPassword"));
        loginPage.getLoginButton().click();
        String err = null;
        try {
            err = loginPage.getTopErrorMessage().getText();
        } catch (NotFoundException e) {
            softAssert.assertTrue(false,"Error Message Not Visible");
        }

        softAssert.assertEquals(err,expErrMsg,"Incorrect Error Message");
        softAssert.assertAll();

    }

    @Test(priority = 2)
    public void tc03(){

        loginPage.getUsernameTextBox().sendKeys(ConfigReader.getProperty("invalidUsername"));
        loginPage.getPasswordTextBox().sendKeys(ConfigReader.getProperty("invalidPassword"));
        loginPage.getLoginButton().click();
        String err = null;
        try {
            err = loginPage.getTopErrorMessage().getText();
        } catch (NotFoundException e) {
            softAssert.assertTrue(false,"Error Message Not Visible");
        }

        softAssert.assertEquals(err,expErrMsg,"Incorrect Error Message");
        softAssert.assertAll();
    }


}
