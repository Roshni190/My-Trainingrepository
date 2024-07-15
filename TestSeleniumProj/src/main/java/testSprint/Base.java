package testSprint;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base {
public WebDriver driver; // Webdriver is an interface, driver is object
	public void initializeBrowser() {
driver=new ChromeDriver(); //driver=new EdgeDriver();loading the driver or browser initialisation. Chrome driver is a class launched by webdriver.
driver.get("https://selenium.qabible.in/");// to launch url
driver.manage().window().maximize();// to maximise the window
	}
	public void driverQuitandClose() { // there are 2 methods -close and quit
		driver.close();// to close
		//driver.quit();//to quit		
	}
	public static void main(String[] args) {
		Base base=new Base();
		base.initializeBrowser();
		//base.driverQuitandClose(); // to close the browser
	}

}

	
