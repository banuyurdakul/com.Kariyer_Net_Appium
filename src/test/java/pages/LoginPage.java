package pages;

import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Driver;

import java.util.List;

public class LoginPage extends BasePage{

    @FindBy(id = "com.kariyer.androidproject:id/snackbar_layout")
    private WebElement headerPageRefresh;

    @FindBy(id = "com.kariyer.androidproject:id/edt_email")
    private WebElement usernameTextBox;

    @FindBy(id = "com.kariyer.androidproject:id/edt_password")
    private WebElement passwordTextBox;

    @FindBy(id = "com.kariyer.androidproject:id/fl_login")
    private WebElement loginButton;

    @FindBy(id = "com.kariyer.androidproject:id/txt_forgot_password")
    private WebElement forgotPasswordButton;

    @FindBy(id = "com.kariyer.androidproject:id/password_visibilty")
    private WebElement passwordVisibilityButton;

    @FindBy(id = "com.kariyer.androidproject:id/fl_login_with_facebook")
    private WebElement facebookLoginButton;

    public WebElement getHeaderPageRefresh() {
        return headerPageRefresh;
    }

    public WebElement getUsernameTextBox() {
        return usernameTextBox;
    }

    public WebElement getPasswordTextBox() {
        return passwordTextBox;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getForgotPasswordButton() {
        return forgotPasswordButton;
    }

    public WebElement getPasswordVisibilityButton() {
        return passwordVisibilityButton;
    }

    public WebElement getFacebookLoginButton() {
        return facebookLoginButton;
    }

    public WebElement getGoogleLoginButton() {
        return googleLoginButton;
    }

    public WebElement getRegisterSaveButton() {
        return registerSaveButton;
    }

    public WebElement getRegisterOption() {
        return registerOption;
    }

    public WebElement getNonLoginContinueButton() {
        return nonLoginContinueButton;
    }

    public WebElement getTopErrorMessage() {
        return topErrorMessage;
    }

    @FindBy(id = "com.kariyer.androidproject:id/fl_login_with_google")
    private WebElement googleLoginButton;

    @FindBy(id = "com.kariyer.androidproject:id/txt_register")
    private WebElement registerOption;

    public WebElement getAdClose() {
        return adClose;
    }

    @FindBy(id = "com.kariyer.androidproject:id/tv_non_login")
    private WebElement nonLoginContinueButton;

    @FindBy(id = "com.kariyer.androidproject:id/lbl_error")
    private WebElement topErrorMessage;

    @FindBy(id = "com.kariyer.androidproject:id/close")
    private WebElement adClose;

    @FindBy(id = "com.kariyer.androidproject:id/tv_employer")
    private WebElement employerLink;

    public WebElement getEmployerLink() {

        return employerLink;
    }

    @FindBy(xpath = "//android.view.View[@content-desc=\"facebook\"]")
    private WebElement facebookLogo;

    public WebElement getFacebookLogo() {
        return facebookLogo;
    }

    public WebElement getGoogleLogo(){

        List<AndroidElement> elements = Driver.getAndroidDriver().findElementsByXPath("//*[class='android.widget.TextView']");
        return elements.get(0);
    }

    @FindBy(id = "com.kariyer.androidproject:id/txt_register")
    private WebElement registerSaveButton;

}
