package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropMenu {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        setDriver("Chrome");
        WebElement create=driver.findElement(By.xpath("//*[text()='Create new account']"));
        create.click();
        Thread.sleep(6000);
        WebElement month=driver.findElement(By.name("birthday_month"));
        Select ob=new Select(month);
        ob.selectByValue("6");
        WebElement day=driver.findElement(By.name("birthday_day"));
        Select ob2=new Select( day);
        ob2.selectByVisibleText("6");
        WebElement year=driver.findElement(By.name("birthday_year"));
        Select ob3=new Select(year);
        ob3.selectByIndex(23);
        Thread.sleep(6000);
        driver.close();
    }


    public static void setDriver(String window) throws InterruptedException {
        if (window.equalsIgnoreCase("Chrome")){
            // System.setProperty("webdriver.chrome.driver", "C:\\Users\\fwzna\\eclipse-workspace\\AutomationRiview\\Drivers\\chromedriver.exe");
            driver=new ChromeDriver();
            driver.navigate().to("Https://www.facebook.com");
            driver.manage().window().maximize();
            Thread.sleep(6000);
        }else if (window.equalsIgnoreCase("Firefox")){
            // System.setProperty("webdriver.gecko.driver", "C:\\Users\\fwzna\\IdeaProjects\\Mentoring\\src\\Drivers\\geckodriver.exe");
            driver=new FirefoxDriver();
            driver.navigate().to("Https://www.facebook.com");
            driver.manage().window().maximize();
            Thread.sleep(6000);
        }else if(window.equalsIgnoreCase("Edge")) {
            // System.setProperty("webdriver.edge.driver", "C:\\Users\\fwzna\\IdeaProjects\\Mentoring\\src\\Drivers\\msedgedriver.exe");
            driver= new EdgeDriver();
            driver.navigate().to("Https://www.facebook.com");
            driver.manage().window().maximize();
            Thread.sleep(6000);
        }

    }

}
