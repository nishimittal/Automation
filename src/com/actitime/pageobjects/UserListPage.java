package com.actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserListPage {
@FindBy (xpath="//span[text()='Create New User']")
private WebElement newUser;

public UserListPage(WebDriver driver){
	PageFactory.initElements(driver, this);
}

public void clickOncreateNewUser(){
	newUser.click();
}

}
