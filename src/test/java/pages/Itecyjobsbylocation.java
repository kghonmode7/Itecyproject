package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Itecyjobsbylocation 
{
	@FindBy(xpath="//*[text()='Mumbai']")
	public WebElement mum;
	
	public Itecyjobsbylocation(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void click_mumbai()
	{
		mum.click();
	}

}
