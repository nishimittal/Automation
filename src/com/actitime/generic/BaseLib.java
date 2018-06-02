package com.actitime.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseLib {
public WebDriver driver; //final driver

@BeforeMethod
//provide parameter in testNG Suite File
@Parameters("browser")  //browser--> parameter name
public void setUp(String browserName){
if(browserName.equalsIgnoreCase("firefox")){
driver=new FirefoxDriver();
Reporter.log("firefox launched", true);
}
else if(browserName.equalsIgnoreCase("chrome")){
System.setProperty("webdriver.chrome.driver",".\\exefiles\\chromedriver.exe");
driver=new ChromeDriver();
Reporter.log("chrome launched",true);
}
else if(browserName.equalsIgnoreCase("ie")){
System.setProperty("webdriver.ie.driver",".\\exefiles\\IEDriver.exe");
driver=new InternetExplorerDriver();
Reporter.log("IE launched", true);
}
driver.manage().window().maximize();
WaitStatementLib.implicitWaitForSeconds(driver,120);
driver.get(GetPropertyValues.getValue("testURL"));
Reporter.log("Navigating to url",true);
}

@AfterMethod
public void tearDown(ITestResult result){
	if(result.isSuccess()){
		Reporter.log("Script passed",true);
	}
	else{
		String fileName=result.getMethod().getMethodName();
		ScreenshotLib slib=new ScreenshotLib();
		slib.getScreenshot(driver, fileName);
		Reporter.log("Screenshot has been taken",true);
 	}
	driver.close();
	Reporter.log("browser closed",true);
}
}
