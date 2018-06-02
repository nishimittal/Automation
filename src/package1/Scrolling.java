package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scrolling {
public static void main(String [] args){
	System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://duckduckgo.com");
	driver.findElement(By.id("search_form_input_homepage")).sendKeys("Virat Kohli");
    driver.findElements(By.xpath("//strong[text()='virat kohli']")).get(0).click();
    
}
}
