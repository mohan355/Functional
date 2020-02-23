package com.facebook.auto.Funtional;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Testdeta extends CommonBrowser {
  @Test(dataProvider = "signin")
  public void f(String n, String s) throws InterruptedException {
	  
		HomePageAmazon obj=new HomePageAmazon(driver);
	obj.mohan();
	  
	  SecondPageAmazon obj1=new SecondPageAmazon(driver);
		obj1.kafle();
	  
		ThirdPageAmazon obj2= new ThirdPageAmazon(driver);
		obj2.username("moh@gmail.com");
		obj2.passwordfld("123586");
		obj2.inn();
		obj2.wrong();
		
		driver.navigate().back();
		
		obj2.empty();
		
		Thread.sleep(8000);
	  
  }

  @DataProvider
  public Object[][] signin() {
    return new Object[][] {
      new Object[] { "mosfeka@yahoo.com", "ahgjhgj" },
      new Object[] { "mosfeka1@yahoo.com", "bkjgkhgkhg" },
      new Object[] { "mohan@yahoo.com", "gkgggjhg" },
      
    };
  }
}
