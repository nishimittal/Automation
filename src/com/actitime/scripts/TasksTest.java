package com.actitime.scripts;

import org.testng.annotations.Test;

import com.actitime.generic.BaseLib;
import com.actitime.generic.ExcelUtils;
import com.actitime.pageobjects.ActiveProjAndCustPage;
import com.actitime.pageobjects.CreateNewCustPage;
import com.actitime.pageobjects.CreateNewProjectPage;
import com.actitime.pageobjects.CreateNewTasksPage;
import com.actitime.pageobjects.CreateNewUserPage;
import com.actitime.pageobjects.EditCustInfoPage;
import com.actitime.pageobjects.EnterTimeTrackPage;
import com.actitime.pageobjects.LoginPage;
import com.actitime.pageobjects.OpenTasksPage;
import com.actitime.pageobjects.UserListPage;

public class TasksTest extends BaseLib{
//	@Test
//	public void createCustomerTest(){
//		String username = ExcelUtils.readData("Sheet1", 3, 1);
//		String password = ExcelUtils.readData("Sheet1", 3, 2);
//		LoginPage lp=new LoginPage(driver);
//		lp.login(username, password);
//		
//		EnterTimeTrackPage ettp=new EnterTimeTrackPage(driver);
//		ettp.clickOnTasks();
//		
//		OpenTasksPage otp=new OpenTasksPage(driver);  //OpenTaskPage class
//		otp.clickOnprojAndCustLink();
//		
//		ActiveProjAndCustPage apcp=new ActiveProjAndCustPage(driver);  
//		                         //ActiveProjAndCustPage class
//		   apcp.clickOnCreateNewCustBtn();
//		   
//		String customerName=ExcelUtils.readData("Sheet1", 3, 3);
//		                          //data for create customer field
//		CreateNewCustPage cncp=new CreateNewCustPage(driver);
//		                          //CreateNewCustPage class
//		cncp.createCustomer(customerName);
//		
//		apcp.verifyCreateCustMsg();  //ActiveProjAndCustPage class
//		
//		apcp.clickOnCreateNewProj();
//		String projectName=ExcelUtils.readData("Sheet1", 2, 4);
//		CreateNewProjectPage cnpp=new CreateNewProjectPage(driver);
//		cnpp.createProject(projectName);
//		
//		apcp.verifyCreateProjMsg();
//		
//		apcp.clickOnLogOutLink();	
//	}
	
	//(dependsOnMethods="createCustomerTest")
@Test(priority=1)
public void createCustomerTest() throws InterruptedException{
	String username = ExcelUtils.readData("Sheet1", 3, 1);
	String password = ExcelUtils.readData("Sheet1", 3, 2);
	LoginPage lp=new LoginPage(driver);
	lp.login(username, password);
	
	EnterTimeTrackPage ettp=new EnterTimeTrackPage(driver);
	ettp.clickOnTasks();

	OpenTasksPage otp=new OpenTasksPage(driver);
	otp.clickOnprojAndCustLink();
	
	ActiveProjAndCustPage apcp=new ActiveProjAndCustPage(driver);
	apcp.clickOnCreateNewCustBtn();
	
	String customerName=ExcelUtils.readData("Sheet1", 4, 3);
	CreateNewCustPage cncp=new CreateNewCustPage(driver);
	cncp.createCustomer(customerName);
	
	apcp.clickOnCreateNewProj();
	
	String projectName = ExcelUtils.readData("Sheet1", 3, 4);
	String custName = ExcelUtils.readData("Sheet1", 2, 3);
	CreateNewProjectPage cnpp=new CreateNewProjectPage(driver);
	cnpp.selectCustomer(custName, driver);
	cnpp.createProject(projectName);
    apcp.clickOnLogOutLink();
	
			
}
	
@Test(priority=2)
public void deleteCustomer() throws InterruptedException{
	String username = ExcelUtils.readData("Sheet1", 3, 1);
	String password = ExcelUtils.readData("Sheet1", 3, 2);
	LoginPage lp=new LoginPage(driver);
	lp.login(username, password);
	
	EnterTimeTrackPage ettp=new EnterTimeTrackPage(driver);
	ettp.clickOnTasks();
	
	OpenTasksPage otp=new OpenTasksPage(driver);
	otp.clickOnprojAndCustLink();
	
	Thread.sleep(3000);
	
	ActiveProjAndCustPage apcp=new ActiveProjAndCustPage(driver);
	String customerName = ExcelUtils.readData("Sheet1", 4, 3);
	Thread.sleep(3000);
	apcp.selectCustomer(customerName, driver);
	
	EditCustInfoPage ecip=new EditCustInfoPage(driver);
	Thread.sleep(3000);
	ecip.deleteCustomer();	
}

@Test
public void createTask() throws InterruptedException{
	String username = ExcelUtils.readData("Sheet1", 3, 1);
	String password = ExcelUtils.readData("Sheet1", 3, 2);
	LoginPage lp=new LoginPage(driver);
	lp.login(username, password);
	
	EnterTimeTrackPage ettp=new EnterTimeTrackPage(driver);
	ettp.clickOnTasks();	
	
	OpenTasksPage otp=new OpenTasksPage(driver);
	otp.clickOncreateNewTask();
	
	String custName1 = ExcelUtils.readData("Sheet1", 2, 3);
	String projectName1 = ExcelUtils.readData("Sheet1", 3, 4);
	String taskName = ExcelUtils.readData("Sheet1", 3, 5);
	CreateNewTasksPage cntp=new CreateNewTasksPage(driver);
	cntp.selectCustomer(custName1, driver);
	Thread.sleep(3000);
	cntp.selectProject(projectName1, driver);
	Thread.sleep(4000);
	cntp.createTask(taskName);
	

} 

@Test(priority=4)
public void createNewUser() throws InterruptedException{
	String username = ExcelUtils.readData("Sheet1", 3, 1);
	String password = ExcelUtils.readData("Sheet1", 3, 2);
	LoginPage lp=new LoginPage(driver);
	lp.login(username, password);
	
	EnterTimeTrackPage ettp=new EnterTimeTrackPage(driver);
	Thread.sleep(3000);
	ettp.clickOnUsers();
			
	UserListPage ulp=new UserListPage(driver);
	Thread.sleep(3000);
	ulp.clickOncreateNewUser();
	
	
	String newusername = ExcelUtils.readData("Sheet1", 3, 6);
	String newpassword = ExcelUtils.readData("Sheet1", 3, 9);
	String retypasswrd = ExcelUtils.readData("Sheet1", 3, 9);
	String enterfirstname = ExcelUtils.readData("Sheet1", 3, 7);
	String enterlastname = ExcelUtils.readData("Sheet1", 3, 8);
	String enteremail = ExcelUtils.readData("Sheet1", 3, 10);
	
	CreateNewUserPage cnup=new CreateNewUserPage(driver);
	Thread.sleep(3000);
	cnup.createUser(newusername, newpassword, retypasswrd, enterfirstname, enterlastname, enteremail);
}

}
