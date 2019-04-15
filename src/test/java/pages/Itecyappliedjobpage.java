package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Itecyappliedjobpage 
{
  @FindBy(xpath="(//table)/tbody/tr[7]/td")
  public WebElement table7;
  
  @FindBy(xpath="(//*[text()='View Details'])[1]")
  public WebElement viewdetails;
  
  public Itecyappliedjobpage(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
	}
  
  
  public void click_view_details()
  {
	  viewdetails.click();
  }
}
