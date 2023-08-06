package org.ictkerala.page;

import java.time.Duration;

import org.ictkerala.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminAdRe extends BaseClass {
	
	
	public AdminAdRe(WebDriver driver)
	{this.driver=driver;
	PageFactory.initElements(driver, this);}
	
	//LGDUPLI
	
	@FindBy(id="user")
	WebElement userNameA;
	
	@FindBy(id="pwd")
	WebElement passwordFieldA;
	
	
	
	
	@FindBy(xpath="//li[@class='nav-item dropdown ng-star-inserted']//p[@id='nav']")
	WebElement actionMain;
	
	@FindBy(xpath="//a[@routerlink=\"/category\"]")
     WebElement actionDrop;
	
	@FindBy(xpath="//input[@placeholder=\"Enter new category name\"]")
	WebElement addCaInp;
	
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	WebElement addBtn;
	
	//AdmnRmv
	
	@FindBy(xpath="//li[1]//button[1]")
	WebElement remove;
	
	//apprv
	
	@FindBy(xpath="//li[@class='nav-item dropdown ng-star-inserted']//li[1]//a[1]")
	WebElement approve;
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-pendingapproval[1]/div[2]/li[1]/div[1]/div[1]/div[1]/button[1]")
	WebElement aprvBtn;
	//rjct
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-pendingapproval[1]/div[2]/li[1]/div[1]/div[1]/div[1]/button[2]")
	WebElement rejct;
	
	@FindBy(xpath="//textarea[@name=\"p_post\"]")
	WebElement cmntbox;
	
	
@FindBy(xpath="//button[@class=\"btn btn-primary\"]")
WebElement send;
	
	public String stdUserNameA()
	{userNameA.sendKeys("admin");
	return null;
	}
	
	public String stdUserPasswordA()
	{
	passwordFieldA.sendKeys("1234");
	return null;
	}
	
	
	public void ActionClick() {
		actionMain.click();
		
	}
	public void ClickActionDrop() {
		actionDrop.click();
	}
	public void AdCapInp(String categoryName) {
		addCaInp.sendKeys(categoryName);
	}
	public void AddButton() {
		addBtn.sendKeys(Keys.ENTER);
	}
	
	
	public void AdRemove() {
		remove.click();
	}
	
	public void Aprve() {
		approve.click();
	}
	public void ApButton() {
		aprvBtn.click();
	}
	
	public void Rejct() {
	rejct.click();
	}
	public void RejctCmnt() {
		driver.switchTo().alert().accept();
	}
	public void CommentR(String commentRejct) {
		cmntbox.sendKeys(commentRejct);
	}
	public void SendButton() {
		send.sendKeys(Keys.ENTER);
	}
	//public void SDCmnt() {
		//driver.switchTo().alert().accept();}
	
//	assertion
	
	public String adConfirm() {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		return (driver.switchTo().alert().getText());
		}
	
	
	public String adConfirm1() {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		return (driver.getCurrentUrl());
		}
	
	public String adConfirm2() {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		return (driver.switchTo().alert().getText());
}
	public String removeConfirm() {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		return (driver.switchTo().alert().getText());
}
	public String aprlAdmin() {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		return (driver.switchTo().activeElement().getText());
}
	public String RejectAdmin() {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		return (driver.switchTo().alert().getText());
}
	public String RjctCmnt() {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		return (driver.switchTo().alert().getText());
	
	}
}