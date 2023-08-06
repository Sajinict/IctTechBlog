package org.ictkerala.testcases;

import java.io.IOException;
import java.time.Duration;

import org.ictkerala.base.BaseClass;
import org.ictkerala.constants.AutomationConstants;
import org.ictkerala.page.SignUpPage;
import org.ictkerala.utilities.ExcelUtility;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TrainerSignTestCase extends BaseClass {
	
	SignUpPage trainerSign;
	
	
	@Test(priority=1)
	public void verifyvalidTrainerName() throws IOException, InterruptedException 
	{
		trainerSign= new SignUpPage(driver);
		
		trainerSign.ClickDropDown();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		trainerSign.ClickSign();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		trainerSign.SelectTrainer();
		
		trainerSign.SelectEdu();
		
		trainerSign.SelectPG();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	
		String enterName= ExcelUtility.getData(15, 0);
		String yourEmail=ExcelUtility.getData(15, 1);
		String yourPassword=ExcelUtility.getData(15, 2);
		trainerSign.EnterName(enterName);
		trainerSign.setYourEmail(yourEmail);
		trainerSign.setYourPassword(yourPassword);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		trainerSign.allSubmitSign();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		String actualResults=trainerSign.getErrorT1();
	    System.out.println(actualResults);
		Assert.assertEquals(actualResults,AutomationConstants.ExpectedUBox);
}
	
	
	
	
	@Test(priority=2)
	public void verifyInvalidTrainerName() throws IOException, InterruptedException 
	{
		trainerSign= new SignUpPage(driver);
		
		trainerSign.ClickDropDown();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		trainerSign.ClickSign();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		trainerSign.SelectTrainer();
		
		trainerSign.SelectEdu();
		
		trainerSign.SelectPG();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	
		String enterName= ExcelUtility.getData(16, 0);
		String yourEmail=ExcelUtility.getData(16, 1);
		String yourPassword=ExcelUtility.getData(16, 2);
		trainerSign.EnterName(enterName);
		trainerSign.setYourEmail(yourEmail);
		trainerSign.setYourPassword(yourPassword);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		trainerSign.cSubmitUser();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		String actualResults=trainerSign.getErrorU2();
	    System.out.println(actualResults);
		Assert.assertEquals(actualResults,AutomationConstants.ExpectedErrorWU);
}
	
	@Test(priority=3)
	public void verifyInvalidTrainerPassword() throws IOException, InterruptedException 
	{
		trainerSign= new SignUpPage(driver);
		
		trainerSign.ClickDropDown();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		trainerSign.ClickSign();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		trainerSign.SelectTrainer();
		
		trainerSign.SelectEdu();
		
		trainerSign.SelectPG();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	
		String enterName= ExcelUtility.getData(17, 0);
		String yourEmail=ExcelUtility.getData(17, 1);
		String yourPassword=ExcelUtility.getData(17, 2);
		trainerSign.EnterName(enterName);
		trainerSign.setYourEmail(yourEmail);
		trainerSign.setYourPassword(yourPassword);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		//trainerSign.cSubmitUser();
		trainerSign.cSubmitUser();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		String actualResults=trainerSign.getErrorUp1();
	    System.out.println(actualResults);
		Assert.assertEquals(actualResults,AutomationConstants.ExpectedErrorPU);
		
		
	}
	@Test(priority=4)
	public void verifyInvalidTrainerSelection() throws IOException, InterruptedException 
	{
		trainerSign= new SignUpPage(driver);
		
		trainerSign.ClickDropDown();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		trainerSign.ClickSign();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		//trainerSign.SelectTrainer();
		
		//trainerSign.SelectEdu();
		
		//trainerSign.SelectPG();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	
		String enterName= ExcelUtility.getData(15, 0);
		String yourEmail=ExcelUtility.getData(15, 1);
		String yourPassword=ExcelUtility.getData(15, 2);
		trainerSign.EnterName(enterName);
		trainerSign.setYourEmail(yourEmail);
		trainerSign.setYourPassword(yourPassword);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		trainerSign.cSubmitUser();
		trainerSign.cSubmitUser();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		String actualResults=trainerSign.getErrorUSelect1();
	    System.out.println(actualResults);
		Assert.assertEquals(actualResults,AutomationConstants.ExpectedErrorUSelection);

}

}