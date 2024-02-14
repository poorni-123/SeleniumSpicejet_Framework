package TestCases;

import org.testng.annotations.Test;

import Base.BaseClass;
import PageObjects.Checkoutcart;

public class Checkoutcarttest extends BaseClass
{
@Test(priority = 8)
public void Checkoutcrt() {
	Checkoutcart chk=new Checkoutcart(driver);
	chk.countryselect();
	chk.checkingcart();
	chk.checkoutcart();
	chk.guest();
	chk.Email(prop.getProperty("emailaddress"));
	chk.telenumber(prop.getProperty("mobile"));
	chk.payment();
	chk.carddetails(prop.getProperty("cardnumber"));
	chk.firstname(prop.getProperty("first"));
	chk.lastname(prop.getProperty("last"));
	chk.emailaddress(prop.getProperty("emailaddress"));
	chk.city(prop.getProperty("cityname"));
	chk.State(prop.getProperty("Statename"));
	chk.code(prop.getProperty("codenumber"));
	chk.orderbutton();
}
}
