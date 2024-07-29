package com.intelBanking.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name = "uid")
	@CacheLookup
	WebElement txtUsername;
	
	@FindBy(name = "password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(name = "btnLogin")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(xpath = "//div//div//li//a[@href='Logout.php']")
	@CacheLookup
	WebElement btnlogout;
	
	public void setUsername(String User)
	{
		txtUsername.sendKeys(User);
	}
	
	public void setPassword(String Password)
	{
		txtPassword.sendKeys(Password);
	}

	public void clickSubmit()
	{
		btnLogin.click();
	}
	
	public void clockLogout()
	{
		btnlogout.click();
	}
}
