package com.acti.aq.testcasess;
import static org.testng.Assert.assertTrue;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import com.acti.qa.base.TestBase;
import com.acti.qa.pages.HomePage;
import com.acti.qa.pages.LoginPage;


public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	Logger log=Logger.getLogger(LoginPageTest.class);
	
	public LoginPageTest(){
		super();
	}
	
	
	@BeforeMethod
	public void setUp(){
		
		initialization();
		loginPage = new LoginPage();	
		log.info("******************Loginpage opens*******************");
	}
	
	@Test(priority=1)
	public void loginPageTitleTest(){
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "ctiTIME - Login");
		log.info("*****************loginpageTitleTest passed*******************");
	}
	
	@Test(priority=2)
	public void ActiLogoImageTest(){
		boolean flag = loginPage.validateActiImage();
		Assert.assertTrue(flag);
		log.info("*****************ActiLogoImageTest passed*******************");
	}
	
	
	@Test(priority=3)
	public void loginTest(){
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		log.info("*****************HomePage Opens*******************");
	}
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	
	

}