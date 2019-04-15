package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Itecyforgetpasswordpage 
{
	@FindBy(name="Email")
	public WebElement mailid;
	
	@FindBy(xpath="//*[@class='btn btn-login']")
	public WebElement submitbutton;
	
	@FindBy(xpath="//*[@class='panel-title']")
	public WebElement resetlinkmsg;
	
	public Itecyforgetpasswordpage(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
	}
	
	public void fillmailid(String x)
	{
		mailid.sendKeys(x);
	}
	
	public void click_submit_button()
	{
		submitbutton.click();
	}

}
