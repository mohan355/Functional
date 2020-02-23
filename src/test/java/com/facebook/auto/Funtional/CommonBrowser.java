package com.facebook.auto.Funtional;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class CommonBrowser {
	public static WebDriver driver;
	
	@BeforeClass
	@Parameters({"URL","browser"})
	public void beforeClass(String mohan,String kafle) {
		
	if(kafle.equalsIgnoreCase("chrome")) { 
			System.setProperty("webdriver.chrome.driver","C:\\Users\\kafle\\Desktop\\PNT\\Funtional\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.navigate().to(mohan);
			driver.manage().window().maximize();
	}
	  else if(kafle.equalsIgnoreCase("firefox")) {
		  System.setProperty("webdriver.gecko.driver","C:\\Users\\kafle\\Desktop\\PNT\\Funtional\\Drivers\\geckodriver.exe");
		  driver=new FirefoxDriver();
		  driver.navigate().to(mohan);
		  driver.manage().window().maximize();
		  
	  }
	  else {
		  System.out.println("please check name");
	  }
	  
	}



@AfterClass
public void afterClass() throws IOException {	

 	
}
public void screenshot(String source) throws IOException {
	
	File shots = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(shots, new File (source+tmsp()+"scrn.png"));
}
public String tmsp() {
return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	
}
}
