package TestCases;

import org.testng.annotations.Test;

import Base.BaseClass;
import PageObjects.Departmentselection;

public class Deptarmentvalidationtest extends BaseClass {
	@Test(priority = 6)
	public void dpt() throws InterruptedException {
		Departmentselection dt=new Departmentselection(driver);
		dt.countryselect();
		dt.menuclick();
		dt.dpt();
		dt.subdpt();
		dt.catselection();
		dt.shopnow();
		dt.addtocart();
		dt.checkcart();
	}

}
