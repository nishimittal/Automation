package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Iframe {

	public static void main(String[] args){
		System.setProperty("webdriver.gecko.driver","C://geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/");
		
		int total_frames = driver.findElements(By.tagName("frame")).size();
		System.out.println(total_frames);
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.xpath("//a[@href='com/thoughtworks/selenium/package-frame.html']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("classFrame");
		driver.findElement(By.xpath("//a[text()='Tree']")).click();
	}
}
