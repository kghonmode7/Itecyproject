package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Itecyjobsbycompany 
{
	@FindBy(xpath="//*[text()='Abhi TechnoSoft']")
	public WebElement abhi;
	
	public Itecyjobsbycompany(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void click_technosoft()
	{
		abhi.click();
	}

}
