package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browered {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        driver=new ChromeDriver();
        driver.navigate().to("Https://www.amazon.com");
        driver.manage().window().maximize();
        Thread.sleep(6000);
        /*driver.navigate().back();
        Thread.sleep(6000);
        driver.navigate().forward();
        Thread.sleep(6000);*/
        driver.navigate().refresh();
        Thread.sleep(6000);
        String ur= driver.getCurrentUrl();
        System.out.println(ur);
        Thread.sleep(6000);
        String windowHondle= driver.getWindowHandle();
        System.out.println(windowHondle);
        Thread.sleep(6000);
        driver.close();


    }



}
