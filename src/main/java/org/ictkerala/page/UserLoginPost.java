package org.ictkerala.page;

import java.time.Duration;

import org.ictkerala.base.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserLoginPost extends BaseClass {
	
	public UserLoginPost(WebDriver driver)
	{this.driver=driver;
	PageFactory.initElements(driver, this);}
	
	@FindBy(xpath="//a[@href=\"/usernewpost\"]")  // 
	WebElement UserNewPost;
	@FindBy(xpath="//input[@id=\"exampleInputEmail1\"]") //
	WebElement InputPutTitle;
	
	@FindBy(xpath="//input[@name=\"P_image\"]")
	WebElement InputURL;
	
	@FindBy(xpath="/html/body/app-root/app-usernewpost/form/div[4]/select")
	WebElement InputCategory;
	
	@FindBy(xpath="/html/body/app-root/app-usernewpost/form/div[4]/select/option[1]")
	WebElement CategoryDrp;
	
	@FindBy(xpath="//textarea[@name=\"p_post\"]")
	WebElement InputPost;
	
	@FindBy(xpath="//button[@class=\"btn text-center btn-primary\"]")
	WebElement SendApproval;
	
	
	public void ClickUserPost() {
		UserNewPost.click();
		}
		public void ClickTitle(String newTitle) 
		{
			InputPutTitle.sendKeys(newTitle);
		}
		public void SelectURL(String newURL)
		{InputURL.sendKeys(newURL);
		}
		
		public void CategoryClick()
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
			InputCategory.sendKeys(Keys.ENTER);
		}
		public void SelectCategoryDrop() {
			CategoryDrp.click();
		}
		
		public void InputField(String inputUserP) {
			InputPost.sendKeys(inputUserP);
		}
		
		
		
		public void clickAdAproval()
		{
			SendApproval.sendKeys(Keys.ENTER);
	
		}
		public void ClickBox() {
			driver.switchTo().activeElement().click();
		}
		
		
		
	//assertion	
		public String ConfirmNewP() {
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
			return (driver.switchTo().activeElement().getText());
			}
		
		public String ConfirmNewP1() {
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
			return (driver.getCurrentUrl());
		
}
}