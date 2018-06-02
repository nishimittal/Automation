package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectFacebookDropdown 
   {
	@Test
    public void SelectDDValues() throws InterruptedException
    {
	System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://facebook.com");

	
	WebElement day_dropdown = driver.findElement(By.id("day"));
	Select day_dd=new Select(day_dropdown);
	day_dd.selectByIndex(28);
	
	WebElement month_dropdown = driver.findElement(By.id("month"));
	Select month_dd=new Select(month_dropdown);
	month_dd.selectByVisibleText("Dec");
	
	WebElement year_dropdown = driver.findElement(By.id("year"));
	Select year_dd=new Select(year_dropdown);
	year_dd.selectByValue("1992");

}
}
