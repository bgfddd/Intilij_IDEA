package TestNG;

import M.common.Utility;
import PageOjectModel.DataProviderpage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TestDataProvider  extends Utility {
    @Test( dataProvider = "dp")
    public void f(String n, String s) throws InterruptedException {
        DataProviderpage home = new DataProviderpage(driver);
        home.Email(n);
        home.PasswordField(s);
        Thread.sleep(6000);
        home.loginbtn();
        Thread.sleep(6000);
        driver.navigate().back();
        Thread.sleep(6000);
    }
@DataProvider(name = "dp")
    public Object[][] dp() {
        return new Object[][] {
                new Object[] { "Mimiche@gmail.com", "Autoumation" },
                new Object[] { "Lula@gmail.com", "bravo" },
        };
    }
}
