package com.acti.aq.testcasess;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.acti.qa.base.TestBase;
import com.acti.qa.pages.HomePage;
import com.acti.qa.pages.LoginPage;
import com.acti.qa.pages.TaskPage;

public class TaskPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	TaskPage taskPage;
	

	public TaskPageTest() {
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
		taskPage=homePage.clickTasksLink();
		homePage.shortcutwindow();
	}
	
	
	@Test(priority=1)
	public void verifyTaskPageTitleTest(){
		String homePageTitle = taskPage.verifyTaskPageTitle();
		Assert.assertEquals(homePageTitle, "actiTIME - Task List","Home page title not matched");
	}
	
	@Test(priority=2)
	public void createTask()
	{
		taskPage.clickonaddnewTasks();
		taskPage.createnewTasks();
		taskPage.selectcustomerandproject();
		taskPage.entercustomername();
	}
	@Test(priority=3)
	public void LagoutTest(){
		homePage.clickOnlagoutLink();
	}
	
		
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	

}