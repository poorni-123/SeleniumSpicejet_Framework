package TestCases;

import org.testng.annotations.Test;

import Base.BaseClass;
import PageObjects.Bottomlinks;

public class Bottomlinktest extends BaseClass 
{
@Test (priority = 4)
public void bottomlnk() {
	Bottomlinks bl=new Bottomlinks(driver);
	bl.countryselect();
	bl.scrollbottom();
	bl.supportcenter();
	bl.ordercheck();
	bl.previousscreen();
	bl.shippingcheck();
	bl.returncheck();
}

}
