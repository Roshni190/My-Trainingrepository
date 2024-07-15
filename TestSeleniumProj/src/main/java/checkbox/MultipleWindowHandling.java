package checkbox;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testSprint.Base;

public class MultipleWindowHandling extends Base {
	public void multipleWindow() {
		driver.navigate().to("https://webdriveruniversity.com/");
		WebElement login=driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
		login.click();
		WebElement contactus=driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
		contactus.click();
		String parent=driver.getWindowHandle();// we get id of parent window only
		System.out.println("Parent"+parent);
		Set<String> allwindows=driver.getWindowHandles();// for getting id of all open windows
		for(String temp:allwindows) 
		{	if(!temp.equals(parent)) {
		System.out.println("windows"+temp);
		driver.switchTo().window(temp);// to switch to each windows which are opened
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println("**********************************************");
		}
		}
		
	}
	public void multipleWindowTest2() {
		driver.navigate().to("https://webdriveruniversity.com/");
		WebElement login=driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
		login.click();
		WebElement contactus=driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
		contactus.click();
		String parent=driver.getWindowHandle();// we get id of parent window only
		System.out.println("Parent"+parent);
		Set<String> allwindows=driver.getWindowHandles();// for getting id of all open windows
		String title="";
		for(String temp:allwindows) 
		{	if(!temp.equals(parent)) {
		System.out.println("windows"+temp);
		driver.switchTo().window(temp);// to switch to each windows which are opened
			title=driver.getTitle();//to get title
			System.out.println(driver.getCurrentUrl());
			System.out.println("**********************************************");
		
		}
		}
	if(title.equals("WebDriver | Contact Us"))
		{
			WebElement firstname=driver.findElement(By.xpath("//input[@name='first_name']"));
			firstname.sendKeys("john");
		}
	
	if(title.equals("WebDriver | Login Portal"))
	{
		WebElement firstname=driver.findElement(By.xpath("//input[@id='text']"));
		firstname.sendKeys("john");
	}
	}

	public static void main(String[] args) {
		MultipleWindowHandling multiplewindowhandling=new MultipleWindowHandling();
		multiplewindowhandling.initializeBrowser();
		multiplewindowhandling.multipleWindow();
		//multiplewindowhandling.multipleWindowTest2();
	}

}
