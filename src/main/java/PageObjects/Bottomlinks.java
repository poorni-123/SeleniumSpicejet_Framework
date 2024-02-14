package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bottomlinks 
{
public WebDriver driver;
	
	public Bottomlinks(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
//Locating the elements:
	//Country selection
		@FindBy(xpath="/html/body/div[2]/div/div/div/div[1]/div[2]/a[2]/img")
		WebElement country;
	//supportcenter
		@FindBy(xpath="//a[@data-lid=\"ft_icon_visit_our_support_center\"]")
		WebElement support;
		
	//Order status
		@FindBy(xpath="//a[@data-lid=\"ft_icon_order_status\"]")
		WebElement order;
	
	//Return to previous page
		@FindBy(xpath="//a[@class=\"mini-header__nav\"]")
		WebElement previouspage;
		
	//shipping
		@FindBy(xpath="//a[@data-lid=\"ft_icon_shipping_delivery_store_pickup\"]")
		WebElement shipping;
		
	//Return
		@FindBy(xpath="//a[@data-lid=\"ft_icon_returns_exchanges\"]")
		WebElement orderreturn;
	
		public void countryselect() {
			country.click();
		}
		
		public void scrollbottom() {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,3000)");
		}
		
		public void supportcenter() {
			support.click();
			if(driver.getPageSource().contains("Best Buy Support"))
			{
				System.out.println("user lands in Support screen");
			}else {
				System.out.println("user is in incorrect screen");}
			}
		
			public void ordercheck() {
				order.click();
				if(driver.getPageSource().contains("Order"))
				{
					System.out.println("user lands in order screen");
				}else {
					System.out.println("user is in incorrect screen");}
				}
			public void previousscreen() {
				previouspage.click();
			}
			public void shippingcheck() {
				shipping.click();
				if(driver.getPageSource().contains("Shipping, Delivery & Store Pickup"))
				{
					System.out.println("User lands in shipping screen");
				}else {
					System.out.println("User lands in incorrect screen");}
				}
			
			public void returncheck() {
				orderreturn.click();
				if(driver.getPageSource().contains("Returns and Exchanges")) {
					System.out.println("User lands in return screen");
	
				}else {
					System.out.println("User lands in incorrect screen");
				}
			}





}
