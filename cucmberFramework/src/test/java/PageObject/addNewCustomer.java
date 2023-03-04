package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class addNewCustomer 
{
	@FindBy(linkText = "John Smith") WebElement username;
	@FindBy(xpath = "/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[1]/a/p") WebElement dashboard;
	@FindBy(xpath = "/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/a") WebElement customers;
	@FindBy(xpath = "/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/ul/li[1]/a") WebElement drp_customers;
	@FindBy(xpath = "/html/body/div[3]/div[1]/form[1]/div/div/a") WebElement addnew;
	@FindBy(xpath = "//input[@id='Email']") WebElement txtemail;
	@FindBy(xpath = "//input[@id='Password']") WebElement txtpwd;
	@FindBy(xpath = "//*[@id=\"FirstName\"]") WebElement firstname;
	@FindBy(xpath = "//*[@id=\"LastName\"]") WebElement lastname;
	@FindBy(xpath = "//*[@id=\"Gender_Male\"]") WebElement male;
	@FindBy(xpath = "//*[@id=\"Gender_Female\"]") WebElement female;
	@FindBy(xpath = "//*[@id=\"DateOfBirth\"]") WebElement DOB;
	@FindBy(xpath = "//*[@id=\"Company\"]") WebElement companyname;
	@FindBy(xpath = "//*[@id=\"IsTaxExempt\"]") WebElement tax;
	@FindBy(xpath = "//*[@id=\"customer-info\"]/div[2]/div[9]/div[2]/div/div[1]/div/div/input") WebElement newslwtter;
	@FindBy(xpath = "//*[@id=\"customer-info\"]/div[2]/div[10]/div[2]/div/div[1]/div/div") WebElement customerrole;
	@FindBy(xpath = "//*[@id=\"VendorId\"]") WebElement vendormsg;
	@FindBy(xpath = "//*[@id=\"Active\"]") WebElement activecheck;
	@FindBy(xpath = "//*[@id=\"AdminComment\"]") WebElement admincomment;
	@FindBy(xpath = "/html/body/div[3]/div[1]/form/div[1]/div/button[1]") WebElement savebtn;
	@FindBy(xpath = "/html/body/div[3]/div[1]/div[1]") WebElement newcutmoraddedsuccess;
		
	
	
	public addNewCustomer(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void customermenu()
	{
		customers.click();		
		
	}
	
	public void customerdrpmenu()
	{	
		drp_customers.click();
	}
	
	public void addnewcustomer()
	{
		addnew.click();
	}
	
	public void email(String email)
	{
		txtemail.sendKeys(email);
	}
	
	public void pass(String pwd)
	{
		txtpwd.sendKeys(pwd);
	}
	
	public void fname(String name)
	{
		firstname.sendKeys(name);
	}
	
	public void lname(String lname)
	{
		lastname.sendKeys(lname);
	}
	
//	public void gender(String gender)
//	{
//		txtpwd.sendKeys();
//	}
	
	public void dob(String dob)
	{
		DOB.sendKeys(dob);
	}
	
	public void companyname(String cname)
	{
		companyname.sendKeys(cname);
	}
	
	public void vendormsg()
	{
		Select drp = new Select(vendormsg);
		drp.selectByVisibleText("Vendor 1");
	}
	
	public void admincomnt(String comment)
	{
		admincomment.sendKeys(comment);
	}
	
	public void save()
	{
		savebtn.click();
	}
	
	public void successmsg()
	{
		newcutmoraddedsuccess.getText();
	}

}
