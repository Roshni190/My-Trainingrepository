package checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testSprint.Base;

public class CheckBox extends Base{
	
	public void checkboxHandling1() { // to click the checkbox
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");	
		WebElement checkbx=driver.findElement(By.xpath("//input[@class='form-check-input']"));
		checkbx.click();
	}
	public void checkboxHandling2() { // we are selecting the checkbx, if not selected it will select using this method
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");	
		WebElement checkbx=driver.findElement(By.xpath("//input[@class='form-check-input']"));
		//checkbx.click();
		if(!checkbx.isSelected()) {
			checkbx.click(); // we are selecting
			System.out.println("Checkbox selected");
		}
		else {
			checkbx.click(); // if already selected, we select again to deselect
			System.out.println("Checkbox deselected");
		}
	}


	public static void main(String[] args) {
		CheckBox checkbox= new CheckBox();
		checkbox.initializeBrowser();
		checkbox.checkboxHandling1();
		checkbox.checkboxHandling2();
		//checkbox.driverQuitandClose();

	}

}
