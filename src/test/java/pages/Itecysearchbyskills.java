package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Itecysearchbyskills
{
	@FindBy(xpath="//*[text()='Search By Skills']")
	public WebElement searchskills;
	
	public Itecysearchbyskills(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

}
