package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Itecyemployerpage 
{
	@FindBy(xpath="//*[text()='Employer']")
	public WebElement emp;
	
	@FindBy(xpath="//*[text()='Post Job']")
	public WebElement postjob;
	
	@FindBy(xpath=("//*[text()='My Account']"))
	public WebElement myaccount;
	
	@FindBy(xpath="//*[text()='Job applications']")
	public WebElement applications;
	
	public Itecyemployerpage(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
	}
	
	public void click_employer()
	{
		emp.click();
	}
	public void click_myaccount()
	{
		myaccount.click();
	}
	public void click_job_application()
	{
		applications.click();
	}
	public void click_post_job()
	{
		postjob.click();
	}

}
