package checkbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testSprint.Base;

public class RadioButtonHandling extends Base{

	public void radioButtonHandling() {
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement radiobutton1=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeSelected(radiobutton1));
		radiobutton1.click();
	}
	public void radioButtonHandling2() {
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement male=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		WebElement female=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		if(male.isSelected()) {
			female.click();
			System.out.println("Female is selected");
			}
		else {
			female.click();
		System.out.println("Female is selected");
		}
	}
	public static void main(String[] args) {
		RadioButtonHandling radiobuttonhandling= new RadioButtonHandling();
		radiobuttonhandling.initializeBrowser();
		radiobuttonhandling.radioButtonHandling();
		//radiobuttonhandling.radioButtonHandling2();

	}

}
