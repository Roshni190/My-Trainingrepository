package testSprint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownAssignment extends Base {
public void dropDown1() {
	driver.navigate().to("https://www.geodatasource.com/software/country-region-dropdown-menu-demo");
	WebElement dropdown1=driver.findElement(By.xpath("//select[@country-data-region-id='gds-cr-one']"));
	WebElement region=driver.findElement(By.xpath("//select[@id='gds-cr-one']"));
			Select select=new Select(dropdown1);
			select.selectByIndex(1);
			select.selectByValue("Austria");
			select.selectByVisibleText("Australia");
			Select regionsel=new Select(region);
			regionsel.selectByIndex(2);
			regionsel.selectByValue("Victoria");
			regionsel.selectByVisibleText("Tasmania");
			
	
	
}
public void dropDown2() {
	//driver.navigate().to("https://www.geodatasource.com/software/country-region-dropdown-menu-demo");
	WebElement dropdown2=driver.findElement(By.xpath("//select[@country-data-region-id='gds-cr-two']"));
	
		Select select=new Select(dropdown2);
		select.selectByIndex(3);
		select.selectByValue("New Zealand");
		//select.selectByVisibleText("Germany");
	
	
	
}
	public static void main(String[] args) {
		DropDownAssignment dropdownassignment= new DropDownAssignment();
		dropdownassignment.initializeBrowser();
		dropdownassignment.dropDown1();
		dropdownassignment.dropDown2();
		//dropdownassignment.driverQuitandClose();
	}

}
