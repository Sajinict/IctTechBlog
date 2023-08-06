	package org.ictkerala.page;

import org.ictkerala.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{
	public LoginPage(WebDriver driver)
	{this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@src=\"../../assets/images/user.png\"]")
	WebElement DropDown;
	@FindBy(xpath="//a[@href=\"/login\"]")
     WebElement LoginOpt;
	
	@FindBy(id="user")
	WebElement userName;
	
	@FindBy(id="pwd")
	WebElement passwordField;
	  
	@FindBy(id="logbut")
	WebElement login;
	
	
	

	
		public void ClickDropDown() {
		DropDown.click();
		}
		public void ClickLog() {
			LoginOpt.click();
		}
		public void stdUserName(String stUserName)
		{userName.sendKeys(stUserName);
		}
		
		public void stdUserPassword(String stUserPassword)
		{passwordField.sendKeys(stUserPassword);
		}
		
		public void clickSubmLogin()
		{
			login.click();
		}
		
		public String ConfirmLog() {
			return(driver.getCurrentUrl());}
		
		public String getError() {
			return(driver.switchTo().alert().getText());
		}
		public String getError1() {
			return(driver.switchTo().alert().getText());
		}
		public String getError2() {
			return(driver.switchTo().alert().getText());
		}
		
		
		//admin
		public String ConfirmAdmin() {
			return(driver.getCurrentUrl());}
		}



	
