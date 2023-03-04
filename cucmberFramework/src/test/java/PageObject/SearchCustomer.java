package PageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchCustomer 
{
	@FindBy(id = "SearchEmail") WebElement emailenter;
	@FindBy(id = "search-customers") WebElement searchbtn;		
	@FindBy(xpath = "//*[@id=\"customers-grid\"]/tbody/tr/td[2]") WebElement tablemail;
	@FindBy(xpath="//table[@id='customers-grid']//tbody/tr") List<WebElement> tablerows;
	@FindBy(xpath = "//*[@id=\"customers-grid\"]/tbody/tr/td[2]") WebElement smail;
	
//	WebDriver ldriver;	
	WebDriver driver;
	
	public SearchCustomer(WebDriver rdriver)
	{

		driver=rdriver;

		PageFactory.initElements(rdriver, this);
//		PageFactory.initElements(driver, this);
	}
	
	public void enterEmail(String mail)
	{
		emailenter.sendKeys(mail);
	}
	
	public void searchclick() throws InterruptedException
	{
		searchbtn.click();
		Thread.sleep(4000);
	}
	
	public boolean searchcustomerbyemail(String mail)
	{
		boolean found = false;
		if(smail.equals(mail));
		{
			found = true;
		}
	
		return found;
	}
	
	
	
	
	
}
