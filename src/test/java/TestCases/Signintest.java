package TestCases;

import org.testng.annotations.Test;

import Base.BaseClass;
import PageObjects.SignIn;

public class Signintest extends BaseClass
{
@Test(priority = 1)
public void Sign() throws InterruptedException {
	SignIn sgn=new SignIn(driver);
	sgn.signup();
	sgn.title(prop.getProperty("titlevalue"));
	sgn.firstname(prop.getProperty("first"));
	sgn.Lastname(prop.getProperty("last"));
	sgn.country(prop.getProperty("countryvalue"));
	sgn.calendar(prop.getProperty("date"));
	sgn.phone(prop.getProperty("number"));
	sgn.emailadd(prop.getProperty("mail"));
	sgn.passwordval(prop.getProperty("pawd"));
	sgn.cpasswordval(prop.getProperty("cpawd"));
	sgn.agree();
	sgn.signbtnclk();
}
}
