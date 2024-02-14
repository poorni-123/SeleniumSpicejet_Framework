package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Checkoutcart 
{
public WebDriver driver;
	
	public Checkoutcart(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Locating the elements
		//Country selection
				@FindBy(xpath="/html/body/div[2]/div/div/div/div[1]/div[2]/a[2]/img")
				WebElement country;
	//Checking in cart
				@FindBy(xpath="//span[@class=\"cart-label\"]")
				WebElement cartcheck;
	//checkout from cart
				@FindBy(xpath="//button[@class=\"btn btn-lg btn-block btn-primary\"]")
				WebElement checkout;
	//Guest login
				@FindBy(xpath="//button[@class=\"c-button c-button-secondary c-button-lg cia-guest-content__continue guest\"]")
				WebElement guest;
	//Email Address
				@FindBy(xpath="//input[@id=\"user.emailAddress\"]")
				WebElement emailid;
	//phone number
				@FindBy(xpath="//input[@id=\"user.phone\"]")
				WebElement phone;
    //Payment
				@FindBy(xpath="//div[@class=\"button--continue\"]")
				WebElement payment;
	//card
				@FindBy(xpath="//input[@class=\"tb-input v-medium \"]")
				WebElement cardetails;
	//firstname
				@FindBy(xpath="//input[@id=\"first-name\"]")
				WebElement firstname;
	//lastname
				@FindBy(xpath="//input[@id=\"last-name\"]")
				WebElement lastname;
	//emailaddress
				@FindBy(xpath="//input[@id=\"address-input\"]")
				WebElement emailaddressout;
	//city
				@FindBy(xpath="//input[@id=\"city\"]")
				WebElement city;
   //Postalcode
				@FindBy(xpath="//input[@id=\"postalCode\"]")
				WebElement postalcode;
	//orderplace
				@FindBy(xpath="//button[@class=\"btn btn-lg btn-block btn-primary\"]")
				WebElement orderplace;
				
				public void countryselect() {
					country.click();
				}
      public void checkingcart()
      {
    	  cartcheck.click();
      }
	
      public void checkoutcart()
      {
    	  checkout.click();
      }
      public void guest()
      {
    	  guest.click();
      }
      public void Email(String emailaddress)
      {
    	  emailid.sendKeys(emailaddress);
      }
      public void telenumber(String mobile)
      {
    	  phone.sendKeys(mobile);
      }
      public void payment()
      {
    	  payment.click();
      }
      public void carddetails(String cardnumber)
      {
    	  cardetails.sendKeys(cardnumber);
      }
      public void firstname(String first)
      {
    	  firstname.sendKeys(first);
      }
      public void lastname(String last)
      {
    	  firstname.sendKeys(last);
      }
      public void emailaddress(String emailaddress)
      {
    	  emailaddressout.sendKeys(emailaddress);
      }
      public void city(String cityname)
      {
    	  city.sendKeys(cityname);
      }
      public void State(String Statename)
      {   
    	  Select ste=new Select(driver.findElement(By.id("State")));
          ste.selectByVisibleText(Statename);
    	  
      }
      public void code(String codenumber) {
    	  postalcode.sendKeys(codenumber);
      }
      public void orderbutton() {
    	  orderplace.click();
      }
      
      
      
      
      

}
