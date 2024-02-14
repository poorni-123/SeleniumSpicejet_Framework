package Base;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Utilities.Utility;

public class BaseClass extends Utility 
{

@BeforeMethod
public void launch() throws IOException 
{
	driver=initializeDriver();
	driver.get(prop.getProperty("url"));
	
	
}

@AfterMethod
public void closebrowser()
{
	driver.quit();
}
}
