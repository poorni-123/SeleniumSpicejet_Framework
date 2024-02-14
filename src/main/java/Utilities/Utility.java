package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utility 
{
	public static WebDriver driver;
	public Properties prop;
	
public WebDriver initializeDriver() throws IOException 
{
	
	prop=new Properties();
	String proppath=System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties";
	FileInputStream fis=new FileInputStream(proppath);
	prop.load(fis);
	
	//Browser selection
	
	String choicebrowser=prop.getProperty("browser", "chrome");
	if(choicebrowser.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}else if(choicebrowser.equals("Firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}else if(choicebrowser.equals("IE")) {
		WebDriverManager.iedriver().setup();
		driver=new InternetExplorerDriver();
	}else {
		System.out.println("Invalid browser selection!");
		System.exit(1);
	}
		
	//Window maximization
	driver.manage().window().maximize();
	//Delete cookies
	driver.manage().deleteAllCookies();
	//Implicit Wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	return driver;
}


//Capture Screenshot
public String takeScreenshot(String testname,WebDriver driver) throws IOException
{
 File srcScreenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
String screenshotfilepath=System.getProperty("user.dir")+"\\screenshot\\"+testname+".png";
FileUtils.copyFile(srcScreenshot, new File(screenshotfilepath));
return screenshotfilepath;

}

//Window Handler
public static void SwitchWindow(){
	String ParentWindow=driver.getWindowHandle();
	Set<String> windowhandles=driver.getWindowHandles();
	windowhandles.size();
	for(String childwindow:windowhandles) {
		if(!childwindow.contentEquals(ParentWindow)) {
			driver.switchTo().window(childwindow);
		}
	}
}

//Element waiting time to be clickable
public static WebElement waitforElementToBeClickable(By locator,int timeoutinseconds) {
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeoutinseconds));
	return wait.until(ExpectedConditions.elementToBeClickable(locator));
	
}
}
