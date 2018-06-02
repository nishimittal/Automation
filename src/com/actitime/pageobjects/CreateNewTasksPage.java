package com.actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateNewTasksPage {
@FindBy(name="task[0].name")
private WebElement custTask;
@FindBy(css="input[value='Create Tasks']")
private WebElement createPrjTask;	
@FindBy(name="customerId")
private WebElement customerDrpDwn;
@FindBy(name="projectId")
private WebElement projectDrpDwn;


public CreateNewTasksPage(WebDriver driver){
	PageFactory.initElements(driver, this);
}

public void selectCustomer(String custName1, WebDriver driver) throws InterruptedException{
	Select sel=new Select(customerDrpDwn);
	Thread.sleep(3000);
	sel.selectByVisibleText(custName1);
}

public void selectProject(String projectName1,WebDriver driver) throws InterruptedException{
	Select sel= new Select(projectDrpDwn);
	Thread.sleep(3000);
	sel.selectByVisibleText(projectName1);
}
public void createTask(String taskName) throws InterruptedException{
	custTask.sendKeys(taskName);
	Thread.sleep(5000);
	createPrjTask.click();
}
}