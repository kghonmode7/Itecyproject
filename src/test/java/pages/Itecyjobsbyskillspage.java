package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Itecyjobsbyskillspage 
{
	@FindBy(id="btnA")
	public WebElement A;
	
	@FindBy(id="btnB")
	public WebElement B;
	
	@FindBy(id="btnC")
	public WebElement C;
	
	@FindBy(id="btnD")
	public WebElement D;
	
	@FindBy(id="btnE")
	public WebElement E;
	
	@FindBy(xpath="//*[text()='ASP.Net']")
	public WebElement aspnet;
	
	public Itecyjobsbyskillspage(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
	}
	
	public void click_a()
	{
		A.click();
	}
	
	public void click_b()
	{
		B.click();
	}

	
	public void click_c()
	{
		C.click();
	}

	
	public void click_d()
	{
		D.click();
	}

	
	public void click_e()
	{
		E.click();
	}

	
	public void click_asp()
	{
		aspnet.click();
	}


}
