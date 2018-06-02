package package1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.irctc.co.in");
	driver.findElement(By.xpath("//a[text()='Flights']")).click();
	Set<String> windows = driver.getWindowHandles();
	Iterator<String> it = windows.iterator();
	String parentID = it.next();
	String childID = it.next();
	System.out.println(parentID);
	System.out.println(childID);
	driver.switchTo().window(childID);
	driver.findElement(By.id("international")).click();
	driver.switchTo().window(parentID);
	driver.findElement(By.id("usernameId")).sendKeys("abcd");
    driver.close();
}
}