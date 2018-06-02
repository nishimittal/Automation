package package1;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", ".\\exefiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/dell/Desktop/enterdata.html");
		List<WebElement> textboxes = driver.findElements(By.cssSelector("input[type='text']"));
		int textbox_size = textboxes.size();
		System.out.println(textbox_size);
//		for(int i=0;i<textbox_size;i++)
			for(WebElement textbox : textboxes)
		{
//			 WebElement textbox = textboxes.get(i);
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
		driver.findElement(By.cssSelector("input[type='button']")).click();
		Thread.sleep(5000);
		driver.quit();
	}
		}

	