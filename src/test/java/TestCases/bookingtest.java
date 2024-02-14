package TestCases;


import Base.BaseClass;
import PageObjects.Flightselectionandbooking;

public class bookingtest extends BaseClass{

	public void book() throws InterruptedException {
		Flightselectionandbooking bk=new Flightselectionandbooking(driver);
		bk.continu();
		bk.titlesltn();
		bk.titleselection();
		bk.frstname(prop.getProperty("first"));
		bk.lstname(prop.getProperty("last"));
		bk.contact(prop.getProperty("number"));
		bk.country();
		bk.emailaddress(prop.getProperty("mail"));
		bk.twn(prop.getProperty("townname"));
		bk.passengertitle();
		bk.psngrfrst(prop.getProperty("first"));
		bk.psngrlst(prop.getProperty("last"));
		bk.psngrnumber(prop.getProperty("number"));
		bk.cntn();
	}
}
