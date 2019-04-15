package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Itecysearchbylocation 
{
	@FindBy(xpath="//*[text()='Search By location']")
	public WebElement searchlocation;
	
	public Itecysearchbylocation(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

}
