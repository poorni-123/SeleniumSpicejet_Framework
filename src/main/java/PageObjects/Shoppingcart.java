package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shoppingcart 
{
public WebDriver driver;
	
	public Shoppingcart(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
//Locating the elements
	//Country selection
		@FindBy(xpath="/html/body/div[2]/div/div/div/div[1]/div[2]/a[2]/img")
		WebElement country;
//Search box
	@FindBy(id="gh-search-input")
	WebElement Search;
	
//Submit search
	@FindBy(xpath="//button[@class=\"header-search-button\"]")
	WebElement submitsearch;
//Checking for product
	@FindBy(xpath="//a[contains(text(),'Samsung - 77\" Class S90C OLED 4K UHD Smart Tizen TV')]")
	WebElement product;
//Add to cart
	@FindBy(xpath="//button[text()=\"Add to Cart\"]")
	WebElement cart;
//Checking in cart
	@FindBy(xpath="//span[@class=\"cart-label\"]")
	WebElement cartcheck;

	public void countryselect() {
		country.click();
	}

	public void searchbox(String itemname) {
		Search.sendKeys(itemname);
		
	}
	public void submitsearch() {
		submitsearch.click();
	}
	public void productsearch() {
		product.click();
	}
    public void addtocart() {
    	JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",cart);
		cart.click();
		
		
    }
	

	public void checkcart() throws InterruptedException {
		cartcheck.click();
		Thread.sleep(10000);
		if(driver.getPageSource().contains("Samsung - 77\" Class S90C OLED 4K UHD Smart Tizen TV")) {
			System.out.println("Item added to cart successfully");
		}else {
			System.out.println("Item not present in cart");
		}
	
	}
	
	
	
}





