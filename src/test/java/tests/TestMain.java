package tests;
import org.testng.asserts.SoftAssert;
import pages.ForgotPasswordPage;
import pages.HomePage;
import pages.LoginPage;
import utils.Driver;


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


}
