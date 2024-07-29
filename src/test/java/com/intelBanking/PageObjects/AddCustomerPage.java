package com.intelBanking.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	
	WebDriver ldriver;
	
	public AddCustomerPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@CacheLookup
	@FindBy(how = How.XPATH, using ="/html/body/div[3]/div/ul/li[2]/a")
	WebElement lnkAddNewCustomer;
	
	@CacheLookup
	@FindBy(how = How.NAME, using = "name")
	WebElement txtCustomerName;
	
	@CacheLookup
	@FindBy(how = How.NAME, using = "rad1")
	WebElement rdGender;
	
	@CacheLookup
	@FindBy(how = How.NAME, using = "dob")
	WebElement txtdob;
	
	@CacheLookup
	@FindBy(how = How.NAME, using = "addr")
	WebElement txtaddress;
	
	@CacheLookup
	@FindBy(how = How.NAME, using = "city")
	WebElement txtCity;
	
	@CacheLookup
	@FindBy(how = How.NAME, using = "state")
	WebElement txtState;
	
	@CacheLookup
	@FindBy(how = How.NAME, using = "pinno")
	WebElement txtPinno;
	
	@CacheLookup
	@FindBy(how = How.NAME, using = "telephoneno")
	WebElement txtTelephoneno;
	
	@CacheLookup
	@FindBy(how = How.NAME, using = "emailid")
	WebElement txtEmail;
	
	@CacheLookup
	@FindBy(how = How.NAME, using = "password")
	WebElement txtPassword;
	
	@CacheLookup
	@FindBy(how = How.NAME, using = "sub")
	WebElement clickSumit;
	
	@CacheLookup
	@FindBy(id ="dismiss-button")
	WebElement dismiss;
	
	public void clickAddCustomerPage()
	{
		lnkAddNewCustomer.click();
	}
	
	public void custName(String UserName)
	{
		txtCustomerName.sendKeys(UserName);
	}
	
	public void custGender()
	{
		rdGender.click();
	}
	
	public void custDob(String dd, String mm, String yyyy)
	{
		txtdob.sendKeys(dd);
		txtdob.sendKeys(mm);
		txtdob.sendKeys(yyyy);
	}
	
	public void custAddress(String address)
	{
		txtaddress.sendKeys(address);
	}
	
	public void custCity(String city)
	{
		txtCity.sendKeys(city);
	}
	
	public void custState(String state)
	{
		txtState.sendKeys(state);
	}
	
	public void custPinno(String pinno)
	{
		txtPinno.sendKeys(pinno);
	}
	
	public void custTelephone(String telephone)
	{
		txtTelephoneno.sendKeys(telephone);
	}
	
	public void custEmail(String Email)
	{
		txtEmail.sendKeys(Email);
	}
	
	public void custPassword(String Password)
	{
		txtPassword.sendKeys(Password);
	}
	
	public void clickSubmit() 
	{
		clickSumit.click();	
	}
	
	public void clickDismiss()
	{
		dismiss.click();
	}
	

}
