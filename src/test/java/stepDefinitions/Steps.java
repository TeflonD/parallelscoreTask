package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CareersPage;


public class Steps {
	
	WebDriver driver;
	public CareersPage page;
	
	
	
	
	
	@Given("^user launches chrome browser$")
	public void user_launches_chrome_browser() throws Throwable {
		
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		page = new CareersPage(driver);
	   
	}

	@When("^user navigates to the URL \"([^\"]*)\"$")
	public void user_navigates_to_the_URL(String url) throws Throwable {
		
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().deleteAllCookies();
		page.closePopUpBox();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	   
	}

	@And("^the user selects Full time from the catory drop-down field$")
	public void the_user_selects_Full_time_from_the_catory_drop_down_field() throws Throwable {
		
		page.clickCareersLink();
		//Thread.sleep(2000);
		page.selectCategoty("full-time");
	    
	}

	@And("^the user selects Lagos from the Location drop-down field$")
	public void the_user_selects_Lagos_from_the_Location_drop_down_field() throws Throwable {
		
		//Thread.sleep(2000);
		page.selectLocation("lagos");
	   
	}

	@And("^the user clicks on the search button$")
	public void the_user_clicks_on_the_search_button() throws Throwable {
		
		//Thread.sleep(2000);
		page.clickSearchButton();
	   
	}

	@Then("^the Careers – ParallelScore page should be displayed to the user$")
	public void the_Careers_ParallelScore_page_should_be_displayed_to_the_user() throws Throwable {
		
		String expectedTitle = "Careers – ParallelScore";
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(expectedTitle, actualTitle);
		
		Assert.assertTrue(driver.getPageSource().contains("Parallelscore is looking for a talented QA Automation Engineer to join our Quality Assurance team...."));
		Assert.assertTrue(driver.getPageSource().contains("We are looking for a Senior Software/DevOps Engineer that will develop information systems by studying..."));
		Assert.assertTrue(driver.getPageSource().contains("We are looking for a Java Software Engineer to manage the software development life cycle,..."));
		Assert.assertTrue(driver.getPageSource().contains("JAVA SOFTWARE ENGINEER"));
		Assert.assertTrue(driver.getPageSource().contains("Technical Manager"));
		Assert.assertTrue(driver.getPageSource().contains("TALENT POOL"));
		Assert.assertTrue(driver.getPageSource().contains("Security Engineer"));
		Thread.sleep(3000);
		
		
		
		            
		
	}

	@Then("^the user closes the browser$")
	public void the_user_closes_the_browser() throws Throwable {
	    
		driver.quit();
	}

}
