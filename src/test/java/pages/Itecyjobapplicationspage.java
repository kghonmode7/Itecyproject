package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Itecyjobapplicationspage 
{
	@FindBy(xpath="(//*[@class='brows-resume'])[5]")
	public WebElement resume;
	
	public Itecyjobapplicationspage(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
	}

}
