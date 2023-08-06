package org.ictkerala.testcases;

import java.io.IOException;

import org.ictkerala.base.BaseClass;
import org.ictkerala.constants.AutomationConstants;
import org.ictkerala.page.AdminAdRe;
import org.ictkerala.page.LoginPage;
import org.ictkerala.utilities.ExcelUtility;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdminApproval extends  BaseClass {
	
//cncted AdminAdRe	
	
	LoginPage lgp;
	AdminAdRe adm;
	
	
	@Test(priority=1)
	public void ValidApproval() throws IOException {
		
		lgp=new LoginPage(driver);
		adm=new AdminAdRe(driver);
		
		lgp.ClickDropDown();
		lgp.ClickLog();
		adm.stdUserNameA();
		adm.stdUserPasswordA();
		
		lgp.clickSubmLogin();
		
		adm.ActionClick();
		adm.Aprve();
		adm.ApButton();
		
		String actualResult=adm.aprlAdmin();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, AutomationConstants.ExpectedTextAprve);
		
		
		
	}
	@Test(priority=2)
	public void ValidReject() throws IOException {
		
		lgp=new LoginPage(driver);
		adm=new AdminAdRe(driver);
		
		lgp.ClickDropDown();
		lgp.ClickLog();
		adm.stdUserNameA();
		adm.stdUserPasswordA();
		
		lgp.clickSubmLogin();
		
		adm.ActionClick();
		adm.Aprve();
		adm.Rejct();
		
		
		String actualResult=adm.RejectAdmin();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, AutomationConstants.ExpectedTextRejct);
		
		
		
	}
	
	@Test(priority=3)
	public void ValidRejectComment() throws IOException {
		
		lgp=new LoginPage(driver);
		adm=new AdminAdRe(driver);
		
		lgp.ClickDropDown();
		lgp.ClickLog();
		adm.stdUserNameA();
		adm.stdUserPasswordA();
		
		lgp.clickSubmLogin();
		
		adm.ActionClick();
		adm.Aprve();
		adm.Rejct();
		adm.RejctCmnt();
		
		String cmntbox= ExcelUtility.getData(45, 0);
		adm.CommentR(cmntbox);
		adm.SendButton();
		
		
	
		
		String actualResult=adm.RjctCmnt();
		System.out.println(actualResult);
	Assert.assertEquals(actualResult, AutomationConstants.ExpectedTextRcmt);
		
		
		
	}
	

}
