package popupclass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {				
public static void main(String[] args) throws IOException {	
	System.setProperty("webdriver.chrome.driver",".\\exefiles\\chromedriver.exe");
	//System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.get("http://maxdesign.com.au/jobs/sample-accessibility/05-forms/input-file.html");			
    driver.findElement(By.id("a")).click();					
    // below line execute the AutoIT script .
     Runtime.getRuntime().exec("C:\\Users\\dell\\Documents\\AutoIt\\piyus.exe");		
     //driver.close();
     }
}