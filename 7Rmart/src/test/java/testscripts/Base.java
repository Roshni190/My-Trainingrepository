package testscripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import constants.Constants;
import utilities.ScreenshotUtility;


public class Base {
public WebDriver driver;
public 	ScreenshotUtility screenshot;
public Properties prop;
public FileInputStream fs;
@BeforeMethod(alwaysRun=true)
@Parameters("browser")
public void initializeBrowser(String browser ) throws Exception {
	try 
	{
		prop = new Properties();
		fs = new FileInputStream(Constants.Configfile);
		prop.load(fs);
	} 
	catch (FileNotFoundException e) 
	{
		e.printStackTrace();
	}
	if(browser.equalsIgnoreCase("chrome")) {
		driver=new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("firefox")){
		driver=new FirefoxDriver();
	}
	else if(browser.equalsIgnoreCase("edge")) {
		driver=new EdgeDriver();
	}
	else
	{
		throw new Exception("browser is not correct");
	}


driver.get(prop.getProperty("url"));
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();
	}
@AfterMethod(alwaysRun = true)
public void browserQuit(ITestResult iTestResult) throws IOException {
	if (iTestResult.getStatus() == ITestResult.FAILURE) {
		ScreenshotUtility screenshot = new ScreenshotUtility();
		screenshot.getScreenShot(driver, iTestResult.getName());
	}
	driver.quit();
}
}
