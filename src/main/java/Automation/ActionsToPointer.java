package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsToPointer {

    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        driver=new ChromeDriver();
        driver.navigate().to("https://www.amazon.com");
        driver.manage().window().maximize();
        Thread.sleep(6000);
        Actions ob=new Actions(driver);
        WebElement hovers=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        ob.moveToElement(hovers).build().perform();
        WebElement accountb=driver.findElement(By.partialLinkText("Account"));
        accountb.click();


        Thread.sleep(6000);
        driver.close();

    }

}
