package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Itecysearchbycompany 
{
	@FindBy(xpath="//*[text()='Search By company']")
	public WebElement searchcompany;
	
	public Itecysearchbycompany(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

}
