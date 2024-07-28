package testscripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
public WebDriver driver;
@BeforeMethod
public void initializeBrowser() {
driver=new ChromeDriver(); //driver=new EdgeDriver();loading the driver or browser initialisation. Chrome driver is a class launched by webdriver.
driver.get("https://selenium.qabible.in/");// to launch url
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//implicit wait
driver.manage().window().maximize();// to maximise the window
	}
@AfterMethod
public void driverQuitandClose() { // there are 2 methods -close and quit
	//driver.close();// to close
	//driver.quit();//to quit		
}
}
