package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoExplicit {
public static void main(String[] args){
	System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
	WebElement element = driver.findElement(By.xpath("//p[text()='WebDriver']"));
	boolean status = element.isDisplayed();
	if (status)
	{
		System.out.println("Element is displayed");
	}
	else
	{
		System.out.println("Element is not displayed");
	}
}
}
