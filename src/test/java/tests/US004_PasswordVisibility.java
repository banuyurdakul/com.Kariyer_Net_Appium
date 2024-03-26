package tests;


import org.testng.annotations.Test;

import utils.ConfigReader;

public class US004_PasswordVisibility extends TestMain{



    @Test
    public void tc01(){
        loginPage.getUsernameTextBox().sendKeys(ConfigReader.getProperty("validUsername"));
        loginPage.getPasswordTextBox().sendKeys(ConfigReader.getProperty("validPassword"));

        softAssert.assertEquals(loginPage.getPasswordVisibilityButton().getText(), expVisText, "Incorrect Text");
        softAssert.assertAll();

    }


    @Test
    public void tc02(){
        loginPage.getUsernameTextBox().sendKeys(ConfigReader.getProperty("validUsername"));
        loginPage.getPasswordTextBox().sendKeys(ConfigReader.getProperty("validPassword"));
        loginPage.getPasswordVisibilityButton().click();
        softAssert.assertEquals(loginPage.getPasswordVisibilityButton().getText(), expInvisText, "Incorrect Text");
        softAssert.assertAll();

    }



}
