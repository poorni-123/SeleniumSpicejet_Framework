package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Departmentselection 
{
public WebDriver driver;
	
	public Departmentselection(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Locating the elements
		//Country selection
				@FindBy(xpath="/html/body/div[2]/div/div/div/div[1]/div[2]/a[2]/img")
				WebElement country;
		//menu
			@FindBy(xpath="//button[@class=\"c-button-unstyled hamburger-menu-button\"]")
			WebElement menu;		
		//Department
			@FindBy(xpath="//button[contains(text(),'Cell Phones')]")
			WebElement Deptmenu;
		//SubDeptselection
			@FindBy(xpath="//button[contains(text(),'iPhone')]")
			WebElement subdeptselection;
	//categoryselection
			@FindBy(xpath="//a[contains(text(),'iPhone 15 Pro')]")
			WebElement catselection;
		//shopnow
			@FindBy(xpath="//a[@id=\"iPhone 15 Pro Max\"]")
			WebElement shop;
		//Add to cart
			@FindBy(xpath="//button[text()=\"Add to Cart\"]")
			WebElement Cart;
		//Checking in cart
			@FindBy(xpath="//span[@class=\"cart-label\"]")
			WebElement cartcheck;
			public void countryselect() {
				country.click();
			}
			public void menuclick() {
				menu.click();
				
			}
			public void dpt() {
				Deptmenu.click();
			}	
			public void subdpt() {
				subdeptselection.click();
			}
			public void catselection() {
				catselection.click();
			}
			public void shopnow() {
				shop.click();
			}
			public void addtocart() {
		    	JavascriptExecutor js=(JavascriptExecutor)driver;
		    	js.executeScript("window.scrollBy(0,1000)");
				Cart.click();
				
		    }
			public void checkcart() throws InterruptedException {
				cartcheck.click();
			}
		
			
}
