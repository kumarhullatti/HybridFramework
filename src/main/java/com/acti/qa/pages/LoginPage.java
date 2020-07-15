package com.acti.qa.pages;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.acti.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory - OR:
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="pwd")
	WebElement password;
	
	@FindBy(xpath="//a[@id= 'loginButton']")
	WebElement loginBtn;
	
	@FindBy(xpath="//button[contains(text(),'Sign Up')]")
	WebElement signUpBtn;
	
	@FindBy(xpath="//*[@id=\"logoContainer\"]/div[1]/img")
	WebElement actiLogo;
	
	//Initializing the Page Objects:
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public boolean validateActiImage(){
		return actiLogo.isDisplayed();
	}
	
	public HomePage login(String un, String pwd){
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		    	//JavascriptExecutor js = (JavascriptExecutor)driver;
		    	//js.executeScript("arguments[0].click();", loginBtn);
		    	
		return new HomePage();
	}
	
}
