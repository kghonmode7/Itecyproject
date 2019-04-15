package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Itecysearchbyindustry 
{
	@FindBy(xpath="//*[text()='Search By Industry']")
	public WebElement searchindustry;
	
	public Itecysearchbyindustry(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

}
