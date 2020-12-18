package com.crm.qa.pages;



import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//div[contains(text(), 'Login') and @class='ui fluid large blue submit button']")
	WebElement Submit_Login;
	
	@FindBy(xpath="//span[contains(text(),'Log In')]")
	WebElement LoginBtn;
	
	public LoginPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	

	
	public HomePage Login(String un, String pwd) throws IOException {
		LoginBtn.click();
		username.sendKeys(un);
		password.sendKeys(pwd);
		Submit_Login.click();
		
		return new HomePage();
	}
	
	
	
}
