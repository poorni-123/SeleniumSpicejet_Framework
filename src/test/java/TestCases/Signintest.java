package TestCases;

import org.testng.annotations.Test;

import Base.BaseClass;
import PageObjects.SignIn;

public class Signintest extends BaseClass
{
@Test(priority = 2)
public void Sign() throws InterruptedException {
	SignIn sgn=new SignIn(driver);
	sgn.countryselect();
	sgn.dropdown();
	sgn.signin();
	sgn.emailaddress(prop.getProperty("Email"));
	sgn.password(prop.getProperty("password"));
	sgn.signinclick();
	Thread.sleep(1000);
}
}
