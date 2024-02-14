package TestCases;

import org.testng.annotations.Test;

import Base.BaseClass;
import PageObjects.CreateAccount;

public class Createaccounttest extends BaseClass{
	@Test(priority = 1)
	public void createacc() throws InterruptedException {
		CreateAccount acc=new CreateAccount(driver);
		acc.countryselect();
		acc.dropdown();
		acc.optnselection();
		acc.getuserfirstname(prop.getProperty("username"));
		acc.getuserlastname(prop.getProperty("lastname"));
		acc.password(prop.getProperty("password"));
		acc.reenterpassword(prop.getProperty("confirmpassword"));
		acc.get_email(prop.getProperty("Email"));
		acc.mobilenumber(prop.getProperty("mobile"));
		acc.btnclick();
		Thread.sleep(10000);
		
	}
	
	

}
