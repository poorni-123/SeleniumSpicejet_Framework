package Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport 
{
public static ExtentReports getExtentReports() {
	String extentreportpath =System.getProperty("user.dir")+"\\reports\\extentreport.html";
	ExtentSparkReporter reporter = new ExtentSparkReporter(extentreportpath);
	reporter.config().setReportName("Bestbuy");
	reporter.config().setDocumentTitle("Report of Bestbuy website");
	ExtentReports ex=new ExtentReports();
	ex.attachReporter(reporter);
	return ex;
}
}
