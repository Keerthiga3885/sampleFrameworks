package Pages.Level4;

import Base.BaseLevel4;
import Utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends BaseLevel4 {

    @FindBy(xpath = "//*[@placeholder='Email']")
    WebElement txtuserName;

    @FindBy(xpath = "//*[@placeholder='Password']")
    WebElement txtpassword;

    @FindBy(xpath = "//button[text()='Sign in']")
    WebElement btnSignIn;

    public Login() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    public void loginToE6data( String username, String password) {

        wrapper.loginToE6data(txtuserName, txtpassword, btnSignIn, username, password);

    }


}
