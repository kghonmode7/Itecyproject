package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Itecyprofiledetailpage 
{
	@FindBy(xpath="(//*[text()='Profile Details'])[2]")
	public WebElement details;
	
	@FindBy(xpath=("//*[text()=' Click here ']"))
	public WebElement downloadresume;
	
	public Itecyprofiledetailpage(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
	}
	
	public void click_download()
	{
		downloadresume.click();
	}

}
