package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SelectradioButton {

//	public static void main(String[] args){
//		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
//		WebDriver driver= new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
//		List<WebElement> radio = driver.findElements(By.xpath("//input[@name='lang' and @type='radio']"));
//		for(int i=0;i<radio.size();i++);
//		{
//		
//		WebElement local_radio = radio.get(i);
//		
//		}
//	}
	
	@Test
	public void test1()
	{
     Assert.assertEquals(12, 13);
	}
}
