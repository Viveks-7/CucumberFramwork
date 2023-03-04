package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class DashboardPage 
{
	@FindBy(linkText = "John Smith") WebElement username;
	@FindBy(xpath = "/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[1]/a/p") WebElement dashboard;
	@FindBy(xpath = "//img[@class=\"brand-image-xl logo-xl\"]") WebElement logo;

	public DashboardPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifyuser()
	{
		String expname = "John Smith";
		String name = username.getText();
		if(expname.equals(name))
		{
			Assert.assertTrue(true);
		}
		else
			Assert.assertTrue(false);
	}
	
	public void verifylogo()
	{
		boolean logodisp = logo.isDisplayed();
		if(logodisp==true)
		{
			System.out.println("Logo is displayed");
		}
		else 
			System.out.println("Logo not Displayed");
	}
}
