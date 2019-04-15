package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Itecypostjobpage 
{
	@FindBy(name="JobTitle")
	public WebElement title;
	
	@FindBy(xpath="(//*[@class='chosen-choices'])[1]")
	public WebElement type;
	
	@FindBy(name="ContactPerson")
	public WebElement personname;
	
	@FindBy(name="Mobile")
	public WebElement number;
	
	@FindBy(name="Email")
	public WebElement mail;
	
	@FindBy(name="CountryId")
	public WebElement country;
	
	@FindBy(name="StateId")
	public WebElement state;
	
	@FindBy(name="CityId")
	public WebElement city;
	
	@FindBy(name="StartDate")
	public WebElement startdate;
	
	@FindBy(name="ExpiryDate")
	public WebElement endingdate;
	
	@FindBy(name="IndustryId")
	public WebElement industry;
	
	@FindBy(name="FunctionId")
	public WebElement function;
	
	@FindBy(name="Experience")
	public WebElement exp;
	
	@FindBy(xpath="(//*[@class='chosen-choices'])[2]")
	public WebElement skills;
	
	@FindBy(xpath="(//*[text()='Post Job'])[3]")
	public WebElement postjobbutton;
	
	public Itecypostjobpage(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
	}
	
	public void fill_title(String x)
	{
		title.sendKeys(x);
	}
	
	public void select_jobtype()
	{
		type.click();
		Select s=new Select(type);
		s.selectByVisibleText("Full Time");
	}
	
	public void fill_name(String x)
	{
		personname.sendKeys(x);
	}
	
	public void fill_mobile_number(String x)
	{
		number.sendKeys(x);
	}
	
	public void fill_mailid(String x)
	{
		mail.sendKeys(x);
	}
	
	public void select_countryid()
	{
		country.click();
		Select s=new Select(country);
		s.selectByVisibleText("India");
	}
	
	public void select_stateid()
	{
		state.click();
		Select s=new Select(state);
		s.selectByVisibleText("TELANGANA");
	}
	
	public void select_cityid()
	{
		city.click();
		Select s=new Select(city);
		s.selectByVisibleText("Hyderabad");
	}
	
	public void select_startdate()
	{
		startdate.click();
		//pending
	}
	
	public void select_expirydate()
	{
		endingdate.click();
		//pending
	}
	
	public void select_industry()
	{
		industry.click();
		Select s=new Select(industry);
		s.selectByVisibleText("IT");
	}
	
	public void select_function()
	{
		function.click();
		Select s=new Select(function);
		s.selectByVisibleText("IT");
	}
	
	public void select_exp()
	{
		exp.click();
		Select s=new Select(exp);
		s.selectByVisibleText("2 to 5 Years");
	}
	
	public void select_skills()
	{
		skills.click();
		Select s=new Select(skills);
		s.selectByVisibleText("Java");
	}
	
	public void click_postjob()
	{
		postjobbutton.click();
	}


}
