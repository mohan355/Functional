package com.facebook.auto.Funtional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThirdPageAmazon {
	
	WebDriver driver;
	
	@FindBy(name="emailllll")
	WebElement usre;
	
	@FindBy(xpath="//*[contains(@type,'password')]")
	WebElement paswd;
	
	@FindBy(id="signInSubmit")
	WebElement signinn;
	
	@FindBy(xpath="//*[@class='a-list-item']")
	WebElement msg;
	
	
	public ThirdPageAmazon(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void username(String email) {
		usre.sendKeys( email);
		
	}
	public void passwordfld(String passwrd) {
		paswd.sendKeys(passwrd);
		
	}
	public void inn() {
		signinn.click();
	}
	public void wrong() {
	String eror=msg.getText();
	System.out.println(eror);
		
	}
	
	public void empty() {
		usre.clear();
	}

}
