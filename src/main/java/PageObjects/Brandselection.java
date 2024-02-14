package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Brandselection 
{
public WebDriver driver;
	
	public Brandselection(WebDriver driver) 
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
	//Brand
		@FindBy(xpath="//button[contains(text(),'Brands')]")
		WebElement Brandmenu;
	//Brandselection
		@FindBy(xpath="//a[contains(text(),'Samsung')]")
		WebElement brandselection;
		
	//Category selection
		@FindBy(xpath="//a[contains(text(),'TV & Home Theater')]")
		WebElement category;
	//subcategory selection
		@FindBy(xpath="//a[contains(text(),'TVs')]")
		WebElement subcategory;
	
	//product
		@FindBy(xpath="//a[contains(text(),'Samsung - 75\" Class Q70C QLED 4K UHD Smart Tizen TV')]")
		WebElement product;
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
		public void brandmenu() {
			Brandmenu.click();
		}
		public void brandselect() {
			brandselection.click();
		}
		public void category() {
			category.click();
		}
		public void subcat() {
			subcategory.click();
		}
		
		public void productselection() throws InterruptedException {
			product.click();
			
		}
	    public void addtocart() {
	    	JavascriptExecutor js=(JavascriptExecutor)driver;
	    	js.executeScript("window.scrollBy(0,1000)");
			Cart.click();
			
			
	    }
		
		public void checkcart() throws InterruptedException {
			cartcheck.click();
			Thread.sleep(10000);
			if(product.isDisplayed())
			{
				System.out.println("Item added to cart successfully");
			}else {
				System.out.println("Item not present in cart");
			}
		
		}
		
	
	
	
}




