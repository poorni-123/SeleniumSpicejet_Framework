package TestCases;

import org.testng.annotations.Test;

import Base.BaseClass;
import PageObjects.onewaytrip;

public class onewaytest extends BaseClass {
@Test(priority=3)
public void oneway() throws InterruptedException {
	onewaytrip one=new onewaytrip(driver);
	one.oneway();
	one.frm(prop.getProperty("fromloction"));
	one.to(prop.getProperty("toloction"));
	one.doflight(prop.getProperty("dateofflight"));
	one.passenger();
	one.currncy();
	one.search();
	
	
}
}
