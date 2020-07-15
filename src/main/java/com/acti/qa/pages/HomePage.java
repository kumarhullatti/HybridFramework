package com.acti.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.acti.qa.base.TestBase;



public class HomePage extends TestBase {

	@FindBy(xpath = "//td[text()='Enter Time-Track']')]")
	@CacheLookup
	WebElement pagetitle;
	
	@FindBy(xpath = "//a[@class=\"content tasks\"]")
	WebElement taskLink;

	@FindBy(xpath = "//*[@id=\"gettingStartedShortcutsMenuCloseId\"]")
	WebElement shortcutwindow;
	
	@FindBy(xpath = "//a[@class=\"content reports\"]")
	WebElement reportsLink;
	

	@FindBy(xpath = "//a[@class=\"content users\"]")
	WebElement usersLink;

	@FindBy(xpath = "//a[@id=\"logoutLink\"]")
	WebElement lagoutLink;

	// Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void shortcutwindow()
	{
		shortcutwindow.click();
		
	}
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	
	
	
	public TaskPage clickTasksLink(){
		taskLink.click();
		return new TaskPage();
	}
	
	public ReportsPage clickonReportsLink(){
		reportsLink.click();
		return new ReportsPage();
	}
	
	public UserPage clickOnTasksLink(){
		usersLink.click();
		return new UserPage();
	}
	
	public LoginPage clickOnlagoutLink()
	{
		lagoutLink.click();
		return new LoginPage();
	}
		
	}
	
	
	
	
	
	
	
	
	


