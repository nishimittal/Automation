package popupclass;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertPopup {

	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver",".\\exefiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/");
		driver.findElement(By.id("loginbutton")).click();
		Alert alt = driver.switchTo().alert();
		String alertText = alt.getText();
		System.out.println(alertText);
		alt.accept();
		
		

	}

}
