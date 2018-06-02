package com.actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;


public class EnterTimeTrackPage extends BasePage{
	
public EnterTimeTrackPage(WebDriver driver){
	super(driver); // calling BasePage constructor
}
public void verifyHomePageTitle(WebDriver driver){
	String act = driver.getTitle();
	String exp="actiTIME - Enter Time-Track";
	Assert.assertEquals(act, exp);
	Reporter.log("Home page title is verified",true);
}
public void verifyHomePageUrl(WebDriver driver){
	String act = driver.getCurrentUrl();
	String exp = "http://127.0.0.1/user/submit_tt.do";
	Assert.assertEquals(act, exp);
	Reporter.log("Home page url is verified", true);
}
}
