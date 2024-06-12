package Pages.Level1;

import Base.BaseLevel1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class Login extends BaseLevel1 {

    @FindBy(xpath = "//*[@placeholder='Email']")
    WebElement txtuserName;

    @FindBy(xpath = "//*[@placeholder='Password']")
    WebElement txtpassword;

    @FindBy(xpath = "//button[text()='Sign in']")
    WebElement btnSignIn;

    public Login(){

        PageFactory.initElements(driver,this);

    }

    public void loginToE6data(String username, String password){

        enterUserName(username);
        enterPassword(password);
        clickSignIn();
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.urlToBe("https://plt-beta.itachi.ai/workspace"));

        if(driver.getCurrentUrl().equals("https://plt-beta.itachi.ai/workspace")){

            System.out.println("Successfully logged in !!!");

        }

        else{

            throw new RuntimeException("Unable to login...");

        }

    }

    public void enterUserName(String userName){

        waitToClick(driver, 10, txtuserName);
        txtuserName.sendKeys(userName);

    }

    public void enterPassword(String password){

        waitToClick(driver, 10, txtpassword);
        txtpassword.sendKeys(password);

    }

    public void clickSignIn(){

        waitToClick(driver, 10, btnSignIn);
        btnSignIn.click();

    }

}
