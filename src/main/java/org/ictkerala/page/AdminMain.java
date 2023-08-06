package org.ictkerala.page;

import java.time.Duration;

import org.ictkerala.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

 public class AdminMain extends BaseClass {
    

	public AdminMain(WebDriver driver)
	{this.driver=driver;
	PageFactory.initElements(driver, this);
	}

	
	
	@FindBy(xpath="//img[@src=\"../../assets/images/user.png\"]")
	WebElement DropDown;
	@FindBy(xpath="//a[@href=\"/login\"]")
     WebElement LoginOpt;
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-login[1]/form[1]/input[1]")
	WebElement userName;
	
	@FindBy(xpath="//input[@type=\"password\"]")
	WebElement passwordField;
	
	@FindBy(xpath="//button[@id=\"logbut\"]")
	WebElement login;
	
	
	
	public void ClickDropDown() {
		DropDown.click();
		}
		public void ClickLog() {
			LoginOpt.click();
		}
		public void stdUserName(String stUserName)
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
			userName.sendKeys(stUserName);
		}
		
		public void stdUserPassword(String passwordField2)
		{passwordField.sendKeys(passwordField2);
		}
		
		public void clickSubmLogin()
		{
			login.click();
		}
	
		
		
		
		public String ConfirmAdmin() {
			return(driver.getCurrentUrl());}
 }
