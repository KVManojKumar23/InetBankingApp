package com.intelBanking.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.intelBanking.PageObjects.AddCustomerPage;
import com.intelBanking.PageObjects.LoginPage;

public class TC_AddCustomer_003 extends BaseClass{
	
	@Test
	public void AddNewCoustomer() throws InterruptedException, IOException
	{
		LoginPage lp = new LoginPage(driver);
		
		lp.setUsername(UserID);
		logger.info("UserName is Provided");
		lp.setPassword(PassWord);
		logger.info("Password is provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		AddCustomerPage cp = new AddCustomerPage(driver);
		
		cp.clickAddCustomerPage();
		Thread.sleep(10000);
		//cp.clickDismiss();
		
		logger.info("providing Customer Details....");
		
		cp.custName("Manoj");
		cp.custGender();
		cp.custDob("02", "03", "1999");
		Thread.sleep(3000);
		cp.custAddress("Kampli");
		cp.custCity("Ballary");
		cp.custState("Karnataka");
		cp.custPinno("123456");
		cp.custTelephone("1234567899");
		
		String email = getRandomEmails_8()+"@gmail.com";
		cp.custEmail(email);
		cp.custPassword("abced");
		cp.clickSubmit();
		
		Thread.sleep(3000);
		
		logger.info("Validation started....");
		
		boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("test case passed....");
			
		}
		else
		{
			logger.info("test case failed....");
			captureScreen(driver,"addNewCustomer");
			Assert.assertTrue(false);
		}
		
	}

}
