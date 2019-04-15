package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Itecyemploginpage 
{
	@FindBy(name="email")
	public WebElement username;
	
	@FindBy(name="Password")
	public WebElement pwd;
	
	@FindBy(xpath="//*[@type='submit']")
	public WebElement submit;
	
	@FindBy(xpath="//*[@class='alert alert-danger']")
	public WebElement invalidacnt;
	
	@FindBy(xpath="//*[@class='alert alert-danger']")
	public WebElement invalaidpwd;
	
	@FindBy(xpath="//*[text()='ForgotPassword']")
	public WebElement forgetpwd;
	
	public Itecyemploginpage(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
	}
	
	public void fillempuid(String x)
	{
		username.sendKeys(x);
	}
	
	public void fillemppwd(String x)
	{
		pwd.sendKeys(x);
	}
	
	public void clickforgetpwd()
	{
		forgetpwd.click();
	}
	
	public void clicksubmit()
	{
		submit.click();
	}

}
