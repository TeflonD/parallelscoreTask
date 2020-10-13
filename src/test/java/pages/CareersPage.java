package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CareersPage {
	
	
	WebDriver driver;
	
	public CareersPage(WebDriver driver) 
	{
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(name="selected_category")
	@CacheLookup
	WebElement categoryDropDownField;
	
	@FindBy(name="selected_location")
	@CacheLookup
	WebElement locationDropDownField;
	
	@FindBy(xpath="//input[@type='submit']")
	@CacheLookup
	WebElement searchButton;;
	
	@FindBy(linkText="Careers")
	@CacheLookup
	WebElement careersLink;
	
	@FindBy(css="#PopupSignupForm_0 > div.mc-modal > div.mc-closeModal")
	@CacheLookup
	WebElement popUpSignUpForm;
	
	

	
	
	
	
	
	public void clickCareersLink() {
		careersLink.click();
	}
	

	public void selectCategoty(String category) {
		
		Select oselect = new Select(categoryDropDownField);
		categoryDropDownField.click();
		oselect.selectByValue(category);
	}
	
	
	public void selectLocation(String location) {
		
		Select loc = new Select(locationDropDownField);
		locationDropDownField.click();
		loc.selectByValue(location);
	}
	
	public void closePopUpBox( ) {
		
		popUpSignUpForm.click();
	}
	
	
	
	public void clickSearchButton() {
		
		searchButton.click();
	}

}
