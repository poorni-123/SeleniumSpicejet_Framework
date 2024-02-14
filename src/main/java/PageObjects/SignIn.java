package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn 
{
	
public WebDriver driver;


	public SignIn(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//Locating the elements
	
		//Country selection
		@FindBy(xpath="/html/body/div[2]/div/div/div/div[1]/div[2]/a[2]/img")
		WebElement country;
		
		//Dropdown selection
		@FindBy(id="account-menu-account-button")
		WebElement accountdropdown;
		
		//Signin button
		@FindBy(linkText="Sign In")
		WebElement signinbutton;
		
		//EmailAddress
		@FindBy(xpath="//input[@type=\"email\"]")
		WebElement EmailID;
		
		//Password
		@FindBy(xpath="//input[@type=\"password\"]")
		WebElement pwd;
		
		//Signin button click
		@FindBy(xpath="//button[@type=\"submit\"]")
		WebElement singinclk;
		
		//Methods
		public void countryselect() {
			country.click();
		}
		public void dropdown() {
			accountdropdown.click();
		}
		public void signin() {
			signinbutton.click();
		}
		public void emailaddress(String Emailadd) {
			EmailID.sendKeys(Emailadd);
		}
		public void password(String password) {
			pwd.sendKeys(password);
			
		}
		public void signinclick() {
			singinclk.click();
		}
		
		
}
