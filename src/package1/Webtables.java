package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webtables {
public static void main(String[] args){
	System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.get("file:///C:/Users/dell/Desktop/Webtables.html");
	List<WebElement> rows = driver.findElements(By.xpath("//table[@name='table1']//td"));
	int rowcount = rows.size();
	System.out.println(rowcount);
}
}
