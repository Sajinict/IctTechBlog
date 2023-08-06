package org.ictkerala.testcases;

import java.io.IOException;
import java.time.Duration;

import org.ictkerala.base.BaseClass;
import org.ictkerala.constants.AutomationConstants;
import org.ictkerala.page.AdminAdRe;
import org.ictkerala.page.LoginPage;
import org.ictkerala.utilities.ExcelUtility;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdminAdReTest extends BaseClass{
	
	LoginPage lgp;
	AdminAdRe adm;
	
	
	@Test(priority=1)
	public void ValidAddCat() throws IOException {
		
		lgp=new LoginPage(driver);
		adm=new AdminAdRe(driver);
		
		lgp.ClickDropDown();
		lgp.ClickLog();
		adm.stdUserNameA();
		adm.stdUserPasswordA();
		
		lgp.clickSubmLogin();
		
		adm.ActionClick();
		adm.ClickActionDrop();
		
		
		String addCaInp=ExcelUtility.getData(41, 0);
		adm.AdCapInp(addCaInp);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		
		adm.AddButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		
		String actualResult=adm.adConfirm();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, AutomationConstants.ExpectedTextCate);
		
		
		
	}
	
	@Test(priority=2)
	public void NonCapsAddCat() throws IOException {
		
		lgp=new LoginPage(driver);
		adm=new AdminAdRe(driver);
		
		lgp.ClickDropDown();
		lgp.ClickLog();
		adm.stdUserNameA();
		adm.stdUserPasswordA();
		
		lgp.clickSubmLogin();
		
		adm.ActionClick();
		adm.ClickActionDrop();
		
		
		String addCaInp=ExcelUtility.getData(42, 0);
		adm.AdCapInp(addCaInp);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		
		//adm.AddButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		
		String actualResult=adm.adConfirm1();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, AutomationConstants.ExpectedTextCate1);
		
		
		
	}
	
	@Test(priority=3)
	public void SameValidAddCat() throws IOException {
		
		lgp=new LoginPage(driver);
		adm=new AdminAdRe(driver);
		
		lgp.ClickDropDown();
		lgp.ClickLog();
		adm.stdUserNameA();
		adm.stdUserPasswordA();
		
		lgp.clickSubmLogin();
		
		adm.ActionClick();
		adm.ClickActionDrop();
		
		
		String addCaInp=ExcelUtility.getData(41, 0);
		adm.AdCapInp(addCaInp);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		
		adm.AddButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		
		String actualResult=adm.adConfirm2();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, AutomationConstants.ExpectedTextCateg3);
		
		}
	
	
	@Test
	public void RemoveCat()throws IOException {
		
		
		lgp=new LoginPage(driver);
		adm=new AdminAdRe(driver);
		
		lgp.ClickDropDown();
		lgp.ClickLog();
		adm.stdUserNameA();
		adm.stdUserPasswordA();
		
		lgp.clickSubmLogin();
		
		adm.ActionClick();
		adm.ClickActionDrop();
		
		adm.AdRemove();
		
		
		String actualResult=adm.removeConfirm();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, AutomationConstants.ExpectedTextCate4);
		
		
	}

}
