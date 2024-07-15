package testSprint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Xpath extends Base{
	
	public void basicXpath() { //•	//tag[@attribute='value']
		WebElement xpath1= driver.findElement(By.xpath("//button[@class='navbar-toggler']"));
		WebElement xpath2=driver.findElement(By.xpath("//button[@id='button-one']"));
		WebElement xpath3=driver.findElement(By.xpath("//div[@id='message-one']"));
		WebElement xpath4=driver.findElement(By.xpath("//div[@id='collapsibleNavbar']"));
	}
public void contains() { //     //tag[contains(@attribute,'value')] //contains can also use partial attribute value
	WebElement xpatcont1=driver.findElement(By.xpath("//button[contains(@id,'button-o')]"));
	WebElement xpathcont2=driver.findElement(By.xpath("//div[contains(@id,'message-o')]"));
	WebElement xpathcont3=driver.findElement(By.xpath("//button[contains(@id,'button-two')]"));
	WebElement xpathcont4=driver.findElement(By.xpath("//input[contains(@id,'inlineRadio11')]"));
	
}
public void startsWith() { //      //tag[starts-with(@attribute,'value')]
	WebElement xpathstrtwth1=driver.findElement(By.xpath("//button[starts-with(@id,'button-o')]"));
	WebElement xpathstrtwth2=driver.findElement(By.xpath("//button[starts-with(@id,'button-t')]"));
	WebElement xpathstrtwth3=driver.findElement(By.xpath("//label[starts-with(@for,'inputEmail4')]"));
	WebElement xpathstrtwth4=driver.findElement(By.xpath("//input[starts-with(@id,'single')]"));
	
}

public void text() { //   //tag[text()='text']
	WebElement xpathtx1=driver.findElement(By.xpath("//button[text()='Show Message']"));
	WebElement xpathtx2=driver.findElement(By.xpath("//button[text()='Get Total']"));
	WebElement xpathtx3=driver.findElement(By.xpath("//label[text()='Enter Message']"));
	WebElement xpathtx4=driver.findElement(By.xpath(" //button[text()='Show Selected Value']"));
	
	
}
public void or() { // //tag[@attribute='value' or @attribute='value']
	
}
public void and() { // //tag[@attribute='value' and @attribute='value']
	
}
	public static void main(String[] args) {
		Xpath xpath= new Xpath();
		xpath.initializeBrowser();
		xpath.basicXpath();

	}

}
