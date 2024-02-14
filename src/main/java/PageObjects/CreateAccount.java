package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccount 
{
	public WebDriver driver;
	
	public CreateAccount(WebDriver driver) 
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
	
	//CreateAccount selectiion
	@FindBy(linkText="Create Account")
	WebElement optioncreateaccount;
	
	//FirstName selection
	@FindBy(id="firstName")
	WebElement firstname;
	
	//LastName selection
	@FindBy(id="lastName")
	WebElement Lastname;
	
	//EmailID 
	@FindBy(id="email")
	WebElement emailid;
	
	//Password
	@FindBy(xpath="//input[@type=\"password\"]")
	WebElement password;
	
	//Confirmpassword
	@FindBy(id="reenterPassword")
	WebElement confirmpassword;
	
	//Mobilenumber
	@FindBy(id="phone")
	WebElement phone;
	
	//Button selection
	@FindBy(xpath="//button[@type=\"submit\"]")
	WebElement accountbtnclick;
	
	//Method Creation
	
	public void countryselect() {
		country.click();
	}
	public void dropdown() {
		accountdropdown.click();
	}
	public void optnselection() {
		optioncreateaccount.click();		
	}
	
	public void getuserfirstname(String username) {
		firstname.sendKeys(username);		
	}
	public void getuserlastname(String lastname) {
		Lastname.sendKeys(lastname);		
	}
	public void password(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void get_email(String emailId) {
		emailid.sendKeys(emailId);
	}
	public void reenterpassword(String repwd) {
		confirmpassword.sendKeys(repwd);
	}
	public void mobilenumber(String number)
	{
		phone.sendKeys(number);
	}
	public void btnclick() {
		accountbtnclick.click();
	}
	
	
	
	
}

