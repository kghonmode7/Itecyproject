package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Itecyjobsbyindustry 
{
	@FindBy(xpath="//*[text()='Accounting / Finance']")
	public WebElement acntfinc;
	
	public Itecyjobsbyindustry(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void click_acnt()
	{
		acntfinc.click();
	}


}
