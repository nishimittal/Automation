package package1;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenNewTab {
	public static void main(String[] args)
	{
//		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.gecko.driver","C://geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"t");
    	System.out.println(driver.getTitle());
	    driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"t");
	    driver.get("https://bing.com");

}
}