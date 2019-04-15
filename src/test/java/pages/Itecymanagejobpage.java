package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Itecymanagejobpage 
{
	@FindBy(xpath="//*[@class='table']")
	public WebElement table;
	
	public Itecymanagejobpage(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
	}

}
