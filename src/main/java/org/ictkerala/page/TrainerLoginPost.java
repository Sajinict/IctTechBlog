package org.ictkerala.page;

import java.time.Duration;

import org.ictkerala.base.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrainerLoginPost extends BaseClass {
	
	public TrainerLoginPost(WebDriver driver)
	{this.driver=driver;
	PageFactory.initElements(driver, this);}
	
	

    @FindBy(xpath="//a[@href=\"/trainerpost\"]")
    WebElement TrainerNewPost;
    @FindBy(xpath="//input[@id=\"exampleInputEmail1\"]")
	WebElement InputPutTitle;
    
    @FindBy(xpath="//input[@name=\"P_image\"]")
	WebElement InputURL;
    
    @FindBy(xpath="//select[@name=\"p_cat\"]")
	WebElement InputCategory;
    
    @FindBy(xpath="/html/body/app-root/app-trainerpost/form/div[4]/select/option[1]")
	WebElement CategoryDrp;
    
    @FindBy(xpath="//textarea[@name=\"p_post\"]")
	WebElement InputPost;
    
    @FindBy(xpath="//button[@type=\"submit\"]")
	WebElement SendSubmit;
    
    
    public void ClickTrainerPost() {
		TrainerNewPost.click();
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
	
	public void InputField(String inputTrainerP) {
		InputPost.sendKeys(inputTrainerP);
	}
	
	public void ClickSubmitt() {
		SendSubmit.sendKeys(Keys.ENTER);

	}
	
	public String ConfirmNewPT() {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		return (driver.switchTo().activeElement().getText());
		
	}
	public String ConfirmNewPT1() {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		return(driver.getCurrentUrl());
		
		}
	
	
	
	public void ClickBox() {
		driver.switchTo().activeElement().click();
	}
	
	
	
}
