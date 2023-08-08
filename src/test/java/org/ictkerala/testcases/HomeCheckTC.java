package org.ictkerala.testcases;

import org.ictkerala.base.BaseClass;
import org.ictkerala.constants.AutomationConstants;
import org.ictkerala.page.HomeChecks;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeCheckTC extends BaseClass {

	HomeChecks hmc;

	@Test(priority=1)
	public void CheckUserCataPosted() {
	hmc= new HomeChecks(driver);
		
	hmc.HomeDropCat();
	hmc.ClickHCata();
	
//	JavascriptExecutor js = (JavascriptExecutor) driver;
//	js.executeScript("window.scrollBy(10,500)");
	
	String actualResult=hmc.PostedPost();
	System.out.println(actualResult);
	Assert.assertEquals(actualResult, AutomationConstants.ExpectedTextUserCata);
	
	}

	@Test(priority=2)
	public void CheckGECataPosted() {
	hmc= new HomeChecks(driver);
		
	hmc.HomeDropCat();
	hmc.ClickHGECata();
	
	String actualResult=hmc.PostedPost1();
	System.out.println(actualResult);
	Assert.assertEquals(actualResult, AutomationConstants.ExpectedTextGECata);
	
	}
	
	
}
