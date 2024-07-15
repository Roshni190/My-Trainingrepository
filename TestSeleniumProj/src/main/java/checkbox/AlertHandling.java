package checkbox;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testSprint.Base;

public class AlertHandling extends Base {
	
	public void simpleAlert() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement simplealert=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		simplealert.click();
		driver.switchTo().alert().accept();
	}
	public void confirmAlert() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement confirmalert=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));	
		confirmalert.click();
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
	}
	public void promptAlert() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement promptalert=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));	
		promptalert.click();
		driver.switchTo().alert().sendKeys("Roshni");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));//explicit
		wait.until(ExpectedConditions.alertIsPresent());
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().sendKeys("Rosh");
		
		
	}
	public static void main(String[] args) {
		AlertHandling alerthandling= new AlertHandling();
		alerthandling.initializeBrowser();
		//alerthandling.simpleAlert();
		//alerthandling.confirmAlert();
		alerthandling.promptAlert();
		//alerthandling.driverQuitandClose();
	}

}
