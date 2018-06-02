package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class VerifyErrorMessage 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://gmail.com");
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	Thread.sleep(2000);
	String actual_error = driver.findElement(By.xpath("//div[text()='Enter an email or phone number']")).getText();
	String expected_error = "Enter an email or phone number";
	
	//Assert.assertEquals(actual_error,expected_error);
	
	Assert.assertTrue(actual_error.contains("Enter an email or phone number"),"Test Completed");
}
}