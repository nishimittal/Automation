package package1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class InvalidLogin extends BaseClass
{
    @Test(description="This will perform valid login")
	public void loginToApplication() throws InterruptedException
	{
		driver.findElement(By.name("username")).sendKeys("admin2");
    	driver.findElement(By.name("pwd")).sendKeys("manager2");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
	}
    
    @Test(description="This will perform invalid login")
	public void loginToApplication1()
	{
		driver.findElement(By.name("username")).sendKeys("admin1");
    	driver.findElement(By.name("pwd")).sendKeys("manager1");
		driver.findElement(By.id("loginButton")).click();
	}
}
