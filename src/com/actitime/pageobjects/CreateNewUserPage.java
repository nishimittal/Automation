package com.actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewUserPage {
@FindBy(name="username")
private WebElement newUserName;
@FindBy (name="passwordText")
private WebElement newPsdTxt;
@FindBy (name="passwordTextRetype")
private WebElement newPsdTxtRtype;
@FindBy (name="firstName")
private WebElement typeFirstName;
@FindBy (name="lastName")
private WebElement typeLastName;
@FindBy (name="email")
private WebElement enterEmail;
@FindBy (xpath="//input[contains(@value,' Create User ')]")
private WebElement createNewUser;

public CreateNewUserPage(WebDriver driver){
	PageFactory.initElements(driver, this);
}

public void createUser(String newusername,String newpassword,String retypasswrd,String enterfirstname,String enterlastname,String enteremail){
	newUserName.sendKeys(newusername);
	newPsdTxt.sendKeys(newpassword);
	newPsdTxtRtype.sendKeys(retypasswrd);
	typeFirstName.sendKeys(enterfirstname);
	typeLastName.sendKeys(enterlastname);
	enterEmail.sendKeys(enteremail);
	createNewUser.click();
}
}
