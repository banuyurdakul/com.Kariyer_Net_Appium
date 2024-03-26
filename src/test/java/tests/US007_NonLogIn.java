package tests;


import org.testng.annotations.Test;
import utils.ReusableMethods;

public class US007_NonLogIn extends TestMain{

 @Test
    public void tc01(){
     loginPage.getNonLoginContinueButton().click();
     ReusableMethods.wait(2);
     softAssert.assertTrue(homePage.getSearchForAJobFooterLink().isDisplayed());
     softAssert.assertAll();
 }

}
