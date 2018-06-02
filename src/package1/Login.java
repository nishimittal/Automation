package package1;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", ".\\exefiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/dell/Downloads/Login.html");
		driver.findElement(By.id("userid")).sendKeys("Username");
		driver.findElement(By.id("pwd")).sendKeys("Password");
		driver.findElement(By.id("loginButton")).click();
		List<WebElement> textboxes = driver.findElements(By.cssSelector("input[type='text']"));
		System.out.println(textboxes.size());
		Iterator<WebElement> iterator = textboxes.iterator();
		while (iterator.hasNext()) {

			WebElement textbox = iterator.next();
			if (textbox.isEnabled()) {
				if (textbox.getAttribute("id").equals("s1")) {
					textbox.sendKeys("1");
				} else if (textbox.getAttribute("id").equals("s2")) {
					textbox.sendKeys("2");
				} else if (textbox.getAttribute("id").equals("s3")) {
					textbox.sendKeys("3");
				} else if (textbox.getAttribute("id").equals("s4")) {
					textbox.sendKeys("4");
				} else if (textbox.getAttribute("id").equals("s5")) {
					textbox.sendKeys("5");
				} else if (textbox.getAttribute("id").equals("s6")) {
					textbox.sendKeys("6");
				} else if (textbox.getAttribute("id").equals("s7")) {
					textbox.sendKeys("7");
				} else if (textbox.getAttribute("id").equals("s8")) {
					textbox.sendKeys("8");
				} else if (textbox.getAttribute("id").equals("s9")) {
					textbox.sendKeys("9");
				} else if (textbox.getAttribute("id").equals("s10")) {
					textbox.sendKeys("10");
				} else {
					System.out.println("not coming in the inner if for " + textbox.getAttribute("id"));
				}
			}

			else {
				System.out.println("Textbox " + textbox.getAttribute("id") + " is disabled.");
			}

		}

		/*
		 * for(WebElement textbox : textboxes) { 
		 * if(textbox.isEnabled()) {
		 * textbox.sendKeys("a"); }
		 *  else { System.out.println("Textbox is disabled."); 
		 *  }
		 * }
		 */

		driver.findElement(By.cssSelector("input[type='button']")).click();
		Thread.sleep(5000);
		driver.quit();
	}

}