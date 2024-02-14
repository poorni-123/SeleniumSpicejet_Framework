package TestCases;

import org.testng.annotations.Test;

import Base.BaseClass;
import PageObjects.Brandselection;

public class Shopbybrandtest extends BaseClass
{
@Test(priority = 7)

public void brandtest() throws InterruptedException {
	Brandselection sb=new Brandselection(driver);
	sb.countryselect();
	sb.menuclick();
	sb.brandmenu();
	sb.brandselect();
	sb.category();
	sb.subcat();
	sb.productselection();
	sb.addtocart();
	sb.checkcart();
}
}
