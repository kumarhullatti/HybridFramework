package com.acti.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.qa.base.TestBase;

public class TaskPage extends TestBase {
	
	@FindBy(xpath = "//td[text()='actiTIME -  Task List']')]")
	@CacheLookup
	WebElement pagetitle;

	@FindBy(xpath = "//*[text()=\"Add New Task\"]")
	WebElement addNewTask;
	
	@FindBy(xpath = "//*[@class=\"item createNewTask ellipsis\"]")
	WebElement createNewTask;
	
	@FindBy(xpath = "//*[@id=\"ext-gen598\"]")
	WebElement selectcustomer;
	
	@FindBy(xpath = "//*[@id=\"ext-gen728\"]")
	WebElement selectnewcustomer;
	
	@FindBy(xpath = "//*[@id=\"createTasksPopup_newCustomer\"]")
	WebElement entercustomername;
	
	@FindBy(xpath = "//*[@id=\"createTasksPopup_newProject\"]")
	WebElement enterprojectname;
	
	@FindBy(xpath = "//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[1]/td[1]/input")
	WebElement entertaskname;
	
	@FindBy(xpath = "//*[@id=\"createTasksPopup_commitBtn\"]")
	WebElement createtask;
	
	// Initializing the Page Objects:
		public TaskPage() {
			PageFactory.initElements(driver, this);
		}
		
		public String verifyTaskPageTitle(){
			return driver.getTitle();
		}
		
		public void clickonaddnewTasks() {
			addNewTask.click();
			
		}
		public void createnewTasks() {
			createNewTask.click();
			
		}
		public void selectcustomerandproject() {
			selectcustomer.click();
			
		}
		public void entercustomername() {
			entercustomername.click();
			entercustomername.sendKeys("my_new_customer");
			
		}
		public void projectname() {
			enterprojectname.click();
			enterprojectname.sendKeys("my_new_project");
			
		}
			}
		
		
	
	
	
	
	
	

