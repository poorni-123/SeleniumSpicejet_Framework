package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Login 
{
	
public WebDriver driver;


	public Login(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//Locating the elements
		
		//Login button
		@FindBy(xpath="//div[@class=\"css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1otgn73\"]/div")
		WebElement loginbutton;
	    //Email radiobutton
		@FindBy(xpath="(//div[@class=\"css-76zvg2 r-homxoj r-ubezar r-1ozqkpa\"])[4]")
		WebElement radioemail;
		
		//emailenter
		@FindBy(xpath="//input[@type=\"email\"]")
		WebElement Email;
		
		//password
		@FindBy(xpath="//input[@type=\"password\"]")
		WebElement passwd;
		
		//loginbtn
		@FindBy(xpath="//div[@class=\"css-1dbjc4n r-1awozwy r-184aecr r-z2wwpe r-1loqt21 r-18u37iz r-tmtnm0 r-1777fci r-1x0uki6 r-1w50u8q r-ah5dr5 r-1otgn73\"]")
		WebElement lgnbtn;
		
		public void login() {
			loginbutton.click();
		}
		public void radiobtn() {
			radioemail.click();
		}
		public void emailenter(String mail) {
			Email.sendKeys(mail);
		}
		public void password(String pawd) {
			passwd.sendKeys(pawd);
		}
		
		public void loginbutton() 
		{
			lgnbtn.click();
		}
		
}
		
		
		