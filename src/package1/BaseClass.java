/* Nishi */
package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
WebDriver driver;
	
	@BeforeClass
	public void setUpApplication()
	{
		Reporter.log("====Browser session started====", true);
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/");
		Reporter.log("====Application started====", true);
	}
	
	@AfterClass
	 public void closeApplication(){
		 driver.quit();
		 Reporter.log("====Browser session end====", true);
	 }
}
