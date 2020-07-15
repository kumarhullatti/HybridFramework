package com.acti.aq.testcasess;

import java.io.IOException;

import org.apache.commons.logging.impl.Log4JLogger;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.acti.qa.base.TestBase;
import com.acti.qa.pages.HomePage;
import com.acti.qa.pages.LoginPage;
import com.acti.qa.util.TestUtil;



public class HomePageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	

	public HomePageTest() {
		super();
	}

	//test cases should be separated -- independent with each other
	//before each test case -- launch the browser and login
	//@test -- execute test case
	//after each test case -- close the browser
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	
	}
	
	
	@Test(priority=1)
	public void verifyHomePageTitleTest(){
		String homePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, " Enter Time-Track","Home page title not matched");
	}
	
	@Test(priority=2)
	public void ShorcutwindowTest(){
		homePage.shortcutwindow();
	}
	
	@Test(priority=3)
	public void LagoutTest(){
		homePage.clickOnlagoutLink();
	}
	
		
	
	@AfterMethod
	public void tearDown() throws IOException{
		TestUtil.takeScreenshotAtEndOfTest((ITestResult) driver);
		driver.quit();
	}
	
	

}
