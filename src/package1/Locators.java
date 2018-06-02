package package1;

import org.openqa.selenium.By;

import java.util.List;
import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Dimension;
//import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locators {
public static void main(String args[] ){
	System.setProperty("webdriver.chrome.driver",".\\exefiles\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
//	System.setProperty("webdriver.gecko.driver","C://geckodriver.exe");
//	WebDriver driver=new FirefoxDriver();
	//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/dell/Desktop/Q_Login.html");
	WebElement wb = driver.findElement(By.name("Female Dropdown"));
	Select sel=new Select(wb);
	List<WebElement> options = sel.getOptions();
	int count = options.size();
	System.out.println(count);
	for(int i = 0;i<count;i++){
	WebElement wb1 = options.get(i);
	String text = wb1.getText();
	System.out.println(text);
	}
}
}

	