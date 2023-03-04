package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage 
{
	@FindBy(id = "Email") WebElement email;
	@FindBy(id = "Password") WebElement password;
	@FindBy(xpath = "//button[@type='submit']") WebElement loginBtn;
	@FindBy(linkText = "Logout") WebElement logoutBtn;
	
	public loginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterEmail(String emailAdd)
	{
		email.clear();
		email.sendKeys(emailAdd);		
	}
	
	public void enterPassword(String pwd)
	{
		password.clear();
		password.sendKeys(pwd);
	}
	
	public void clickLoginBtn()
	{
		loginBtn.click();
	}
	
	public void clickLogoutBtn()
	{
		logoutBtn.click();
	}
	

	

}
