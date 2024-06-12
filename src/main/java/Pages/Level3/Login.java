package Pages.Level3;

import Base.BaseLevel3;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Login extends BaseLevel3 {

    @FindBy(xpath = "//*[@placeholder='Email']")
    WebElement txtuserName;

    @FindBy(xpath = "//*[@placeholder='Password']")
    WebElement txtpassword;

    @FindBy(xpath = "//button[text()='Sign in']")
    WebElement btnSignIn;

    public Login() {

        PageFactory.initElements(driver, this);

    }

    public void loginToE6data( String username, String password) {

        wrapper.loginToE6data(txtuserName, txtpassword, btnSignIn, username, password);

    }


}
