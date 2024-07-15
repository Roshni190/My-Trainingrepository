package testSprint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown extends Base {

	public void dropDownHandling() {  //to automate dropdown we use select class. tag name should be select
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
	WebElement dropdown1=driver.findElement(By.xpath("//select [@id='single-input-field']"));
	Select select =new Select(dropdown1); //select is the class, and we create object for this and we pass the element dropdown
	select.selectByVisibleText("Red");
	select.selectByIndex(3);
	select.selectByValue("Yellow");
	
	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DropDown dropdown = new DropDown();
		dropdown.initializeBrowser();
		dropdown.dropDownHandling();
		dropdown.driverQuitandClose();
	}

}
