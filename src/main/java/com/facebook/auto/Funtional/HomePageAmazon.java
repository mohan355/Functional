package com.facebook.auto.Funtional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageAmazon {
	
	WebDriver driver;
	
	@FindBy(partialLinkText="Try")
	WebElement prime;
	
	public HomePageAmazon(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		}
	public void mohan() {
		prime.click();
		
         }

}
