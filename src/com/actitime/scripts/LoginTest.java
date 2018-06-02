package com.actitime.scripts;

import org.testng.annotations.Test;

import com.actitime.generic.BaseLib;
import com.actitime.generic.ExcelUtils;
import com.actitime.generic.WaitStatementLib;
import com.actitime.pageobjects.EnterTimeTrackPage;
import com.actitime.pageobjects.LoginPage;

public class LoginTest extends BaseLib{
@Test(priority=1)
public void validLoginTest() throws InterruptedException{
	LoginPage lp=new LoginPage(driver);
	String username = ExcelUtils.readData("Sheet1",1,1);
	String password = ExcelUtils.readData("Sheet1",1,2);
	lp.login(username, password);
	EnterTimeTrackPage ettp=new EnterTimeTrackPage(driver);
	WaitStatementLib.isleep(2);
	ettp.verifyHomePageTitle(driver);
	ettp.verifyHomePageUrl(driver);
}
@Test(priority=2)
public void invalidLoginTest() throws InterruptedException{
	LoginPage lp=new LoginPage(driver);
	String username = ExcelUtils.readData("Sheet1", 2, 1);
	String password = ExcelUtils.readData("Sheet1", 2, 2);
	lp.login(username, password);
	//WaitStatementLib.explicitWaitForVisibility(driver, 10, lp.getInvalidLoginMsg());
	WaitStatementLib.isleep(4);
	lp.verifyInvalidLoginMsg();
	
}
}
