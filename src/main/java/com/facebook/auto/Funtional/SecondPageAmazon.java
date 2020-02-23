package com.facebook.auto.Funtional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecondPageAmazon {
	WebDriver driver;
	
	@FindBy(xpath="//*[@class='prime-cta-signup-button-input']")
	WebElement tprime;
	
	public SecondPageAmazon(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	 
 public void kafle() {
	 tprime.click();
	 
 }

}
