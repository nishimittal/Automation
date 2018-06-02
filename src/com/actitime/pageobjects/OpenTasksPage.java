package com.actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenTasksPage {
@FindBy(linkText="Projects & Customers")
private WebElement projAndCustLink;
@FindBy(css="input[value='Create New Tasks']")
private WebElement createNewTask;



public OpenTasksPage(WebDriver driver){
PageFactory.initElements(driver,this);
}
public void clickOnprojAndCustLink(){
projAndCustLink.click();
}

public void clickOncreateNewTask() throws InterruptedException{
	Thread.sleep(2000);
	createNewTask.click();
	
	
	
	
}
}