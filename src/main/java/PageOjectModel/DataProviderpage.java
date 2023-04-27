package PageOjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DataProviderpage {
    WebDriver driver;
    @FindBy(name = "email")
    WebElement Ids;
    @FindBy(name="pass") WebElement Pass;
    @FindBy(xpath  = "//*[text()='Forgot password?']") WebElement Forgot;
    @FindBy(name = "login") WebElement Loginbutton;

    public DataProviderpage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    //for data provider we need to pass string data type like argument
    public void Email(String name) {
        Ids.sendKeys(name);
    }
    //for data provider we need to pass string data type like argument
    public void PasswordField(String name) {
        Pass.sendKeys(name);

    }
    public void ForgotPass() {
        Forgot.click();
    }

    public void loginbtn() {
        Loginbutton.click();
    }

}
