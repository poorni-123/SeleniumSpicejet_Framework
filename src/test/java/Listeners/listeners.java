package Listeners;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Base.BaseClass;
import Utilities.ExtentReport;

public class listeners extends BaseClass implements ITestListener{
	WebDriver driver =null;
	
	ExtentReports extentreport=ExtentReport.getExtentReports();
	ExtentTest extenttest ;
	
	@Override
	public void onTestStart (ITestResult result) {
		extenttest= extentreport.createTest(result.getName());
		
	}

	public void onTestSuccess (ITestResult result) {
		extenttest.log(Status.PASS, "TestCase Passed");		
	}
	
	public void onTestFailure (ITestResult result) {
		extenttest.fail(result.getThrowable());
		String testname = result.getName();
		try {
			driver=(WebDriver) result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			String screenshotpath=takeScreenshot(testname, driver);
			extenttest.addScreenCaptureFromPath(screenshotpath,testname);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
		public void onFinish(ITestContext context) 
		{
			extentreport.flush();
		}
	}
	
	
	
	


