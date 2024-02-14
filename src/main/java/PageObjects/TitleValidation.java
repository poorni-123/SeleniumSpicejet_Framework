package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TitleValidation 
{
public WebDriver driver;
	
	public TitleValidation(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Locating the elements
	
	//Country selection
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[1]/div[2]/a[2]/img")
	WebElement country;
	
	//Title Validation for Top Deals
	@FindBy(linkText="Top Deals")
	WebElement text1;
	
	
	//Title Validation for Deal of the day
	@FindBy(linkText="Deal of the Day")
	WebElement text2;

	
		
	//Title Validation for Yes, Best Buy Sells That
	@FindBy(linkText="Yes, Best Buy Sells That")
	WebElement text3;
		
		
	public void countryselect() {
		country.click();
	}
	public void topdeals() {
		text1.click();
		if(driver.getPageSource().contains("Top Deals")) {
			System.out.println("Text is present");
		}else {
			System.out.println("Text is not present");
		}
		
	}
	
	public void DealoftheDay() {
		text2.click();
		String expectedtitle="Dealof the Day.";
		String title2 = driver.findElement(By.xpath("//div[@class=\"cb-dotd\"]/h2")).getText();
		if(title2.equals(expectedtitle))
		{
			System.out.println("Text is present");
		}else {
			System.out.println("Text is not present");
		}
		
	}
	public void YesBestBuySellsThat() {
		text3.click();
		if(driver.getPageSource().contains("Yes, Best Buy sells")) {
			System.out.println("Text is present");
		}else {
			System.out.println("Text is not present");
		}
		
	}
	
	
}
