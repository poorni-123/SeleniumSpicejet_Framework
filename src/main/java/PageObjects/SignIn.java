package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignIn 
{
	
public WebDriver driver;


	public SignIn(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//Locating the elements
		
		//Signup button
		@FindBy(xpath="//div[@class=\"css-1dbjc4n r-1awozwy r-1eqmklk r-dwliz8 r-1phboty r-18u37iz r-1n0xq6e\"]/div/a")
		WebElement signupbutton;
	
		
		//firstname
		@FindBy(id="first_name")
		WebElement firstname;
	    //Lastname
		@FindBy(id="last_name")
		WebElement lastname;
		//Country
		@FindBy(xpath="(//div/select)[2]")
		WebElement country;
		//DOB
		@FindBy(id="dobDate")
		WebElement DOB;
	//mobile
		@FindBy(xpath="//input[@type=\"tel\"]")
		WebElement mobilenumber;
		
		//EmailID
		@FindBy(xpath="//input[@id=\"email_id\"]")
		WebElement EmailID;
		
		
		//Password
		@FindBy(xpath="//input[@type=\"password\"]")
		WebElement pwd;
		
		//confirm passsword
		@FindBy(xpath="//input[@id=\"c-password\"]")
		WebElement cpwd;
		
		//agree
		@FindBy(xpath="//input[@type=\"checkbox\"]")
		WebElement agree;
		
		//Signin button click
		@FindBy(xpath="//button[@type=\"button\"]")
		WebElement singinclk;
		
		public void signup() throws InterruptedException {
			signupbutton.click();
			for(String windowhandle:driver.getWindowHandles()) {
				driver.switchTo().window(windowhandle);
			}
			
			
		}
		
		
		    
		public void title(String titlevalue) throws InterruptedException {
			
			WebElement title=driver.findElement(By.xpath("(//div/select)[1]"));
			Select titlename=new Select(title);
			titlename.selectByVisibleText(titlevalue);
			Thread.sleep(1000);
		}
		
		public void firstname(String first) throws InterruptedException {
			firstname.sendKeys(first);
			Thread.sleep(1000);
		}
		public void Lastname(String last) throws InterruptedException {
			lastname.sendKeys(last);
			Thread.sleep(1000);
		}
		public void country(String countryvalue) throws InterruptedException {
			Select cval = new Select(country);
			cval.selectByVisibleText(countryvalue);
			Thread.sleep(1000);
		}
		
		public void calendar(String date) {
			DOB.sendKeys(date);
		}
		
		public void phone(String number) {
			mobilenumber.sendKeys(number);
		}
		public void emailadd(String mail) {
			EmailID.sendKeys(mail);
		}
		public void passwordval(String pawd) {
			pwd.sendKeys(pawd);
		}
		public void cpasswordval(String cpawd) {
			cpwd.sendKeys(cpawd);
		}
		public void agree() {
			agree.click();
		}
		public void signbtnclk() {
			singinclk.click();
		}
}
