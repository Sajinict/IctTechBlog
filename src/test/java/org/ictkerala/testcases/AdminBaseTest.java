package org.ictkerala.testcases;

import java.io.IOException;
import java.time.Duration;

import org.ictkerala.base.BaseClass;
import org.ictkerala.constants.AutomationConstants;
import org.ictkerala.page.AdminMain;
import org.ictkerala.page.LoginPage;
import org.ictkerala.utilities.ExcelUtility;
import org.ictkerala.utilities.ExcelUtility2;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdminBaseTest extends BaseClass {
	
	
	
	AdminMain adminTry;
	//LoginPage admN;
	@Test
	public void adminBasic() throws IOException  {
		adminTry =new AdminMain(driver);
	          //admN=new LoginPage(driver);
		
		adminTry.ClickDropDown();
		adminTry.ClickLog();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		String userName=ExcelUtility.getData(21, 0);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		System.out.println(userName);
		String passwordField=ExcelUtility.getData(21, 1);
				System.out.println(passwordField);
				
				
		
		
				//adminTry.ClickDropDown();
				//adminTry.ClickLog();
				driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
				adminTry.stdUserName(userName);
				
				adminTry.stdUserPassword(passwordField);
				driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
				adminTry.clickSubmLogin();
		
		String actualResult=adminTry.ConfirmAdmin();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, AutomationConstants.ExpectedURL);
		
	}


}