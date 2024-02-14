package TestCases;

import org.testng.annotations.Test;

import Base.BaseClass;
import PageObjects.twoway;

public class twowaytest extends BaseClass {
@Test(priority=4)
public void round() throws InterruptedException {
	twoway two=new PageObjects.twoway(driver);
	two.oneway();
	two.frm(prop.getProperty("fromloction"));
	two.to(prop.getProperty("toloction"));
	two.doflight(prop.getProperty("dateofflight"));
	two.returnflight(prop.getProperty("returnDate"));
	two.passenger();
	two.currncy();
	two.search();
	
	
}
}
