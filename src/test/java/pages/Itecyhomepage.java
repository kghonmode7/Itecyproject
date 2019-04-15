package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Itecyhomepage 
{
	
@FindBy(xpath="//*[text()='Hi komalkumar ghonmode !']")
public WebElement messg;

@FindBy(linkText="Log off")
public WebElement logoff;

@FindBy(xpath="//*[text()='Job Seeker']")
public WebElement jobseeker_dropdown_link;

@FindBy(xpath="//*[text()='Create Resume']")
public WebElement create_resume_option;

@FindBy(xpath="//*[text()='Employer Zone']")
public WebElement emp_link;

@FindBy(xpath="//*[@placeholder='Keyword: Name']")
public WebElement keywordname;

@FindBy(xpath="//*[@class='chosen-single']")
public WebElement selectstate;

@FindBy(xpath="//*[text()=' Search Job']")
public WebElement searchjob;

@FindBy(xpath="(//*[@class='brows-job-list'])[1]")
public WebElement list;

@FindBy(xpath="//*[text()='Salary']")
public WebElement salary;

@FindBy(xpath="(//*[@class='custom-checkbox'])[25]")
public WebElement under10k;

@FindBy(xpath="(//*[@class='custom-checkbox'])[26]")
public WebElement morethan10k;

@FindBy(xpath="(//*[@class='custom-checkbox'])[27]")
public WebElement morethan30k;

@FindBy(xpath="(//*[@class='custom-checkbox'])[28]")
public WebElement morethan50k;

@FindBy(xpath="(//*[@class='custom-checkbox'])[29]")
public WebElement morethan1lac;

@FindBy(name="PageSize")
public WebElement pagelist;

@FindBy(xpath="//*[text()='Job type']")
public WebElement jobtype;

@FindBy(xpath="(//*[@class='custom-checkbox'])[30]")
public WebElement fulltime;

@FindBy(xpath="(//*[@class='custom-checkbox'])[31]")
public WebElement contract;

@FindBy(xpath="//*[text()='Apply Now']")
public WebElement applynow;

@FindBy(xpath="(//*[text()='Full Time,'])[1]")
public WebElement fulltimejoblist;

@FindBy(xpath="(//*[text()='Contract Corp to Corp'])[1]")
public WebElement contractjoblist;

@FindBy(xpath="//*[text()='My Account']")
public WebElement myaccount;

@FindBy(xpath="//*[text()='My Jobs']")
public WebElement myjobs;

@FindBy(xpath="//*[text()='Search']")
public WebElement searchdropdown;

@FindBy(xpath="(//*[text()='Jobs by Skills'])[1]")
public WebElement jobsbyskills;

@FindBy(xpath="(//*[text()='Jobs by Industry'])[1]")
public WebElement jobsbyindustry;

@FindBy(xpath="(//*[text()='Jobs by Function'])[1]")
public WebElement jobsbyfunction;

@FindBy(xpath="(//*[text()='Jobs by Designation'])[1]")
public WebElement designation;

@FindBy(xpath="(//*[text()='Jobs by Company'])[1]")
public WebElement company;

@FindBy(xpath="(//*[text()='Jobs by Country'])[1]")
public WebElement country;

@FindBy(xpath="(//*[text()='Jobs by Location'])[1]")
public WebElement location;

@FindBy(xpath="//*[text()='Profile Details']")
public WebElement profiledetails;

public Itecyhomepage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public void click_jobseeker_dropdown_link()
{
	jobseeker_dropdown_link.click();
}
public void click_employer_link()
{
	emp_link.click();
}

public void click_create_resume_option()
{
	create_resume_option.click();
}
public void fill_keyword(String x)
{
	keywordname.sendKeys(x);
}

public void click_select_state()
{
	selectstate.click();
	Select s=new Select(selectstate);
	s.selectByVisibleText("Alabama");
}
public void click_search_job()
{
	searchjob.click();
}
public void click_salary_dropdown()
{
	salary.click();
}

public void click_10000_checkbox()
{
	under10k.click();
}

public void click_morethan10_checkbox()
{
	morethan10k.click();
}

public void click_morethan30_checkbox()
{
	morethan30k.click();
}

public void click_morethan50_checkbox()
{
	morethan50k.click();
}

public void click_morethan1lac_checkbox()
{
	morethan1lac.click();
}

public void click_jobtype()
{
	jobtype.click();
}

public void click_fulltime_checkbox()
{
	fulltime.click();
}

public void click_contract_checkbox()
{
	contract.click();
}

public void click_apply_now()
{
	applynow.click();
}

public void click_myaccount()
{
	myaccount.click();
}

public void click_myjobs()
{
	myjobs.click();
}
public void click_search()
{
	searchdropdown.click();
}
public void click_skills()
{
	jobsbyskills.click();
}
public void click_industry()
{
	jobsbyindustry.click();
}
public void click_function()
{
	jobsbyfunction.click();
}
public void click_designation()
{
	designation.click();
}
public void click_company()
{
	company.click();
}
public void click_country()
{
	country.click();
}
public void click_location()
{
	location.click();
}
public void click_profile_details()
{
	profiledetails.click();
}

public void clickMessg()
{
	messg.click();
}

public void clickLogoff()
{
	logoff.click();
}

}
