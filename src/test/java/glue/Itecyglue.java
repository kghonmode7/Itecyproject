package glue;


import java.io.FileInputStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Itecyaddcertificationpage;
import pages.Itecyaddeducationpage;
import pages.Itecyaddexperiencepage;
import pages.Itecyaddskillspage;
import pages.Itecyappliedjobpage;
import pages.Itecyapplyjobpage;
import pages.Itecybuyjobpostingpackage;
import pages.Itecycreatepage;
import pages.Itecyemploginpage;
import pages.Itecyemployerpage;
import pages.Itecyforgetpasswordpage;
import pages.Itecygeneralinformationpage;
import pages.Itecyhomepage;
import pages.Itecyjobapplicationspage;
import pages.Itecyjobdetailpage;
import pages.Itecyjobsbycompany;
import pages.Itecyjobsbycountry;
import pages.Itecyjobsbydesignation;
import pages.Itecyjobsbyfunction;
import pages.Itecyjobsbyindustry;
import pages.Itecyjobsbylocation;
import pages.Itecyjobsbyskillspage;
import pages.Itecyloginpage;
import pages.Itecymanagejobpage;
import pages.Itecypostjobpage;
import pages.Itecyproductdetailspage;
import pages.Itecyprofiledetailpage;
import pages.Itecyresumeuploadpage;
import pages.Itecysearchbycompany;
import pages.Itecysearchbycountry;
import pages.Itecysearchbydesignation;
import pages.Itecysearchbyfunction;
import pages.Itecysearchbyindustry;
import pages.Itecysearchbylocation;
import pages.Itecysearchbyskills;
import pages.Itecysocialprofilepage;

public class Itecyglue 
{
	public WebDriver driver;
	public WebDriverWait wait;
	public Itecyhomepage homepage;
	public Itecyloginpage loginpage;
	public Itecycreatepage createpage;
	public Itecygeneralinformationpage generalinformationpage;
	public Itecyaddeducationpage addeducationpage;
	public Itecyaddexperiencepage addexperiencepage;
	public Itecyaddcertificationpage addcertificationpage;
	public Itecyaddskillspage addskillspage;
	public Itecysocialprofilepage socialprofilepage;
	public Itecyresumeuploadpage resumeuploadpage;
	public Itecyemployerpage employerpage;
	public Itecypostjobpage postjobpage;
	public Itecyemploginpage emploginpage;
	public Itecyapplyjobpage applyjobpage;
	public Itecybuyjobpostingpackage buyjobpostingpackage;
	public Itecyproductdetailspage productdetailspage;
	public Itecymanagejobpage managejobpage;
	public Itecyappliedjobpage appliedjobpage;
	public Itecyjobdetailpage jobdetailpage;
	public Itecyjobsbycompany jobsbycompany;
	public Itecyjobsbyskillspage jobsbyskills;
	public Itecyjobsbyfunction jobsbyfunction;
	public Itecyjobsbydesignation jobsbydesignation;
	public Itecyjobsbyindustry jobsbyindustry;
	public Itecyjobsbycountry jobsbycountry;
	public Itecyjobsbylocation jobsbylocation;
	public Itecysearchbyindustry searchbyindustry;
	public Itecysearchbyfunction searchbyfunction;
	public Itecysearchbydesignation searchbydesignation;
	public Itecysearchbycompany searchbycompany;
	public Itecysearchbycountry searchbycountry;
	public Itecysearchbylocation searchbylocation;
	public Itecysearchbyskills searchbyskills;
	public Itecyforgetpasswordpage forgetpasswordpage;
	public Itecyprofiledetailpage profiledetailpage;
	public Itecyjobapplicationspage jobapplicationspage;
	public Scenario s;
	public Properties p;
	
	@Before
	public void method1(Scenario s)throws Exception
	{
		this.s=s;
		FileInputStream fi=new FileInputStream("E:\\CSTECH0786\\itecyproject\\src\\test\\resources\\repository\\file1.properties");
		p=new Properties();
		p.load(fi);
	}
	
	@Given("^launch site$")
	public void launch_site() throws Exception
	{
		System.setProperty("webdriver.chrome.driver",p.getProperty("cpath"));
		driver=new ChromeDriver();
		homepage=new Itecyhomepage(driver);
		loginpage=new Itecyloginpage(driver);
		createpage=new Itecycreatepage(driver);
		generalinformationpage=new Itecygeneralinformationpage(driver);
		addeducationpage=new Itecyaddeducationpage(driver);
		addexperiencepage=new Itecyaddexperiencepage(driver);
		addcertificationpage=new Itecyaddcertificationpage(driver);
		addskillspage=new Itecyaddskillspage(driver);
		socialprofilepage=new Itecysocialprofilepage(driver);
		resumeuploadpage=new Itecyresumeuploadpage(driver);
		employerpage=new Itecyemployerpage(driver);
		postjobpage=new Itecypostjobpage(driver);
		emploginpage=new Itecyemploginpage(driver);
		applyjobpage=new Itecyapplyjobpage(driver);
		buyjobpostingpackage=new Itecybuyjobpostingpackage(driver);
		productdetailspage=new Itecyproductdetailspage(driver);
		managejobpage=new Itecymanagejobpage(driver);
		appliedjobpage=new Itecyappliedjobpage(driver);
		jobdetailpage=new Itecyjobdetailpage(driver);
		jobsbyskills=new Itecyjobsbyskillspage(driver);
		jobsbyindustry=new Itecyjobsbyindustry(driver);
		jobsbyfunction=new Itecyjobsbyfunction(driver);
		jobsbydesignation=new Itecyjobsbydesignation(driver);
		jobsbycompany=new Itecyjobsbycompany(driver);
		jobsbycountry=new Itecyjobsbycountry(driver);
		jobsbylocation=new Itecyjobsbylocation(driver);
		searchbyskills=new Itecysearchbyskills(driver);
		searchbyindustry=new Itecysearchbyindustry(driver);
		searchbyfunction=new Itecysearchbyfunction(driver);
		searchbydesignation=new Itecysearchbydesignation(driver);
		searchbycompany=new Itecysearchbycompany(driver);
		searchbycountry=new Itecysearchbycountry(driver);
		searchbylocation=new Itecysearchbylocation(driver);
		forgetpasswordpage=new Itecyforgetpasswordpage(driver);
		profiledetailpage=new Itecyprofiledetailpage(driver);
		jobapplicationspage=new Itecyjobapplicationspage(driver);
		driver.get(p.getProperty("url"));
		wait=new WebDriverWait(driver,50);
		driver.manage().window().maximize();
	}
	
	@When("^click on signin link$")
	public void click_on_signin_link()
	{
		wait.until(ExpectedConditions.visibilityOf(loginpage.signin));
		loginpage.clickSignin();
	}
	
	@And("^fill username \"(.*)\"$")
	public void fill_username(String x)
	{
		wait.until(ExpectedConditions.visibilityOf(loginpage.uid));
		loginpage.fillUid(x);
	}
	
	@And("^fill password \"(.*)\"$")
	public void fill_password(String y)
	{
		wait.until(ExpectedConditions.visibilityOf(loginpage.pwd));
		loginpage.fillPwd(y);
	}
	
	@And("^click login button$")
	public void click_login_button()
	{
		wait.until(ExpectedConditions.visibilityOf(loginpage.login));
		loginpage.clickLogin();
	}
	
	@Then("^validate output for criteria \"(.*)\" for \"(.*)\" and \"(.*)\" for \"(.*)\"$")
	public void validate_output(String uc,String u,String pc,String p)throws Exception
	{
		Thread.sleep(5000);
	    try 
	    {
	    	if(uc.equals("valid") && pc.equals("valid") && homepage.messg.isDisplayed())
	    	{
	    		
	    		wait.until(ExpectedConditions.visibilityOf(homepage.messg));
	    		s.write("valid userid and password test passed");
	    		homepage.clickMessg();
	    		wait.until(ExpectedConditions.visibilityOf(homepage.logoff));
	    		homepage.clickLogoff();
	    		
	    	}
	    	else if(uc.equals("invalid") && pc.equals("invalid") && loginpage.alertmessg.isDisplayed())
	    	{
	    		s.write("invalid uid & pwd test passed");
	    	}
	    	else if(uc.equals("invalid") && pc.equals("valid") && loginpage.uidinvaliderrmessg.isDisplayed())
	    	{
	    		s.write("invalid uid test passed");
	    	}
	    	else if(uc.equals("valid") && pc.equals("invalid") && loginpage.pwdinvaliderrmessg.isDisplayed())
	    	{
	    		s.write("invalid uid test passed");
	    	}
	    	else
	    	{
	    		byte[] ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	    		s.embed(ss,"login test failed");
	    	}
	    }
	    catch(Exception ex)
	    {
	    	byte[] ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    		s.embed(ss,ex.getMessage());
    		
	    }
	
	}
	@And("^close site$")
	public void close_site()
	{
		driver.close();
	}
	
	@And("^click on jobseeker dropdown in login page$")
	public void click_on_jobseeker_dropdown()
	{
		wait.until(ExpectedConditions.visibilityOf(homepage.jobseeker_dropdown_link));
		homepage.click_jobseeker_dropdown_link();
	}
	
	@And("^click on create resume$")
	public void click_on_create_resume()
	{
		wait.until(ExpectedConditions.visibilityOf(homepage.create_resume_option));
		homepage.click_create_resume_option();
	}
	
	@And("^fill the fields in creation page$")
	public void fill_fields_in_creation_page(DataTable dt) throws Exception
	{
		//data-table

		List<Map<String,String>> data=dt.asMaps(String.class,String.class);
		wait.until(ExpectedConditions.visibilityOf(createpage.resume_title));
		 
		//fill fields
		String professional_title=data.get(0).get("professional_title");
		String about_notes=data.get(0).get("about_notes");
		
		createpage.fill_resume_title(professional_title);
		wait.until(ExpectedConditions.visibilityOf(createpage.industry_id));
		createpage.select_industry();
		wait.until(ExpectedConditions.visibilityOf(createpage.summary));
		createpage.fill_summary(about_notes);
	}
	
	@And("^click on next in creation page$")
	public void click_on_next_in_creation_page()
	{
		wait.until(ExpectedConditions.visibilityOf(createpage.cpnext_button));
		createpage.cpclick_next();
	}
	
	@And("^fill the fields in general information page$")
	public void fill_fields_in_general_information_page(DataTable dt) throws Exception
	{
		//data-table
		List<Map<String,String>> data=dt.asMaps(String.class,String.class);
		wait.until(ExpectedConditions.visibilityOf(generalinformationpage.gender));
		
		//fill fields
		String experience=data.get(0).get("Experience");
		
		generalinformationpage.select_gender();
		wait.until(ExpectedConditions.visibilityOf(generalinformationpage.marital_status));
		generalinformationpage.select_marital_status();
		wait.until(ExpectedConditions.visibilityOf(generalinformationpage.nationality));
		generalinformationpage.select_nationality();
		wait.until(ExpectedConditions.visibilityOf(generalinformationpage.country));
		generalinformationpage.select_country();
		wait.until(ExpectedConditions.visibilityOf(generalinformationpage.state));
		generalinformationpage.select_state();
		wait.until(ExpectedConditions.visibilityOf(generalinformationpage.city));
		generalinformationpage.select_city();
		wait.until(ExpectedConditions.visibilityOf(generalinformationpage.experience));
		generalinformationpage.fill_experience(experience);
		wait.until(ExpectedConditions.visibilityOf(generalinformationpage.experience_level));
		generalinformationpage.select_experience_level();
		wait.until(ExpectedConditions.visibilityOf(generalinformationpage.work_authorization));
		generalinformationpage.select_work_authorization();
		
	}
	
	@And("^click on next in general information page$")
	public void click_on_next_in_general_information_page()
	{
		wait.until(ExpectedConditions.visibilityOf(generalinformationpage.gfpnext_button));
		generalinformationpage.gfpclick_next();
	}
	
	@And("^click on Add education and fill fields$")
	public void fill_fields_in_add_education_page(DataTable dt) throws Exception
	{
		wait.until(ExpectedConditions.visibilityOf(addeducationpage.add_education));
		addeducationpage.aedpclick_add_education();
		//data-table
		List<Map<String,String>> data=dt.asMaps(String.class,String.class);
		wait.until(ExpectedConditions.visibilityOf(addeducationpage.select_degree));
		
		String passing_year=data.get(0).get("Passing_Year");
		String university_name=data.get(0).get("University_Name");
		
		addeducationpage.select_degree();
		wait.until(ExpectedConditions.visibilityOf(addeducationpage.select_specialization));
		addeducationpage.select_specialization();
		wait.until(ExpectedConditions.visibilityOf(addeducationpage.passing_year));
		addeducationpage.fill_passing_year(passing_year);
		wait.until(ExpectedConditions.visibilityOf(addeducationpage.university));
		addeducationpage.fill_university_name(university_name);
	}
	
	@And("^click on save changes button in add education page$")
	public void click_on_save_changes_button_in_add_education_page()
	{
		wait.until(ExpectedConditions.visibilityOf(addeducationpage.save_changes_button));
		addeducationpage.aedpclick_save_changes_button();
	}
	
	@And("^click on close button in add education page$")
	public void click_on_close_button_in_add_education_page()
	{
		wait.until(ExpectedConditions.visibilityOf(addeducationpage.close_button));
		addeducationpage.aedpclick_close_button();
	}
	
	@And("^click on next in add education page$")
	public void click_on_next_in_add_education_page()
	{
		wait.until(ExpectedConditions.visibilityOf(addeducationpage.aedpnext_button));
		addeducationpage.aedpclick_next();
	}
	
	@And("^click on Add experience and fill fields$")
	public void fill_fields_in_add_experience_page(DataTable dt) throws Exception
	{
		wait.until(ExpectedConditions.visibilityOf(addexperiencepage.add_experience_link));
		addexperiencepage.aexpclick_on_experience_link();
		//data-table
		List<Map<String,String>> data=dt.asMaps(String.class,String.class);
		wait.until(ExpectedConditions.visibilityOf(addexperiencepage.select_company));
		
		String monthly_salary=data.get(0).get("Monthly_Salary");
		
		addexperiencepage.select_company();
		wait.until(ExpectedConditions.visibilityOf(addexperiencepage.select_industry));
		addexperiencepage.select_industry();
		wait.until(ExpectedConditions.visibilityOf(addexperiencepage.select_functional_area));
		addexperiencepage.select_functional_area();
		wait.until(ExpectedConditions.visibilityOf(addexperiencepage.select_designation));
		addexperiencepage.select_designation();
		wait.until(ExpectedConditions.visibilityOf(addexperiencepage.monthly_salary));
		addexperiencepage.select_expected_salary();
		wait.until(ExpectedConditions.visibilityOf(addexperiencepage.checkbox));
		addexperiencepage.click_checkbox();
		wait.until(ExpectedConditions.visibilityOf(addexperiencepage.expected_salary));
		addexperiencepage.fill_monthly_salary(monthly_salary);
		wait.until(ExpectedConditions.visibilityOf(addexperiencepage.notice_period));
		addexperiencepage.select_notice_period();
		
	}
	
	@And("^click on save changes button in add experience page$")
	public void click_on_save_changes_button_in_add_experience_page()
	{
		wait.until(ExpectedConditions.visibilityOf(addexperiencepage.aexpsave_changes_button));
		addexperiencepage.aexpclick_save_changes();
	}
	
	@And("^click on close button in add experience page$")
	public void click_on_close_button_in_add_experience_page()
	{
		wait.until(ExpectedConditions.visibilityOf(addexperiencepage.aexpclose_button));
		addexperiencepage.aexpclick_close();
	}
	
	@And("^click on next in add experience page$")
	public void click_on_next_in_add_experience_page()
	{
		wait.until(ExpectedConditions.visibilityOf(addexperiencepage.aexpnext_button));
		addexperiencepage.aexpclick_next();
	}
	
	@And("^click on Add certification and fill fields$")
	public void fill_fields_in_add_certification_page(DataTable dt) throws Exception
	{
		wait.until(ExpectedConditions.visibilityOf(addcertificationpage.add_certification_link));
		addcertificationpage.aexpclick_add_certification_link();
		//data-table
		List<Map<String,String>> data=dt.asMaps(String.class,String.class);
		wait.until(ExpectedConditions.visibilityOf(addcertificationpage.certificate_name));
		
		String certification_name=data.get(0).get("Certification_name");
		String license_no=data.get(0).get("License_no");
		String institute_name=data.get(0).get("Institute_name");
		
		addcertificationpage.fill_certificate_name(certification_name);
		wait.until(ExpectedConditions.visibilityOf(addcertificationpage.license_no));
		addcertificationpage.fill_license_no(license_no);
		wait.until(ExpectedConditions.visibilityOf(addcertificationpage.institution_name));
		addcertificationpage.fill_institution_name(institute_name);
	}
	
	@And("^click on save changes button in add certification page$")
	public void click_on_save_changes_button_in_add_certification_page()
	{
		wait.until(ExpectedConditions.visibilityOf(addcertificationpage.acpsave_changes_button));
		addcertificationpage.acpclick_save_changes();
	}
	
	@And("^click on close button in add certification page$")
	public void click_on_close_button_in_add_certification_page()
	{
		wait.until(ExpectedConditions.visibilityOf(addcertificationpage.acpclose_button));
		addcertificationpage.acpclick_close();
	}
	
	@And("^click on next in add certification page$")
	public void click_on_next_in_add_certification_page()
	{
		wait.until(ExpectedConditions.visibilityOf(addcertificationpage.acpnext_button));
		addcertificationpage.acpclick_next();
	}
	
	@And("^click on add skills dropdown and select required skills$")
	public void select_required_skills_from_dropdown()
	{
		wait.until(ExpectedConditions.visibilityOf(addskillspage.add_skills_link));
		addskillspage.click_add_skills_link();
	}
	
	@And("^click on next in add skills page$")
	public void click_on_next_in_add_skills_page()
	{
		wait.until(ExpectedConditions.visibilityOf(addskillspage.aspnext_button));
		addskillspage.aspclick_next();
	}
	
	@And("^fill the fields of social profile$")
	public void fill_fields_in_social_profile_page(DataTable dt) throws Exception
	{
		wait.until(ExpectedConditions.visibilityOf(socialprofilepage.facebook));
		//data-table
		List<Map<String,String>> data=dt.asMaps(String.class,String.class);
		
		String facebook_link=data.get(0).get("Facebook_link");
		String twitter_link=data.get(0).get("Twitter_link");
		String linkdin_link=data.get(0).get("Linkdin_link");
		String g_link=data.get(0).get("G_link");
		String instagram_link=data.get(0).get("Instagram_link");
		String dribble_link=data.get(0).get("Dribble_link");
		
		socialprofilepage.fill_facebook(facebook_link);
		wait.until(ExpectedConditions.visibilityOf(socialprofilepage.twitter));
		socialprofilepage.fill_twitter(twitter_link);
		wait.until(ExpectedConditions.visibilityOf(socialprofilepage.linkdin));
		socialprofilepage.fill_linkdin(linkdin_link);
		wait.until(ExpectedConditions.visibilityOf(socialprofilepage.glink));
		socialprofilepage.fill_glink(g_link);
		wait.until(ExpectedConditions.visibilityOf(socialprofilepage.instagram));
		socialprofilepage.fill_instagram(instagram_link);
		wait.until(ExpectedConditions.visibilityOf(socialprofilepage.dribble));
		socialprofilepage.fill_dribble(dribble_link);
		
	}
	
	@And("^click on next in add social profile page$")
	public void click_on_next_in_add_social_profile_page()
	{
		wait.until(ExpectedConditions.visibilityOf(socialprofilepage.sppnext_button));
		socialprofilepage.sppclick_next();
	}
	
	@And("^upload resume$")
	public void upload_resume() throws Exception
	{
		wait.until(ExpectedConditions.visibilityOf(resumeuploadpage.upload_resume));
		resumeuploadpage.click_upload_resume();
	}
	
	@And("^click on download resume to download resume$")
	public void download_resume()
	{
		wait.until(ExpectedConditions.visibilityOf(resumeuploadpage.download_resume));
		resumeuploadpage.click_download_resume();
	}
	
	@And("^click on submit your details button to submitt$")
	public void click_on_submitt()
	{
		wait.until(ExpectedConditions.visibilityOf(resumeuploadpage.submitt));
		resumeuploadpage.click_submitt();
	}
	
	@And("^click on hi message to logout$")
	public void click_on_messg()
	{
		wait.until(ExpectedConditions.visibilityOf(resumeuploadpage.profile_link));
		resumeuploadpage.click_profile_link();
	}
	
	@And("^click on logoff$")
	public void click_on_logoff()
	{
		wait.until(ExpectedConditions.visibilityOf(resumeuploadpage.logoff));
		resumeuploadpage.click_logoff();
	}
	
	@When("^click on employer zone$")
	public void click_on_emp()
	{
		wait.until(ExpectedConditions.visibilityOf(employerpage.emp));
	    employerpage.click_employer();
	    ArrayList<String> a=new ArrayList<String>(driver.getWindowHandles());
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		driver.switchTo().window(a.get(1));
	}
	
	@And("^fill emp username \"(.*)\"$")
	public void fill_empusername(String x)
	{
		wait.until(ExpectedConditions.visibilityOf(emploginpage.username));
		emploginpage.fillempuid(x);
	}
	
	@And("^fill emp password \"(.*)\"$")
	public void fill_emppwd(String y)
	{
		wait.until(ExpectedConditions.visibilityOf(emploginpage.pwd));
		emploginpage.fillemppwd(y);
	}
	
	@And("^click on signin$")
	public void click_signin()
	{
		wait.until(ExpectedConditions.visibilityOf(emploginpage.submit));
		emploginpage.clicksubmit();
	}
	
	@And("^click on employer dropdown$")
	public void click_empdropdown()
	{
		wait.until(ExpectedConditions.visibilityOf(employerpage.emp));
		employerpage.click_employer();
	}
	
	@And("^click on post job$")
	public void click_postjob()
	{
		wait.until(ExpectedConditions.visibilityOf(employerpage.postjob));
		employerpage.click_post_job();
	}
	
	@And("^fill fields in post job page$")
	public void fill_fields_in_post_job_page(DataTable dt) throws Exception
	{
		wait.until(ExpectedConditions.visibilityOf(postjobpage.title));
		//data-table
		List<Map<String,String>> data=dt.asMaps(String.class,String.class);
				
		String Job_title=data.get(0).get("Job_title");
		String Person_name=data.get(0).get("Person_name");
	    String Contact_number=data.get(0).get("Contact_number");
	    String Mail_id=data.get(0).get("Mail_id");
		
	    postjobpage.fill_title(Job_title);
	    wait.until(ExpectedConditions.visibilityOf(postjobpage.type));
	    postjobpage.select_jobtype();
	    wait.until(ExpectedConditions.visibilityOf(postjobpage.personname));
	    postjobpage.fill_name(Person_name);
	    wait.until(ExpectedConditions.visibilityOf(postjobpage.number));
	    postjobpage.fill_mobile_number(Contact_number);
	    wait.until(ExpectedConditions.visibilityOf(postjobpage.mail));
	    postjobpage.fill_mailid(Mail_id);
	    wait.until(ExpectedConditions.visibilityOf(postjobpage.country));
	    postjobpage.select_countryid();
	    wait.until(ExpectedConditions.visibilityOf(postjobpage.state));
	    postjobpage.select_stateid();
	    wait.until(ExpectedConditions.visibilityOf(postjobpage.city));
	    postjobpage.select_cityid();
	    wait.until(ExpectedConditions.visibilityOf(postjobpage.startdate));
	    postjobpage.select_startdate();
	    wait.until(ExpectedConditions.visibilityOf(postjobpage.endingdate));
	    postjobpage.select_expirydate();
	    wait.until(ExpectedConditions.visibilityOf(postjobpage.industry));
	    postjobpage.select_industry();
	    wait.until(ExpectedConditions.visibilityOf(postjobpage.function));
	    postjobpage.select_function();
	    wait.until(ExpectedConditions.visibilityOf(postjobpage.exp));
	    postjobpage.select_exp();
	    wait.until(ExpectedConditions.visibilityOf(postjobpage.skills));
	    postjobpage.select_skills();
	}
	
	@And("^click on post job button$")
	public void click_jobpost()
	{
		wait.until(ExpectedConditions.visibilityOf(postjobpage.postjobbutton));
		postjobpage.click_postjob();
	}
	
	@Then("^observer the posted job details in manage job page$")
	public void validate_output() throws Exception
	{
		Thread.sleep(5000);
	    try 
	    {
	    	if(managejobpage.table.isDisplayed())
	    	{
	    		wait.until(ExpectedConditions.visibilityOf(managejobpage.table));
	    		s.write("successfully job posted msg is displayed");
	    	}
	    	else
	    	{
	    		byte[] ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		    	s.embed(ss,"test failed");
		    }
	    }
	    catch(Exception ex)
	    {
	    	byte[] ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	    	s.embed(ss,ex.getMessage());
	    }
	}
	
	@When("^enter the keyword name as \"(.*)\"$")
	public void fill_keyword(String x)
	{
		wait.until(ExpectedConditions.visibilityOf(homepage.keywordname));
		homepage.fill_keyword(x);
	}
	
	@And("^click on search job button$")
	public void click_search()
	{
		wait.until(ExpectedConditions.visibilityOf(homepage.searchjob));
		homepage.click_search_job();
	}
	
	@And("^click on apply now button$")
	public void click_apply_now()
	{
		wait.until(ExpectedConditions.visibilityOf(homepage.applynow));
		homepage.click_apply_now();
	}
	
	@And("^click on apply button$")
	public void click_apply()
	{
		wait.until(ExpectedConditions.visibilityOf(applyjobpage.apply));
		applyjobpage.click_apply();
	}
	
	@Then("^observe the job in applied job page$")
	public void validate_job_details() throws Exception
	{
		Thread.sleep(5000);
	    try 
	    {
	    	if(appliedjobpage.table7.isDisplayed())
	    	{
	    		wait.until(ExpectedConditions.visibilityOf(appliedjobpage.table7));
	    		s.write("successfully apllied job msg is displayed");
	    	}
	    	else
	    	{
	    		byte[] ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		    	s.embed(ss,"test failed");
		    }
	    }
	    catch(Exception ex)
	    {
	    	byte[] ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	    	s.embed(ss,ex.getMessage());
	    }
	}
	@And("^click on buy job posting package$")
	public void click_buy_job_posting_package()
	{
		wait.until(ExpectedConditions.visibilityOf(buyjobpostingpackage.buyjob));
		buyjobpostingpackage.click_buyjob();
	}
	
	@And("^click on free registration package$")
	public void click_free_registration()
	{
		wait.until(ExpectedConditions.visibilityOf(productdetailspage.registration));
		productdetailspage.click_free_registration();
	}
	
	@And("^scroll down and click on buy now button$")
	public void click_buynow()
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",productdetailspage.buynow);
		wait.until(ExpectedConditions.visibilityOf(productdetailspage.buynow));
		productdetailspage.click_buynow();
	}
	
	@And("^click on ok in alert message$")
	public void click_ok()
	{
		driver.switchTo().alert().accept();
	}
	
	@Then("^observe the package updated successfully$")
	public void validate_sucessfully_updated() throws Exception
	{
		Thread.sleep(5000);
	    try 
	    {
	    	if(productdetailspage.success.isDisplayed())
	    	{
	    		wait.until(ExpectedConditions.visibilityOf(productdetailspage.success));
	    		s.write("successfully updated msg is displayed");
	    	}
	    	else
	    	{
	    		byte[] ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		    	s.embed(ss,"test failed");
		    }
	    }
	    catch(Exception ex)
	    {
	    	byte[] ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	    	s.embed(ss,ex.getMessage());
	    }
	}
	
	@And("^click on select states dropdown and select required state$")
	public void select_state()
	{
		wait.until(ExpectedConditions.visibilityOf(homepage.selectstate));
		homepage.click_select_state();
	}
	
	@Then("^observe the job list displayed as per the serach criteria$")
	public void validate_list_displayed_successfully() throws Exception
	{
		Thread.sleep(5000);
	    try 
	    {
	    	if(homepage.list.isDisplayed())
	    	{
	    		wait.until(ExpectedConditions.visibilityOf(homepage.list));
	    		s.write("successfully job list is displayed");
	    	}
	    	else
	    	{
	    		byte[] ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		    	s.embed(ss,"test failed");
		    }
	    }
	    catch(Exception ex)
	    {
	    	byte[] ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	    	s.embed(ss,ex.getMessage());
	    }
	}
	
	@When("^click on salary dropdown$")
	public void click_salary_dropdown()
	{
		wait.until(ExpectedConditions.visibilityOf(homepage.salary));
		homepage.click_salary_dropdown();
	}
	
	@And("^click on \"(.*)\" checkbox$")
	public void click_under10_checkbox()
	{
		wait.until(ExpectedConditions.visibilityOf(homepage.under10k));
		homepage.click_10000_checkbox();
	}
	
	@And("^click on \"(.*)\" checkbox$")
	public void click_10k_checkbox()
	{
		wait.until(ExpectedConditions.visibilityOf(homepage.morethan10k));
		homepage.click_morethan10_checkbox();
	}
	
	@And("^click on \"(.*)\" checkbox$")
	public void click_30k_checkbox()
	{
		wait.until(ExpectedConditions.visibilityOf(homepage.morethan30k));
		homepage.click_morethan30_checkbox();
	}
	
	@And("^click on \"(.*)\" checkbox$")
	public void click_50k_checkbox()
	{
		wait.until(ExpectedConditions.visibilityOf(homepage.morethan50k));
		homepage.click_morethan50_checkbox();
	}
	
	@And("^click on more than \"(.*)\" checkbox$")
	public void click_morethan1lac_checkbox()
	{
		wait.until(ExpectedConditions.visibilityOf(homepage.morethan1lac));
		homepage.click_morethan1lac_checkbox();
	}
	
	@Then("^observe the job is displayed as per the salary range$")
	public void validate_pagelist_successfully() throws Exception
	{
		Thread.sleep(5000);
	    try 
	    {
	    	if(homepage.pagelist.isDisplayed())
	    	{
	    		wait.until(ExpectedConditions.visibilityOf(homepage.pagelist));
	    		s.write("successfully job list as per salary range is displayed");
	    	}
	    	else
	    	{
	    		byte[] ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		    	s.embed(ss,"test failed");
		    }
	    }
	    catch(Exception ex)
	    {
	    	byte[] ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	    	s.embed(ss,ex.getMessage());
	    }
	}
	
	@When("^clcik on job type dropdown$")
	public void click_jobtype()
	{
		wait.until(ExpectedConditions.visibilityOf(homepage.jobtype));
		homepage.click_jobtype();
	}
	
	@And("^click on full time checkbox$")
	public void click_fulltime_checkbox()
	{
		wait.until(ExpectedConditions.visibilityOf(homepage.fulltime));
		homepage.click_fulltime_checkbox();
	}
	
	@And("^click on contract checkbox$")
	public void click_contract_checkbox()
	{
		wait.until(ExpectedConditions.visibilityOf(homepage.contract));
		homepage.click_contract_checkbox();
	}
	
	@Then("^observe the job list displayed as per job type$")
	public void validate_fulltime_and_contract_joblist_successfully() throws Exception
	{
		Thread.sleep(5000);
	    try 
	    {
	    	if(homepage.fulltimejoblist.isDisplayed())
	    	{
	    		wait.until(ExpectedConditions.visibilityOf(homepage.fulltimejoblist));
	    		s.write("successfully fulltime job list is displayed");
	    	}
	    	else if(homepage.contractjoblist.isDisplayed())
	    	{
	    		wait.until(ExpectedConditions.visibilityOf(homepage.contractjoblist));
	    		s.write("successfully contract job list is displayed");
	    	}
	    	else
	    	{
	    		byte[] ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		    	s.embed(ss,"test failed");
		    }
	    }
	    catch(Exception ex)
	    {
	    	byte[] ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	    	s.embed(ss,ex.getMessage());
	    }
	}
	
	@And("^click on my account dropdown$")
	public void click_myaccount()
	{
		wait.until(ExpectedConditions.visibilityOf(homepage.myaccount));
		homepage.click_myaccount();
	}
	
	@And("^click on my jobs$")
	public void click_myjobs()
	{
		wait.until(ExpectedConditions.visibilityOf(homepage.myjobs));
		homepage.click_myjobs();
	}
	
	@And("^click on view details$")
	public void click_viewdetails()
	{
		wait.until(ExpectedConditions.visibilityOf(appliedjobpage.viewdetails));
		appliedjobpage.click_view_details();
	}
	
	@And("^click on apply$")
	public void click_applying()
	{
		wait.until(ExpectedConditions.visibilityOf(jobdetailpage.applyjob));
		jobdetailpage.click_apply();
	}
	
	@And("^click on apply button again$")
	public void click_apply_again()
	{
		wait.until(ExpectedConditions.visibilityOf(applyjobpage.apply));
		applyjobpage.click_apply();
	}
	
	@Then("^observe the position is already apply$")
	public void validate_already_apply() throws Exception
	{
		Thread.sleep(5000);
	    try 
	    {
	    	if(applyjobpage.positionapplied.isDisplayed())
	    	{
	    		wait.until(ExpectedConditions.visibilityOf(applyjobpage.positionapplied));
	    		s.write("already applied text is displayed");
	    	}
	    	else
	    	{
	    		byte[] ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		    	s.embed(ss,"test failed");
		    }
	    }
	    catch(Exception ex)
	    {
	    	byte[] ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	    	s.embed(ss,ex.getMessage());
	    }
	}
	
	@And("^click on search dropdown$")
	public void click_search_dropdown()
	{
		wait.until(ExpectedConditions.visibilityOf(homepage.searchdropdown));
		homepage.click_search();
	}
	
	@And("^click on jobs by skills$")
	public void click_jobs_skills()
	{
		wait.until(ExpectedConditions.visibilityOf(homepage.jobsbyskills));
		homepage.click_skills();
	}
	
	@And("^click on a to z options$")
	public void click_options()
	{
		wait.until(ExpectedConditions.visibilityOf(jobsbyskills.A));
		jobsbyskills.click_a();
		wait.until(ExpectedConditions.visibilityOf(jobsbyskills.B));
		jobsbyskills.click_b();
		wait.until(ExpectedConditions.visibilityOf(jobsbyskills.C));
		jobsbyskills.click_c();
		wait.until(ExpectedConditions.visibilityOf(jobsbyskills.D));
		jobsbyskills.click_d();
		wait.until(ExpectedConditions.visibilityOf(jobsbyskills.E));
		jobsbyskills.click_e();
	}
	
	@And("^clcik on any skills$")
	public void click_asp()
	{
		wait.until(ExpectedConditions.visibilityOf(jobsbyskills.aspnet));
		jobsbyskills.click_asp();
	}
	
	@Then("^observe the jobs are displayed according to skills$")
	public void validate_skills() throws Exception
	{
		Thread.sleep(5000);
	    try 
	    {
	    	if(searchbyskills.searchskills.isDisplayed())
	    	{
	    		wait.until(ExpectedConditions.visibilityOf(searchbyskills.searchskills));
	    		s.write("skills related jobs are displayed");
	    	}
	    	else
	    	{
	    		byte[] ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		    	s.embed(ss,"test failed");
		    }
	    }
	    catch(Exception ex)
	    {
	    	byte[] ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	    	s.embed(ss,ex.getMessage());
	    }
	}
	
	@When("^click on jobs by industry$")
	public void click_industry()
	{
		wait.until(ExpectedConditions.visibilityOf(homepage.jobsbyindustry));
		homepage.click_industry();
	}
	
	@And("^click on any industry$")
	public void click_acnt_finance()
	{
		wait.until(ExpectedConditions.visibilityOf(jobsbyindustry.acntfinc));
		jobsbyindustry.click_acnt();
	}
	
	@Then("^observe the jobs are displayed according to industry$")
	public void validate_industry() throws Exception
	{
		Thread.sleep(5000);
	    try 
	    {
	    	if(searchbyindustry.searchindustry.isDisplayed())
	    	{
	    		wait.until(ExpectedConditions.visibilityOf(searchbyindustry.searchindustry));
	    		s.write("industry related jobs are displayed");
	    	}
	    	else
	    	{
	    		byte[] ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		    	s.embed(ss,"test failed");
		    }
	    }
	    catch(Exception ex)
	    {
	    	byte[] ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	    	s.embed(ss,ex.getMessage());
	    }
	}
	
	@When("^click on jobs by function$")
	public void click_function()
	{
		wait.until(ExpectedConditions.visibilityOf(homepage.jobsbyfunction));
		homepage.click_function();
	}
	
	@And("^click on any function$")
	public void click_agent()
	{
		wait.until(ExpectedConditions.visibilityOf(jobsbyfunction.agent));
		jobsbyfunction.click_agent();
	}
	
	@Then("^observe the jobs are displayed according to function$")
	public void validate_function() throws Exception
	{
		Thread.sleep(5000);
	    try 
	    {
	    	if(searchbyfunction.searchfunction.isDisplayed())
	    	{
	    		wait.until(ExpectedConditions.visibilityOf(searchbyfunction.searchfunction));
	    		s.write("function related jobs are displayed");
	    	}
	    	else
	    	{
	    		byte[] ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		    	s.embed(ss,"test failed");
		    }
	    }
	    catch(Exception ex)
	    {
	    	byte[] ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	    	s.embed(ss,ex.getMessage());
	    }
	}
	
	@When("^click on jobs by designation$")
	public void click_designation()
	{
		wait.until(ExpectedConditions.visibilityOf(homepage.designation));
		homepage.click_designation();
	}
	
	@And("^click on any designation$")
	public void click_acntant()
	{
		wait.until(ExpectedConditions.visibilityOf(jobsbydesignation.accountant));
		jobsbydesignation.click_acountant();
	}
	
	@Then("^observe the jobs are displayed according to designation$")
	public void validate_designation() throws Exception
	{
		Thread.sleep(5000);
	    try 
	    {
	    	if(searchbydesignation.searchdesignation.isDisplayed())
	    	{
	    		wait.until(ExpectedConditions.visibilityOf(searchbydesignation.searchdesignation));
	    		s.write("designation related jobs are displayed");
	    	}
	    	else
	    	{
	    		byte[] ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		    	s.embed(ss,"test failed");
		    }
	    }
	    catch(Exception ex)
	    {
	    	byte[] ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	    	s.embed(ss,ex.getMessage());
	    }
	}
	
	@When("^click on jobs by company$")
	public void click_company()
	{
		wait.until(ExpectedConditions.visibilityOf(homepage.company));
		homepage.click_company();
	}
	
	@And("^click on any company$")
	public void click_abhi()
	{
		wait.until(ExpectedConditions.visibilityOf(jobsbycompany.abhi));
		jobsbycompany.click_technosoft();
	}
	
	@Then("^observe the jobs are displayed according to company$")
	public void validate_company() throws Exception
	{
		Thread.sleep(5000);
	    try 
	    {
	    	if(searchbycompany.searchcompany.isDisplayed())
	    	{
	    		wait.until(ExpectedConditions.visibilityOf(searchbycompany.searchcompany));
	    		s.write("company related jobs are displayed");
	    	}
	    	else
	    	{
	    		byte[] ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		    	s.embed(ss,"test failed");
		    }
	    }
	    catch(Exception ex)
	    {
	    	byte[] ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	    	s.embed(ss,ex.getMessage());
	    }
	}
	
	@When("^click on jobs by country$")
	public void click_country()
	{
		wait.until(ExpectedConditions.visibilityOf(homepage.country));
		homepage.click_country();
	}
	
	@And("^click on any country$")
	public void click_india()
	{
		wait.until(ExpectedConditions.visibilityOf(jobsbycountry.ind));
		jobsbycountry.click_india();
	}
	
	@Then("^observe the jobs are displayed according to country$")
	public void validate_country() throws Exception
	{
		Thread.sleep(5000);
	    try 
	    {
	    	if(searchbycountry.searchcountry.isDisplayed())
	    	{
	    		wait.until(ExpectedConditions.visibilityOf(searchbycountry.searchcountry));
	    		s.write("country related jobs are displayed");
	    	}
	    	else
	    	{
	    		byte[] ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		    	s.embed(ss,"test failed");
		    }
	    }
	    catch(Exception ex)
	    {
	    	byte[] ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	    	s.embed(ss,ex.getMessage());
	    }
	}
	
	@When("^click on jobs by location$")
	public void click_location()
	{
		wait.until(ExpectedConditions.visibilityOf(homepage.location));
		homepage.click_location();
	}
	
	@And("^click on any location$")
	public void click_mumbai()
	{
		wait.until(ExpectedConditions.visibilityOf(jobsbylocation.mum));
		jobsbylocation.click_mumbai();
	}
	
	@Then("^observe the jobs are displayed according to location$")
	public void validate_location() throws Exception
	{
		Thread.sleep(5000);
	    try 
	    {
	    	if(searchbylocation.searchlocation.isDisplayed())
	    	{
	    		wait.until(ExpectedConditions.visibilityOf(searchbylocation.searchlocation));
	    		s.write("location related jobs are displayed");
	    	}
	    	else
	    	{
	    		byte[] ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		    	s.embed(ss,"test failed");
		    }
	    }
	    catch(Exception ex)
	    {
	    	byte[] ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	    	s.embed(ss,ex.getMessage());
	    }
	}
	
	@Then("^validate employer output for criteria \"(.*)\" for \"(.*)\" and \"(.*)\" for \"(.*)\"$")
	public void validate_employer_output(String uc,String u,String pc,String p)throws Exception
	{
		Thread.sleep(5000);
	    try 
	    {
	    	if(uc.equals("valid") && pc.equals("valid") && homepage.messg.isDisplayed())
	    	{
	    		
	    		wait.until(ExpectedConditions.visibilityOf(homepage.messg));
	    		s.write("valid userid and password test passed");
	    		homepage.clickMessg();
	    		wait.until(ExpectedConditions.visibilityOf(homepage.logoff));
	    		homepage.clickLogoff();
	    		
	    	}
	    	else if(uc.equals("invalid") && pc.equals("valid") && emploginpage.invalidacnt.isDisplayed())
	    	{
	    		s.write("invalid userid test passed");
	    	}
	    	else if(uc.equals("valid") && pc.equals("invalid") && emploginpage.invalaidpwd.isDisplayed())
	    	{
	    		s.write("invalid pwd test passed");
	    	}
	    	else if(uc.equals("invalid") && pc.equals("invalid") && emploginpage.invalaidpwd.isDisplayed())
	    	{
	    		s.write("invalid uid and pwd test passed");
	    	}
	    	else
	    	{
	    		byte[] ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	    		s.embed(ss,"login test failed");
	    	}
	    }
	    catch(Exception ex)
	    {
	    	byte[] ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    		s.embed(ss,ex.getMessage());
    		
	    }
   }
	
	@And("^click on forget password button$")
	public void click_forget_pwd()
	{
		wait.until(ExpectedConditions.visibilityOf(emploginpage.forgetpwd));
		emploginpage.clickforgetpwd();
	}
	
	@And("^fill email id as \"(.*)\"$")
	public void fill_mailid(String x)
	{
		wait.until(ExpectedConditions.visibilityOf(forgetpasswordpage.mailid));
		forgetpasswordpage.fillmailid(x);
	}
	
	@And("^click on submit button$")
	public void click_submit_button()
	{
		wait.until(ExpectedConditions.visibilityOf(forgetpasswordpage.submitbutton));
		forgetpasswordpage.click_submit_button();
	}
	
	@Then("^observe the msg is displayed that Please Check Your Email To Reset Your Password$")
	public void validate_reset_password_msg() throws Exception
	{
		Thread.sleep(5000);
	    try 
	    {
	    	if(forgetpasswordpage.resetlinkmsg.isDisplayed())
	    	{
	    		wait.until(ExpectedConditions.visibilityOf(forgetpasswordpage.resetlinkmsg));
	    		s.write("Reset your password msg is displayed");
	    	}
	    	else
	    	{
	    		byte[] ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		    	s.embed(ss,"test failed");
		    }
	    }
	    catch(Exception ex)
	    {
	    	byte[] ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	    	s.embed(ss,ex.getMessage());
	    }
	}
	
	@And("^click on profile details on jobseeker dropdown$")
	public void click_profile_details()
	{
		wait.until(ExpectedConditions.visibilityOf(homepage.profiledetails));
		homepage.click_profile_details();	
	}
	
	@Then("^observe application should displayed the profile details$")
	public void validate_profile_details() throws Exception
	{
		Thread.sleep(5000);
	    try 
	    {
	    	if(profiledetailpage.details.isDisplayed())
	    	{
	    		wait.until(ExpectedConditions.visibilityOf(profiledetailpage.details));
	    		s.write("profile details is displayed");
	    	}
	    	else
	    	{
	    		byte[] ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		    	s.embed(ss,"test failed");
		    }
	    }
	    catch(Exception ex)
	    {
	    	byte[] ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	    	s.embed(ss,ex.getMessage());
	    }
	}
	
	@And("^click on click here link$")
	public void click_download_resume()
	{
		wait.until(ExpectedConditions.visibilityOf(profiledetailpage.downloadresume));
		profiledetailpage.click_download();
	}

	@And("^click on job application$")
	public void clcik_job_application()
	{
		wait.until(ExpectedConditions.visibilityOf(employerpage.applications));
		employerpage.click_job_application();
	}
	
	@Then("^observe the application is displayed applied jobseeker resume in the list$")
	public void validate_job_application() throws Exception
	{
		Thread.sleep(5000);
	    try 
	    {
	    	if(jobapplicationspage.resume.isDisplayed())
	    	{
	    		wait.until(ExpectedConditions.visibilityOf(jobapplicationspage.resume));
	    		s.write("Resume is displayed in the list");
	    	}
	    	else
	    	{
	    		byte[] ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		    	s.embed(ss,"test failed");
		    }
	    }
	    catch(Exception ex)
	    {
	    	byte[] ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	    	s.embed(ss,ex.getMessage());
	    }
	}
}
