package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Itecysearchbydesignation 
{
	@FindBy(xpath="//*[text()='Search By Designation']")
	public WebElement searchdesignation;
	
	public Itecysearchbydesignation(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

}
