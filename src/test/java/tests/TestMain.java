package tests;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;
import pages.ForgotPasswordPage;
import pages.HomePage;
import pages.LoginPage;
import utils.ConfigReader;
import utils.Driver;
import utils.ReusableMethods;



public class TestMain {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    SoftAssert softAssert = new SoftAssert();
    ForgotPasswordPage fpPage = new ForgotPasswordPage();
    String expErrMsg = "Kullanıcı adı veya şifre hatalı!";
    String expVisText = "Göster";
    String expInvisText = "Gizle";
    String employerUrl = "kariyer.net/isveren/sizi-arayalim/?utm_source=kariyer.net&utm_medium=app&utm_campaign=isveren";
    String expForgotPasswordPageHeaderText= "Şifremi Unuttum";

    @BeforeMethod
    public static void goToLogin() throws InterruptedException {
        AndroidDriver<AndroidElement> driver=Driver.getAndroidDriver();
        Assert.assertTrue(driver.isAppInstalled(ConfigReader.getProperty("appPackage")));
        ReusableMethods.wait(10);
        ReusableMethods.clickOn(821,158,5);
    }

    @AfterMethod
    public static void close(){
        Driver.quitDriver();
    }





}
