package TestCases;

import org.testng.annotations.Test;

import Base.BaseClass;
import PageObjects.Login;

public class Logintest extends BaseClass{
	@Test (priority=2)
	public void lgn() {
		Login lg = new Login(driver);
		lg.login();
		lg.radiobtn();
		lg.emailenter(prop.getProperty("mail"));
		lg.password(prop.getProperty("pawd"));
		lg.loginbutton();
	}

}
