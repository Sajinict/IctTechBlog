package org.ictkerala.page;

import org.ictkerala.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeChecks extends BaseClass  {
	public  HomeChecks(WebDriver driver)
    {this.driver=driver;
    PageFactory.initElements(driver, this);
    }
	
	
	@FindBy(xpath="//p[@class=\"dropdown-toggle\"]")
	WebElement hCata;
	
	
	//Home Category: User
	@FindBy(xpath="//li[@class='nav-item dropdown']//li[1]//a[1]")
	WebElement hCUser;
	
	@FindBy(xpath="//li[2]//div[1]//div[1]//div[1]//h5[1]")
	WebElement hUPosted;
	
	
	@FindBy(xpath="//li[10]//a[1]")
	WebElement hCGE;
	
	@FindBy (xpath="//h5[normalize-space()='AKHL']")
	WebElement hUPosted1;
	
	//Method
	public void HomeDropCat() {
		hCata.click();
	}
	
	public void ClickHCata () {
		hCUser.click();
	}
	
	public void ClickHGECata() {
		hCGE.click();
	}
	
	
	//Assertion
	public String PostedPost() {
	return hUPosted.getText();
	}
	
	public String PostedPost1() {
	return hUPosted1.getText();
	}
	
}
