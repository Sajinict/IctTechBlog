package org.ictkerala.testcases;

import java.io.IOException;
import java.time.Duration;

import org.ictkerala.base.BaseClass;
import org.ictkerala.constants.AutomationConstants;
import org.ictkerala.page.LoginPage;
import org.ictkerala.page.TrainerLoginPost;
import org.ictkerala.utilities.ExcelUtility;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TrainerNewPost extends BaseClass{
	
	LoginPage post1;
	TrainerLoginPost Usrp1;
	
@Test(priority=1)
	
	public void validUserPost() throws IOException
	{
	post1=new LoginPage(driver);
	Usrp1=new TrainerLoginPost(driver);
	
	post1.ClickDropDown();
	post1.ClickLog();
	String userName=ExcelUtility.getData(33, 0);
	String passwordField=ExcelUtility.getData(33, 1);
	post1.stdUserName(userName);
	post1.stdUserPassword(passwordField);
	post1.clickSubmLogin();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	
	Usrp1.ClickTrainerPost();
	String InputPutTitle=ExcelUtility.getData(34, 0);
	Usrp1.ClickTitle(InputPutTitle);

	String InputURL=ExcelUtility.getData(35, 0);
	Usrp1.SelectURL(InputURL);
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(10,500)");

	Usrp1.CategoryClick();
	Usrp1.SelectCategoryDrop();
	
	String 	InputPost=ExcelUtility.getData(36, 0);
	Usrp1.InputField(InputPost);
	Usrp1.ClickSubmitt();
	
	
	
	String actualResult=Usrp1.ConfirmNewPT();
			System.out.println(actualResult);
	Assert.assertEquals(actualResult, AutomationConstants.ExpectedTextNewPostT);
	
	}
	
@Test(priority=2)

public void validTrainerPostInvalidURL() throws IOException
{
post1=new LoginPage(driver);
Usrp1=new TrainerLoginPost(driver);

post1.ClickDropDown();
post1.ClickLog();
String userName=ExcelUtility.getData(33, 0);
String passwordField=ExcelUtility.getData(33, 1);
post1.stdUserName(userName);
post1.stdUserPassword(passwordField);
post1.clickSubmLogin();
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

Usrp1.ClickTrainerPost();
String InputPutTitle=ExcelUtility.getData(34, 0);
Usrp1.ClickTitle(InputPutTitle);

String InputURL=ExcelUtility.getData(35, 1);
Usrp1.SelectURL(InputURL);
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(10,500)");

Usrp1.CategoryClick();
Usrp1.SelectCategoryDrop();

String 	InputPost=ExcelUtility.getData(36, 0);
Usrp1.InputField(InputPost);
Usrp1.ClickSubmitt();

Usrp1.ClickBox();

String actualResult=Usrp1.ConfirmNewPT1();
		System.out.println(actualResult);
Assert.assertEquals(actualResult, AutomationConstants.ExpectedTextNewPostT1);

}
@Test(priority=1)

public void validUserPostInvalidCategorySel() throws IOException
{
post1=new LoginPage(driver);
Usrp1=new TrainerLoginPost(driver);

post1.ClickDropDown();
post1.ClickLog();
String userName=ExcelUtility.getData(33, 0);
String passwordField=ExcelUtility.getData(33, 1);
post1.stdUserName(userName);
post1.stdUserPassword(passwordField);
post1.clickSubmLogin();
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

Usrp1.ClickTrainerPost();
String InputPutTitle=ExcelUtility.getData(34, 0);
Usrp1.ClickTitle(InputPutTitle);

String InputURL=ExcelUtility.getData(35, 0);
Usrp1.SelectURL(InputURL);
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(10,500)");

//Usrp1.CategoryClick();
//Usrp1.SelectCategoryDrop();

String 	InputPost=ExcelUtility.getData(36, 0);
Usrp1.InputField(InputPost);
Usrp1.ClickSubmitt();



String actualResult=Usrp1.ConfirmNewPT1();
		System.out.println(actualResult);
Assert.assertEquals(actualResult, AutomationConstants.ExpectedTextNewPostT1);

}



}
