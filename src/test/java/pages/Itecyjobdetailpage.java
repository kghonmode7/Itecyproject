package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Itecyjobdetailpage 
{
	@FindBy(xpath="//*[text()='Apply']")
    public WebElement applyjob;
	  
	public Itecyjobdetailpage(WebDriver driver)
	 {
		PageFactory.initElements(driver,this);
	 }
	
	public void click_apply()
	{
		applyjob.click();
	}


}
