package org.ictkerala.testcases;

import java.io.IOException;
import java.time.Duration;

import org.ictkerala.base.BaseClass;
import org.ictkerala.constants.AutomationConstants;
import org.ictkerala.page.SignUpPage;
import org.ictkerala.utilities.ExcelUtility;
import org.testng.Assert;

import org.testng.annotations.Test;



public class SignUpTestCase extends BaseClass {
	SignUpPage userSign;
	
@Test(priority=1)
	public void verifyvalidUserName() throws IOException, InterruptedException 
	{
		userSign= new SignUpPage(driver);
	//driver.navigate().refresh();
		
	userSign.ClickDropDown();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	userSign.ClickSign();
	Thread.sleep(2000);
	String enterName= ExcelUtility.getData(7, 0);
	String yourEmail=ExcelUtility.getData(7, 1);
	String yourPassword=ExcelUtility.getData(7, 2);
	userSign.EnterName(enterName);
	userSign.SelectUser();
	
	userSign.setYourEmail(yourEmail);
	userSign.setYourPassword(yourPassword);
	
	userSign.allSubmitSign();
	Thread.sleep(2000);
	 
    String actualResults=userSign.getErrorU1();
    System.out.println(actualResults);
	Assert.assertEquals(actualResults,AutomationConstants.ExpectedUBox);

	
	}

	
	
	
	
	
@Test(priority=2)
	public void verifyInvalidUserName() throws IOException, InterruptedException 
	{
		userSign= new SignUpPage(driver);
	//driver.navigate().refresh();
		
	userSign.ClickDropDown();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	userSign.ClickSign();
	Thread.sleep(2000);
	String enterName= ExcelUtility.getData(8, 0);
	String yourEmail=ExcelUtility.getData(8, 1);
	String yourPassword=ExcelUtility.getData(8, 2);
	userSign.EnterName(enterName);
	userSign.SelectUser();
	
	userSign.setYourEmail(yourEmail);
	userSign.setYourPassword(yourPassword);
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	
	userSign.cSubmitUser();
	Thread.sleep(2000);
	
	String actualResults=userSign.getErrorU2();
    System.out.println(actualResults);
	Assert.assertEquals(actualResults,AutomationConstants.ExpectedErrorWU);
	
	}


	@Test(priority=3)
	public void verifyInvalidUserPassword() throws IOException, InterruptedException 
	{
		userSign= new SignUpPage(driver);
		
	userSign.ClickDropDown();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	userSign.ClickSign();
	Thread.sleep(2000);
	String enterName= ExcelUtility.getData(9, 0);
	String yourEmail=ExcelUtility.getData(9, 1);
	String yourPassword=ExcelUtility.getData(9, 2);
	userSign.EnterName(enterName);
	userSign.SelectUser();
	
	userSign.setYourEmail(yourEmail);
	userSign.setYourPassword(yourPassword);
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	
	userSign.cSubmitUser();
	Thread.sleep(2000);
	
	String actualResults=userSign.getErrorUp1();
    System.out.println(actualResults);
	Assert.assertEquals(actualResults,AutomationConstants.ExpectedErrorPU);
	
	
	}
	
	
	@Test(priority=1)
	public void verifyInvalidUserSelection() throws IOException, InterruptedException 
	{
		userSign= new SignUpPage(driver);
	//driver.navigate().refresh();
		
	userSign.ClickDropDown();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	userSign.ClickSign();
	Thread.sleep(2000);
	String enterName= ExcelUtility.getData(7, 0);
	String yourEmail=ExcelUtility.getData(7, 1);
	String yourPassword=ExcelUtility.getData(7, 2);
	userSign.EnterName(enterName);
	//userSign.SelectUser();
	
	userSign.setYourEmail(yourEmail);
	userSign.setYourPassword(yourPassword);
	
	userSign.cSubmitUser();

	String actualResults=userSign.getErrorUSelect1();
    System.out.println(actualResults);
	Assert.assertEquals(actualResults,AutomationConstants.ExpectedErrorUSelection);
	
	
	//String getErrorUSelect1=AutomationContants.ExpectedErrorWU;
	//String actualResults=userSign.getErrorUSelect1();
	//System.out.println(actualResults);
	//Assert.assertEquals(getErrorUSelect1,actualResults );
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

