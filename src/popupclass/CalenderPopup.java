package popupclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderPopup {
public static void main(String[] args){
	System.setProperty("webdriver.chrome.driver",".\\exefiles\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.makemytrip.com/");
	driver.findElement(By.id("hp-widget__sfrom")).sendKeys("Delhi");
	driver.findElement(By.xpath("//div[@class='locationFilter autocomplete_from']//span[contains(text(),'New Del')]")).click();
	driver.findElement(By.id("hp-widget__sTo")).sendKeys("Jaipur");
	driver.findElement(By.xpath("//div[@class='locationFilter autocomplete_to']//span[text()='JAI']")).click();
	driver.findElement(By.xpath("//div[@class='dateFilter hasDatepicker']//span[text()='February']/../../../../..//a[text()='2']")).click();
	
}
}
