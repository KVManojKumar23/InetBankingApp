package com.intelBanking.TestCases;

import org.testng.annotations.Test;

import java.io.IOException;

import org.testng.Assert;
import com.intelBanking.PageObjects.LoginPage;

public class TC_LoginTest001 extends BaseClass {
	
	@Test
	public void loginTest() throws IOException
	{
		logger.info("URL is Opened");
		
		LoginPage lp = new LoginPage(driver);
		lp.setUsername(UserID);
		logger.info("Enter UserName");
		
		lp.setPassword(PassWord);
		logger.info("Enter Password");
		
		lp.clickSubmit();
		
		
		if(driver.getTitle().equalsIgnoreCase("GTPL Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Login test failed");
			captureScreen(driver, "loginTest");
		}
		
		
	}

}
