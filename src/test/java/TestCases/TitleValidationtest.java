package TestCases;

import org.testng.annotations.Test;

import Base.BaseClass;
import PageObjects.TitleValidation;

public class TitleValidationtest extends BaseClass
{
	@Test(priority = 3)
	public void TitleVal()
	{
		TitleValidation tv=new TitleValidation(driver);
		tv.countryselect();
		tv.topdeals();
		tv.DealoftheDay();
		tv.YesBestBuySellsThat();
		
	}
}
