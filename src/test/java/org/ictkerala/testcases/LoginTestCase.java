package org.ictkerala.testcases;

import java.io.IOException;

import org.ictkerala.base.BaseClass;
import org.ictkerala.constants.AutomationConstants;
import org.ictkerala.page.LoginPage;
import org.ictkerala.utilities.ExcelUtility;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTestCase extends BaseClass {
	
	
	LoginPage loginPage;
	
	
	@Test(priority=1)
	
	
	public void validLogin() throws IOException, InterruptedException {
			
		
		loginPage=new LoginPage(driver);
		
		loginPage.ClickDropDown();
		loginPage.ClickLog();
		
		
		String userName=ExcelUtility.getData(0, 0);
		String passwordField=ExcelUtility.getData(0, 1);
		
		loginPage.ClickDropDown();
		loginPage.ClickLog();
		loginPage.stdUserName(userName);
		loginPage.stdUserPassword(passwordField);
		loginPage.clickSubmLogin();
		Thread.sleep(2000);
		
	String actualResult=loginPage.ConfirmLog();
	System.out.println(actualResult);
	Assert.assertEquals(actualResult, AutomationConstants.ExpectedText);
	
	}  
	
	
 @Test(priority=2)
	
 public void InvalidLogin() throws IOException, InterruptedException {
	loginPage=new LoginPage(driver);
	
	loginPage.ClickDropDown();
	loginPage.ClickLog();
	
	
	String userName=ExcelUtility.getData(1, 0);
	String passwordField=ExcelUtility.getData(1, 1);
	
	loginPage.ClickDropDown();
	loginPage.ClickLog();
	loginPage.stdUserName(userName);
	loginPage.stdUserPassword(passwordField);
	loginPage.clickSubmLogin();
	Thread.sleep(2000);
	
	String actualResult=loginPage.getError();
System.out.println(actualResult);
    Assert.assertEquals(actualResult,AutomationConstants.ExpectedError);
	
	
 }
 @Test(priority=3)
	
 public void InvalidPasswordLogin() throws IOException, InterruptedException {
	loginPage=new LoginPage(driver);
	
	loginPage.ClickDropDown();
	loginPage.ClickLog();
	
	
	String userName=ExcelUtility.getData(2, 0);
	String passwordField=ExcelUtility.getData(2, 1);
	
	loginPage.ClickDropDown();
	loginPage.ClickLog();
	loginPage.stdUserName(userName);
	loginPage.stdUserPassword(passwordField);
	loginPage.clickSubmLogin();
	Thread.sleep(2000);
	
	String actualResult=loginPage.getError1();
	System.out.println(actualResult);
	    Assert.assertEquals(actualResult,AutomationConstants.ExpectedError);
		
}
 @Test(priority=4)
	
 public void BlankInputLogin() throws IOException, InterruptedException {
	loginPage=new LoginPage(driver);
	
	loginPage.ClickDropDown();
	loginPage.ClickLog();
	
	
	String userName=ExcelUtility.getData(3, 0);
	String passwordField=ExcelUtility.getData(3, 1);
	
	loginPage.ClickDropDown();
	loginPage.ClickLog();
	loginPage.stdUserName(userName);
	loginPage.stdUserPassword(passwordField);
	loginPage.clickSubmLogin();
	Thread.sleep(2000);
	String actualResult=loginPage.getError2();
	System.out.println(actualResult);
	    Assert.assertEquals(actualResult,AutomationConstants.ExpectedError);
		
}
} 
