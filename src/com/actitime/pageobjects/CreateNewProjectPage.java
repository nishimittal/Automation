package com.actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateNewProjectPage {
@FindBy(name="name")
private WebElement projNameTxtBx;
@FindBy(name="createProjectSubmit")
private WebElement createProjectSubmitBtn;
@FindBy(name="customerId")
private WebElement customerDrpdwn;


public CreateNewProjectPage(WebDriver driver){
	PageFactory.initElements(driver, this);
}

public void selectCustomer(String custName, WebDriver driver){
	 Select sel=new Select(customerDrpdwn);
	 sel.selectByVisibleText(custName);
}	 
	 
public void createProject(String projectName1) throws InterruptedException{
	projNameTxtBx.sendKeys(projectName1);
	Thread.sleep(3000);
	createProjectSubmitBtn.click();
	Thread.sleep(3000);

}
}
