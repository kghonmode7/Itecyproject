package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Itecyjobsbydesignation 
{
	@FindBy(xpath="//*[text()='Accountant']")
	public WebElement accountant;
	
	public Itecyjobsbydesignation(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void click_acountant()
	{
		accountant.click();
	}

}
