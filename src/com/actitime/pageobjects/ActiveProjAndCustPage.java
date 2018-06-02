package com.actitime.pageobjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class ActiveProjAndCustPage extends BasePage{
@FindBy(css="input[value='Create New Customer']")
private WebElement createNewCustBtn;
@FindBy(className="successmsg")
private WebElement successMsg;
@FindBy(name="selectedCustomer")
private WebElement customerDrpdwn;
@FindBy(xpath="//input[contains(@value,'Show')]") 
private WebElement showBtn;
@FindBy(css="input[value='Create New Project']")
private WebElement createNewProj;


public ActiveProjAndCustPage(WebDriver driver){
	super(driver);
	PageFactory.initElements(driver, this);
}

public void clickOnCreateNewCustBtn(){
	createNewCustBtn.click();
}
public void verifyCreateCustMsg(){
	Assert.assertTrue(successMsg.isDisplayed());
	Reporter.log(successMsg.getText(),true);
}
 public void selectCustomer(String customerName, WebDriver driver) throws InterruptedException{
	 Select sel=new Select(customerDrpdwn);
	 sel.selectByVisibleText(customerName);
	 Thread.sleep(3000);
	 showBtn.click();
	 Thread.sleep(3000);
	 driver.findElement(By.linkText(customerName)).click();
 }

 public void verifyDeleteCustMsg(){
	 String act = successMsg.getText();
	 String exp = "Customer has been successfully deleted.";
	 Assert.assertEquals(act, exp);
	 Reporter.log("Delete Customer msg is verified",true);
 }
 
 public void clickOnCreateNewProj(){
	 createNewProj.click();
 }
// public void verifyCreateProjMsg(){
//	 Assert.assertTrue(successMsg.isDisplayed());
//	 Reporter.log(successMsg.getText(),true);
// }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 






}
