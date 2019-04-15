package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Itecysearchbycountry 
{
	@FindBy(xpath="//*[text()='Search By country']")
	public WebElement searchcountry;
	
	public Itecysearchbycountry(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

}
