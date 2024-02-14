package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flightselectionandbooking {
	public WebDriver driver;


	public Flightselectionandbooking(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
//continue
	@FindBy(xpath="//div[@class=\"css-1dbjc4n r-1awozwy r-1xfd6ze r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73\"]")
	WebElement continuebtn;
//title
	@FindBy(xpath="//div[@class=\"css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-1ugchlj r-1777fci r-ymttw5 r-5njf8e r-1otgn73 r-1x93onp\"]")
	WebElement titleselect;
//firstname
	@FindBy(xpath="(//input[@class=\"css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy\"])[1]")
	WebElement firstandmiddle;
	//lastname
		@FindBy(xpath="(//input[@class=\"css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy\"])[2]")
		WebElement lastname;
	//contact
		@FindBy(xpath="(//input[@class=\"css-1cwyjr8 r-1yadl64 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy\"])[1]")
		WebElement phonenumber;
	//country
		@FindBy(xpath="css-76zvg2 css-bfa6kz r-homxoj r-poiln3 r-ubezar")
		WebElement countryselection;
		
	
		//emailaddressname
				@FindBy(xpath="(//input[@class=\"css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy\"])[3]")
				WebElement emailid;
				//Town
				@FindBy(xpath="(//input[@class=\"css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy\"])[4]")
				WebElement town;
	//passengerinfo
				@FindBy(xpath="(//div[@class=\"css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep\"])[1]")
				WebElement passengertitle;
	//firstname
				@FindBy(xpath="(//input[@class=\"css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy\"])[5]")
				WebElement psngrfrtname;
				//lastname
				@FindBy(xpath="(//input[@class=\"css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy\"])[6]")
				WebElement psngrlstname;
	//passenger number
				@FindBy(xpath="(//input[@class=\"css-1cwyjr8 r-1yadl64 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy\"])[2]")
				WebElement psngrnumber;
		//continue
				@FindBy(xpath="//div[@class=\"css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-6ity3w r-d9fdf6 r-9qu9m4 r-ah5dr5 r-1otgn73\"]")
				WebElement continuebutn;
			
			public void continu() {
				continuebtn.click();
			}
	public void titleselection() {
		titleselect.click();
		driver.findElement(By.xpath("//div[contains(text(),'Mrs')]")).click();
	}
	public void frstname(String first) {
		firstandmiddle.sendKeys(first);
	}
	public void lstname(String last) {
		lastname.sendKeys(last);
	}
	public void contact(String number) {
		phonenumber.sendKeys(number);
	}
	public void country() {
		countryselection.click();
	}
	
	public void emailaddress(String mail) {
		emailid.sendKeys(mail);
	}
	public void twn(String townname) {
		town.sendKeys(townname);
	}
	
	public void passengertitle() {
		passengertitle.click();
		driver.findElement(By.xpath("//div[contains(text(),'Mrs')]")).click();

	}
	public void psngrfrst(String first) {
		psngrfrtname.sendKeys(first);
		
	}
	public void psngrlst(String last) {
		psngrlstname.sendKeys(last);
		
	}
	
	public void psngrnumber(String number ) {
		psngrnumber.sendKeys(number);
	}
	public void cntn() {
		continuebutn.click();
	}
	
	public void titlesltn() throws InterruptedException {
		titleselect.click();
		driver.findElement(By.xpath("//div[contains(text(),'Mrs')]")).click();
		
	}
	
}
