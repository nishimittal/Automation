package popupclass;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Crmpage {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", ".\\exefiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.freecrm.com");
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*/input[@type='image']")).click();
		//System.out.println(driver.findElement(By.xpath("//*/td[text()='CRMPRO']")).getClass());

	}
}