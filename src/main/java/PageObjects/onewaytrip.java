package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class onewaytrip 
{
	public WebDriver driver;


	public onewaytrip(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	//Element locator
	//oneway
	@FindBy(xpath="(//div[@class=\"css-76zvg2 r-homxoj r-ubezar r-1ozqkpa\"])[1]")
	WebElement onewayslt;

	//From location
	@FindBy(xpath="(//input[@class=\"css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu\"])[1]")
	WebElement fromlctn;
     
	//To location
	@FindBy(xpath="(//input[@class=\"css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu\"])[2]")
	WebElement tolctn;
	
	//Date
	@FindBy(xpath="(//div[@class=\"css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep\"])[3]")
	WebElement Date;
	
	//Passengers
	@FindBy(xpath="(//div[@class=\"css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep\"])[5]")
	WebElement passenger;

	//Adult
	@FindBy(xpath="(//div[@class=\"css-1dbjc4n r-1awozwy r-19m6qjp r-y47klf r-1loqt21 r-eu3ka r-1777fci r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr r-1aockid\"])[1])")
	WebElement adultcount;

	//children count
	@FindBy(xpath="(//div[@class=\"css-1dbjc4n r-1awozwy r-19m6qjp r-y47klf r-1loqt21 r-eu3ka r-1777fci r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr r-1aockid\"])[2])")
	WebElement chldcount;
	
	//infant count
		@FindBy(xpath="(//div[@class=\"css-1dbjc4n r-1awozwy r-19m6qjp r-y47klf r-1loqt21 r-eu3ka r-1777fci r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr r-1aockid\"])[3])")
		WebElement infantcount;
	
	//currency
		@FindBy(xpath="(//div[@class=\"css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep\"])[6]")
		WebElement crncy;
	//Selection
		@FindBy(xpath="//div[contains(text(),'INR')]")
		WebElement currencyselected;
		
		//Search flight
		@FindBy(xpath="//div[@class=\"css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1g94qm0 r-1w50u8q r-ah5dr5 r-1otgn73\"]")
		WebElement srchbtn;
	
		public void oneway() throws InterruptedException {
			onewayslt.click();
			Thread.sleep(1000);
		}

		public void frm(String fromloction) throws InterruptedException {
			fromlctn.click();
			fromlctn.sendKeys(fromloction);
			driver.findElement(By.xpath("//div[contains(text(),'Chennai(MAA)')]")).click();
			Thread.sleep(1000);
		}
		
		public void to(String tolocation) throws InterruptedException {
			tolctn.click();
			tolctn.sendKeys(tolocation);
			driver.findElement(By.xpath("//div[contains(text(),'Coimbatore(CJB)')]")).click();
			Thread.sleep(1000);
		}
		
		public void doflight(String dateofflight) throws InterruptedException {
			Date.sendKeys(dateofflight);
			Thread.sleep(1000);
		}
		
		
		public void passenger() throws InterruptedException {
			passenger.click();
			adultcount.click();
			chldcount.click();
			infantcount.click();
			Thread.sleep(1000);
		}
		

		public void currncy() throws InterruptedException {
			crncy.click();
			currencyselected.click();
			Thread.sleep(1000);
		}
		
		public void search() throws InterruptedException {
			srchbtn.click();
			Thread.sleep(1000);
		}
		
		
}
