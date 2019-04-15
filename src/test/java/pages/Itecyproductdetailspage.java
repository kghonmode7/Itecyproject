package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Itecyproductdetailspage 
{
	@FindBy(xpath="//*[text()='Free Registration']")
	public WebElement registration;
	
	@FindBy(name="Button1")
	public WebElement buynow;
	
	@FindBy(xpath="//*[text()='Successfully Updated']")
	public WebElement success;
	
	public Itecyproductdetailspage(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
	}
	
	public void click_free_registration()
	{
		registration.click();
	}
	
	public void click_buynow()
	{
		buynow.click();
	}

}
