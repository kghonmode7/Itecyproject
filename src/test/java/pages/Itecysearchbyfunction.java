package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Itecysearchbyfunction 
{
	@FindBy(xpath="//*[text()='Search By Function']")
	public WebElement searchfunction;
	
	public Itecysearchbyfunction(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

}
