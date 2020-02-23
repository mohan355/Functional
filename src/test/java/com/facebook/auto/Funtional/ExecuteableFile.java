package com.facebook.auto.Funtional;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class ExecuteableFile extends CommonBrowser{

 
	@Test(priority=1)
	public void shanti() {
		HomePageAmazon obj=new HomePageAmazon(driver);
	obj.mohan();
}

@Test(priority=2)
public void sachhem() {
	SecondPageAmazon obj1=new SecondPageAmazon(driver);
	obj1.kafle();
}



@Test(priority=3)
public void samiksha() {
	ThirdPageAmazon obj2= new ThirdPageAmazon(driver);
	obj2.username("moh@gmail.com");
	obj2.passwordfld("123586");
	obj2.inn();
	obj2.wrong();


	}
 

}
