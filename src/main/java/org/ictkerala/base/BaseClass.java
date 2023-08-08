package org.ictkerala.base;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;



public class BaseClass {

	public WebDriver driver;
    public static Properties properties;
    public void init() {
    	driver=new ChromeDriver();
    }
	
	 
	   public BaseClass()
	   {
			properties= new Properties();
			File file=new File(System.getProperty("user.dir")+"/src/main/java/org/ictkerala/config/config.properties");
		try {
			FileInputStream inputstream= new FileInputStream(file);
			  properties.load(new InputStreamReader(inputstream, Charset.forName("UTF-8")));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		
	
	}
		
		@BeforeMethod
		
		
	   public void intilization() throws InterruptedException {
			
	String browser=properties.getProperty("browser");
		if(browser.equalsIgnoreCase("chrome"))
		{
		driver=new ChromeDriver();
		}
		if(browser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
	}
         driver.get(properties.getProperty("url"));
        driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		}
}