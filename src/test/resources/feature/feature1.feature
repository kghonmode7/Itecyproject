Feature: Itecy site testing 
Scenario Outline: Itecy Login testing as a jobseeker
Given launch site
When click on signin link
And fill username "<uid>"
And fill password "<pwd>"
And click login button
Then validate output for criteria "<uid criteria>" for "<uid>" and "<pwd criteria>" for "<pwd>"
And close site
Examples:
|         uid                |uid criteria|  pwd      |pwd criteria|
|    testcstech108@gmail.com | valid      |Client@2019|valid       |
|    kghonmode8@gmail.com    | invalid    |Client@2019|valid       |
|    testcstech108@gmail.com | valid      |Kunal@0123 |invalid     |
|    kghonmode8@gmail.com    | invalid    |Kunal@0123 |invalid     |


Scenario: Creating Resume
Given launch site
When click on signin link
And fill username "<testcstech108@gmail.com>"
And fill password "<Client@2019>"
And click login button
And click on jobseeker dropdown in login page
And click on create resume
And fill the fields in creation page
|professional_title|select_industry|                  about_notes                     |
| manual testing   |      IT       |    having 3 years of exp in manual testing       |
And click on next in creation page
And fill the fields in general information page
|Select_Gender|Select_Martial_Status|Select_Nationality|Select_Country|Select_State|Select_City|Select_some_languages|Select_some_cities|Experience|Select_Experience_level|Select_Work_Authorization|
|    Male     |      Single         |     INdian       |    India     |  TELANGANA | Hyderabad |     English         |  Hyderabad       |   3.00   |     3-5 Years         |    Citizen              |
And click on next in general information page
And click on Add education and fill fields
|Select_Degree|Select_Specialization|Passing_Year|University_Name|
| B.E / B.Tech|    Computers        | 2012       |  RTMNU        |
And click on save changes button in add education page
And click on close button in add education page 
And click on next in add education page
And click on Add experience and fill fields
|             Select_Company              |Select_Industry|Select_Functional_Area|      Select_Designation   |Monthly_Salary|
|  ClientServer Technology Solutions LLC  |     IT        |        IT            |    Software Test Engineer |   30000      |      
And click on save changes button in add experience page
And click on close button in add experience page
And click on next in add experience page
And click on Add certification and fill fields
|Certification_name|License_no|Institute_name|
|      Java        |12345     | mindq        |
And click on save changes button in add certification page
And click on close button in add certification page
And click on next in add certification page
And click on add skills dropdown and select required skills
And click on next in add skills page
And fill the fields of social profile
|Facebook_link    |Twitter_link      |Linkdin_link    |G_link         |Instagram_link    |Dribble_link    |
|www.facebook.com | www.twitter.com  |www.linkdin.com |www.google.com |www.instagram.com |www.dribble.com |
And click on next in add social profile page
And upload resume 
And click on download resume to download resume
And click on submit your details button to submitt
And click on hi message to logout
And click on logoff
And close site


Scenario: post a job regression testing
Given launch site
When click on employer zone
And fill emp username "<nagajyothi.moka@clientservertech.com>"
And fill emp password "<Client@2019>"
And click on signin
And click on employer dropdown
And click on post job
And fill fields in post job page
|      Job_title    | Job_type|   Person_name     |Contact_number|      Mail_id       |Select_country|Select_state|Select_city|Job post_date|Job expiry_date|Slect_industry|Select_function|Select_experience|Select_skills|
|Automation engineer|Full Time|Komalkumar Ghonmode|  7757016176  |kghonmode7@gmail.com|     India    |TELANGANA   |Hyderabad  |04/16/2016   |02/28/2019     |      IT      |       IT      |2 to 5 Years     |    Java     |
And click on post job button
Then observer the posted job details in manage job page



Scenario: apply to a job regression testing
Given launch site
When click on signin link
And fill username "<testcstech108@gmail.com>"
And fill password "<Client@2019>"
And click login button
When enter the keyword name as "<Automation engg>"
And click on search job button
And click on apply now button
And click on apply button
Then observe the job in applied job page


Scenario: buying a resume purchase package regression testing
Given launch site
When click on employer zone
And fill username "<komalkumar.ghonmode@clientservertech.com>"
And fill password "<Kunal@0786>"
And click on signin
And click on employer dropdown
And click on post job
And click on buy job posting package
And click on free registration package
And scroll down and click on buy now button
And click on ok in alert message
Then observe the package updated successfully


Scenario: test job search and jobs by compensation and job type functionality
Given launch site
When click on signin link
And fill username "<testcstech108@gmail.com>"
And fill password "<Client@2019>"
And click login button
When enter the keyword name as "<IT>" 
And click on select states dropdown and select required state
And click on search job button
Then observe the job list displayed as per the serach criteria
When click on salary dropdown
And click on "<10000>" checkbox
And click on "<10000-30000>" checkbox
And click on "<30000-50000>" checkbox
And click on "<50000-100000>" checkbox
And click on more than "<100000>" checkbox
Then observe the job is displayed as per the salary range
When clcik on job type dropdown
And click on full time checkbox
And click on contract checkbox
Then observe the job list displayed as per job type


Scenario: test my account and my jobs functionality
Given launch site
When click on signin link
And fill username "<testcstech108@gmail.com>"
And fill password "<Client@2019>"
And click login button
And click on my account dropdown
And click on my jobs
And click on view details
And click on apply
And click on apply button again
Then observe the position is already apply


Scenario: test to search job by various options
Given launch site
When click on signin link
And fill username "<testcstech108@gmail.com>"
And fill password "<Client@2019>"
And click login button
And click on search dropdown
And click on jobs by skills
And click on a to z options
And clcik on any skills
Then observe the jobs are displayed according to skills
When click on jobs by industry
And click on any industry
Then observe the jobs are displayed according to industry
When click on jobs by function
And click on any function
Then observe the jobs are displayed according to function
When click on jobs by designation
And click on any designation
Then observe the jobs are displayed according to designation
When click on jobs by company
And click on any company
Then observe the jobs are displayed according to company
When click on jobs by country
And click on any country
Then observe the jobs are displayed according to country
When click on jobs by location
And click on any location
Then observe the jobs are displayed according to location


Scenario Outline: Itecy login testing as an employee
Given launch site
When click on employer zone 
And fill emp username "<uid>"
And fill emp password "<pwd>"
And click on signin
Then validate employer output for criteria "<uid criteria>" for "<uid>" and "<pwd criteria>" for "<pwd>"
And close site
Examples:
|                 uid                  |uid criteria|  pwd      |pwd criteria|
| nagajyothi.moka@clientservertech.com | valid      |Client@2019|valid       |
|        kghonmode8@gmail.com          | invalid    |Client@2019|valid       |
| nagajyothi.moka@clientservertech.com | valid      |Kunal@0123 |invalid     |
|        kghonmode8@gmail.com          | invalid    |Kunal@0123 |invalid     |


Scenario: test forget password functionality as an employee
Given launch site
When click on employer zone 
And fill username "<nagajyothi.moka@clientservertech.com>"
And fill password "<kunal@0786>"
And click on signin
And click on forget password button
And fill email id as "<nagajyothi.moka@clientservertech.com>"
And click on submit button
Then observe the msg is displayed that Please Check Your Email To Reset Your Password


Scenario: view reasume details and download resume functionality regression testing
Given launch site
When click on signin link
And fill username "<testcstech108@gmail.com>"
And fill password "<Client@2019>"
And click login button
And click on profile details on jobseeker dropdown
Then observe application should displayed the profile details
And click on click here link


Scenario: test job apllication functionality regression testing
Given launch site
When click on employer zone
And fill username "<nagajyothi.moka@clientservertech.com>"
And fill password "<Client@2019>"
And click on signin
And click on my account dropdown
And click on job application
Then observe the application is displayed applied jobseeker resume in the list
