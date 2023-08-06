package org.ictkerala.testcases;

import java.io.IOException;
import java.time.Duration;

import org.ictkerala.base.BaseClass;
import org.ictkerala.constants.AutomationConstants;
import org.ictkerala.page.LoginPage;
import org.ictkerala.page.UserLoginPost;
import org.ictkerala.utilities.ExcelUtility;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserNewPost extends BaseClass{
	
	LoginPage post;
	UserLoginPost Usrp;
	
	
	@Test(priority=1)
	
	public void validUserPost() throws IOException {
		
		Usrp=new UserLoginPost(driver);
		post=new LoginPage(driver);
		
		
		post.ClickDropDown();
		post.ClickLog();
		String userName=ExcelUtility.getData(28, 0);
		String passwordField=ExcelUtility.getData(28, 1);
		post.stdUserName(userName);
		post.stdUserPassword(passwordField);
		post.clickSubmLogin();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		Usrp.ClickUserPost();
		String InputPutTitle=ExcelUtility.getData(25, 0);
		Usrp.ClickTitle(InputPutTitle);
		
		String InputURL=ExcelUtility.getData(26, 0);
		Usrp.SelectURL(InputURL);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(10,500)");
		Usrp.CategoryClick();
		Usrp.SelectCategoryDrop();
		
		String 	InputPost=ExcelUtility.getData(27, 0);
		Usrp.InputField(InputPost);
		Usrp.clickAdAproval();
		
		
		String actualResult=Usrp.ConfirmNewP();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, AutomationConstants.ExpectedTextNewPost);
		
		
	}
	
	@Test(priority=2)
	//failedTC
public void validUserPostInvalidURL() throws IOException {
		
		Usrp=new UserLoginPost(driver);
		post=new LoginPage(driver);
		
		
		post.ClickDropDown();
		post.ClickLog();
		String userName=ExcelUtility.getData(28, 0);
		String passwordField=ExcelUtility.getData(28, 1);
		post.stdUserName(userName);
		post.stdUserPassword(passwordField);
		post.clickSubmLogin();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		Usrp.ClickUserPost();
		String InputPutTitle=ExcelUtility.getData(25, 0);
		Usrp.ClickTitle(InputPutTitle);
		String InputURL=ExcelUtility.getData(26, 1);
		Usrp.SelectURL(InputURL);
			
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(10,500)");
		Usrp.CategoryClick();
		Usrp.SelectCategoryDrop();
	
		String 	InputPost=ExcelUtility.getData(27, 0);
		Usrp.InputField(InputPost);
		Usrp.clickAdAproval();
		Usrp.ClickBox();
		
		String actualResult=Usrp.ConfirmNewP1();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, AutomationConstants.ExpectedTextNewPost1);
		
		
	}
	@Test(priority=3)
public void validUserPostInvalidCategorySel() throws IOException {
		
		Usrp=new UserLoginPost(driver);
		post=new LoginPage(driver);
		
		
		post.ClickDropDown();
		post.ClickLog();
		String userName=ExcelUtility.getData(28, 0);
		String passwordField=ExcelUtility.getData(28, 1);
		post.stdUserName(userName);
		post.stdUserPassword(passwordField);
		post.clickSubmLogin();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		Usrp.ClickUserPost();
		String InputPutTitle=ExcelUtility.getData(25, 0);
		Usrp.ClickTitle(InputPutTitle);
		
		String InputURL=ExcelUtility.getData(26, 0);
		Usrp.SelectURL(InputURL);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(10,500)");
		//Usrp.CategoryClick();
		//Usrp.SelectCategoryDrop();
		
		String 	InputPost=ExcelUtility.getData(27, 0);
		Usrp.InputField(InputPost);
		//Usrp.clickAdAproval();
		
		
		String actualResult=Usrp.ConfirmNewP1();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, AutomationConstants.ExpectedTextNewPost1);
		

}
	}
