package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Itecyapplyjobpage 
{
	@FindBy(xpath="(//*[@type='submit'])[1]")
	public WebElement apply;
	
	@FindBy(xpath="//*[text()='Position Already Applied']")
	public WebElement positionapplied;
	
	public Itecyapplyjobpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void click_apply()
	{
		apply.click();
	}

}
