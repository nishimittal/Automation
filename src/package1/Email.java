package package1;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Email {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", ".\\exefiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"file:///C:/Users/dell/Desktop/enterdata.html");
//		driver.findElement(By.id("userid")).sendKeys("Username");
//		driver.findElement(By.id("pwd")).sendKeys("Password");
//		driver.findElement(By.id("loginButton")).click();
		List<WebElement> textboxes = driver.findElements(By.cssSelector("input[type='text']"));
		System.out.println(textboxes.size());
		Iterator<WebElement> iterator = textboxes.iterator();
		while (iterator.hasNext()) {

			WebElement textbox = iterator.next();
			if (textbox.isEnabled()) {

				textbox.sendKeys("a");
			} else {
				System.out.println("Textbox is disabled.");
			}

		}

		/*
		 for(WebElement textbox : textboxes) { 
		 if(textbox.isEnabled()) {
		 textbox.sendKeys("a");
		 }
		 else 
		 { 
		 System.out.println("Textbox is disabled."); }
		 }
		 */

		driver.findElement(By.cssSelector("input[type='button']")).click();
	}

}