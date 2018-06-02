package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class YahooMailCheck {
public static void main(String[] args){
	
//	System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
//	WebDriver driver= new FirefoxDriver();
	System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://login.yahoo.com/");
	//driver.findElement(By.id("persistent")).click();
	
	Actions act=new Actions(driver);
	act.moveToElement(driver.findElement(By.id("persistent"))).click().build().perform();
	
}
}
