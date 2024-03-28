package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class ForgotPasswordPage extends BasePage{

    public WebElement getHeaderText() {
        return headerText;
    }

    @FindBy(id = "com.kariyer.androidproject:id/tv_title")
    private WebElement headerText;

    @FindBy(id = "com.kariyer.androidproject:id/icon_mail")
    private WebElement icon;

    @FindBy(id = "com.kariyer.androidproject:id/edt_email")
    private WebElement usernameTextBox;

    @FindBy(id = "com.kariyer.androidproject:id/send_mail")
    private WebElement sendMailLink;

    @FindBy(id = "com.kariyer.androidproject:id/info_txt_desc")
    private WebElement instructions;

    @FindBy(id = "com.kariyer.androidproject:id/tv_close")
    private WebElement closeButton;

    @FindBy(id = "com.kariyer.androidproject:id/title")
    private WebElement checkEmailText;

    @FindBy(id = "com.kariyer.androidproject:id/btn_login")
    private WebElement loginButton;

    @FindBy(id = "com.kariyer.androidproject:id/btn_support")
    private WebElement supportLink;

    @FindBy(id = "com.kariyer.androidproject:id/desc")
    private WebElement descriptiveText;




}
