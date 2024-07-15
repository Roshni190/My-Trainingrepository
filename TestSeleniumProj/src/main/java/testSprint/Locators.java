package testSprint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base{
public void idMethod() {
	//webElement elementname= driver.findElement(By.locator (locator value)); // find element method
	WebElement Entermessage=driver.findElement(By.id("single-input-field"));
	WebElement Entervaluea=driver.findElement(By.id("value-a"));
	WebElement Entervalue=driver.findElement(By.id("button-two"));
	WebElement Entervalueb=driver.findElement(By.id("value-b"));
	WebElement Entervaluec=driver.findElement(By.id("message-one"));
}
public void className() {
	WebElement Elementclass=driver.findElement(By.className("mb-sec"));
	WebElement Elementclass1=driver.findElement(By.className("col-lg-3 col-md-3 col-sm-12 col-xs-12"));
	WebElement Elementclas2=driver.findElement(By.className("clearfix"));
}
public void name() {
	WebElement Elementname=driver.findElement(By.name("keywords"));
	WebElement Elementname1=driver.findElement(By.name("description"));
	WebElement Elementname2=driver.findElement(By.name("author"));
}
public void linkText() {
	WebElement Elementlinktext=driver.findElement(By.linkText("Checkbox Demo"));
	WebElement Elementlinktext2=driver.findElement(By.linkText("Radio Buttons Demo"));
	WebElement Elementlinktext3=driver.findElement(By.linkText("Ajax Form Submit"));
}
public void partialLinkText() {
	WebElement Elementpartial=driver.findElement(By.partialLinkText("Jquery Select"));
	
}


	public static void main(String[] args) {
		Locators locators= new Locators();
		locators.initializeBrowser();
		locators.className();
		locators.idMethod();
		locators.name();
		locators.linkText();
		locators.partialLinkText();

	}

}
