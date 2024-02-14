package TestCases;

import org.testng.annotations.Test;

import Base.BaseClass;
import PageObjects.Shoppingcart;

public class Shoppingcarttest extends BaseClass{
	@Test(priority = 5)
	
	public void Shoppingcart() throws InterruptedException{
		Shoppingcart sc=new Shoppingcart(driver);
		sc.countryselect();
		sc.searchbox(prop.getProperty("itemname"));
		sc.submitsearch();
		sc.productsearch();
		sc.addtocart();
		sc.checkcart();
		
	}

}
