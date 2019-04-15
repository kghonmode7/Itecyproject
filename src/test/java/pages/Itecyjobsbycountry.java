package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Itecyjobsbycountry 
{
	@FindBy(xpath="//*[text()='India']")
	public WebElement ind;
	
	public Itecyjobsbycountry(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void click_india()
	{
		ind.click();
	}

}
