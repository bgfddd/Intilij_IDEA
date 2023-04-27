package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        setDriver("Chrome");
        WebElement Picture=driver.findElement(By.xpath("//*[@style='cursor: pointer;']"));
        Actions objt=new Actions(driver);
        Thread.sleep(6000);

        //click
        objt.moveToElement(Picture).click().build().perform();
        Thread.sleep(6000);
        objt.moveToElement(Picture).build().perform();

        //right click
        objt.contextClick(Picture).perform();
        Thread.sleep(6000);
        System.out.println("Right click Context Menu displayed");

        driver.quit();

    }
    public static void setDriver(String window) throws InterruptedException {
        if (window.equalsIgnoreCase("Chrome")){
            // System.setProperty("webdriver.chrome.driver", "C:\\Users\\fwzna\\eclipse-workspace\\AutomationRiview\\Drivers\\chromedriver.exe");
            driver=new ChromeDriver();
            driver.navigate().to("https://deluxe-menu.com/popup-mode-sample.html");
            driver.manage().window().maximize();
            Thread.sleep(6000);
        }else if (window.equalsIgnoreCase("Firefox")){
            // System.setProperty("webdriver.gecko.driver", "C:\\Users\\fwzna\\IdeaProjects\\Mentoring\\src\\Drivers\\geckodriver.exe");
            driver=new FirefoxDriver();
            driver.navigate().to("https://deluxe-menu.com/popup-mode-sample.html");
            driver.manage().window().maximize();
            Thread.sleep(6000);
        }else if(window.equalsIgnoreCase("Edge")) {
            // System.setProperty("webdriver.edge.driver", "C:\\Users\\fwzna\\IdeaProjects\\Mentoring\\src\\Drivers\\msedgedriver.exe");
            driver= new EdgeDriver();
            driver.navigate().to("https://deluxe-menu.com/popup-mode-sample.html");
            driver.manage().window().maximize();
            Thread.sleep(6000);
        }

    }

}
