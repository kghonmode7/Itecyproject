package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Itecybuyjobpostingpackage 
{
	@FindBy(xpath="//*[text()='Buy Job posting package']")
	public WebElement buyjob;
	
	public Itecybuyjobpostingpackage(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
	}
	
	public void click_buyjob()
	{
		buyjob.click();
	}

}
