package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.DashboardPage;
import PageObject.SearchCustomer;
import PageObject.addNewCustomer;
import PageObject.loginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class StepDefinition extends BaseClass
{
	public WebDriver driver;
	public loginPage lp;
	public addNewCustomer cst;
	public DashboardPage dsh;
	public SearchCustomer srch;

	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		lp = new loginPage(driver);
		cst = new addNewCustomer(driver);
		dsh = new DashboardPage(driver);
		srch = new SearchCustomer(driver);

	}

	@When("user opens URL {string}")
	public void user_opens_url(String url) 
	{	
		driver.get(url);
	}

	@When("user enters email {string} and password {string}")
	public void user_enters_email_and_password(String mail, String pwd) 
	{
		lp.enterEmail(mail);
		lp.enterPassword(pwd);
	}

	@When("user click on log in button")
	public void user_click_on_log_in_button() 
	{
		lp.clickLoginBtn();
	}

	@Then("user should navigate to dashboard")
	public void user_should_navigate_to_dashboard() 
	{
		String acttitle = driver.getTitle();
		String exptitle = "Dashboard / nopCommerce administration";
				if(acttitle.equals(exptitle))
				{
					Assert.assertTrue(true);
				}
				else
					Assert.assertTrue(false);
		
	}

	@When("user click on log out button")
	public void user_click_on_log_out_button() 
	{
		lp.clickLogoutBtn();
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String exptitle1) 
	{
		String acttitle1 = driver.getTitle();
		if(acttitle1.equals(exptitle1))
		{
			Assert.assertTrue(true);
		}
		else
			Assert.assertTrue(false);
	}

	@Then("close browser")
	public void close_browser() 
	{
		driver.close();
	}

	
	////////////////////////add new customer//////////////////////////////
	
	@Then("user can view dashboard")
	public void user_can_view_dashboard() 
	{
		driver.getTitle();
	}

	@When("user click on customer menu")
	public void user_click_on_customer_menu() 
	{
		cst.customermenu();
	}

	@When("click on customer menu item")
	public void click_on_customer_menu_item() 
	{
		cst.customerdrpmenu();
	}

	@When("click on add new button")
	public void click_on_add_new_button() 
	{
		cst.addnewcustomer();
	}

	@Then("user can view add new customer page")
	public void user_can_view_add_new_customer_page()
	{
		driver.getTitle();
	}

	@When("user enters customer info")
	public void user_enters_customer_info() 
	{
//		cst.email("vivekshinde1123@gmail.com");
		cst.email(GenerateEmail()+"@gmail.com");
		cst.fname("vivek");
		cst.lname("shinde");
		cst.pass("123456789");
		cst.dob("04/05/1995");
		cst.companyname("vSolutions");
		cst.vendormsg();
		
		
	}

	@When("click on save button")
	public void click_on_save_button() 
	{
		cst.save();
	}

	@Then("user can see confirmation message {string}")
	public void user_can_see_confirmation_message(String string) 
	{
		cst.successmsg();
	}
	
	
	//////////////////////// Dashboard Username and Logo Verify /////////////////////////////
	
	@Then("user can view logo")
	public void user_can_view_logo() 
	{
		dsh.verifylogo();
	}
	@Then("User can view username as {string}")
	public void user_can_view_username_as(String un) 
	{
		dsh.verifyuser();
	}
	
	
	///////////////// Search customer //////////////////////
	
	@When("uesr clicks on customer menu")
	public void uesr_clicks_on_customer_menu() 
	{
		cst.customermenu();
	}

	@When("user click on customers menu item")
	public void user_click_on_customers_menu_item() 
	{
		cst.customerdrpmenu();
	}

	@When("user enters Email {string}")
	public void user_enters_email(String mail) 
	{
		srch.enterEmail("james_pan@nopCommerce.com");
	}

	@When("click on search button")
	public void click_on_search_button() throws InterruptedException 
	{
		srch.searchclick();
	}

	@Then("user should found email in search table")
	public void user_should_found_email_in_search_table()
	{
//		String expemail = "james_pan@nopCommerce.com";
//		if(srch.searchcustomerbyemail(expemail) ==true)
//		{
//			Assert.assertTrue(true);
//			Log.info("Email address found in table");
//		}
//		else
//			Assert.assertTrue(false);
//			Log.info("Email address not found in table");
		
		String expectedEmail = "victoria_victoria@nopCommerce.com";

		if( srch.searchcustomerbyemail(expectedEmail) ==true)
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
	}
	
	
	
}
